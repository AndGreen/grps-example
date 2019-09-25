package ru.mango.rocks.api.policy.command.internal;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import rocks.mango.api.policy.PUpdateLimits;
import rocks.mango.helper.interfaces.BiConverter;
import ru.mango.rocks.api.policy.base.AmountMapper;
import ru.mango.rocks.api.policy.base.UuidMapper;
import ru.mango.rocks.api.policy.command.UpdateLimits;

import static org.mapstruct.InjectionStrategy.CONSTRUCTOR;

@Mapper(injectionStrategy = CONSTRUCTOR, uses = {AmountMapper.class, UuidMapper.class})
public interface UpdateLimitsCommandConverter extends BiConverter<UpdateLimits, PUpdateLimits> {
    @Override
    @Mappings({
            @Mapping(source = "limits", target = "mutableLimits"),
            @Mapping(target = "limits", ignore = true)
    })
    PUpdateLimits convert(UpdateLimits assignPolicy);

    @Override
    UpdateLimits inverseConvert(PUpdateLimits pUpdateLimits);
}
