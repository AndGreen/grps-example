package rocks.mango.api.policy;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.23.0)",
    comments = "Source: proto-policy/service.proto")
public final class PolicyServiceGrpc {

  private PolicyServiceGrpc() {}

  public static final String SERVICE_NAME = "rocks.mango.proto.api.PolicyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<rocks.mango.api.policy.PCreatePolicyRequest,
      rocks.mango.api.policy.PCreatePolicyResponse> getCreatePolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createPolicy",
      requestType = rocks.mango.api.policy.PCreatePolicyRequest.class,
      responseType = rocks.mango.api.policy.PCreatePolicyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rocks.mango.api.policy.PCreatePolicyRequest,
      rocks.mango.api.policy.PCreatePolicyResponse> getCreatePolicyMethod() {
    io.grpc.MethodDescriptor<rocks.mango.api.policy.PCreatePolicyRequest, rocks.mango.api.policy.PCreatePolicyResponse> getCreatePolicyMethod;
    if ((getCreatePolicyMethod = PolicyServiceGrpc.getCreatePolicyMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getCreatePolicyMethod = PolicyServiceGrpc.getCreatePolicyMethod) == null) {
          PolicyServiceGrpc.getCreatePolicyMethod = getCreatePolicyMethod =
              io.grpc.MethodDescriptor.<rocks.mango.api.policy.PCreatePolicyRequest, rocks.mango.api.policy.PCreatePolicyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rocks.mango.api.policy.PCreatePolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rocks.mango.api.policy.PCreatePolicyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("createPolicy"))
              .build();
        }
      }
    }
    return getCreatePolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rocks.mango.api.policy.PUpdateLimitsRequest,
      rocks.mango.api.policy.PUpdateLimitsResponse> getUpdateLimitsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateLimits",
      requestType = rocks.mango.api.policy.PUpdateLimitsRequest.class,
      responseType = rocks.mango.api.policy.PUpdateLimitsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rocks.mango.api.policy.PUpdateLimitsRequest,
      rocks.mango.api.policy.PUpdateLimitsResponse> getUpdateLimitsMethod() {
    io.grpc.MethodDescriptor<rocks.mango.api.policy.PUpdateLimitsRequest, rocks.mango.api.policy.PUpdateLimitsResponse> getUpdateLimitsMethod;
    if ((getUpdateLimitsMethod = PolicyServiceGrpc.getUpdateLimitsMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getUpdateLimitsMethod = PolicyServiceGrpc.getUpdateLimitsMethod) == null) {
          PolicyServiceGrpc.getUpdateLimitsMethod = getUpdateLimitsMethod =
              io.grpc.MethodDescriptor.<rocks.mango.api.policy.PUpdateLimitsRequest, rocks.mango.api.policy.PUpdateLimitsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateLimits"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rocks.mango.api.policy.PUpdateLimitsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rocks.mango.api.policy.PUpdateLimitsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("updateLimits"))
              .build();
        }
      }
    }
    return getUpdateLimitsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rocks.mango.api.policy.PAssignPolicyRequest,
      rocks.mango.api.policy.PAssignPolicyResponse> getAssignPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "assignPolicy",
      requestType = rocks.mango.api.policy.PAssignPolicyRequest.class,
      responseType = rocks.mango.api.policy.PAssignPolicyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<rocks.mango.api.policy.PAssignPolicyRequest,
      rocks.mango.api.policy.PAssignPolicyResponse> getAssignPolicyMethod() {
    io.grpc.MethodDescriptor<rocks.mango.api.policy.PAssignPolicyRequest, rocks.mango.api.policy.PAssignPolicyResponse> getAssignPolicyMethod;
    if ((getAssignPolicyMethod = PolicyServiceGrpc.getAssignPolicyMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getAssignPolicyMethod = PolicyServiceGrpc.getAssignPolicyMethod) == null) {
          PolicyServiceGrpc.getAssignPolicyMethod = getAssignPolicyMethod =
              io.grpc.MethodDescriptor.<rocks.mango.api.policy.PAssignPolicyRequest, rocks.mango.api.policy.PAssignPolicyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "assignPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rocks.mango.api.policy.PAssignPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rocks.mango.api.policy.PAssignPolicyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("assignPolicy"))
              .build();
        }
      }
    }
    return getAssignPolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<rocks.mango.api.policy.PGetPolicyRequest,
      rocks.mango.api.policy.PGetPolicyResponse> getGetPolicyStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPolicyStream",
      requestType = rocks.mango.api.policy.PGetPolicyRequest.class,
      responseType = rocks.mango.api.policy.PGetPolicyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<rocks.mango.api.policy.PGetPolicyRequest,
      rocks.mango.api.policy.PGetPolicyResponse> getGetPolicyStreamMethod() {
    io.grpc.MethodDescriptor<rocks.mango.api.policy.PGetPolicyRequest, rocks.mango.api.policy.PGetPolicyResponse> getGetPolicyStreamMethod;
    if ((getGetPolicyStreamMethod = PolicyServiceGrpc.getGetPolicyStreamMethod) == null) {
      synchronized (PolicyServiceGrpc.class) {
        if ((getGetPolicyStreamMethod = PolicyServiceGrpc.getGetPolicyStreamMethod) == null) {
          PolicyServiceGrpc.getGetPolicyStreamMethod = getGetPolicyStreamMethod =
              io.grpc.MethodDescriptor.<rocks.mango.api.policy.PGetPolicyRequest, rocks.mango.api.policy.PGetPolicyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getPolicyStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rocks.mango.api.policy.PGetPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  rocks.mango.api.policy.PGetPolicyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PolicyServiceMethodDescriptorSupplier("getPolicyStream"))
              .build();
        }
      }
    }
    return getGetPolicyStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PolicyServiceStub newStub(io.grpc.Channel channel) {
    return new PolicyServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PolicyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PolicyServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PolicyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PolicyServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PolicyServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createPolicy(rocks.mango.api.policy.PCreatePolicyRequest request,
        io.grpc.stub.StreamObserver<rocks.mango.api.policy.PCreatePolicyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreatePolicyMethod(), responseObserver);
    }

    /**
     */
    public void updateLimits(rocks.mango.api.policy.PUpdateLimitsRequest request,
        io.grpc.stub.StreamObserver<rocks.mango.api.policy.PUpdateLimitsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateLimitsMethod(), responseObserver);
    }

    /**
     */
    public void assignPolicy(rocks.mango.api.policy.PAssignPolicyRequest request,
        io.grpc.stub.StreamObserver<rocks.mango.api.policy.PAssignPolicyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAssignPolicyMethod(), responseObserver);
    }

    /**
     */
    public void getPolicyStream(rocks.mango.api.policy.PGetPolicyRequest request,
        io.grpc.stub.StreamObserver<rocks.mango.api.policy.PGetPolicyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPolicyStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreatePolicyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                rocks.mango.api.policy.PCreatePolicyRequest,
                rocks.mango.api.policy.PCreatePolicyResponse>(
                  this, METHODID_CREATE_POLICY)))
          .addMethod(
            getUpdateLimitsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                rocks.mango.api.policy.PUpdateLimitsRequest,
                rocks.mango.api.policy.PUpdateLimitsResponse>(
                  this, METHODID_UPDATE_LIMITS)))
          .addMethod(
            getAssignPolicyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                rocks.mango.api.policy.PAssignPolicyRequest,
                rocks.mango.api.policy.PAssignPolicyResponse>(
                  this, METHODID_ASSIGN_POLICY)))
          .addMethod(
            getGetPolicyStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                rocks.mango.api.policy.PGetPolicyRequest,
                rocks.mango.api.policy.PGetPolicyResponse>(
                  this, METHODID_GET_POLICY_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class PolicyServiceStub extends io.grpc.stub.AbstractStub<PolicyServiceStub> {
    private PolicyServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PolicyServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PolicyServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PolicyServiceStub(channel, callOptions);
    }

    /**
     */
    public void createPolicy(rocks.mango.api.policy.PCreatePolicyRequest request,
        io.grpc.stub.StreamObserver<rocks.mango.api.policy.PCreatePolicyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreatePolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateLimits(rocks.mango.api.policy.PUpdateLimitsRequest request,
        io.grpc.stub.StreamObserver<rocks.mango.api.policy.PUpdateLimitsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateLimitsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void assignPolicy(rocks.mango.api.policy.PAssignPolicyRequest request,
        io.grpc.stub.StreamObserver<rocks.mango.api.policy.PAssignPolicyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAssignPolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPolicyStream(rocks.mango.api.policy.PGetPolicyRequest request,
        io.grpc.stub.StreamObserver<rocks.mango.api.policy.PGetPolicyResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetPolicyStreamMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PolicyServiceBlockingStub extends io.grpc.stub.AbstractStub<PolicyServiceBlockingStub> {
    private PolicyServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PolicyServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PolicyServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PolicyServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public rocks.mango.api.policy.PCreatePolicyResponse createPolicy(rocks.mango.api.policy.PCreatePolicyRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreatePolicyMethod(), getCallOptions(), request);
    }

    /**
     */
    public rocks.mango.api.policy.PUpdateLimitsResponse updateLimits(rocks.mango.api.policy.PUpdateLimitsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateLimitsMethod(), getCallOptions(), request);
    }

    /**
     */
    public rocks.mango.api.policy.PAssignPolicyResponse assignPolicy(rocks.mango.api.policy.PAssignPolicyRequest request) {
      return blockingUnaryCall(
          getChannel(), getAssignPolicyMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<rocks.mango.api.policy.PGetPolicyResponse> getPolicyStream(
        rocks.mango.api.policy.PGetPolicyRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetPolicyStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PolicyServiceFutureStub extends io.grpc.stub.AbstractStub<PolicyServiceFutureStub> {
    private PolicyServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PolicyServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PolicyServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PolicyServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rocks.mango.api.policy.PCreatePolicyResponse> createPolicy(
        rocks.mango.api.policy.PCreatePolicyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreatePolicyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rocks.mango.api.policy.PUpdateLimitsResponse> updateLimits(
        rocks.mango.api.policy.PUpdateLimitsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateLimitsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<rocks.mango.api.policy.PAssignPolicyResponse> assignPolicy(
        rocks.mango.api.policy.PAssignPolicyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAssignPolicyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_POLICY = 0;
  private static final int METHODID_UPDATE_LIMITS = 1;
  private static final int METHODID_ASSIGN_POLICY = 2;
  private static final int METHODID_GET_POLICY_STREAM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PolicyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PolicyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_POLICY:
          serviceImpl.createPolicy((rocks.mango.api.policy.PCreatePolicyRequest) request,
              (io.grpc.stub.StreamObserver<rocks.mango.api.policy.PCreatePolicyResponse>) responseObserver);
          break;
        case METHODID_UPDATE_LIMITS:
          serviceImpl.updateLimits((rocks.mango.api.policy.PUpdateLimitsRequest) request,
              (io.grpc.stub.StreamObserver<rocks.mango.api.policy.PUpdateLimitsResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_POLICY:
          serviceImpl.assignPolicy((rocks.mango.api.policy.PAssignPolicyRequest) request,
              (io.grpc.stub.StreamObserver<rocks.mango.api.policy.PAssignPolicyResponse>) responseObserver);
          break;
        case METHODID_GET_POLICY_STREAM:
          serviceImpl.getPolicyStream((rocks.mango.api.policy.PGetPolicyRequest) request,
              (io.grpc.stub.StreamObserver<rocks.mango.api.policy.PGetPolicyResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PolicyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PolicyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return rocks.mango.api.policy.Service.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PolicyService");
    }
  }

  private static final class PolicyServiceFileDescriptorSupplier
      extends PolicyServiceBaseDescriptorSupplier {
    PolicyServiceFileDescriptorSupplier() {}
  }

  private static final class PolicyServiceMethodDescriptorSupplier
      extends PolicyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PolicyServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PolicyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PolicyServiceFileDescriptorSupplier())
              .addMethod(getCreatePolicyMethod())
              .addMethod(getUpdateLimitsMethod())
              .addMethod(getAssignPolicyMethod())
              .addMethod(getGetPolicyStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
