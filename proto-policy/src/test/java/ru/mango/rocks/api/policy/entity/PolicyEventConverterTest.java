package ru.mango.rocks.api.policy.entity;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import rocks.mango.api.policy.PPolicy;
import rocks.mango.api.policy.PPolicyEvent;
import ru.mango.rocks.api.policy.event.PolicyEvent;
import ru.mango.rocks.api.policy.event.PolicyEventConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PolicyEventConverterTest {

    @Test
    void repeatedTest() {
        PPolicy pPolicy = PPolicy.newBuilder()
                .addPaymentIds("PaymentIds")
                .build();
        PolicyEventConverter converter = Mappers.getMapper(PolicyEventConverter.class);
        PolicyEvent policy = converter.inverseConvert(PPolicyEvent.newBuilder().setPolicy(pPolicy).build());
        assertEquals(pPolicy.getPaymentIdsList(), policy.getPolicy().getPaymentIds());
    }

}