package ru.mango.rocks.api.policy.event;

import javax.annotation.Generated;
import rocks.mango.api.policy.PPolicyNumber;
import rocks.mango.api.policy.PPolicyNumber.Builder;
import ru.mango.rocks.api.policy.base.UuidMapper;
import ru.mango.rocks.api.policy.event.PolicyNumberEvent.PolicyNumberEventBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-09-17T20:57:49+0000",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.3 (Azul Systems, Inc.)"
)
public class PolicyNumberEventConverterImpl implements PolicyNumberEventConverter {

    private final UuidMapper uuidMapper = new UuidMapper();

    @Override
    public PPolicyNumber convert(PolicyNumberEvent event) {
        if ( event == null ) {
            return null;
        }

        Builder pPolicyNumber = PPolicyNumber.newBuilder();

        if ( event.getId() != null ) {
            pPolicyNumber.setRequestId( uuidMapper.toString( event.getId() ) );
        }
        if ( event.getNumber() != null ) {
            pPolicyNumber.setNumber( event.getNumber() );
        }

        return pPolicyNumber.build();
    }

    @Override
    public PolicyNumberEvent inverseConvert(PPolicyNumber pPolicyNumber) {
        if ( pPolicyNumber == null ) {
            return null;
        }

        PolicyNumberEventBuilder policyNumberEvent = PolicyNumberEvent.builder();

        if ( pPolicyNumber.getRequestId() != null ) {
            policyNumberEvent.id( uuidMapper.toUUID( pPolicyNumber.getRequestId() ) );
        }
        if ( pPolicyNumber.getNumber() != null ) {
            policyNumberEvent.number( pPolicyNumber.getNumber() );
        }

        return policyNumberEvent.build();
    }
}
