package ru.mango.rocks.api.policy.appview;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import rocks.mango.api.policy.PLimit;
import rocks.mango.api.policy.PPolicyAppView;
import rocks.mango.api.policy.PPolicyAppView.Builder;
import rocks.mango.api.policy.PPolicyStatus;
import ru.mango.rocks.api.policy.appview.PolicyAppView.PolicyAppViewBuilder;
import ru.mango.rocks.api.policy.base.AmountMapper;
import ru.mango.rocks.api.policy.base.TimestampMapper;
import ru.mango.rocks.api.policy.base.UuidMapper;
import ru.mango.rocks.api.policy.entity.Limit;
import ru.mango.rocks.api.policy.entity.Limit.LimitBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-09-17T20:57:50+0000",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.3 (Azul Systems, Inc.)"
)
public class PolicyAppViewProtoConverterImpl implements PolicyAppViewProtoConverter {

    private final AmountMapper amountMapper = new AmountMapper();
    private final UuidMapper uuidMapper = new UuidMapper();
    private final TimestampMapper timestampMapper = new TimestampMapper();

    @Override
    public PolicyAppView inverseConvert(PPolicyAppView arg0) {
        if ( arg0 == null ) {
            return null;
        }

        PolicyAppViewBuilder policyAppView = PolicyAppView.builder();

        if ( arg0.getId() != null ) {
            policyAppView.id( uuidMapper.toUUID( arg0.getId() ) );
        }
        if ( arg0.hasPrice() ) {
            policyAppView.price( amountMapper.toDecimal( arg0.getPrice() ) );
        }
        if ( arg0.getAddress() != null ) {
            policyAppView.address( arg0.getAddress() );
        }
        if ( arg0.getStatus() != null ) {
            policyAppView.status( arg0.getStatus().name() );
        }
        Map<? extends String, ? extends Limit> map = stringPLimitMapToStringLimitMap( arg0.getLimits() );
        if ( map != null ) {
            policyAppView.limits( map );
        }
        if ( arg0.getSubscriptionId() != null ) {
            policyAppView.subscriptionId( arg0.getSubscriptionId() );
        }
        if ( arg0.hasStartDate() ) {
            policyAppView.startDate( timestampMapper.toLocalDateTime( arg0.getStartDate() ) );
        }
        if ( arg0.hasEndDate() ) {
            policyAppView.endDate( timestampMapper.toLocalDateTime( arg0.getEndDate() ) );
        }
        policyAppView.paid( arg0.getPaid() );
        policyAppView.cancelled( arg0.getCancelled() );
        if ( arg0.getPdfLink() != null ) {
            policyAppView.pdfLink( arg0.getPdfLink() );
        }
        if ( arg0.getPdfSignatureLink() != null ) {
            policyAppView.pdfSignatureLink( arg0.getPdfSignatureLink() );
        }

        return policyAppView.build();
    }

    @Override
    public PPolicyAppView convert(PolicyAppView policyAppView) {
        if ( policyAppView == null ) {
            return null;
        }

        Builder pPolicyAppView = PPolicyAppView.newBuilder();

        if ( pPolicyAppView.getMutableLimits() != null ) {
            Map<String, PLimit> map = stringLimitMapToStringPLimitMap( policyAppView.getLimits() );
            if ( map != null ) {
                pPolicyAppView.getMutableLimits().putAll( map );
            }
        }
        if ( policyAppView.getId() != null ) {
            pPolicyAppView.setId( uuidMapper.toString( policyAppView.getId() ) );
        }
        if ( policyAppView.getPrice() != null ) {
            pPolicyAppView.setPrice( amountMapper.toAmount( policyAppView.getPrice() ) );
        }
        if ( policyAppView.getAddress() != null ) {
            pPolicyAppView.setAddress( policyAppView.getAddress() );
        }
        if ( policyAppView.getStatus() != null ) {
            pPolicyAppView.setStatus( Enum.valueOf( PPolicyStatus.class, policyAppView.getStatus() ) );
        }
        if ( policyAppView.getSubscriptionId() != null ) {
            pPolicyAppView.setSubscriptionId( policyAppView.getSubscriptionId() );
        }
        if ( policyAppView.getEndDate() != null ) {
            pPolicyAppView.setEndDate( timestampMapper.toPTimestamp( policyAppView.getEndDate() ) );
        }
        if ( policyAppView.getStartDate() != null ) {
            pPolicyAppView.setStartDate( timestampMapper.toPTimestamp( policyAppView.getStartDate() ) );
        }
        pPolicyAppView.setPaid( policyAppView.isPaid() );
        pPolicyAppView.setCancelled( policyAppView.isCancelled() );
        if ( policyAppView.getPdfLink() != null ) {
            pPolicyAppView.setPdfLink( policyAppView.getPdfLink() );
        }
        if ( policyAppView.getPdfSignatureLink() != null ) {
            pPolicyAppView.setPdfSignatureLink( policyAppView.getPdfSignatureLink() );
        }

        return pPolicyAppView.build();
    }

    protected Limit pLimitToLimit(PLimit pLimit) {
        if ( pLimit == null ) {
            return null;
        }

        LimitBuilder limit = Limit.builder();

        if ( pLimit.hasValue() ) {
            limit.value( amountMapper.toDecimal( pLimit.getValue() ) );
        }

        return limit.build();
    }

    protected Map<String, Limit> stringPLimitMapToStringLimitMap(Map<String, PLimit> map) {
        if ( map == null ) {
            return null;
        }

        Map<String, Limit> map1 = new HashMap<String, Limit>( Math.max( (int) ( map.size() / .75f ) + 1, 16 ) );

        for ( java.util.Map.Entry<String, PLimit> entry : map.entrySet() ) {
            String key = entry.getKey();
            Limit value = pLimitToLimit( entry.getValue() );
            map1.put( key, value );
        }

        return map1;
    }

    protected PLimit limitToPLimit(Limit limit) {
        if ( limit == null ) {
            return null;
        }

        rocks.mango.api.policy.PLimit.Builder pLimit = PLimit.newBuilder();

        if ( limit.getValue() != null ) {
            pLimit.setValue( amountMapper.toAmount( limit.getValue() ) );
        }

        return pLimit.build();
    }

    protected Map<String, PLimit> stringLimitMapToStringPLimitMap(Map<String, Limit> map) {
        if ( map == null ) {
            return null;
        }

        Map<String, PLimit> map1 = new HashMap<String, PLimit>( Math.max( (int) ( map.size() / .75f ) + 1, 16 ) );

        for ( java.util.Map.Entry<String, Limit> entry : map.entrySet() ) {
            String key = entry.getKey();
            PLimit value = limitToPLimit( entry.getValue() );
            map1.put( key, value );
        }

        return map1;
    }
}
