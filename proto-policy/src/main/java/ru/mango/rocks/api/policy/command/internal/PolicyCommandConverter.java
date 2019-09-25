package ru.mango.rocks.api.policy.command.internal;

import org.mapstruct.Mapper;
import rocks.mango.api.policy.PPolicyCommand;
import rocks.mango.helper.interfaces.BiConverter;
import ru.mango.rocks.api.policy.base.AmountMapper;
import ru.mango.rocks.api.policy.base.TimestampMapper;
import ru.mango.rocks.api.policy.base.UuidMapper;
import ru.mango.rocks.api.policy.command.PolicyCommand;

import static org.mapstruct.InjectionStrategy.CONSTRUCTOR;
import static org.mapstruct.NullValueCheckStrategy.ALWAYS;

@Mapper(
        injectionStrategy = CONSTRUCTOR,
        uses = {TimestampMapper.class, UuidMapper.class, AmountMapper.class, UpdateLimitsCommandConverter.class},
        nullValueCheckStrategy = ALWAYS
)
public interface PolicyCommandConverter extends BiConverter<PolicyCommand, PPolicyCommand> {
}
