package ru.mango.rocks.api.policy.command.internal;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import rocks.mango.api.policy.PGeneratePolicyNumbers;
import ru.mango.rocks.api.policy.command.GeneratePolicyNumbers;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratePolicyNumbersCommandConverterTest {
    private final GeneratePolicyNumbersCommandConverter converter =
            Mappers.getMapper(GeneratePolicyNumbersCommandConverter.class);

    @Test
    public void testConvertProtoToDomain() {
        PGeneratePolicyNumbers proto = pGeneratePolicyNumbers();
        GeneratePolicyNumbers domain = converter.inverseConvert(proto);

        assertEquals(proto.getRequestId(), domain.getId().toString());
        assertEquals(proto.getQuantityNumbers(), domain.getNumberCapacity());
    }

    @Test
    public void testConvertDomainToProto() {
        GeneratePolicyNumbers domain = generatePolicyNumbers();
        PGeneratePolicyNumbers proto = converter.convert(domain);

        assertEquals(domain.getId().toString(), proto.getRequestId());
        assertEquals(domain.getNumberCapacity(), proto.getQuantityNumbers());
    }

    private GeneratePolicyNumbers generatePolicyNumbers() {
        return GeneratePolicyNumbers
                .builder()
                .id(UUID.randomUUID())
                .numberCapacity(42)
                .build();
    }

    private PGeneratePolicyNumbers pGeneratePolicyNumbers() {
        return PGeneratePolicyNumbers.newBuilder()
                .setRequestId(UUID.randomUUID().toString())
                .setQuantityNumbers(100)
                .build();
    }

}