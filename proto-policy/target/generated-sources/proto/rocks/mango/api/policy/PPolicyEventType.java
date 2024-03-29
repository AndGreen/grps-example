// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto-policy/kafka.proto

package rocks.mango.api.policy;

/**
 * Protobuf enum {@code rocks.mango.proto.api.PPolicyEventType}
 */
public enum PPolicyEventType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNDEFINED = 0;</code>
   */
  UNDEFINED(0),
  /**
   * <code>CREATED = 1;</code>
   */
  CREATED(1),
  /**
   * <code>ASSIGNED = 2;</code>
   */
  ASSIGNED(2),
  /**
   * <code>LIMITS_UPDATED = 3;</code>
   */
  LIMITS_UPDATED(3),
  /**
   * <code>RENEWED = 4;</code>
   */
  RENEWED(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNDEFINED = 0;</code>
   */
  public static final int UNDEFINED_VALUE = 0;
  /**
   * <code>CREATED = 1;</code>
   */
  public static final int CREATED_VALUE = 1;
  /**
   * <code>ASSIGNED = 2;</code>
   */
  public static final int ASSIGNED_VALUE = 2;
  /**
   * <code>LIMITS_UPDATED = 3;</code>
   */
  public static final int LIMITS_UPDATED_VALUE = 3;
  /**
   * <code>RENEWED = 4;</code>
   */
  public static final int RENEWED_VALUE = 4;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static PPolicyEventType valueOf(int value) {
    return forNumber(value);
  }

  public static PPolicyEventType forNumber(int value) {
    switch (value) {
      case 0: return UNDEFINED;
      case 1: return CREATED;
      case 2: return ASSIGNED;
      case 3: return LIMITS_UPDATED;
      case 4: return RENEWED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PPolicyEventType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PPolicyEventType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PPolicyEventType>() {
          public PPolicyEventType findValueByNumber(int number) {
            return PPolicyEventType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return rocks.mango.api.policy.Kafka.getDescriptor().getEnumTypes().get(0);
  }

  private static final PPolicyEventType[] VALUES = values();

  public static PPolicyEventType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private PPolicyEventType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:rocks.mango.proto.api.PPolicyEventType)
}

