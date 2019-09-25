package ru.mango.rocks.api.policy.updatelimitsrequest;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import rocks.mango.api.policy.PPolicyCommand;
import rocks.mango.api.policy.PUpdateLimitsRequest;
import rocks.mango.helper.interfaces.BiConverter;

import static org.mapstruct.NullValueCheckStrategy.ALWAYS;

@Mapper(nullValueCheckStrategy = ALWAYS)
public interface UpdateLimitsRequestConverter extends BiConverter<PUpdateLimitsRequest, PPolicyCommand> {
    @Override
    @Mapping(source = "requestId", target = "id")
    @Mapping(source = "policyId", target = "updateLimits.policyId")
    @Mapping(source = "limits", target = "updateLimits.mutableLimits")
    @Mapping(target = "updateLimits.limits", ignore = true)
    @Mapping(target = "allFields", ignore = true)
    @Mapping(target = "unknownFields", ignore = true)
    PPolicyCommand convert(PUpdateLimitsRequest pUpdateLimitsRequest);

    @Override
    @Mapping(source = "id", target = "requestId")
    @Mapping(source = "updateLimits.policyId", target = "policyId")
    @Mapping(source = "updateLimits.limits", target = "mutableLimits")
    @Mapping(target = "limits", ignore = true)
    @Mapping(target = "allFields", ignore = true)
    @Mapping(target = "unknownFields", ignore = true)
    PUpdateLimitsRequest inverseConvert(PPolicyCommand pPolicyCommand);
}
