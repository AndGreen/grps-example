package ru.mango.rocks.api.policy.event;

import org.mapstruct.factory.Mappers;
import rocks.mango.api.policy.PPolicyEvent;
import rocks.mango.helper.kafka.serde.PojoSerializer;
import rocks.mango.helper.kafka.serde.ProtobufSerializer;

public class PolicyEventSerializer extends PojoSerializer<PolicyEvent, PPolicyEvent> {
    public PolicyEventSerializer() {
        super(
                new ProtobufSerializer<>(),
                Mappers.getMapper(PolicyEventConverter.class)
        );
    }
}
