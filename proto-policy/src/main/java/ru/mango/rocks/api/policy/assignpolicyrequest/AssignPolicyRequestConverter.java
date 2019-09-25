package ru.mango.rocks.api.policy.assignpolicyrequest;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import rocks.mango.api.policy.PAssignPolicyRequest;
import rocks.mango.api.policy.PPolicyCommand;
import rocks.mango.helper.interfaces.BiConverter;

import static org.mapstruct.NullValueCheckStrategy.ALWAYS;

@Mapper(nullValueCheckStrategy = ALWAYS)
public interface AssignPolicyRequestConverter extends BiConverter<PAssignPolicyRequest, PPolicyCommand> {
    @Override
    @Mapping(source = "requestId", target = "id")
    @Mapping(source = "policyId", target = "assignPolicy.policyId")
    @Mapping(source = "userId", target = "assignPolicy.userId")
    @Mapping(target = "allFields", ignore = true)
    @Mapping(target = "unknownFields", ignore = true)
    PPolicyCommand convert(PAssignPolicyRequest pCreatePolicyRequest);

    @Override
    @InheritInverseConfiguration
    @Mapping(target = "allFields", ignore = true)
    @Mapping(target = "unknownFields", ignore = true)
    PAssignPolicyRequest inverseConvert(PPolicyCommand pPolicyCommand);
}
