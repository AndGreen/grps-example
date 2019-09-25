package ru.mango.rocks.api.policy.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;
import rocks.mango.api.policy.PPolicyEventType;
import rocks.mango.helper.interfaces.Identified;
import ru.mango.rocks.api.policy.entity.Policy;

import java.util.UUID;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class PolicyEvent implements Identified<UUID> {

    @BsonId
    private UUID id;

    @BsonProperty("error_code")
    private String errorCode;

    @BsonProperty("error_message")
    private String errorMessage;

    @BsonProperty("event_type")
    private PPolicyEventType eventType;

    @BsonProperty("policy")
    private Policy policy;

}
