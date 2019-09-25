package ru.mango.rocks.api.policy.event;

import static org.mapstruct.InjectionStrategy.CONSTRUCTOR;
import static org.mapstruct.NullValueCheckStrategy.ALWAYS;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import rocks.mango.api.policy.PPolicyNumber;
import rocks.mango.helper.interfaces.BiConverter;
import ru.mango.rocks.api.policy.base.UuidMapper;
import ru.mango.rocks.api.policy.event.PolicyNumberEvent;

@Mapper(
        injectionStrategy = CONSTRUCTOR,
        uses = { UuidMapper.class},
        nullValueCheckStrategy = ALWAYS
)
public interface PolicyNumberEventConverter extends BiConverter<PolicyNumberEvent, PPolicyNumber> {

    @Override
    @Mapping(target = "requestId", source = "id")
    PPolicyNumber convert(PolicyNumberEvent event);

    @Override
    @Mapping(target = "id", source = "requestId")
    PolicyNumberEvent inverseConvert(PPolicyNumber pPolicyNumber);
}
