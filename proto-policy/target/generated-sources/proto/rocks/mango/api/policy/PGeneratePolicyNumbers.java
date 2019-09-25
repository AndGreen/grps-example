// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto-policy/kafka.proto

package rocks.mango.api.policy;

/**
 * Protobuf type {@code rocks.mango.proto.api.PGeneratePolicyNumbers}
 */
public  final class PGeneratePolicyNumbers extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rocks.mango.proto.api.PGeneratePolicyNumbers)
    PGeneratePolicyNumbersOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PGeneratePolicyNumbers.newBuilder() to construct.
  private PGeneratePolicyNumbers(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PGeneratePolicyNumbers() {
    requestId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PGeneratePolicyNumbers(
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

            requestId_ = s;
            break;
          }
          case 16: {

            quantityNumbers_ = input.readInt32();
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
    return rocks.mango.api.policy.Kafka.internal_static_rocks_mango_proto_api_PGeneratePolicyNumbers_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return rocks.mango.api.policy.Kafka.internal_static_rocks_mango_proto_api_PGeneratePolicyNumbers_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            rocks.mango.api.policy.PGeneratePolicyNumbers.class, rocks.mango.api.policy.PGeneratePolicyNumbers.Builder.class);
  }

  public static final int REQUEST_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object requestId_;
  /**
   * <code>string request_id = 1;</code>
   */
  public java.lang.String getRequestId() {
    java.lang.Object ref = requestId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      requestId_ = s;
      return s;
    }
  }
  /**
   * <code>string request_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getRequestIdBytes() {
    java.lang.Object ref = requestId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      requestId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUANTITYNUMBERS_FIELD_NUMBER = 2;
  private int quantityNumbers_;
  /**
   * <code>int32 quantityNumbers = 2;</code>
   */
  public int getQuantityNumbers() {
    return quantityNumbers_;
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
    if (!getRequestIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, requestId_);
    }
    if (quantityNumbers_ != 0) {
      output.writeInt32(2, quantityNumbers_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getRequestIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, requestId_);
    }
    if (quantityNumbers_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, quantityNumbers_);
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
    if (!(obj instanceof rocks.mango.api.policy.PGeneratePolicyNumbers)) {
      return super.equals(obj);
    }
    rocks.mango.api.policy.PGeneratePolicyNumbers other = (rocks.mango.api.policy.PGeneratePolicyNumbers) obj;

    if (!getRequestId()
        .equals(other.getRequestId())) return false;
    if (getQuantityNumbers()
        != other.getQuantityNumbers()) return false;
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
    hash = (37 * hash) + REQUEST_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRequestId().hashCode();
    hash = (37 * hash) + QUANTITYNUMBERS_FIELD_NUMBER;
    hash = (53 * hash) + getQuantityNumbers();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static rocks.mango.api.policy.PGeneratePolicyNumbers parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static rocks.mango.api.policy.PGeneratePolicyNumbers parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static rocks.mango.api.policy.PGeneratePolicyNumbers parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static rocks.mango.api.policy.PGeneratePolicyNumbers parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static rocks.mango.api.policy.PGeneratePolicyNumbers parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static rocks.mango.api.policy.PGeneratePolicyNumbers parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static rocks.mango.api.policy.PGeneratePolicyNumbers parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static rocks.mango.api.policy.PGeneratePolicyNumbers parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static rocks.mango.api.policy.PGeneratePolicyNumbers parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static rocks.mango.api.policy.PGeneratePolicyNumbers parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static rocks.mango.api.policy.PGeneratePolicyNumbers parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static rocks.mango.api.policy.PGeneratePolicyNumbers parseFrom(
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
  public static Builder newBuilder(rocks.mango.api.policy.PGeneratePolicyNumbers prototype) {
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
   * Protobuf type {@code rocks.mango.proto.api.PGeneratePolicyNumbers}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rocks.mango.proto.api.PGeneratePolicyNumbers)
      rocks.mango.api.policy.PGeneratePolicyNumbersOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return rocks.mango.api.policy.Kafka.internal_static_rocks_mango_proto_api_PGeneratePolicyNumbers_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return rocks.mango.api.policy.Kafka.internal_static_rocks_mango_proto_api_PGeneratePolicyNumbers_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              rocks.mango.api.policy.PGeneratePolicyNumbers.class, rocks.mango.api.policy.PGeneratePolicyNumbers.Builder.class);
    }

    // Construct using rocks.mango.api.policy.PGeneratePolicyNumbers.newBuilder()
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
      requestId_ = "";

      quantityNumbers_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return rocks.mango.api.policy.Kafka.internal_static_rocks_mango_proto_api_PGeneratePolicyNumbers_descriptor;
    }

    @java.lang.Override
    public rocks.mango.api.policy.PGeneratePolicyNumbers getDefaultInstanceForType() {
      return rocks.mango.api.policy.PGeneratePolicyNumbers.getDefaultInstance();
    }

    @java.lang.Override
    public rocks.mango.api.policy.PGeneratePolicyNumbers build() {
      rocks.mango.api.policy.PGeneratePolicyNumbers result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public rocks.mango.api.policy.PGeneratePolicyNumbers buildPartial() {
      rocks.mango.api.policy.PGeneratePolicyNumbers result = new rocks.mango.api.policy.PGeneratePolicyNumbers(this);
      result.requestId_ = requestId_;
      result.quantityNumbers_ = quantityNumbers_;
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
      if (other instanceof rocks.mango.api.policy.PGeneratePolicyNumbers) {
        return mergeFrom((rocks.mango.api.policy.PGeneratePolicyNumbers)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(rocks.mango.api.policy.PGeneratePolicyNumbers other) {
      if (other == rocks.mango.api.policy.PGeneratePolicyNumbers.getDefaultInstance()) return this;
      if (!other.getRequestId().isEmpty()) {
        requestId_ = other.requestId_;
        onChanged();
      }
      if (other.getQuantityNumbers() != 0) {
        setQuantityNumbers(other.getQuantityNumbers());
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
      rocks.mango.api.policy.PGeneratePolicyNumbers parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (rocks.mango.api.policy.PGeneratePolicyNumbers) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object requestId_ = "";
    /**
     * <code>string request_id = 1;</code>
     */
    public java.lang.String getRequestId() {
      java.lang.Object ref = requestId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        requestId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string request_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getRequestIdBytes() {
      java.lang.Object ref = requestId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        requestId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string request_id = 1;</code>
     */
    public Builder setRequestId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      requestId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string request_id = 1;</code>
     */
    public Builder clearRequestId() {
      
      requestId_ = getDefaultInstance().getRequestId();
      onChanged();
      return this;
    }
    /**
     * <code>string request_id = 1;</code>
     */
    public Builder setRequestIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      requestId_ = value;
      onChanged();
      return this;
    }

    private int quantityNumbers_ ;
    /**
     * <code>int32 quantityNumbers = 2;</code>
     */
    public int getQuantityNumbers() {
      return quantityNumbers_;
    }
    /**
     * <code>int32 quantityNumbers = 2;</code>
     */
    public Builder setQuantityNumbers(int value) {
      
      quantityNumbers_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 quantityNumbers = 2;</code>
     */
    public Builder clearQuantityNumbers() {
      
      quantityNumbers_ = 0;
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


    // @@protoc_insertion_point(builder_scope:rocks.mango.proto.api.PGeneratePolicyNumbers)
  }

  // @@protoc_insertion_point(class_scope:rocks.mango.proto.api.PGeneratePolicyNumbers)
  private static final rocks.mango.api.policy.PGeneratePolicyNumbers DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new rocks.mango.api.policy.PGeneratePolicyNumbers();
  }

  public static rocks.mango.api.policy.PGeneratePolicyNumbers getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PGeneratePolicyNumbers>
      PARSER = new com.google.protobuf.AbstractParser<PGeneratePolicyNumbers>() {
    @java.lang.Override
    public PGeneratePolicyNumbers parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PGeneratePolicyNumbers(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PGeneratePolicyNumbers> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PGeneratePolicyNumbers> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public rocks.mango.api.policy.PGeneratePolicyNumbers getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

