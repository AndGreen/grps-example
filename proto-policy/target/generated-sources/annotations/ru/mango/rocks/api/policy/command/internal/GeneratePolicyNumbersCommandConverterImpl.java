package ru.mango.rocks.api.policy.command.internal;

import javax.annotation.Generated;
import rocks.mango.api.policy.PGeneratePolicyNumbers;
import rocks.mango.api.policy.PGeneratePolicyNumbers.Builder;
import ru.mango.rocks.api.policy.base.UuidMapper;
import ru.mango.rocks.api.policy.command.GeneratePolicyNumbers;
import ru.mango.rocks.api.policy.command.GeneratePolicyNumbers.GeneratePolicyNumbersBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-09-17T20:57:49+0000",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.3 (Azul Systems, Inc.)"
)
public class GeneratePolicyNumbersCommandConverterImpl implements GeneratePolicyNumbersCommandConverter {

    private final UuidMapper uuidMapper = new UuidMapper();

    @Override
    public PGeneratePolicyNumbers convert(GeneratePolicyNumbers generatePolicyNumbersCommand) {
        if ( generatePolicyNumbersCommand == null ) {
            return null;
        }

        Builder pGeneratePolicyNumbers = PGeneratePolicyNumbers.newBuilder();

        pGeneratePolicyNumbers.setQuantityNumbers( generatePolicyNumbersCommand.getNumberCapacity() );
        if ( generatePolicyNumbersCommand.getId() != null ) {
            pGeneratePolicyNumbers.setRequestId( uuidMapper.toString( generatePolicyNumbersCommand.getId() ) );
        }

        return pGeneratePolicyNumbers.build();
    }

    @Override
    public GeneratePolicyNumbers inverseConvert(PGeneratePolicyNumbers pGeneratePolicyNumbers) {
        if ( pGeneratePolicyNumbers == null ) {
            return null;
        }

        GeneratePolicyNumbersBuilder generatePolicyNumbers = GeneratePolicyNumbers.builder();

        generatePolicyNumbers.numberCapacity( pGeneratePolicyNumbers.getQuantityNumbers() );
        if ( pGeneratePolicyNumbers.getRequestId() != null ) {
            generatePolicyNumbers.id( uuidMapper.toUUID( pGeneratePolicyNumbers.getRequestId() ) );
        }

        return generatePolicyNumbers.build();
    }
}
