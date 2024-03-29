// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto-policy/entity.proto

package rocks.mango.api.policy;

public final class Entity {
  private Entity() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rocks_mango_proto_api_PPolicy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rocks_mango_proto_api_PPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rocks_mango_proto_api_PPolicy_LimitsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rocks_mango_proto_api_PPolicy_LimitsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rocks_mango_proto_api_PLimit_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rocks_mango_proto_api_PLimit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rocks_mango_proto_api_PPolicyAppView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rocks_mango_proto_api_PPolicyAppView_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rocks_mango_proto_api_PPolicyAppView_LimitsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rocks_mango_proto_api_PPolicyAppView_LimitsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_rocks_mango_proto_api_PCard_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_rocks_mango_proto_api_PCard_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031proto-policy/entity.proto\022\025rocks.mango" +
      ".proto.api\032\026proto-types/base.proto\"\353\003\n\007P" +
      "Policy\022\n\n\002id\030\001 \001(\t\022\017\n\007user_id\030\002 \001(\t\0221\n\ns" +
      "tart_date\030\003 \001(\0132\035.rocks.mango.proto.PTim" +
      "estamp\022/\n\010end_date\030\004 \001(\0132\035.rocks.mango.p" +
      "roto.PTimestamp\0227\n\013period_type\030\005 \001(\0162\".r" +
      "ocks.mango.proto.api.PPeriodType\022\023\n\013paym" +
      "ent_ids\030\006 \003(\t\022\025\n\rpolicy_number\030\007 \001(\t\022\017\n\007" +
      "version\030\010 \001(\003\022\033\n\023insurance_object_id\030\n \001" +
      "(\t\022:\n\006limits\030\013 \003(\0132*.rocks.mango.proto.a" +
      "pi.PPolicy.LimitsEntry\022)\n\005price\030\014 \001(\0132\032." +
      "rocks.mango.proto.PAmount\022\027\n\017subscriptio" +
      "n_id\030\r \001(\t\032L\n\013LimitsEntry\022\013\n\003key\030\001 \001(\t\022," +
      "\n\005value\030\002 \001(\0132\035.rocks.mango.proto.api.PL" +
      "imit:\0028\001\"3\n\006PLimit\022)\n\005value\030\001 \001(\0132\032.rock" +
      "s.mango.proto.PAmount\"\353\003\n\016PPolicyAppView" +
      "\022\n\n\002id\030\001 \001(\t\022)\n\005price\030\002 \001(\0132\032.rocks.mang" +
      "o.proto.PAmount\022\017\n\007address\030\003 \001(\t\022A\n\006limi" +
      "ts\030\004 \003(\01321.rocks.mango.proto.api.PPolicy" +
      "AppView.LimitsEntry\0224\n\006status\030\005 \001(\0162$.ro" +
      "cks.mango.proto.api.PPolicyStatus\022\027\n\017sub" +
      "scription_id\030\006 \001(\t\022/\n\010end_date\030\007 \001(\0132\035.r" +
      "ocks.mango.proto.PTimestamp\0221\n\nstart_dat" +
      "e\030\010 \001(\0132\035.rocks.mango.proto.PTimestamp\022\014" +
      "\n\004paid\030\t \001(\010\022\021\n\tcancelled\030\n \001(\010\022\020\n\010pdf_l" +
      "ink\030\013 \001(\t\022\032\n\022pdf_signature_link\030\014 \001(\t\032L\n" +
      "\013LimitsEntry\022\013\n\003key\030\001 \001(\t\022,\n\005value\030\002 \001(\013" +
      "2\035.rocks.mango.proto.api.PLimit:\0028\001\"\\\n\005P" +
      "Card\022\021\n\tfirst_six\030\001 \001(\t\022\021\n\tlast_four\030\002 \001" +
      "(\t\022\014\n\004type\030\003 \001(\t\022\020\n\010exp_date\030\004 \001(\t\022\r\n\005to" +
      "ken\030\005 \001(\t*!\n\013PPeriodType\022\t\n\005MONTH\020\000\022\007\n\003D" +
      "AY\020\001*S\n\rPPolicyStatus\022\n\n\006ACTIVE\020\000\022\014\n\010INA" +
      "CTIVE\020\001\022\022\n\016WILL_BE_ACTIVE\020\002\022\024\n\020WILL_BE_I" +
      "NACTIVE\020\003B\032\n\026rocks.mango.api.policyP\001b\006p" +
      "roto3"
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
        }, assigner);
    internal_static_rocks_mango_proto_api_PPolicy_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_rocks_mango_proto_api_PPolicy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rocks_mango_proto_api_PPolicy_descriptor,
        new java.lang.String[] { "Id", "UserId", "StartDate", "EndDate", "PeriodType", "PaymentIds", "PolicyNumber", "Version", "InsuranceObjectId", "Limits", "Price", "SubscriptionId", });
    internal_static_rocks_mango_proto_api_PPolicy_LimitsEntry_descriptor =
      internal_static_rocks_mango_proto_api_PPolicy_descriptor.getNestedTypes().get(0);
    internal_static_rocks_mango_proto_api_PPolicy_LimitsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rocks_mango_proto_api_PPolicy_LimitsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_rocks_mango_proto_api_PLimit_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_rocks_mango_proto_api_PLimit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rocks_mango_proto_api_PLimit_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_rocks_mango_proto_api_PPolicyAppView_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_rocks_mango_proto_api_PPolicyAppView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rocks_mango_proto_api_PPolicyAppView_descriptor,
        new java.lang.String[] { "Id", "Price", "Address", "Limits", "Status", "SubscriptionId", "EndDate", "StartDate", "Paid", "Cancelled", "PdfLink", "PdfSignatureLink", });
    internal_static_rocks_mango_proto_api_PPolicyAppView_LimitsEntry_descriptor =
      internal_static_rocks_mango_proto_api_PPolicyAppView_descriptor.getNestedTypes().get(0);
    internal_static_rocks_mango_proto_api_PPolicyAppView_LimitsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rocks_mango_proto_api_PPolicyAppView_LimitsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_rocks_mango_proto_api_PCard_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_rocks_mango_proto_api_PCard_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_rocks_mango_proto_api_PCard_descriptor,
        new java.lang.String[] { "FirstSix", "LastFour", "Type", "ExpDate", "Token", });
    rocks.mango.api.Base.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
