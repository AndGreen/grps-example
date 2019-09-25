package ru.mango.rocks.api.policy.command.internal;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;

import rocks.mango.api.policy.PGeneratePolicyNumbers;
import rocks.mango.helper.interfaces.BiConverter;
import ru.mango.rocks.api.policy.base.UuidMapper;
import ru.mango.rocks.api.policy.command.GeneratePolicyNumbers;

@Mapper(
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        uses = {UuidMapper.class},
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface GeneratePolicyNumbersCommandConverter extends BiConverter<GeneratePolicyNumbers, PGeneratePolicyNumbers> {
    @Override
    @Mapping(target = "requestId", source = "id")
    @Mapping(target = "quantityNumbers", source = "numberCapacity")
    PGeneratePolicyNumbers convert(GeneratePolicyNumbers generatePolicyNumbersCommand);

    @Override
    @Mapping(target ="numberCapacity", source = "quantityNumbers")
    @Mapping(target ="id", source = "requestId")
    GeneratePolicyNumbers inverseConvert(PGeneratePolicyNumbers pGeneratePolicyNumbers);
}
