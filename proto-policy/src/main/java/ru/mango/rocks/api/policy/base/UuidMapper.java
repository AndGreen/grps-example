package ru.mango.rocks.api.policy.base;

import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

public class UuidMapper {

    public UuidMapper() {
    }

    public UUID toUUID(final String id) {
        return StringUtils.isBlank(id) ? null : UUID.fromString(id);
    }

    public String toString(final UUID uuid) {
        return uuid == null ? null : uuid.toString();
    }

}
