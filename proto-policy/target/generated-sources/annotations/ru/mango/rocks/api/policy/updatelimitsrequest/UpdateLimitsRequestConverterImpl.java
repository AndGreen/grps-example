package ru.mango.rocks.api.policy.updatelimitsrequest;

import java.util.Map;
import javax.annotation.Generated;
import rocks.mango.api.policy.PLimit;
import rocks.mango.api.policy.PPolicyCommand;
import rocks.mango.api.policy.PPolicyCommand.Builder;
import rocks.mango.api.policy.PUpdateLimits;
import rocks.mango.api.policy.PUpdateLimitsRequest;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-09-17T20:57:49+0000",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.3 (Azul Systems, Inc.)"
)
public class UpdateLimitsRequestConverterImpl implements UpdateLimitsRequestConverter {

    @Override
    public PPolicyCommand convert(PUpdateLimitsRequest pUpdateLimitsRequest) {
        if ( pUpdateLimitsRequest == null ) {
            return null;
        }

        Builder pPolicyCommand = PPolicyCommand.newBuilder();

        pPolicyCommand.setUpdateLimits( pUpdateLimitsRequestToPUpdateLimits( pUpdateLimitsRequest ) );
        if ( pUpdateLimitsRequest.getRequestId() != null ) {
            pPolicyCommand.setId( pUpdateLimitsRequest.getRequestId() );
        }

        return pPolicyCommand.build();
    }

    @Override
    public PUpdateLimitsRequest inverseConvert(PPolicyCommand pPolicyCommand) {
        if ( pPolicyCommand == null ) {
            return null;
        }

        rocks.mango.api.policy.PUpdateLimitsRequest.Builder pUpdateLimitsRequest = PUpdateLimitsRequest.newBuilder();

        String policyId = pPolicyCommandUpdateLimitsPolicyId( pPolicyCommand );
        if ( pPolicyCommand.hasUpdateLimits() ) {
            pUpdateLimitsRequest.setPolicyId( policyId );
        }
        if ( pPolicyCommand.getId() != null ) {
            pUpdateLimitsRequest.setRequestId( pPolicyCommand.getId() );
        }
        Map<String, PLimit> limits = pPolicyCommandUpdateLimitsLimits( pPolicyCommand );
        if ( pUpdateLimitsRequest.getMutableLimits() != null ) {
            if ( pPolicyCommand.hasUpdateLimits() ) {
                pUpdateLimitsRequest.getMutableLimits().putAll( limits );
            }
        }

        return pUpdateLimitsRequest.build();
    }

    protected PUpdateLimits pUpdateLimitsRequestToPUpdateLimits(PUpdateLimitsRequest pUpdateLimitsRequest) {
        if ( pUpdateLimitsRequest == null ) {
            return null;
        }

        rocks.mango.api.policy.PUpdateLimits.Builder pUpdateLimits = PUpdateLimits.newBuilder();

        if ( pUpdateLimits.getMutableLimits() != null ) {
            Map<String, PLimit> map = pUpdateLimitsRequest.getLimits();
            if ( map != null ) {
                pUpdateLimits.getMutableLimits().putAll( map );
            }
        }
        if ( pUpdateLimitsRequest.getPolicyId() != null ) {
            pUpdateLimits.setPolicyId( pUpdateLimitsRequest.getPolicyId() );
        }

        return pUpdateLimits.build();
    }

    private String pPolicyCommandUpdateLimitsPolicyId(PPolicyCommand pPolicyCommand) {
        if ( pPolicyCommand == null ) {
            return null;
        }
        if ( !pPolicyCommand.hasUpdateLimits() ) {
            return null;
        }
        PUpdateLimits updateLimits = pPolicyCommand.getUpdateLimits();
        String policyId = updateLimits.getPolicyId();
        if ( policyId == null ) {
            return null;
        }
        return policyId;
    }

    private Map<String, PLimit> pPolicyCommandUpdateLimitsLimits(PPolicyCommand pPolicyCommand) {
        if ( pPolicyCommand == null ) {
            return null;
        }
        if ( !pPolicyCommand.hasUpdateLimits() ) {
            return null;
        }
        PUpdateLimits updateLimits = pPolicyCommand.getUpdateLimits();
        Map<String, PLimit> limits = updateLimits.getLimits();
        if ( limits == null ) {
            return null;
        }
        return limits;
    }
}
