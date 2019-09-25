package ru.mango.rocks.api.policy.createpolicyrequest;

import javax.annotation.Generated;
import rocks.mango.api.policy.PCreatePolicy;
import rocks.mango.api.policy.PCreatePolicyRequest;
import rocks.mango.api.policy.PPolicyCommand;
import rocks.mango.api.policy.PPolicyCommand.Builder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-09-17T20:57:52+0000",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.3 (Azul Systems, Inc.)"
)
public class CreatePolicyRequestConverterImpl implements CreatePolicyRequestConverter {

    @Override
    public PPolicyCommand convert(PCreatePolicyRequest pCreatePolicyRequest) {
        if ( pCreatePolicyRequest == null ) {
            return null;
        }

        Builder pPolicyCommand = PPolicyCommand.newBuilder();

        pPolicyCommand.setCreatePolicy( pCreatePolicyRequestToPCreatePolicy( pCreatePolicyRequest ) );
        if ( pCreatePolicyRequest.getRequestId() != null ) {
            pPolicyCommand.setId( pCreatePolicyRequest.getRequestId() );
        }

        return pPolicyCommand.build();
    }

    @Override
    public PCreatePolicyRequest inverseConvert(PPolicyCommand pPolicyCommand) {
        if ( pPolicyCommand == null ) {
            return null;
        }

        rocks.mango.api.policy.PCreatePolicyRequest.Builder pCreatePolicyRequest = PCreatePolicyRequest.newBuilder();

        String address = pPolicyCommandCreatePolicyAddress( pPolicyCommand );
        if ( pPolicyCommand.hasCreatePolicy() ) {
            pCreatePolicyRequest.setAddress( address );
        }
        if ( pPolicyCommand.getId() != null ) {
            pCreatePolicyRequest.setRequestId( pPolicyCommand.getId() );
        }

        return pCreatePolicyRequest.build();
    }

    protected PCreatePolicy pCreatePolicyRequestToPCreatePolicy(PCreatePolicyRequest pCreatePolicyRequest) {
        if ( pCreatePolicyRequest == null ) {
            return null;
        }

        rocks.mango.api.policy.PCreatePolicy.Builder pCreatePolicy = PCreatePolicy.newBuilder();

        if ( pCreatePolicyRequest.getAddress() != null ) {
            pCreatePolicy.setAddress( pCreatePolicyRequest.getAddress() );
        }

        return pCreatePolicy.build();
    }

    private String pPolicyCommandCreatePolicyAddress(PPolicyCommand pPolicyCommand) {
        if ( pPolicyCommand == null ) {
            return null;
        }
        if ( !pPolicyCommand.hasCreatePolicy() ) {
            return null;
        }
        PCreatePolicy createPolicy = pPolicyCommand.getCreatePolicy();
        String address = createPolicy.getAddress();
        if ( address == null ) {
            return null;
        }
        return address;
    }
}
