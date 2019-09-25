package ru.mango.rocks.api.policy.entity;

import lombok.*;
import lombok.experimental.Accessors;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;
import rocks.mango.helper.interfaces.Identified;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Builder(toBuilder = true)
public class Policy implements Identified<UUID> {
    @BsonId
    private UUID id;
    @BsonProperty("user_id")
    private UUID userId;
    @BsonProperty("start_Date")
    private LocalDateTime startDate;
    @BsonProperty("end_date")
    private LocalDateTime endDate;
    @BsonProperty("period_type")
    private String periodType;
    @Singular
    @BsonProperty("payment_ids")
    private List<String> paymentIds;
    @BsonProperty("policy_number")
    private String policyNumber;
    @BsonProperty("version")
    private long version;
    @BsonProperty("insurance_object_id")
    private String insuranceObjectId;
    @BsonProperty("price")
    private BigDecimal price;
    @Singular
    @BsonProperty("limits")
    private Map<String, Limit> limits;
    @BsonProperty("subscription_id")
    private UUID subscriptionId;
}
