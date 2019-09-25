package ru.mango.rocks.api.policy.appview;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import ru.mango.rocks.api.policy.appview.PolicyAppView.PolicyAppViewBuilder;
import ru.mango.rocks.api.policy.base.UuidMapper;
import ru.mango.rocks.api.policy.entity.Limit;
import ru.mango.rocks.api.policy.entity.Policy;
import ru.mango.rocks.api.policy.entity.Policy.PolicyBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-09-17T20:57:48+0000",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.3 (Azul Systems, Inc.)"
)
public class PolicyAppViewConverterImpl implements PolicyAppViewConverter {

    private final UuidMapper uuidMapper = new UuidMapper();

    @Override
    public PolicyAppView convert(Policy policy) {
        if ( policy == null ) {
            return null;
        }

        PolicyAppViewBuilder policyAppView = PolicyAppView.builder();

        if ( policy.getInsuranceObjectId() != null ) {
            policyAppView.address( policy.getInsuranceObjectId() );
        }
        if ( policy.getId() != null ) {
            policyAppView.id( policy.getId() );
        }
        if ( policy.getPrice() != null ) {
            policyAppView.price( policy.getPrice() );
        }
        Map<String, Limit> map = policy.getLimits();
        if ( map != null ) {
            policyAppView.limits( new HashMap<String, Limit>( map ) );
        }
        if ( policy.getSubscriptionId() != null ) {
            policyAppView.subscriptionId( uuidMapper.toString( policy.getSubscriptionId() ) );
        }
        if ( policy.getStartDate() != null ) {
            policyAppView.startDate( policy.getStartDate() );
        }
        if ( policy.getEndDate() != null ) {
            policyAppView.endDate( policy.getEndDate() );
        }

        return policyAppView.build();
    }

    @Override
    public Policy inverseConvert(PolicyAppView policyAppView) {
        if ( policyAppView == null ) {
            return null;
        }

        PolicyBuilder policy = Policy.builder();

        if ( policyAppView.getAddress() != null ) {
            policy.insuranceObjectId( policyAppView.getAddress() );
        }
        if ( policyAppView.getId() != null ) {
            policy.id( policyAppView.getId() );
        }
        if ( policyAppView.getStartDate() != null ) {
            policy.startDate( policyAppView.getStartDate() );
        }
        if ( policyAppView.getEndDate() != null ) {
            policy.endDate( policyAppView.getEndDate() );
        }
        if ( policyAppView.getPrice() != null ) {
            policy.price( policyAppView.getPrice() );
        }
        Map<String, Limit> map = policyAppView.getLimits();
        if ( map != null ) {
            policy.limits( new HashMap<String, Limit>( map ) );
        }
        if ( policyAppView.getSubscriptionId() != null ) {
            policy.subscriptionId( uuidMapper.toUUID( policyAppView.getSubscriptionId() ) );
        }

        return policy.build();
    }
}
