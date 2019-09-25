import { eventChannel, END } from 'redux-saga';
import { call, put, takeLatest, take } from 'redux-saga/effects';
import Cookies from 'js-cookie';
import { push } from 'connected-react-router';
import {
  POLICY_CREATE,
  POLICY_ASSIGN,
  POLICY_GET,
  POLICY_UPDATE,
  POLICY_UPDATE_LIMIT,
} from './actions';
import {
  createPolicy,
  assignPolicy,
  updateLimits,
  getPolicyByIdStream,
} from 'api/policy';
import { getTokenField } from 'utils/cookie';
import { sagaType } from 'utils/actions';

function* createPolicySaga(action) {
  const address = action.payload;

  try {
    const response = yield call(createPolicy, address);
    const policyId = response.getPolicyId();
    yield put({ type: sagaType(POLICY_CREATE, true), payload: policyId });
    Cookies.set('policyId', policyId);
    yield put(push('/offer/limits'));
  } catch (error) {
    yield put({ type: sagaType(POLICY_CREATE, false), payload: error });
  }
}

function* assignPolicySaga() {
  const userId = getTokenField('id');
  const policyId = Cookies.get('policyId');

  try {
    yield call(assignPolicy, policyId, userId);
    yield put({ type: sagaType(POLICY_ASSIGN, true), payload: policyId });
  } catch (error) {
    yield put({ type: sagaType(POLICY_ASSIGN, false), payload: error });
  }
}

function* updateLimitsSaga(action) {
  const { policyId, limitName, amount } = action.payload;

  try {
    yield call(updateLimits, policyId, limitName, amount);
    yield put({ type: sagaType(POLICY_UPDATE_LIMIT, true) });
  } catch (error) {
    yield put({ type: sagaType(POLICY_UPDATE_LIMIT, false), payload: error });
  }
}

function* getPolicySaga({ payload }) {
  const channel = () => eventChannel(getPolicyByIdStream(payload, () => END));

  try {
    const stream = yield call(channel);
    yield put({ type: sagaType(POLICY_GET, true) });
    while (true) {
      const response = yield take(stream);
      if (response.code) {
        yield put({
          type: sagaType(POLICY_UPDATE, false),
          payload: response,
        });
      } else {
        yield put({ type: sagaType(POLICY_UPDATE, true), payload: response });
      }
    }
  } catch (error) {
    yield put({ type: sagaType(POLICY_GET, false), payload: error });
  }
}

export default function* policy() {
  yield takeLatest(POLICY_CREATE, createPolicySaga);
  yield takeLatest(POLICY_ASSIGN, assignPolicySaga);
  yield takeLatest(POLICY_GET, getPolicySaga);
  yield takeLatest(POLICY_UPDATE_LIMIT, updateLimitsSaga);
}
