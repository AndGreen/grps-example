package ru.mango.rocks.api.policy.command.internal;

import javax.annotation.Generated;
import org.mapstruct.factory.Mappers;
import rocks.mango.api.policy.PAssignPolicy;
import rocks.mango.api.policy.PCreatePolicy;
import rocks.mango.api.policy.PPolicyCommand;
import rocks.mango.api.policy.PPolicyCommand.Builder;
import rocks.mango.api.policy.PRenewPolicy;
import ru.mango.rocks.api.policy.base.UuidMapper;
import ru.mango.rocks.api.policy.command.AssignPolicy;
import ru.mango.rocks.api.policy.command.AssignPolicy.AssignPolicyBuilder;
import ru.mango.rocks.api.policy.command.CreatePolicy;
import ru.mango.rocks.api.policy.command.CreatePolicy.CreatePolicyBuilder;
import ru.mango.rocks.api.policy.command.PolicyCommand;
import ru.mango.rocks.api.policy.command.PolicyCommand.PolicyCommandBuilder;
import ru.mango.rocks.api.policy.command.RenewPolicy;
import ru.mango.rocks.api.policy.command.RenewPolicy.RenewPolicyBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-09-17T20:57:47+0000",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.3 (Azul Systems, Inc.)"
)
public class PolicyCommandConverterImpl implements PolicyCommandConverter {

    private final UuidMapper uuidMapper = new UuidMapper();
    private final UpdateLimitsCommandConverter updateLimitsCommandConverter = Mappers.getMapper( UpdateLimitsCommandConverter.class );

    @Override
    public PPolicyCommand convert(PolicyCommand arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Builder pPolicyCommand = PPolicyCommand.newBuilder();

        if ( arg0.getId() != null ) {
            pPolicyCommand.setId( uuidMapper.toString( arg0.getId() ) );
        }
        if ( arg0.getCreatePolicy() != null ) {
            pPolicyCommand.setCreatePolicy( createPolicyToPCreatePolicy( arg0.getCreatePolicy() ) );
        }
        if ( arg0.getAssignPolicy() != null ) {
            pPolicyCommand.setAssignPolicy( assignPolicyToPAssignPolicy( arg0.getAssignPolicy() ) );
        }
        if ( arg0.getUpdateLimits() != null ) {
            pPolicyCommand.setUpdateLimits( updateLimitsCommandConverter.convert( arg0.getUpdateLimits() ) );
        }
        if ( arg0.getRenewPolicy() != null ) {
            pPolicyCommand.setRenewPolicy( renewPolicyToPRenewPolicy( arg0.getRenewPolicy() ) );
        }

        return pPolicyCommand.build();
    }

    @Override
    public PolicyCommand inverseConvert(PPolicyCommand arg0) {
        if ( arg0 == null ) {
            return null;
        }

        PolicyCommandBuilder policyCommand = PolicyCommand.builder();

        if ( arg0.getId() != null ) {
            policyCommand.id( uuidMapper.toUUID( arg0.getId() ) );
        }
        if ( arg0.hasCreatePolicy() ) {
            policyCommand.createPolicy( pCreatePolicyToCreatePolicy( arg0.getCreatePolicy() ) );
        }
        if ( arg0.hasUpdateLimits() ) {
            policyCommand.updateLimits( updateLimitsCommandConverter.inverseConvert( arg0.getUpdateLimits() ) );
        }
        if ( arg0.hasAssignPolicy() ) {
            policyCommand.assignPolicy( pAssignPolicyToAssignPolicy( arg0.getAssignPolicy() ) );
        }
        if ( arg0.hasRenewPolicy() ) {
            policyCommand.renewPolicy( pRenewPolicyToRenewPolicy( arg0.getRenewPolicy() ) );
        }

        return policyCommand.build();
    }

    protected PCreatePolicy createPolicyToPCreatePolicy(CreatePolicy createPolicy) {
        if ( createPolicy == null ) {
            return null;
        }

        rocks.mango.api.policy.PCreatePolicy.Builder pCreatePolicy = PCreatePolicy.newBuilder();

        if ( createPolicy.getPolicyId() != null ) {
            pCreatePolicy.setPolicyId( uuidMapper.toString( createPolicy.getPolicyId() ) );
        }
        if ( createPolicy.getAddress() != null ) {
            pCreatePolicy.setAddress( createPolicy.getAddress() );
        }

        return pCreatePolicy.build();
    }

    protected PAssignPolicy assignPolicyToPAssignPolicy(AssignPolicy assignPolicy) {
        if ( assignPolicy == null ) {
            return null;
        }

        rocks.mango.api.policy.PAssignPolicy.Builder pAssignPolicy = PAssignPolicy.newBuilder();

        if ( assignPolicy.getPolicyId() != null ) {
            pAssignPolicy.setPolicyId( uuidMapper.toString( assignPolicy.getPolicyId() ) );
        }
        if ( assignPolicy.getUserId() != null ) {
            pAssignPolicy.setUserId( uuidMapper.toString( assignPolicy.getUserId() ) );
        }

        return pAssignPolicy.build();
    }

    protected PRenewPolicy renewPolicyToPRenewPolicy(RenewPolicy renewPolicy) {
        if ( renewPolicy == null ) {
            return null;
        }

        rocks.mango.api.policy.PRenewPolicy.Builder pRenewPolicy = PRenewPolicy.newBuilder();

        if ( renewPolicy.getPolicyId() != null ) {
            pRenewPolicy.setPolicyId( uuidMapper.toString( renewPolicy.getPolicyId() ) );
        }
        if ( renewPolicy.getPaymentId() != null ) {
            pRenewPolicy.setPaymentId( renewPolicy.getPaymentId() );
        }

        return pRenewPolicy.build();
    }

    protected CreatePolicy pCreatePolicyToCreatePolicy(PCreatePolicy pCreatePolicy) {
        if ( pCreatePolicy == null ) {
            return null;
        }

        CreatePolicyBuilder createPolicy = CreatePolicy.builder();

        if ( pCreatePolicy.getPolicyId() != null ) {
            createPolicy.policyId( uuidMapper.toUUID( pCreatePolicy.getPolicyId() ) );
        }
        if ( pCreatePolicy.getAddress() != null ) {
            createPolicy.address( pCreatePolicy.getAddress() );
        }

        return createPolicy.build();
    }

    protected AssignPolicy pAssignPolicyToAssignPolicy(PAssignPolicy pAssignPolicy) {
        if ( pAssignPolicy == null ) {
            return null;
        }

        AssignPolicyBuilder assignPolicy = AssignPolicy.builder();

        if ( pAssignPolicy.getPolicyId() != null ) {
            assignPolicy.policyId( uuidMapper.toUUID( pAssignPolicy.getPolicyId() ) );
        }
        if ( pAssignPolicy.getUserId() != null ) {
            assignPolicy.userId( uuidMapper.toUUID( pAssignPolicy.getUserId() ) );
        }

        return assignPolicy.build();
    }

    protected RenewPolicy pRenewPolicyToRenewPolicy(PRenewPolicy pRenewPolicy) {
        if ( pRenewPolicy == null ) {
            return null;
        }

        RenewPolicyBuilder renewPolicy = RenewPolicy.builder();

        if ( pRenewPolicy.getPolicyId() != null ) {
            renewPolicy.policyId( uuidMapper.toUUID( pRenewPolicy.getPolicyId() ) );
        }
        if ( pRenewPolicy.getPaymentId() != null ) {
            renewPolicy.paymentId( pRenewPolicy.getPaymentId() );
        }

        return renewPolicy.build();
    }
}
