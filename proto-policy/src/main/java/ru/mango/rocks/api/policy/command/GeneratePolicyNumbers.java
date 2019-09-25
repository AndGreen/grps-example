package ru.mango.rocks.api.policy.command;

import lombok.*;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;
import rocks.mango.helper.interfaces.Identified;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@ToString
public class GeneratePolicyNumbers implements Identified<UUID> {
    @BsonId
    private UUID id;
    @BsonProperty("number_capacity")
    private int numberCapacity;
}
