package ru.mango.rocks.api.policy.appview;

import lombok.*;
import lombok.experimental.Wither;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;
import rocks.mango.api.policy.PPolicyStatus;
import rocks.mango.helper.interfaces.Identified;
import ru.mango.rocks.api.policy.entity.Limit;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

@Data
@Wither
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class PolicyAppView implements Identified<UUID> {
    @BsonId
    private UUID id;
    @BsonProperty("price")
    private BigDecimal price;
    @BsonProperty("address")
    private String address;
    @BsonProperty("status")
    private String status = PPolicyStatus.INACTIVE.name();
    @Singular
    @BsonProperty("limits")
    private Map<String, Limit> limits;
    @BsonProperty("subscription_id")
    private String subscriptionId;
    @BsonProperty("start_date")
    private LocalDateTime startDate;
    @BsonProperty("end_date")
    private LocalDateTime endDate;
    @BsonProperty("paid")
    private boolean paid;
    @BsonProperty("cancelled")
    private boolean cancelled;
    @BsonProperty("pdf_link")
    private String pdfLink;
    @BsonProperty("pdf_signature_link")
    private String pdfSignatureLink;
}
