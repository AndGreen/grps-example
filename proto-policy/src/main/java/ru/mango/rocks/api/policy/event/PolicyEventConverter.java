package ru.mango.rocks.api.policy.event;

import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import rocks.mango.api.policy.PPolicyEvent;
import rocks.mango.helper.interfaces.BiConverter;
import ru.mango.rocks.api.policy.base.AmountMapper;
import ru.mango.rocks.api.policy.base.TimestampMapper;
import ru.mango.rocks.api.policy.base.UuidMapper;
import ru.mango.rocks.api.policy.entity.PolicyConverter;

import static org.mapstruct.InjectionStrategy.CONSTRUCTOR;
import static org.mapstruct.NullValueCheckStrategy.ALWAYS;

@Mapper(
        injectionStrategy = CONSTRUCTOR,
        uses = {TimestampMapper.class, UuidMapper.class, AmountMapper.class, PolicyConverter.class},
        nullValueCheckStrategy = ALWAYS,
        collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED
)
public interface PolicyEventConverter extends BiConverter<PolicyEvent, PPolicyEvent> {
    @Override
    @Mappings({
            @Mapping(target = "commandId", source = "id")
    })
    PPolicyEvent convert(PolicyEvent policyEvent);

    @Override
    @Mappings({
            @Mapping(target = "id", source = "commandId")
    })
    PolicyEvent inverseConvert(PPolicyEvent pPolicyEvent);

}
