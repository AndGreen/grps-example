package ru.mango.rocks.api.policy.entity;

import org.mapstruct.factory.Mappers;
import rocks.mango.api.policy.PPolicy;
import rocks.mango.helper.kafka.serde.PojoDeserializer;
import rocks.mango.helper.kafka.serde.ProtobufDeserializer;

public class PolicyDeserializer extends PojoDeserializer<Policy, PPolicy> {
    public PolicyDeserializer() {
        super(
                new ProtobufDeserializer<>(PPolicy.getDefaultInstance()),
                Mappers.getMapper(PolicyConverter.class)
        );
    }
}
