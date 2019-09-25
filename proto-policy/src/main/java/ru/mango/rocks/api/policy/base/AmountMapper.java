package ru.mango.rocks.api.policy.base;

import rocks.mango.api.PAmount;
import rocks.mango.api.PCurrency;

import java.math.BigDecimal;

import static java.math.RoundingMode.HALF_UP;

public class AmountMapper {

    public static final BigDecimal MINOR_MULTIPLIER = BigDecimal.valueOf(100);

    private static final PCurrency DEFAULT_CURRENCY = PCurrency
            .newBuilder()
            .setName("RUB")
            .build();

    public AmountMapper() {
    }

    public PAmount toAmount(final BigDecimal amount) {
        if (amount == null) {
            return null;
        }

        return PAmount
                .newBuilder()
                .setAmount(toMinor(amount))
                .setCurrency(DEFAULT_CURRENCY)
                .build();
    }

    private Long toMinor(final BigDecimal amount) {
        if (amount == null) {
            return null;
        }

        return amount.setScale(0, HALF_UP).longValue();
    }

    public BigDecimal toDecimal(final PAmount amount) {
        return amount == null ? null : toMajor(amount.getAmount());
    }

    private BigDecimal toMajor(final Long amount) {
        return amount == null ? null : BigDecimal.valueOf(amount).setScale(0, HALF_UP);
    }

}
