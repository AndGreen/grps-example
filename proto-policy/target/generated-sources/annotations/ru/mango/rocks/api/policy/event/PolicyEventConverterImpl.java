package ru.mango.rocks.api.policy.event;

import javax.annotation.Generated;
import org.mapstruct.factory.Mappers;
import rocks.mango.api.policy.PPolicyEvent;
import rocks.mango.api.policy.PPolicyEvent.Builder;
import ru.mango.rocks.api.policy.base.UuidMapper;
import ru.mango.rocks.api.policy.entity.PolicyConverter;
import ru.mango.rocks.api.policy.event.PolicyEvent.PolicyEventBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-09-17T20:57:52+0000",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.3 (Azul Systems, Inc.)"
)
public class PolicyEventConverterImpl implements PolicyEventConverter {

    private final UuidMapper uuidMapper = new UuidMapper();
    private final PolicyConverter policyConverter = Mappers.getMapper( PolicyConverter.class );

    @Override
    public PPolicyEvent convert(PolicyEvent policyEvent) {
        if ( policyEvent == null ) {
            return null;
        }

        Builder pPolicyEvent = PPolicyEvent.newBuilder();

        if ( policyEvent.getId() != null ) {
            pPolicyEvent.setCommandId( uuidMapper.toString( policyEvent.getId() ) );
        }
        if ( policyEvent.getErrorCode() != null ) {
            pPolicyEvent.setErrorCode( policyEvent.getErrorCode() );
        }
        if ( policyEvent.getErrorMessage() != null ) {
            pPolicyEvent.setErrorMessage( policyEvent.getErrorMessage() );
        }
        if ( policyEvent.getEventType() != null ) {
            pPolicyEvent.setEventType( policyEvent.getEventType() );
        }
        if ( policyEvent.getPolicy() != null ) {
            pPolicyEvent.setPolicy( policyConverter.convert( policyEvent.getPolicy() ) );
        }

        return pPolicyEvent.build();
    }

    @Override
    public PolicyEvent inverseConvert(PPolicyEvent pPolicyEvent) {
        if ( pPolicyEvent == null ) {
            return null;
        }

        PolicyEventBuilder policyEvent = PolicyEvent.builder();

        if ( pPolicyEvent.getCommandId() != null ) {
            policyEvent.id( uuidMapper.toUUID( pPolicyEvent.getCommandId() ) );
        }
        if ( pPolicyEvent.getErrorCode() != null ) {
            policyEvent.errorCode( pPolicyEvent.getErrorCode() );
        }
        if ( pPolicyEvent.getErrorMessage() != null ) {
            policyEvent.errorMessage( pPolicyEvent.getErrorMessage() );
        }
        if ( pPolicyEvent.getEventType() != null ) {
            policyEvent.eventType( pPolicyEvent.getEventType() );
        }
        if ( pPolicyEvent.hasPolicy() ) {
            policyEvent.policy( policyConverter.inverseConvert( pPolicyEvent.getPolicy() ) );
        }

        return policyEvent.build();
    }
}
