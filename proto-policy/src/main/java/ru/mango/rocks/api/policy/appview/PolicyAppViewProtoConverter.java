package ru.mango.rocks.api.policy.appview;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import rocks.mango.api.policy.PPolicyAppView;
import rocks.mango.helper.interfaces.BiConverter;
import ru.mango.rocks.api.policy.base.AmountMapper;
import ru.mango.rocks.api.policy.base.TimestampMapper;
import ru.mango.rocks.api.policy.base.UuidMapper;

import static org.mapstruct.NullValueCheckStrategy.ALWAYS;

@Mapper(uses = {AmountMapper.class, UuidMapper.class, TimestampMapper.class}, nullValueCheckStrategy = ALWAYS)
public interface PolicyAppViewProtoConverter extends BiConverter<PolicyAppView, PPolicyAppView> {
    @Override
    @Mappings({
            @Mapping(source = "limits", target = "mutableLimits"),
            @Mapping(target = "limits", ignore = true)
    })
    PPolicyAppView convert(PolicyAppView policyAppView);
}
