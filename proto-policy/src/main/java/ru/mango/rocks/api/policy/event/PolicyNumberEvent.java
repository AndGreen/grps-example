package ru.mango.rocks.api.policy.event;

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
public class PolicyNumberEvent implements Identified<UUID> {
    @BsonId
    private UUID id;
    @BsonProperty("number")
    private String number;
    @BsonProperty("used")
    private boolean used;
}
