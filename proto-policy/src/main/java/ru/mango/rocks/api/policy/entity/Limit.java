package ru.mango.rocks.api.policy.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Builder(toBuilder = true)
public class Limit {
    private BigDecimal value;

    public static Limit of(final BigDecimal amount) {
        return Limit.builder().value(amount).build();
    }

    public static Limit of(final long amount) {
        return Limit.builder().value(BigDecimal.valueOf(amount)).build();
    }
}
