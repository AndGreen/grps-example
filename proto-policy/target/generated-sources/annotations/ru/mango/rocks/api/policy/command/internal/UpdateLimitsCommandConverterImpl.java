package ru.mango.rocks.api.policy.command.internal;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import rocks.mango.api.policy.PLimit;
import rocks.mango.api.policy.PUpdateLimits;
import rocks.mango.api.policy.PUpdateLimits.Builder;
import ru.mango.rocks.api.policy.base.AmountMapper;
import ru.mango.rocks.api.policy.base.UuidMapper;
import ru.mango.rocks.api.policy.command.UpdateLimits;
import ru.mango.rocks.api.policy.command.UpdateLimits.UpdateLimitsBuilder;
import ru.mango.rocks.api.policy.entity.Limit;
import ru.mango.rocks.api.policy.entity.Limit.LimitBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-09-17T20:57:50+0000",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.3 (Azul Systems, Inc.)"
)
public class UpdateLimitsCommandConverterImpl implements UpdateLimitsCommandConverter {

    private final AmountMapper amountMapper = new AmountMapper();
    private final UuidMapper uuidMapper = new UuidMapper();

    @Override
    public PUpdateLimits convert(UpdateLimits assignPolicy) {
        if ( assignPolicy == null ) {
            return null;
        }

        Builder pUpdateLimits = PUpdateLimits.newBuilder();

        if ( pUpdateLimits.getMutableLimits() != null ) {
            Map<String, PLimit> map = stringLimitMapToStringPLimitMap( assignPolicy.getLimits() );
            if ( map != null ) {
                pUpdateLimits.getMutableLimits().putAll( map );
            }
        }
        pUpdateLimits.setPolicyId( uuidMapper.toString( assignPolicy.getPolicyId() ) );

        return pUpdateLimits.build();
    }

    @Override
    public UpdateLimits inverseConvert(PUpdateLimits pUpdateLimits) {
        if ( pUpdateLimits == null ) {
            return null;
        }

        UpdateLimitsBuilder updateLimits = UpdateLimits.builder();

        updateLimits.policyId( uuidMapper.toUUID( pUpdateLimits.getPolicyId() ) );
        updateLimits.limits( stringPLimitMapToStringLimitMap( pUpdateLimits.getLimits() ) );

        return updateLimits.build();
    }

    protected PLimit limitToPLimit(Limit limit) {
        if ( limit == null ) {
            return null;
        }

        rocks.mango.api.policy.PLimit.Builder pLimit = PLimit.newBuilder();

        pLimit.setValue( amountMapper.toAmount( limit.getValue() ) );

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
