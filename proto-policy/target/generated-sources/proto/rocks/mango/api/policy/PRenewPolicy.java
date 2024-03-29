// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto-policy/kafka.proto

package rocks.mango.api.policy;

/**
 * Protobuf type {@code rocks.mango.proto.api.PRenewPolicy}
 */
public  final class PRenewPolicy extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rocks.mango.proto.api.PRenewPolicy)
    PRenewPolicyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PRenewPolicy.newBuilder() to construct.
  private PRenewPolicy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PRenewPolicy() {
    policyId_ = "";
    paymentId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PRenewPolicy(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            policyId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            paymentId_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return rocks.mango.api.policy.Kafka.internal_static_rocks_mango_proto_api_PRenewPolicy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return rocks.mango.api.policy.Kafka.internal_static_rocks_mango_proto_api_PRenewPolicy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            rocks.mango.api.policy.PRenewPolicy.class, rocks.mango.api.policy.PRenewPolicy.Builder.class);
  }

  public static final int POLICY_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object policyId_;
  /**
   * <code>string policy_id = 1;</code>
   */
  public java.lang.String getPolicyId() {
    java.lang.Object ref = policyId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      policyId_ = s;
      return s;
    }
  }
  /**
   * <code>string policy_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getPolicyIdBytes() {
    java.lang.Object ref = policyId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      policyId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAYMENT_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object paymentId_;
  /**
   * <code>string payment_id = 2;</code>
   */
  public java.lang.String getPaymentId() {
    java.lang.Object ref = paymentId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      paymentId_ = s;
      return s;
    }
  }
  /**
   * <code>string payment_id = 2;</code>
   */
  public com.google.protobuf.ByteString
      getPaymentIdBytes() {
    java.lang.Object ref = paymentId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      paymentId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getPolicyIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, policyId_);
    }
    if (!getPaymentIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, paymentId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPolicyIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, policyId_);
    }
    if (!getPaymentIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, paymentId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof rocks.mango.api.policy.PRenewPolicy)) {
      return super.equals(obj);
    }
    rocks.mango.api.policy.PRenewPolicy other = (rocks.mango.api.policy.PRenewPolicy) obj;

    if (!getPolicyId()
        .equals(other.getPolicyId())) return false;
    if (!getPaymentId()
        .equals(other.getPaymentId())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + POLICY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPolicyId().hashCode();
    hash = (37 * hash) + PAYMENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPaymentId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static rocks.mango.api.policy.PRenewPolicy parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static rocks.mango.api.policy.PRenewPolicy parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static rocks.mango.api.policy.PRenewPolicy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static rocks.mango.api.policy.PRenewPolicy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static rocks.mango.api.policy.PRenewPolicy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static rocks.mango.api.policy.PRenewPolicy parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static rocks.mango.api.policy.PRenewPolicy parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static rocks.mango.api.policy.PRenewPolicy parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static rocks.mango.api.policy.PRenewPolicy parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static rocks.mango.api.policy.PRenewPolicy parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static rocks.mango.api.policy.PRenewPolicy parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static rocks.mango.api.policy.PRenewPolicy parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(rocks.mango.api.policy.PRenewPolicy prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code rocks.mango.proto.api.PRenewPolicy}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rocks.mango.proto.api.PRenewPolicy)
      rocks.mango.api.policy.PRenewPolicyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return rocks.mango.api.policy.Kafka.internal_static_rocks_mango_proto_api_PRenewPolicy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return rocks.mango.api.policy.Kafka.internal_static_rocks_mango_proto_api_PRenewPolicy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              rocks.mango.api.policy.PRenewPolicy.class, rocks.mango.api.policy.PRenewPolicy.Builder.class);
    }

    // Construct using rocks.mango.api.policy.PRenewPolicy.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      policyId_ = "";

      paymentId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return rocks.mango.api.policy.Kafka.internal_static_rocks_mango_proto_api_PRenewPolicy_descriptor;
    }

    @java.lang.Override
    public rocks.mango.api.policy.PRenewPolicy getDefaultInstanceForType() {
      return rocks.mango.api.policy.PRenewPolicy.getDefaultInstance();
    }

    @java.lang.Override
    public rocks.mango.api.policy.PRenewPolicy build() {
      rocks.mango.api.policy.PRenewPolicy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public rocks.mango.api.policy.PRenewPolicy buildPartial() {
      rocks.mango.api.policy.PRenewPolicy result = new rocks.mango.api.policy.PRenewPolicy(this);
      result.policyId_ = policyId_;
      result.paymentId_ = paymentId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof rocks.mango.api.policy.PRenewPolicy) {
        return mergeFrom((rocks.mango.api.policy.PRenewPolicy)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(rocks.mango.api.policy.PRenewPolicy other) {
      if (other == rocks.mango.api.policy.PRenewPolicy.getDefaultInstance()) return this;
      if (!other.getPolicyId().isEmpty()) {
        policyId_ = other.policyId_;
        onChanged();
      }
      if (!other.getPaymentId().isEmpty()) {
        paymentId_ = other.paymentId_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      rocks.mango.api.policy.PRenewPolicy parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (rocks.mango.api.policy.PRenewPolicy) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object policyId_ = "";
    /**
     * <code>string policy_id = 1;</code>
     */
    public java.lang.String getPolicyId() {
      java.lang.Object ref = policyId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        policyId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string policy_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPolicyIdBytes() {
      java.lang.Object ref = policyId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        policyId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string policy_id = 1;</code>
     */
    public Builder setPolicyId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      policyId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string policy_id = 1;</code>
     */
    public Builder clearPolicyId() {
      
      policyId_ = getDefaultInstance().getPolicyId();
      onChanged();
      return this;
    }
    /**
     * <code>string policy_id = 1;</code>
     */
    public Builder setPolicyIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      policyId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object paymentId_ = "";
    /**
     * <code>string payment_id = 2;</code>
     */
    public java.lang.String getPaymentId() {
      java.lang.Object ref = paymentId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        paymentId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string payment_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPaymentIdBytes() {
      java.lang.Object ref = paymentId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        paymentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string payment_id = 2;</code>
     */
    public Builder setPaymentId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      paymentId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string payment_id = 2;</code>
     */
    public Builder clearPaymentId() {
      
      paymentId_ = getDefaultInstance().getPaymentId();
      onChanged();
      return this;
    }
    /**
     * <code>string payment_id = 2;</code>
     */
    public Builder setPaymentIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      paymentId_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:rocks.mango.proto.api.PRenewPolicy)
  }

  // @@protoc_insertion_point(class_scope:rocks.mango.proto.api.PRenewPolicy)
  private static final rocks.mango.api.policy.PRenewPolicy DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new rocks.mango.api.policy.PRenewPolicy();
  }

  public static rocks.mango.api.policy.PRenewPolicy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PRenewPolicy>
      PARSER = new com.google.protobuf.AbstractParser<PRenewPolicy>() {
    @java.lang.Override
    public PRenewPolicy parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PRenewPolicy(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PRenewPolicy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PRenewPolicy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public rocks.mango.api.policy.PRenewPolicy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

