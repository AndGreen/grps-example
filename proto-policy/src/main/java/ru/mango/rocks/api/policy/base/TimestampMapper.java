package ru.mango.rocks.api.policy.base;

import rocks.mango.api.PTimestamp;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static java.time.ZoneOffset.UTC;

public class TimestampMapper {

    public TimestampMapper() {
    }

    public PTimestamp toPTimestamp(final LocalDateTime date) {
        final Instant instant = date.atZone(UTC).toInstant();

        return PTimestamp
                .newBuilder()
                .setSeconds(instant.getEpochSecond())
                .setNanos(instant.getNano())
                .build();
    }

    public PTimestamp toTimestamp(final LocalDate date) {
        final Instant instant = date.atStartOfDay().atZone(UTC).toInstant();

        return PTimestamp
                .newBuilder()
                .setSeconds(instant.getEpochSecond())
                .setNanos(instant.getNano())
                .build();
    }

    public LocalDate toLocalDate(final PTimestamp timestamp) {
        return Instant
                .ofEpochSecond(timestamp.getSeconds())
                .atZone(UTC)
                .toLocalDate();
    }

    public LocalDateTime toLocalDateTime(final PTimestamp timestamp) {
        return Instant
                .ofEpochSecond(timestamp.getSeconds())
                .atZone(UTC)
                .toLocalDateTime();
    }

}
