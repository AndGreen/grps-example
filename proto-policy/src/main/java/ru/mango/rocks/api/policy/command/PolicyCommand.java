package ru.mango.rocks.api.policy.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;
import rocks.mango.helper.interfaces.Identified;

import java.util.UUID;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class PolicyCommand implements Identified<UUID> {
    @BsonId
    private UUID id;
    @BsonProperty("create_policy")
    private CreatePolicy createPolicy;
    @BsonProperty("update_limits")
    private UpdateLimits updateLimits;
    @BsonProperty("assign_policy")
    private AssignPolicy assignPolicy;
    @BsonProperty("renew_policy")
    private RenewPolicy renewPolicy;

}
