package ru.mango.rocks.api.policy.appview;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Wither;
import org.bson.codecs.pojo.annotations.BsonProperty;

@Data
@Wither
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Card {
    @BsonProperty("token")
    private String token;
    @BsonProperty("firstSize")
    private String firstSix;
    @BsonProperty("lastFour")
    private String lastFour;
    @BsonProperty("type")
    private String type;
    @BsonProperty("expDate")
    private String expDate;
}
