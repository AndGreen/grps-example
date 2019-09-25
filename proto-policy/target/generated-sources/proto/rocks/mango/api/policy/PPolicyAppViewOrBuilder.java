// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto-policy/entity.proto

package rocks.mango.api.policy;

public interface PPolicyAppViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rocks.mango.proto.api.PPolicyAppView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>.rocks.mango.proto.PAmount price = 2;</code>
   */
  boolean hasPrice();
  /**
   * <code>.rocks.mango.proto.PAmount price = 2;</code>
   */
  rocks.mango.api.PAmount getPrice();
  /**
   * <code>.rocks.mango.proto.PAmount price = 2;</code>
   */
  rocks.mango.api.PAmountOrBuilder getPriceOrBuilder();

  /**
   * <code>string address = 3;</code>
   */
  java.lang.String getAddress();
  /**
   * <code>string address = 3;</code>
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <code>map&lt;string, .rocks.mango.proto.api.PLimit&gt; limits = 4;</code>
   */
  int getLimitsCount();
  /**
   * <code>map&lt;string, .rocks.mango.proto.api.PLimit&gt; limits = 4;</code>
   */
  boolean containsLimits(
      java.lang.String key);
  /**
   * Use {@link #getLimitsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, rocks.mango.api.policy.PLimit>
  getLimits();
  /**
   * <code>map&lt;string, .rocks.mango.proto.api.PLimit&gt; limits = 4;</code>
   */
  java.util.Map<java.lang.String, rocks.mango.api.policy.PLimit>
  getLimitsMap();
  /**
   * <code>map&lt;string, .rocks.mango.proto.api.PLimit&gt; limits = 4;</code>
   */

  rocks.mango.api.policy.PLimit getLimitsOrDefault(
      java.lang.String key,
      rocks.mango.api.policy.PLimit defaultValue);
  /**
   * <code>map&lt;string, .rocks.mango.proto.api.PLimit&gt; limits = 4;</code>
   */

  rocks.mango.api.policy.PLimit getLimitsOrThrow(
      java.lang.String key);

  /**
   * <code>.rocks.mango.proto.api.PPolicyStatus status = 5;</code>
   */
  int getStatusValue();
  /**
   * <code>.rocks.mango.proto.api.PPolicyStatus status = 5;</code>
   */
  rocks.mango.api.policy.PPolicyStatus getStatus();

  /**
   * <code>string subscription_id = 6;</code>
   */
  java.lang.String getSubscriptionId();
  /**
   * <code>string subscription_id = 6;</code>
   */
  com.google.protobuf.ByteString
      getSubscriptionIdBytes();

  /**
   * <code>.rocks.mango.proto.PTimestamp end_date = 7;</code>
   */
  boolean hasEndDate();
  /**
   * <code>.rocks.mango.proto.PTimestamp end_date = 7;</code>
   */
  rocks.mango.api.PTimestamp getEndDate();
  /**
   * <code>.rocks.mango.proto.PTimestamp end_date = 7;</code>
   */
  rocks.mango.api.PTimestampOrBuilder getEndDateOrBuilder();

  /**
   * <code>.rocks.mango.proto.PTimestamp start_date = 8;</code>
   */
  boolean hasStartDate();
  /**
   * <code>.rocks.mango.proto.PTimestamp start_date = 8;</code>
   */
  rocks.mango.api.PTimestamp getStartDate();
  /**
   * <code>.rocks.mango.proto.PTimestamp start_date = 8;</code>
   */
  rocks.mango.api.PTimestampOrBuilder getStartDateOrBuilder();

  /**
   * <code>bool paid = 9;</code>
   */
  boolean getPaid();

  /**
   * <code>bool cancelled = 10;</code>
   */
  boolean getCancelled();

  /**
   * <code>string pdf_link = 11;</code>
   */
  java.lang.String getPdfLink();
  /**
   * <code>string pdf_link = 11;</code>
   */
  com.google.protobuf.ByteString
      getPdfLinkBytes();

  /**
   * <code>string pdf_signature_link = 12;</code>
   */
  java.lang.String getPdfSignatureLink();
  /**
   * <code>string pdf_signature_link = 12;</code>
   */
  com.google.protobuf.ByteString
      getPdfSignatureLinkBytes();
}
