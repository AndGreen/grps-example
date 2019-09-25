package ru.mango.rocks.api.policy.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.UUID;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class AssignPolicy {
    @BsonProperty("policy_id")
    private UUID policyId;
    @BsonProperty("user_id")
    private UUID userId;
}
