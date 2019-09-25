import proto from './proto-policy/service_grpc_web_pb';
import uuid from 'uuid/v1';
import { policy, policyLimits } from 'constants/policy';

const client = new proto.PolicyServicePromiseClient(
  'https://policy-service.service.mango.rocks',
  null,
  null,
);

// STREAM
const createPolicyStream = (request, emitter, onEnd) => {
  const stream = client.getPolicyStream(request, {});

  stream.on('data', response => {
    const policyRaw = response.getPolicy();
    const userPolicyLimits = policyRaw.getLimitsMap();
    const normalizeLimits = policyLimits.reduce((result, limit) => {
      const limitsList = result;
      limitsList[limit.id] = userPolicyLimits
        .get(limit.id.toUpperCase())
        .getValue()
        .getAmount();
      return limitsList;
    }, {});

    const normalizePolicy = {
      id: policyRaw.getId(),
      subscriptionId: policyRaw.getSubscriptionId(),
      price: policyRaw.getPrice().getAmount(),
      address: policyRaw.getAddress(),
      status: policy.status[policyRaw.getStatus()],
      limits: normalizeLimits,
      // Todo: replace stabs with getters:
      pdfLink: policyRaw.getPdfLink(),
      pdfSignatureLink: policyRaw.getPdfSignatureLink(),
    };

    emitter({ ...normalizePolicy });
  });

  stream.on('error', response => {
    emitter(response);
  });

  stream.on('end', () => {
    emitter(onEnd);
  });

  return () => {
    stream.end();
  };
};

// METHODS
export const createPolicy = address => {
  const request = new proto.PCreatePolicyRequest();
  request.setRequestId(uuid());
  request.setAddress(address);

  return client.createPolicy(request, {});
};

export const assignPolicy = (policyId, userId) => {
  const request = new proto.PAssignPolicyRequest();
  request.setRequestId(uuid());
  request.setPolicyId(policyId);
  request.setUserId(userId);

  return client.assignPolicy(request, {});
};

export const updateLimits = (policyId, limitName, amount) => {
  const request = new proto.PUpdateLimitsRequest();
  const limitAmount = new proto.PLimit();
  const amountObj = new proto.PAmount();
  amountObj.setAmount(amount);
  limitAmount.setValue(amountObj);

  request.setRequestId(uuid());
  request.setPolicyId(policyId);
  request.getLimitsMap().set(limitName.toUpperCase(), limitAmount);

  return client.updateLimits(request, {});
};

export const getPolicyByIdStream = ({ policyId, userId }, onEnd) => emitter => {
  const request = new proto.PGetPolicyRequest();
  request.setRequestId(uuid());
  if (policyId) request.setPolicyId(policyId);
  if (userId) request.setUserId(userId);

  return createPolicyStream(request, emitter, onEnd);
};

export const getPolicyByUserIdStream = (userId, onEnd) => emitter => {
  const request = new proto.PGetPolicyRequest();
  request.setRequestId(uuid());
  request.setUserId(userId);

  return createPolicyStream(request, emitter, onEnd);
};
