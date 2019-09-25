package ru.mango.rocks.api.policy.event;

import org.mapstruct.factory.Mappers;
import rocks.mango.api.policy.PPolicyEvent;
import rocks.mango.helper.kafka.serde.PojoDeserializer;
import rocks.mango.helper.kafka.serde.ProtobufDeserializer;

public class PolicyEventDeserializer extends PojoDeserializer<PolicyEvent, PPolicyEvent> {
    public PolicyEventDeserializer() {
        super(
                new ProtobufDeserializer<>(PPolicyEvent.getDefaultInstance()),
                Mappers.getMapper(PolicyEventConverter.class)
        );
    }
}
