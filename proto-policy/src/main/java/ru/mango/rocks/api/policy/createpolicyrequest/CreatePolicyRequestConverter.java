package ru.mango.rocks.api.policy.createpolicyrequest;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import rocks.mango.api.policy.PCreatePolicyRequest;
import rocks.mango.api.policy.PPolicyCommand;
import rocks.mango.helper.interfaces.BiConverter;

import static org.mapstruct.NullValueCheckStrategy.ALWAYS;

@Mapper(nullValueCheckStrategy = ALWAYS)
public interface CreatePolicyRequestConverter extends BiConverter<PCreatePolicyRequest, PPolicyCommand> {
    @Override
    @Mapping(source = "requestId", target = "id")
    @Mapping(source = "address", target = "createPolicy.address")
    @Mapping(target = "allFields", ignore = true)
    @Mapping(target = "unknownFields", ignore = true)
    PPolicyCommand convert(PCreatePolicyRequest pCreatePolicyRequest);

    @Override
    @InheritInverseConfiguration
    @Mapping(target = "allFields", ignore = true)
    @Mapping(target = "unknownFields", ignore = true)
    PCreatePolicyRequest inverseConvert(PPolicyCommand pPolicyCommand);
}
