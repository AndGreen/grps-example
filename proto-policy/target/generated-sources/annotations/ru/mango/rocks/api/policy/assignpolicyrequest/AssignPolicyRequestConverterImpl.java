package ru.mango.rocks.api.policy.assignpolicyrequest;

import javax.annotation.Generated;
import rocks.mango.api.policy.PAssignPolicy;
import rocks.mango.api.policy.PAssignPolicyRequest;
import rocks.mango.api.policy.PPolicyCommand;
import rocks.mango.api.policy.PPolicyCommand.Builder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-09-17T20:57:51+0000",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.3 (Azul Systems, Inc.)"
)
public class AssignPolicyRequestConverterImpl implements AssignPolicyRequestConverter {

    @Override
    public PPolicyCommand convert(PAssignPolicyRequest pCreatePolicyRequest) {
        if ( pCreatePolicyRequest == null ) {
            return null;
        }

        Builder pPolicyCommand = PPolicyCommand.newBuilder();

        pPolicyCommand.setAssignPolicy( pAssignPolicyRequestToPAssignPolicy( pCreatePolicyRequest ) );
        if ( pCreatePolicyRequest.getRequestId() != null ) {
            pPolicyCommand.setId( pCreatePolicyRequest.getRequestId() );
        }

        return pPolicyCommand.build();
    }

    @Override
    public PAssignPolicyRequest inverseConvert(PPolicyCommand pPolicyCommand) {
        if ( pPolicyCommand == null ) {
            return null;
        }

        rocks.mango.api.policy.PAssignPolicyRequest.Builder pAssignPolicyRequest = PAssignPolicyRequest.newBuilder();

        String policyId = pPolicyCommandAssignPolicyPolicyId( pPolicyCommand );
        if ( pPolicyCommand.hasAssignPolicy() ) {
            pAssignPolicyRequest.setPolicyId( policyId );
        }
        if ( pPolicyCommand.getId() != null ) {
            pAssignPolicyRequest.setRequestId( pPolicyCommand.getId() );
        }
        String userId = pPolicyCommandAssignPolicyUserId( pPolicyCommand );
        if ( pPolicyCommand.hasAssignPolicy() ) {
            pAssignPolicyRequest.setUserId( userId );
        }

        return pAssignPolicyRequest.build();
    }

    protected PAssignPolicy pAssignPolicyRequestToPAssignPolicy(PAssignPolicyRequest pAssignPolicyRequest) {
        if ( pAssignPolicyRequest == null ) {
            return null;
        }

        rocks.mango.api.policy.PAssignPolicy.Builder pAssignPolicy = PAssignPolicy.newBuilder();

        if ( pAssignPolicyRequest.getUserId() != null ) {
            pAssignPolicy.setUserId( pAssignPolicyRequest.getUserId() );
        }
        if ( pAssignPolicyRequest.getPolicyId() != null ) {
            pAssignPolicy.setPolicyId( pAssignPolicyRequest.getPolicyId() );
        }

        return pAssignPolicy.build();
    }

    private String pPolicyCommandAssignPolicyPolicyId(PPolicyCommand pPolicyCommand) {
        if ( pPolicyCommand == null ) {
            return null;
        }
        if ( !pPolicyCommand.hasAssignPolicy() ) {
            return null;
        }
        PAssignPolicy assignPolicy = pPolicyCommand.getAssignPolicy();
        String policyId = assignPolicy.getPolicyId();
        if ( policyId == null ) {
            return null;
        }
        return policyId;
    }

    private String pPolicyCommandAssignPolicyUserId(PPolicyCommand pPolicyCommand) {
        if ( pPolicyCommand == null ) {
            return null;
        }
        if ( !pPolicyCommand.hasAssignPolicy() ) {
            return null;
        }
        PAssignPolicy assignPolicy = pPolicyCommand.getAssignPolicy();
        String userId = assignPolicy.getUserId();
        if ( userId == null ) {
            return null;
        }
        return userId;
    }
}
