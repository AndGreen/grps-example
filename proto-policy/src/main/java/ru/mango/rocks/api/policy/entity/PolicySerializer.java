package ru.mango.rocks.api.policy.entity;

import org.mapstruct.factory.Mappers;
import rocks.mango.api.policy.PPolicy;
import rocks.mango.helper.kafka.serde.PojoSerializer;
import rocks.mango.helper.kafka.serde.ProtobufSerializer;

public class PolicySerializer extends PojoSerializer<Policy, PPolicy> {
    public PolicySerializer() {
        super(
                new ProtobufSerializer<>(),
                Mappers.getMapper(PolicyConverter.class)
        );
    }
}
