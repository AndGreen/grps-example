// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto-policy/kafka.proto

package rocks.mango.api.policy;

/**
 * Protobuf type {@code rocks.mango.proto.api.PPolicyEvent}
 */
public  final class PPolicyEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:rocks.mango.proto.api.PPolicyEvent)
    PPolicyEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PPolicyEvent.newBuilder() to construct.
  private PPolicyEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PPolicyEvent() {
    commandId_ = "";
    errorCode_ = "";
    errorMessage_ = "";
    eventType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PPolicyEvent(
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

            commandId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            errorCode_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            errorMessage_ = s;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            eventType_ = rawValue;
            break;
          }
          case 42: {
            rocks.mango.api.policy.PPolicy.Builder subBuilder = null;
            if (policy_ != null) {
              subBuilder = policy_.toBuilder();
            }
            policy_ = input.readMessage(rocks.mango.api.policy.PPolicy.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(policy_);
              policy_ = subBuilder.buildPartial();
            }

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
    return rocks.mango.api.policy.Kafka.internal_static_rocks_mango_proto_api_PPolicyEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return rocks.mango.api.policy.Kafka.internal_static_rocks_mango_proto_api_PPolicyEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            rocks.mango.api.policy.PPolicyEvent.class, rocks.mango.api.policy.PPolicyEvent.Builder.class);
  }

  public static final int COMMAND_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object commandId_;
  /**
   * <code>string command_id = 1;</code>
   */
  public java.lang.String getCommandId() {
    java.lang.Object ref = commandId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      commandId_ = s;
      return s;
    }
  }
  /**
   * <code>string command_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getCommandIdBytes() {
    java.lang.Object ref = commandId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      commandId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ERROR_CODE_FIELD_NUMBER = 2;
  private volatile java.lang.Object errorCode_;
  /**
   * <code>string error_code = 2;</code>
   */
  public java.lang.String getErrorCode() {
    java.lang.Object ref = errorCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      errorCode_ = s;
      return s;
    }
  }
  /**
   * <code>string error_code = 2;</code>
   */
  public com.google.protobuf.ByteString
      getErrorCodeBytes() {
    java.lang.Object ref = errorCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      errorCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ERROR_MESSAGE_FIELD_NUMBER = 3;
  private volatile java.lang.Object errorMessage_;
  /**
   * <code>string error_message = 3;</code>
   */
  public java.lang.String getErrorMessage() {
    java.lang.Object ref = errorMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      errorMessage_ = s;
      return s;
    }
  }
  /**
   * <code>string error_message = 3;</code>
   */
  public com.google.protobuf.ByteString
      getErrorMessageBytes() {
    java.lang.Object ref = errorMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      errorMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EVENT_TYPE_FIELD_NUMBER = 4;
  private int eventType_;
  /**
   * <code>.rocks.mango.proto.api.PPolicyEventType event_type = 4;</code>
   */
  public int getEventTypeValue() {
    return eventType_;
  }
  /**
   * <code>.rocks.mango.proto.api.PPolicyEventType event_type = 4;</code>
   */
  public rocks.mango.api.policy.PPolicyEventType getEventType() {
    @SuppressWarnings("deprecation")
    rocks.mango.api.policy.PPolicyEventType result = rocks.mango.api.policy.PPolicyEventType.valueOf(eventType_);
    return result == null ? rocks.mango.api.policy.PPolicyEventType.UNRECOGNIZED : result;
  }

  public static final int POLICY_FIELD_NUMBER = 5;
  private rocks.mango.api.policy.PPolicy policy_;
  /**
   * <code>.rocks.mango.proto.api.PPolicy policy = 5;</code>
   */
  public boolean hasPolicy() {
    return policy_ != null;
  }
  /**
   * <code>.rocks.mango.proto.api.PPolicy policy = 5;</code>
   */
  public rocks.mango.api.policy.PPolicy getPolicy() {
    return policy_ == null ? rocks.mango.api.policy.PPolicy.getDefaultInstance() : policy_;
  }
  /**
   * <code>.rocks.mango.proto.api.PPolicy policy = 5;</code>
   */
  public rocks.mango.api.policy.PPolicyOrBuilder getPolicyOrBuilder() {
    return getPolicy();
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
    if (!getCommandIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, commandId_);
    }
    if (!getErrorCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, errorCode_);
    }
    if (!getErrorMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, errorMessage_);
    }
    if (eventType_ != rocks.mango.api.policy.PPolicyEventType.UNDEFINED.getNumber()) {
      output.writeEnum(4, eventType_);
    }
    if (policy_ != null) {
      output.writeMessage(5, getPolicy());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCommandIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, commandId_);
    }
    if (!getErrorCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, errorCode_);
    }
    if (!getErrorMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, errorMessage_);
    }
    if (eventType_ != rocks.mango.api.policy.PPolicyEventType.UNDEFINED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, eventType_);
    }
    if (policy_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getPolicy());
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
    if (!(obj instanceof rocks.mango.api.policy.PPolicyEvent)) {
      return super.equals(obj);
    }
    rocks.mango.api.policy.PPolicyEvent other = (rocks.mango.api.policy.PPolicyEvent) obj;

    if (!getCommandId()
        .equals(other.getCommandId())) return false;
    if (!getErrorCode()
        .equals(other.getErrorCode())) return false;
    if (!getErrorMessage()
        .equals(other.getErrorMessage())) return false;
    if (eventType_ != other.eventType_) return false;
    if (hasPolicy() != other.hasPolicy()) return false;
    if (hasPolicy()) {
      if (!getPolicy()
          .equals(other.getPolicy())) return false;
    }
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
    hash = (37 * hash) + COMMAND_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCommandId().hashCode();
    hash = (37 * hash) + ERROR_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getErrorCode().hashCode();
    hash = (37 * hash) + ERROR_MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getErrorMessage().hashCode();
    hash = (37 * hash) + EVENT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + eventType_;
    if (hasPolicy()) {
      hash = (37 * hash) + POLICY_FIELD_NUMBER;
      hash = (53 * hash) + getPolicy().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static rocks.mango.api.policy.PPolicyEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static rocks.mango.api.policy.PPolicyEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static rocks.mango.api.policy.PPolicyEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static rocks.mango.api.policy.PPolicyEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static rocks.mango.api.policy.PPolicyEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static rocks.mango.api.policy.PPolicyEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static rocks.mango.api.policy.PPolicyEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static rocks.mango.api.policy.PPolicyEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static rocks.mango.api.policy.PPolicyEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static rocks.mango.api.policy.PPolicyEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static rocks.mango.api.policy.PPolicyEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static rocks.mango.api.policy.PPolicyEvent parseFrom(
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
  public static Builder newBuilder(rocks.mango.api.policy.PPolicyEvent prototype) {
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
   * Protobuf type {@code rocks.mango.proto.api.PPolicyEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:rocks.mango.proto.api.PPolicyEvent)
      rocks.mango.api.policy.PPolicyEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return rocks.mango.api.policy.Kafka.internal_static_rocks_mango_proto_api_PPolicyEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return rocks.mango.api.policy.Kafka.internal_static_rocks_mango_proto_api_PPolicyEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              rocks.mango.api.policy.PPolicyEvent.class, rocks.mango.api.policy.PPolicyEvent.Builder.class);
    }

    // Construct using rocks.mango.api.policy.PPolicyEvent.newBuilder()
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
      commandId_ = "";

      errorCode_ = "";

      errorMessage_ = "";

      eventType_ = 0;

      if (policyBuilder_ == null) {
        policy_ = null;
      } else {
        policy_ = null;
        policyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return rocks.mango.api.policy.Kafka.internal_static_rocks_mango_proto_api_PPolicyEvent_descriptor;
    }

    @java.lang.Override
    public rocks.mango.api.policy.PPolicyEvent getDefaultInstanceForType() {
      return rocks.mango.api.policy.PPolicyEvent.getDefaultInstance();
    }

    @java.lang.Override
    public rocks.mango.api.policy.PPolicyEvent build() {
      rocks.mango.api.policy.PPolicyEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public rocks.mango.api.policy.PPolicyEvent buildPartial() {
      rocks.mango.api.policy.PPolicyEvent result = new rocks.mango.api.policy.PPolicyEvent(this);
      result.commandId_ = commandId_;
      result.errorCode_ = errorCode_;
      result.errorMessage_ = errorMessage_;
      result.eventType_ = eventType_;
      if (policyBuilder_ == null) {
        result.policy_ = policy_;
      } else {
        result.policy_ = policyBuilder_.build();
      }
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
      if (other instanceof rocks.mango.api.policy.PPolicyEvent) {
        return mergeFrom((rocks.mango.api.policy.PPolicyEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(rocks.mango.api.policy.PPolicyEvent other) {
      if (other == rocks.mango.api.policy.PPolicyEvent.getDefaultInstance()) return this;
      if (!other.getCommandId().isEmpty()) {
        commandId_ = other.commandId_;
        onChanged();
      }
      if (!other.getErrorCode().isEmpty()) {
        errorCode_ = other.errorCode_;
        onChanged();
      }
      if (!other.getErrorMessage().isEmpty()) {
        errorMessage_ = other.errorMessage_;
        onChanged();
      }
      if (other.eventType_ != 0) {
        setEventTypeValue(other.getEventTypeValue());
      }
      if (other.hasPolicy()) {
        mergePolicy(other.getPolicy());
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
      rocks.mango.api.policy.PPolicyEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (rocks.mango.api.policy.PPolicyEvent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object commandId_ = "";
    /**
     * <code>string command_id = 1;</code>
     */
    public java.lang.String getCommandId() {
      java.lang.Object ref = commandId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        commandId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string command_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getCommandIdBytes() {
      java.lang.Object ref = commandId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        commandId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string command_id = 1;</code>
     */
    public Builder setCommandId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      commandId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string command_id = 1;</code>
     */
    public Builder clearCommandId() {
      
      commandId_ = getDefaultInstance().getCommandId();
      onChanged();
      return this;
    }
    /**
     * <code>string command_id = 1;</code>
     */
    public Builder setCommandIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      commandId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object errorCode_ = "";
    /**
     * <code>string error_code = 2;</code>
     */
    public java.lang.String getErrorCode() {
      java.lang.Object ref = errorCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        errorCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string error_code = 2;</code>
     */
    public com.google.protobuf.ByteString
        getErrorCodeBytes() {
      java.lang.Object ref = errorCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errorCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string error_code = 2;</code>
     */
    public Builder setErrorCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      errorCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string error_code = 2;</code>
     */
    public Builder clearErrorCode() {
      
      errorCode_ = getDefaultInstance().getErrorCode();
      onChanged();
      return this;
    }
    /**
     * <code>string error_code = 2;</code>
     */
    public Builder setErrorCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      errorCode_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object errorMessage_ = "";
    /**
     * <code>string error_message = 3;</code>
     */
    public java.lang.String getErrorMessage() {
      java.lang.Object ref = errorMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        errorMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string error_message = 3;</code>
     */
    public com.google.protobuf.ByteString
        getErrorMessageBytes() {
      java.lang.Object ref = errorMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errorMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string error_message = 3;</code>
     */
    public Builder setErrorMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      errorMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string error_message = 3;</code>
     */
    public Builder clearErrorMessage() {
      
      errorMessage_ = getDefaultInstance().getErrorMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string error_message = 3;</code>
     */
    public Builder setErrorMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      errorMessage_ = value;
      onChanged();
      return this;
    }

    private int eventType_ = 0;
    /**
     * <code>.rocks.mango.proto.api.PPolicyEventType event_type = 4;</code>
     */
    public int getEventTypeValue() {
      return eventType_;
    }
    /**
     * <code>.rocks.mango.proto.api.PPolicyEventType event_type = 4;</code>
     */
    public Builder setEventTypeValue(int value) {
      eventType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.rocks.mango.proto.api.PPolicyEventType event_type = 4;</code>
     */
    public rocks.mango.api.policy.PPolicyEventType getEventType() {
      @SuppressWarnings("deprecation")
      rocks.mango.api.policy.PPolicyEventType result = rocks.mango.api.policy.PPolicyEventType.valueOf(eventType_);
      return result == null ? rocks.mango.api.policy.PPolicyEventType.UNRECOGNIZED : result;
    }
    /**
     * <code>.rocks.mango.proto.api.PPolicyEventType event_type = 4;</code>
     */
    public Builder setEventType(rocks.mango.api.policy.PPolicyEventType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      eventType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.rocks.mango.proto.api.PPolicyEventType event_type = 4;</code>
     */
    public Builder clearEventType() {
      
      eventType_ = 0;
      onChanged();
      return this;
    }

    private rocks.mango.api.policy.PPolicy policy_;
    private com.google.protobuf.SingleFieldBuilderV3<
        rocks.mango.api.policy.PPolicy, rocks.mango.api.policy.PPolicy.Builder, rocks.mango.api.policy.PPolicyOrBuilder> policyBuilder_;
    /**
     * <code>.rocks.mango.proto.api.PPolicy policy = 5;</code>
     */
    public boolean hasPolicy() {
      return policyBuilder_ != null || policy_ != null;
    }
    /**
     * <code>.rocks.mango.proto.api.PPolicy policy = 5;</code>
     */
    public rocks.mango.api.policy.PPolicy getPolicy() {
      if (policyBuilder_ == null) {
        return policy_ == null ? rocks.mango.api.policy.PPolicy.getDefaultInstance() : policy_;
      } else {
        return policyBuilder_.getMessage();
      }
    }
    /**
     * <code>.rocks.mango.proto.api.PPolicy policy = 5;</code>
     */
    public Builder setPolicy(rocks.mango.api.policy.PPolicy value) {
      if (policyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        policy_ = value;
        onChanged();
      } else {
        policyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.rocks.mango.proto.api.PPolicy policy = 5;</code>
     */
    public Builder setPolicy(
        rocks.mango.api.policy.PPolicy.Builder builderForValue) {
      if (policyBuilder_ == null) {
        policy_ = builderForValue.build();
        onChanged();
      } else {
        policyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.rocks.mango.proto.api.PPolicy policy = 5;</code>
     */
    public Builder mergePolicy(rocks.mango.api.policy.PPolicy value) {
      if (policyBuilder_ == null) {
        if (policy_ != null) {
          policy_ =
            rocks.mango.api.policy.PPolicy.newBuilder(policy_).mergeFrom(value).buildPartial();
        } else {
          policy_ = value;
        }
        onChanged();
      } else {
        policyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.rocks.mango.proto.api.PPolicy policy = 5;</code>
     */
    public Builder clearPolicy() {
      if (policyBuilder_ == null) {
        policy_ = null;
        onChanged();
      } else {
        policy_ = null;
        policyBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.rocks.mango.proto.api.PPolicy policy = 5;</code>
     */
    public rocks.mango.api.policy.PPolicy.Builder getPolicyBuilder() {
      
      onChanged();
      return getPolicyFieldBuilder().getBuilder();
    }
    /**
     * <code>.rocks.mango.proto.api.PPolicy policy = 5;</code>
     */
    public rocks.mango.api.policy.PPolicyOrBuilder getPolicyOrBuilder() {
      if (policyBuilder_ != null) {
        return policyBuilder_.getMessageOrBuilder();
      } else {
        return policy_ == null ?
            rocks.mango.api.policy.PPolicy.getDefaultInstance() : policy_;
      }
    }
    /**
     * <code>.rocks.mango.proto.api.PPolicy policy = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        rocks.mango.api.policy.PPolicy, rocks.mango.api.policy.PPolicy.Builder, rocks.mango.api.policy.PPolicyOrBuilder> 
        getPolicyFieldBuilder() {
      if (policyBuilder_ == null) {
        policyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            rocks.mango.api.policy.PPolicy, rocks.mango.api.policy.PPolicy.Builder, rocks.mango.api.policy.PPolicyOrBuilder>(
                getPolicy(),
                getParentForChildren(),
                isClean());
        policy_ = null;
      }
      return policyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:rocks.mango.proto.api.PPolicyEvent)
  }

  // @@protoc_insertion_point(class_scope:rocks.mango.proto.api.PPolicyEvent)
  private static final rocks.mango.api.policy.PPolicyEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new rocks.mango.api.policy.PPolicyEvent();
  }

  public static rocks.mango.api.policy.PPolicyEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PPolicyEvent>
      PARSER = new com.google.protobuf.AbstractParser<PPolicyEvent>() {
    @java.lang.Override
    public PPolicyEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PPolicyEvent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PPolicyEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PPolicyEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public rocks.mango.api.policy.PPolicyEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

