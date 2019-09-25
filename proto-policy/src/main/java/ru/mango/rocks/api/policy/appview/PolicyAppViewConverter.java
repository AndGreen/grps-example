package ru.mango.rocks.api.policy.appview;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import rocks.mango.helper.interfaces.BiConverter;
import ru.mango.rocks.api.policy.base.AmountMapper;
import ru.mango.rocks.api.policy.base.TimestampMapper;
import ru.mango.rocks.api.policy.base.UuidMapper;
import ru.mango.rocks.api.policy.entity.Policy;

import static org.mapstruct.NullValueCheckStrategy.ALWAYS;

@Mapper(uses = {AmountMapper.class, UuidMapper.class, TimestampMapper.class}, nullValueCheckStrategy = ALWAYS)
public interface PolicyAppViewConverter extends BiConverter<Policy, PolicyAppView> {
    @Override
    @Mappings({
            @Mapping(target = "address", source = "insuranceObjectId")
    })
    PolicyAppView convert(Policy policy);

    @Override
    @Mappings({
            @Mapping(target = "insuranceObjectId", source = "address")
    })
    Policy inverseConvert(PolicyAppView policyAppView);
}
