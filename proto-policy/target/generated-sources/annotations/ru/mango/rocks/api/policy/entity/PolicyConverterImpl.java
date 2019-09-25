package ru.mango.rocks.api.policy.entity;

import com.google.protobuf.ProtocolStringList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import rocks.mango.api.policy.PLimit;
import rocks.mango.api.policy.PPeriodType;
import rocks.mango.api.policy.PPolicy;
import rocks.mango.api.policy.PPolicy.Builder;
import ru.mango.rocks.api.policy.base.AmountMapper;
import ru.mango.rocks.api.policy.base.TimestampMapper;
import ru.mango.rocks.api.policy.base.UuidMapper;
import ru.mango.rocks.api.policy.entity.Limit.LimitBuilder;
import ru.mango.rocks.api.policy.entity.Policy.PolicyBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-09-17T20:57:51+0000",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.3 (Azul Systems, Inc.)"
)
public class PolicyConverterImpl implements PolicyConverter {

    private final AmountMapper amountMapper = new AmountMapper();
    private final UuidMapper uuidMapper = new UuidMapper();
    private final TimestampMapper timestampMapper = new TimestampMapper();

    @Override
    public PPolicy convert(Policy policy) {
        if ( policy == null ) {
            return null;
        }

        Builder pPolicy = PPolicy.newBuilder();

        if ( policy.getPaymentIds() != null ) {
            for ( String paymentId : policy.getPaymentIds() ) {
                pPolicy.addPaymentIds( paymentId );
            }
        }
        if ( pPolicy.getMutableLimits() != null ) {
            Map<String, PLimit> map = stringLimitMapToStringPLimitMap( policy.getLimits() );
            if ( map != null ) {
                pPolicy.getMutableLimits().putAll( map );
            }
        }
        if ( policy.getId() != null ) {
            pPolicy.setId( uuidMapper.toString( policy.getId() ) );
        }
        if ( policy.getUserId() != null ) {
            pPolicy.setUserId( uuidMapper.toString( policy.getUserId() ) );
        }
        if ( policy.getStartDate() != null ) {
            pPolicy.setStartDate( timestampMapper.toPTimestamp( policy.getStartDate() ) );
        }
        if ( policy.getEndDate() != null ) {
            pPolicy.setEndDate( timestampMapper.toPTimestamp( policy.getEndDate() ) );
        }
        if ( policy.getPeriodType() != null ) {
            pPolicy.setPeriodType( Enum.valueOf( PPeriodType.class, policy.getPeriodType() ) );
        }
        if ( policy.getPolicyNumber() != null ) {
            pPolicy.setPolicyNumber( policy.getPolicyNumber() );
        }
        pPolicy.setVersion( policy.getVersion() );
        if ( policy.getInsuranceObjectId() != null ) {
            pPolicy.setInsuranceObjectId( policy.getInsuranceObjectId() );
        }
        if ( policy.getPrice() != null ) {
            pPolicy.setPrice( amountMapper.toAmount( policy.getPrice() ) );
        }
        if ( policy.getSubscriptionId() != null ) {
            pPolicy.setSubscriptionId( uuidMapper.toString( policy.getSubscriptionId() ) );
        }

        return pPolicy.build();
    }

    @Override
    public Policy inverseConvert(PPolicy pPolicy) {
        if ( pPolicy == null ) {
            return null;
        }

        PolicyBuilder policy = Policy.builder();

        ProtocolStringList protocolStringList = pPolicy.getPaymentIdsList();
        if ( protocolStringList != null ) {
            policy.paymentIds( new ArrayList<String>( protocolStringList ) );
        }
        if ( pPolicy.getId() != null ) {
            policy.id( uuidMapper.toUUID( pPolicy.getId() ) );
        }
        if ( pPolicy.getUserId() != null ) {
            policy.userId( uuidMapper.toUUID( pPolicy.getUserId() ) );
        }
        if ( pPolicy.hasStartDate() ) {
            policy.startDate( timestampMapper.toLocalDateTime( pPolicy.getStartDate() ) );
        }
        if ( pPolicy.hasEndDate() ) {
            policy.endDate( timestampMapper.toLocalDateTime( pPolicy.getEndDate() ) );
        }
        if ( pPolicy.getPeriodType() != null ) {
            policy.periodType( pPolicy.getPeriodType().name() );
        }
        if ( pPolicy.getPolicyNumber() != null ) {
            policy.policyNumber( pPolicy.getPolicyNumber() );
        }
        policy.version( pPolicy.getVersion() );
        if ( pPolicy.getInsuranceObjectId() != null ) {
            policy.insuranceObjectId( pPolicy.getInsuranceObjectId() );
        }
        if ( pPolicy.hasPrice() ) {
            policy.price( amountMapper.toDecimal( pPolicy.getPrice() ) );
        }
        Map<? extends String, ? extends Limit> map = stringPLimitMapToStringLimitMap( pPolicy.getLimits() );
        if ( map != null ) {
            policy.limits( map );
        }
        if ( pPolicy.getSubscriptionId() != null ) {
            policy.subscriptionId( uuidMapper.toUUID( pPolicy.getSubscriptionId() ) );
        }

        return policy.build();
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
}
