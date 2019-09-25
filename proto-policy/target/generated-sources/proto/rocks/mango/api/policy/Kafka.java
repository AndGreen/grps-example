// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto-policy/kafka.proto

package rocks.mango.api.policy;

public final class Kafka {
  private Kafka() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rocks_mango_proto_api_PCreatePolicy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rocks_mango_proto_api_PCreatePolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rocks_mango_proto_api_PAssignPolicy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rocks_mango_proto_api_PAssignPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rocks_mango_proto_api_PUpdateLimits_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rocks_mango_proto_api_PUpdateLimits_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rocks_mango_proto_api_PUpdateLimits_LimitsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rocks_mango_proto_api_PUpdateLimits_LimitsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rocks_mango_proto_api_PRenewPolicy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rocks_mango_proto_api_PRenewPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rocks_mango_proto_api_PPolicyCommand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rocks_mango_proto_api_PPolicyCommand_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rocks_mango_proto_api_PPolicyEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rocks_mango_proto_api_PPolicyEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rocks_mango_proto_api_PPolicyNumber_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rocks_mango_proto_api_PPolicyNumber_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rocks_mango_proto_api_PGeneratePolicyNumbers_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rocks_mango_proto_api_PGeneratePolicyNumbers_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030proto-policy/kafka.proto\022\025rocks.mango." +
      "proto.api\032\026proto-types/base.proto\032\031proto" +
      "-policy/entity.proto\"3\n\rPCreatePolicy\022\021\n" +
      "\tpolicy_id\030\001 \001(\t\022\017\n\007address\030\002 \001(\t\"3\n\rPAs" +
      "signPolicy\022\021\n\tpolicy_id\030\001 \001(\t\022\017\n\007user_id" +
      "\030\002 \001(\t\"\262\001\n\rPUpdateLimits\022\021\n\tpolicy_id\030\001 " +
      "\001(\t\022@\n\006limits\030\002 \003(\01320.rocks.mango.proto." +
      "api.PUpdateLimits.LimitsEntry\032L\n\013LimitsE" +
      "ntry\022\013\n\003key\030\001 \001(\t\022,\n\005value\030\002 \001(\0132\035.rocks" +
      ".mango.proto.api.PLimit:\0028\001\"5\n\014PRenewPol" +
      "icy\022\021\n\tpolicy_id\030\001 \001(\t\022\022\n\npayment_id\030\002 \001" +
      "(\t\"\241\002\n\016PPolicyCommand\022\n\n\002id\030\001 \001(\t\022=\n\rcre" +
      "ate_policy\030\013 \001(\0132$.rocks.mango.proto.api" +
      ".PCreatePolicyH\000\022=\n\rassign_policy\030\014 \001(\0132" +
      "$.rocks.mango.proto.api.PAssignPolicyH\000\022" +
      "=\n\rupdate_limits\030\r \001(\0132$.rocks.mango.pro" +
      "to.api.PUpdateLimitsH\000\022;\n\014renew_policy\030\016" +
      " \001(\0132#.rocks.mango.proto.api.PRenewPolic" +
      "yH\000B\t\n\007payload\"\272\001\n\014PPolicyEvent\022\022\n\ncomma" +
      "nd_id\030\001 \001(\t\022\022\n\nerror_code\030\002 \001(\t\022\025\n\rerror" +
      "_message\030\003 \001(\t\022;\n\nevent_type\030\004 \001(\0162\'.roc" +
      "ks.mango.proto.api.PPolicyEventType\022.\n\006p" +
      "olicy\030\005 \001(\0132\036.rocks.mango.proto.api.PPol" +
      "icy\"3\n\rPPolicyNumber\022\022\n\nrequest_id\030\001 \001(\t" +
      "\022\016\n\006number\030\002 \001(\t\"E\n\026PGeneratePolicyNumbe" +
      "rs\022\022\n\nrequest_id\030\001 \001(\t\022\027\n\017quantityNumber" +
      "s\030\002 \001(\005*]\n\020PPolicyEventType\022\r\n\tUNDEFINED" +
      "\020\000\022\013\n\007CREATED\020\001\022\014\n\010ASSIGNED\020\002\022\022\n\016LIMITS_" +
      "UPDATED\020\003\022\013\n\007RENEWED\020\004B\032\n\026rocks.mango.ap" +
      "i.policyP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          rocks.mango.api.Base.getDescriptor(),
          rocks.mango.api.policy.Entity.getDescriptor(),
        }, assigner);
    internal_static_rocks_mango_proto_api_PCreatePolicy_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_rocks_mango_proto_api_PCreatePolicy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rocks_mango_proto_api_PCreatePolicy_descriptor,
        new java.lang.String[] { "PolicyId", "Address", });
    internal_static_rocks_mango_proto_api_PAssignPolicy_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_rocks_mango_proto_api_PAssignPolicy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rocks_mango_proto_api_PAssignPolicy_descriptor,
        new java.lang.String[] { "PolicyId", "UserId", });
    internal_static_rocks_mango_proto_api_PUpdateLimits_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_rocks_mango_proto_api_PUpdateLimits_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rocks_mango_proto_api_PUpdateLimits_descriptor,
        new java.lang.String[] { "PolicyId", "Limits", });
    internal_static_rocks_mango_proto_api_PUpdateLimits_LimitsEntry_descriptor =
      internal_static_rocks_mango_proto_api_PUpdateLimits_descriptor.getNestedTypes().get(0);
    internal_static_rocks_mango_proto_api_PUpdateLimits_LimitsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rocks_mango_proto_api_PUpdateLimits_LimitsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_rocks_mango_proto_api_PRenewPolicy_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_rocks_mango_proto_api_PRenewPolicy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rocks_mango_proto_api_PRenewPolicy_descriptor,
        new java.lang.String[] { "PolicyId", "PaymentId", });
    internal_static_rocks_mango_proto_api_PPolicyCommand_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_rocks_mango_proto_api_PPolicyCommand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rocks_mango_proto_api_PPolicyCommand_descriptor,
        new java.lang.String[] { "Id", "CreatePolicy", "AssignPolicy", "UpdateLimits", "RenewPolicy", "Payload", });
    internal_static_rocks_mango_proto_api_PPolicyEvent_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_rocks_mango_proto_api_PPolicyEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rocks_mango_proto_api_PPolicyEvent_descriptor,
        new java.lang.String[] { "CommandId", "ErrorCode", "ErrorMessage", "EventType", "Policy", });
    internal_static_rocks_mango_proto_api_PPolicyNumber_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_rocks_mango_proto_api_PPolicyNumber_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rocks_mango_proto_api_PPolicyNumber_descriptor,
        new java.lang.String[] { "RequestId", "Number", });
    internal_static_rocks_mango_proto_api_PGeneratePolicyNumbers_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_rocks_mango_proto_api_PGeneratePolicyNumbers_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rocks_mango_proto_api_PGeneratePolicyNumbers_descriptor,
        new java.lang.String[] { "RequestId", "QuantityNumbers", });
    rocks.mango.api.Base.getDescriptor();
    rocks.mango.api.policy.Entity.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
