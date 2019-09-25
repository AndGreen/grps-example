// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto-policy/kafka.proto

package rocks.mango.api.policy;

public interface PPolicyEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:rocks.mango.proto.api.PPolicyEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string command_id = 1;</code>
   */
  java.lang.String getCommandId();
  /**
   * <code>string command_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getCommandIdBytes();

  /**
   * <code>string error_code = 2;</code>
   */
  java.lang.String getErrorCode();
  /**
   * <code>string error_code = 2;</code>
   */
  com.google.protobuf.ByteString
      getErrorCodeBytes();

  /**
   * <code>string error_message = 3;</code>
   */
  java.lang.String getErrorMessage();
  /**
   * <code>string error_message = 3;</code>
   */
  com.google.protobuf.ByteString
      getErrorMessageBytes();

  /**
   * <code>.rocks.mango.proto.api.PPolicyEventType event_type = 4;</code>
   */
  int getEventTypeValue();
  /**
   * <code>.rocks.mango.proto.api.PPolicyEventType event_type = 4;</code>
   */
  rocks.mango.api.policy.PPolicyEventType getEventType();

  /**
   * <code>.rocks.mango.proto.api.PPolicy policy = 5;</code>
   */
  boolean hasPolicy();
  /**
   * <code>.rocks.mango.proto.api.PPolicy policy = 5;</code>
   */
  rocks.mango.api.policy.PPolicy getPolicy();
  /**
   * <code>.rocks.mango.proto.api.PPolicy policy = 5;</code>
   */
  rocks.mango.api.policy.PPolicyOrBuilder getPolicyOrBuilder();
}
