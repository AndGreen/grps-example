package ru.mango.rocks.api.policy.command;

import lombok.*;
import org.bson.codecs.pojo.annotations.BsonProperty;
import ru.mango.rocks.api.policy.entity.Limit;

import java.util.Map;
import java.util.UUID;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class UpdateLimits {
    @BsonProperty("policy_id")
    private UUID policyId;
    @Singular
    @BsonProperty("limits")
    private Map<String, Limit> limits;
}
