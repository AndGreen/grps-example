package ru.mango.rocks.api.policy.entity;

import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import rocks.mango.api.policy.PPolicy;
import rocks.mango.helper.interfaces.BiConverter;
import ru.mango.rocks.api.policy.base.AmountMapper;
import ru.mango.rocks.api.policy.base.TimestampMapper;
import ru.mango.rocks.api.policy.base.UuidMapper;

import static org.mapstruct.NullValueCheckStrategy.ALWAYS;

@Mapper(uses = {AmountMapper.class, UuidMapper.class, TimestampMapper.class},
        nullValueCheckStrategy = ALWAYS,
        collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED
)
public interface PolicyConverter extends BiConverter<Policy, PPolicy> {
    @Override
    @Mappings({
            @Mapping(target = "paymentIdsList", source = "paymentIds"),
            @Mapping(target = "mutableLimits", source = "limits"),
            @Mapping(target = "limits", ignore = true)
    })
    PPolicy convert(Policy policy);

    @Override
    @Mappings({
            @Mapping(target = "paymentIds", source = "paymentIdsList")
    })
    Policy inverseConvert(PPolicy pPolicy);
}
