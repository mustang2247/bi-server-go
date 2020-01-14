package com.bi.biservice;

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
 * <pre>
 * bi 服务大厅
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: BiService.proto")
public final class BiServiceGrpc {

  private BiServiceGrpc() {}

  public static final String SERVICE_NAME = "BiService.BiService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.bi.biservice.CommonRequest,
      com.bi.biservice.CommonResponse> getInstallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Install",
      requestType = com.bi.biservice.CommonRequest.class,
      responseType = com.bi.biservice.CommonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bi.biservice.CommonRequest,
      com.bi.biservice.CommonResponse> getInstallMethod() {
    io.grpc.MethodDescriptor<com.bi.biservice.CommonRequest, com.bi.biservice.CommonResponse> getInstallMethod;
    if ((getInstallMethod = BiServiceGrpc.getInstallMethod) == null) {
      synchronized (BiServiceGrpc.class) {
        if ((getInstallMethod = BiServiceGrpc.getInstallMethod) == null) {
          BiServiceGrpc.getInstallMethod = getInstallMethod =
              io.grpc.MethodDescriptor.<com.bi.biservice.CommonRequest, com.bi.biservice.CommonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Install"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bi.biservice.CommonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bi.biservice.CommonResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BiServiceMethodDescriptorSupplier("Install"))
              .build();
        }
      }
    }
    return getInstallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bi.biservice.CommonRequest,
      com.bi.biservice.CommonResponse> getStartUpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartUp",
      requestType = com.bi.biservice.CommonRequest.class,
      responseType = com.bi.biservice.CommonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bi.biservice.CommonRequest,
      com.bi.biservice.CommonResponse> getStartUpMethod() {
    io.grpc.MethodDescriptor<com.bi.biservice.CommonRequest, com.bi.biservice.CommonResponse> getStartUpMethod;
    if ((getStartUpMethod = BiServiceGrpc.getStartUpMethod) == null) {
      synchronized (BiServiceGrpc.class) {
        if ((getStartUpMethod = BiServiceGrpc.getStartUpMethod) == null) {
          BiServiceGrpc.getStartUpMethod = getStartUpMethod =
              io.grpc.MethodDescriptor.<com.bi.biservice.CommonRequest, com.bi.biservice.CommonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartUp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bi.biservice.CommonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bi.biservice.CommonResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BiServiceMethodDescriptorSupplier("StartUp"))
              .build();
        }
      }
    }
    return getStartUpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bi.biservice.CommonRequest,
      com.bi.biservice.CommonResponse> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Register",
      requestType = com.bi.biservice.CommonRequest.class,
      responseType = com.bi.biservice.CommonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bi.biservice.CommonRequest,
      com.bi.biservice.CommonResponse> getRegisterMethod() {
    io.grpc.MethodDescriptor<com.bi.biservice.CommonRequest, com.bi.biservice.CommonResponse> getRegisterMethod;
    if ((getRegisterMethod = BiServiceGrpc.getRegisterMethod) == null) {
      synchronized (BiServiceGrpc.class) {
        if ((getRegisterMethod = BiServiceGrpc.getRegisterMethod) == null) {
          BiServiceGrpc.getRegisterMethod = getRegisterMethod =
              io.grpc.MethodDescriptor.<com.bi.biservice.CommonRequest, com.bi.biservice.CommonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bi.biservice.CommonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bi.biservice.CommonResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BiServiceMethodDescriptorSupplier("Register"))
              .build();
        }
      }
    }
    return getRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bi.biservice.CommonRequest,
      com.bi.biservice.CommonResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Login",
      requestType = com.bi.biservice.CommonRequest.class,
      responseType = com.bi.biservice.CommonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bi.biservice.CommonRequest,
      com.bi.biservice.CommonResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<com.bi.biservice.CommonRequest, com.bi.biservice.CommonResponse> getLoginMethod;
    if ((getLoginMethod = BiServiceGrpc.getLoginMethod) == null) {
      synchronized (BiServiceGrpc.class) {
        if ((getLoginMethod = BiServiceGrpc.getLoginMethod) == null) {
          BiServiceGrpc.getLoginMethod = getLoginMethod =
              io.grpc.MethodDescriptor.<com.bi.biservice.CommonRequest, com.bi.biservice.CommonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bi.biservice.CommonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bi.biservice.CommonResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BiServiceMethodDescriptorSupplier("Login"))
              .build();
        }
      }
    }
    return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bi.biservice.CommonRequest,
      com.bi.biservice.CommonResponse> getPaymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Payment",
      requestType = com.bi.biservice.CommonRequest.class,
      responseType = com.bi.biservice.CommonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bi.biservice.CommonRequest,
      com.bi.biservice.CommonResponse> getPaymentMethod() {
    io.grpc.MethodDescriptor<com.bi.biservice.CommonRequest, com.bi.biservice.CommonResponse> getPaymentMethod;
    if ((getPaymentMethod = BiServiceGrpc.getPaymentMethod) == null) {
      synchronized (BiServiceGrpc.class) {
        if ((getPaymentMethod = BiServiceGrpc.getPaymentMethod) == null) {
          BiServiceGrpc.getPaymentMethod = getPaymentMethod =
              io.grpc.MethodDescriptor.<com.bi.biservice.CommonRequest, com.bi.biservice.CommonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Payment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bi.biservice.CommonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bi.biservice.CommonResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BiServiceMethodDescriptorSupplier("Payment"))
              .build();
        }
      }
    }
    return getPaymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bi.biservice.CommonRequest,
      com.bi.biservice.CommonResponse> getEconomyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Economy",
      requestType = com.bi.biservice.CommonRequest.class,
      responseType = com.bi.biservice.CommonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bi.biservice.CommonRequest,
      com.bi.biservice.CommonResponse> getEconomyMethod() {
    io.grpc.MethodDescriptor<com.bi.biservice.CommonRequest, com.bi.biservice.CommonResponse> getEconomyMethod;
    if ((getEconomyMethod = BiServiceGrpc.getEconomyMethod) == null) {
      synchronized (BiServiceGrpc.class) {
        if ((getEconomyMethod = BiServiceGrpc.getEconomyMethod) == null) {
          BiServiceGrpc.getEconomyMethod = getEconomyMethod =
              io.grpc.MethodDescriptor.<com.bi.biservice.CommonRequest, com.bi.biservice.CommonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Economy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bi.biservice.CommonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bi.biservice.CommonResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BiServiceMethodDescriptorSupplier("Economy"))
              .build();
        }
      }
    }
    return getEconomyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bi.biservice.CommonRequest,
      com.bi.biservice.CommonResponse> getAddUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUser",
      requestType = com.bi.biservice.CommonRequest.class,
      responseType = com.bi.biservice.CommonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bi.biservice.CommonRequest,
      com.bi.biservice.CommonResponse> getAddUserMethod() {
    io.grpc.MethodDescriptor<com.bi.biservice.CommonRequest, com.bi.biservice.CommonResponse> getAddUserMethod;
    if ((getAddUserMethod = BiServiceGrpc.getAddUserMethod) == null) {
      synchronized (BiServiceGrpc.class) {
        if ((getAddUserMethod = BiServiceGrpc.getAddUserMethod) == null) {
          BiServiceGrpc.getAddUserMethod = getAddUserMethod =
              io.grpc.MethodDescriptor.<com.bi.biservice.CommonRequest, com.bi.biservice.CommonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bi.biservice.CommonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bi.biservice.CommonResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BiServiceMethodDescriptorSupplier("AddUser"))
              .build();
        }
      }
    }
    return getAddUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bi.biservice.CommonRequest,
      com.bi.biservice.CommonResponse> getQuestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Quest",
      requestType = com.bi.biservice.CommonRequest.class,
      responseType = com.bi.biservice.CommonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bi.biservice.CommonRequest,
      com.bi.biservice.CommonResponse> getQuestMethod() {
    io.grpc.MethodDescriptor<com.bi.biservice.CommonRequest, com.bi.biservice.CommonResponse> getQuestMethod;
    if ((getQuestMethod = BiServiceGrpc.getQuestMethod) == null) {
      synchronized (BiServiceGrpc.class) {
        if ((getQuestMethod = BiServiceGrpc.getQuestMethod) == null) {
          BiServiceGrpc.getQuestMethod = getQuestMethod =
              io.grpc.MethodDescriptor.<com.bi.biservice.CommonRequest, com.bi.biservice.CommonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Quest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bi.biservice.CommonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bi.biservice.CommonResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BiServiceMethodDescriptorSupplier("Quest"))
              .build();
        }
      }
    }
    return getQuestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bi.biservice.CommonRequest,
      com.bi.biservice.CommonResponse> getEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Event",
      requestType = com.bi.biservice.CommonRequest.class,
      responseType = com.bi.biservice.CommonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bi.biservice.CommonRequest,
      com.bi.biservice.CommonResponse> getEventMethod() {
    io.grpc.MethodDescriptor<com.bi.biservice.CommonRequest, com.bi.biservice.CommonResponse> getEventMethod;
    if ((getEventMethod = BiServiceGrpc.getEventMethod) == null) {
      synchronized (BiServiceGrpc.class) {
        if ((getEventMethod = BiServiceGrpc.getEventMethod) == null) {
          BiServiceGrpc.getEventMethod = getEventMethod =
              io.grpc.MethodDescriptor.<com.bi.biservice.CommonRequest, com.bi.biservice.CommonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Event"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bi.biservice.CommonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bi.biservice.CommonResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BiServiceMethodDescriptorSupplier("Event"))
              .build();
        }
      }
    }
    return getEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.bi.biservice.CommonRequest,
      com.bi.biservice.CommonResponse> getHeartbeatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Heartbeat",
      requestType = com.bi.biservice.CommonRequest.class,
      responseType = com.bi.biservice.CommonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.bi.biservice.CommonRequest,
      com.bi.biservice.CommonResponse> getHeartbeatMethod() {
    io.grpc.MethodDescriptor<com.bi.biservice.CommonRequest, com.bi.biservice.CommonResponse> getHeartbeatMethod;
    if ((getHeartbeatMethod = BiServiceGrpc.getHeartbeatMethod) == null) {
      synchronized (BiServiceGrpc.class) {
        if ((getHeartbeatMethod = BiServiceGrpc.getHeartbeatMethod) == null) {
          BiServiceGrpc.getHeartbeatMethod = getHeartbeatMethod =
              io.grpc.MethodDescriptor.<com.bi.biservice.CommonRequest, com.bi.biservice.CommonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Heartbeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bi.biservice.CommonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.bi.biservice.CommonResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BiServiceMethodDescriptorSupplier("Heartbeat"))
              .build();
        }
      }
    }
    return getHeartbeatMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BiServiceStub newStub(io.grpc.Channel channel) {
    return new BiServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BiServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BiServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BiServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BiServiceFutureStub(channel);
  }

  /**
   * <pre>
   * bi 服务大厅
   * </pre>
   */
  public static abstract class BiServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 安装 只能报送一次
     * </pre>
     */
    public void install(com.bi.biservice.CommonRequest request,
        io.grpc.stub.StreamObserver<com.bi.biservice.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInstallMethod(), responseObserver);
    }

    /**
     * <pre>
     * 启动 打开应用
     * </pre>
     */
    public void startUp(com.bi.biservice.CommonRequest request,
        io.grpc.stub.StreamObserver<com.bi.biservice.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStartUpMethod(), responseObserver);
    }

    /**
     * <pre>
     * 注册
     * </pre>
     */
    public void register(com.bi.biservice.CommonRequest request,
        io.grpc.stub.StreamObserver<com.bi.biservice.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    /**
     * <pre>
     * 登陆
     * </pre>
     */
    public void login(com.bi.biservice.CommonRequest request,
        io.grpc.stub.StreamObserver<com.bi.biservice.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     * <pre>
     * 支付
     * </pre>
     */
    public void payment(com.bi.biservice.CommonRequest request,
        io.grpc.stub.StreamObserver<com.bi.biservice.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPaymentMethod(), responseObserver);
    }

    /**
     * <pre>
     * 虚拟交易 经济系统
     * </pre>
     */
    public void economy(com.bi.biservice.CommonRequest request,
        io.grpc.stub.StreamObserver<com.bi.biservice.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEconomyMethod(), responseObserver);
    }

    /**
     * <pre>
     * 添加用户
     * </pre>
     */
    public void addUser(com.bi.biservice.CommonRequest request,
        io.grpc.stub.StreamObserver<com.bi.biservice.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * 任务及副本系统
     * </pre>
     */
    public void quest(com.bi.biservice.CommonRequest request,
        io.grpc.stub.StreamObserver<com.bi.biservice.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQuestMethod(), responseObserver);
    }

    /**
     * <pre>
     * 自定义 处理 表等
     * </pre>
     */
    public void event(com.bi.biservice.CommonRequest request,
        io.grpc.stub.StreamObserver<com.bi.biservice.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEventMethod(), responseObserver);
    }

    /**
     * <pre>
     * 心跳 在线统计
     * </pre>
     */
    public void heartbeat(com.bi.biservice.CommonRequest request,
        io.grpc.stub.StreamObserver<com.bi.biservice.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHeartbeatMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInstallMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bi.biservice.CommonRequest,
                com.bi.biservice.CommonResponse>(
                  this, METHODID_INSTALL)))
          .addMethod(
            getStartUpMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bi.biservice.CommonRequest,
                com.bi.biservice.CommonResponse>(
                  this, METHODID_START_UP)))
          .addMethod(
            getRegisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bi.biservice.CommonRequest,
                com.bi.biservice.CommonResponse>(
                  this, METHODID_REGISTER)))
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bi.biservice.CommonRequest,
                com.bi.biservice.CommonResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getPaymentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bi.biservice.CommonRequest,
                com.bi.biservice.CommonResponse>(
                  this, METHODID_PAYMENT)))
          .addMethod(
            getEconomyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bi.biservice.CommonRequest,
                com.bi.biservice.CommonResponse>(
                  this, METHODID_ECONOMY)))
          .addMethod(
            getAddUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bi.biservice.CommonRequest,
                com.bi.biservice.CommonResponse>(
                  this, METHODID_ADD_USER)))
          .addMethod(
            getQuestMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bi.biservice.CommonRequest,
                com.bi.biservice.CommonResponse>(
                  this, METHODID_QUEST)))
          .addMethod(
            getEventMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bi.biservice.CommonRequest,
                com.bi.biservice.CommonResponse>(
                  this, METHODID_EVENT)))
          .addMethod(
            getHeartbeatMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.bi.biservice.CommonRequest,
                com.bi.biservice.CommonResponse>(
                  this, METHODID_HEARTBEAT)))
          .build();
    }
  }

  /**
   * <pre>
   * bi 服务大厅
   * </pre>
   */
  public static final class BiServiceStub extends io.grpc.stub.AbstractStub<BiServiceStub> {
    private BiServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BiServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BiServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BiServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 安装 只能报送一次
     * </pre>
     */
    public void install(com.bi.biservice.CommonRequest request,
        io.grpc.stub.StreamObserver<com.bi.biservice.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInstallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 启动 打开应用
     * </pre>
     */
    public void startUp(com.bi.biservice.CommonRequest request,
        io.grpc.stub.StreamObserver<com.bi.biservice.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartUpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 注册
     * </pre>
     */
    public void register(com.bi.biservice.CommonRequest request,
        io.grpc.stub.StreamObserver<com.bi.biservice.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 登陆
     * </pre>
     */
    public void login(com.bi.biservice.CommonRequest request,
        io.grpc.stub.StreamObserver<com.bi.biservice.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 支付
     * </pre>
     */
    public void payment(com.bi.biservice.CommonRequest request,
        io.grpc.stub.StreamObserver<com.bi.biservice.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPaymentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 虚拟交易 经济系统
     * </pre>
     */
    public void economy(com.bi.biservice.CommonRequest request,
        io.grpc.stub.StreamObserver<com.bi.biservice.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEconomyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 添加用户
     * </pre>
     */
    public void addUser(com.bi.biservice.CommonRequest request,
        io.grpc.stub.StreamObserver<com.bi.biservice.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 任务及副本系统
     * </pre>
     */
    public void quest(com.bi.biservice.CommonRequest request,
        io.grpc.stub.StreamObserver<com.bi.biservice.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQuestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 自定义 处理 表等
     * </pre>
     */
    public void event(com.bi.biservice.CommonRequest request,
        io.grpc.stub.StreamObserver<com.bi.biservice.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 心跳 在线统计
     * </pre>
     */
    public void heartbeat(com.bi.biservice.CommonRequest request,
        io.grpc.stub.StreamObserver<com.bi.biservice.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHeartbeatMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * bi 服务大厅
   * </pre>
   */
  public static final class BiServiceBlockingStub extends io.grpc.stub.AbstractStub<BiServiceBlockingStub> {
    private BiServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BiServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BiServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BiServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 安装 只能报送一次
     * </pre>
     */
    public com.bi.biservice.CommonResponse install(com.bi.biservice.CommonRequest request) {
      return blockingUnaryCall(
          getChannel(), getInstallMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 启动 打开应用
     * </pre>
     */
    public com.bi.biservice.CommonResponse startUp(com.bi.biservice.CommonRequest request) {
      return blockingUnaryCall(
          getChannel(), getStartUpMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 注册
     * </pre>
     */
    public com.bi.biservice.CommonResponse register(com.bi.biservice.CommonRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 登陆
     * </pre>
     */
    public com.bi.biservice.CommonResponse login(com.bi.biservice.CommonRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 支付
     * </pre>
     */
    public com.bi.biservice.CommonResponse payment(com.bi.biservice.CommonRequest request) {
      return blockingUnaryCall(
          getChannel(), getPaymentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 虚拟交易 经济系统
     * </pre>
     */
    public com.bi.biservice.CommonResponse economy(com.bi.biservice.CommonRequest request) {
      return blockingUnaryCall(
          getChannel(), getEconomyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 添加用户
     * </pre>
     */
    public com.bi.biservice.CommonResponse addUser(com.bi.biservice.CommonRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 任务及副本系统
     * </pre>
     */
    public com.bi.biservice.CommonResponse quest(com.bi.biservice.CommonRequest request) {
      return blockingUnaryCall(
          getChannel(), getQuestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 自定义 处理 表等
     * </pre>
     */
    public com.bi.biservice.CommonResponse event(com.bi.biservice.CommonRequest request) {
      return blockingUnaryCall(
          getChannel(), getEventMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 心跳 在线统计
     * </pre>
     */
    public com.bi.biservice.CommonResponse heartbeat(com.bi.biservice.CommonRequest request) {
      return blockingUnaryCall(
          getChannel(), getHeartbeatMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * bi 服务大厅
   * </pre>
   */
  public static final class BiServiceFutureStub extends io.grpc.stub.AbstractStub<BiServiceFutureStub> {
    private BiServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BiServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BiServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BiServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 安装 只能报送一次
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bi.biservice.CommonResponse> install(
        com.bi.biservice.CommonRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getInstallMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 启动 打开应用
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bi.biservice.CommonResponse> startUp(
        com.bi.biservice.CommonRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStartUpMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 注册
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bi.biservice.CommonResponse> register(
        com.bi.biservice.CommonRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 登陆
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bi.biservice.CommonResponse> login(
        com.bi.biservice.CommonRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 支付
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bi.biservice.CommonResponse> payment(
        com.bi.biservice.CommonRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPaymentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 虚拟交易 经济系统
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bi.biservice.CommonResponse> economy(
        com.bi.biservice.CommonRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEconomyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 添加用户
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bi.biservice.CommonResponse> addUser(
        com.bi.biservice.CommonRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 任务及副本系统
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bi.biservice.CommonResponse> quest(
        com.bi.biservice.CommonRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQuestMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 自定义 处理 表等
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bi.biservice.CommonResponse> event(
        com.bi.biservice.CommonRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEventMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 心跳 在线统计
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.bi.biservice.CommonResponse> heartbeat(
        com.bi.biservice.CommonRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHeartbeatMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INSTALL = 0;
  private static final int METHODID_START_UP = 1;
  private static final int METHODID_REGISTER = 2;
  private static final int METHODID_LOGIN = 3;
  private static final int METHODID_PAYMENT = 4;
  private static final int METHODID_ECONOMY = 5;
  private static final int METHODID_ADD_USER = 6;
  private static final int METHODID_QUEST = 7;
  private static final int METHODID_EVENT = 8;
  private static final int METHODID_HEARTBEAT = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BiServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BiServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INSTALL:
          serviceImpl.install((com.bi.biservice.CommonRequest) request,
              (io.grpc.stub.StreamObserver<com.bi.biservice.CommonResponse>) responseObserver);
          break;
        case METHODID_START_UP:
          serviceImpl.startUp((com.bi.biservice.CommonRequest) request,
              (io.grpc.stub.StreamObserver<com.bi.biservice.CommonResponse>) responseObserver);
          break;
        case METHODID_REGISTER:
          serviceImpl.register((com.bi.biservice.CommonRequest) request,
              (io.grpc.stub.StreamObserver<com.bi.biservice.CommonResponse>) responseObserver);
          break;
        case METHODID_LOGIN:
          serviceImpl.login((com.bi.biservice.CommonRequest) request,
              (io.grpc.stub.StreamObserver<com.bi.biservice.CommonResponse>) responseObserver);
          break;
        case METHODID_PAYMENT:
          serviceImpl.payment((com.bi.biservice.CommonRequest) request,
              (io.grpc.stub.StreamObserver<com.bi.biservice.CommonResponse>) responseObserver);
          break;
        case METHODID_ECONOMY:
          serviceImpl.economy((com.bi.biservice.CommonRequest) request,
              (io.grpc.stub.StreamObserver<com.bi.biservice.CommonResponse>) responseObserver);
          break;
        case METHODID_ADD_USER:
          serviceImpl.addUser((com.bi.biservice.CommonRequest) request,
              (io.grpc.stub.StreamObserver<com.bi.biservice.CommonResponse>) responseObserver);
          break;
        case METHODID_QUEST:
          serviceImpl.quest((com.bi.biservice.CommonRequest) request,
              (io.grpc.stub.StreamObserver<com.bi.biservice.CommonResponse>) responseObserver);
          break;
        case METHODID_EVENT:
          serviceImpl.event((com.bi.biservice.CommonRequest) request,
              (io.grpc.stub.StreamObserver<com.bi.biservice.CommonResponse>) responseObserver);
          break;
        case METHODID_HEARTBEAT:
          serviceImpl.heartbeat((com.bi.biservice.CommonRequest) request,
              (io.grpc.stub.StreamObserver<com.bi.biservice.CommonResponse>) responseObserver);
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

  private static abstract class BiServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BiServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.bi.biservice.BiServerService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BiService");
    }
  }

  private static final class BiServiceFileDescriptorSupplier
      extends BiServiceBaseDescriptorSupplier {
    BiServiceFileDescriptorSupplier() {}
  }

  private static final class BiServiceMethodDescriptorSupplier
      extends BiServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BiServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BiServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BiServiceFileDescriptorSupplier())
              .addMethod(getInstallMethod())
              .addMethod(getStartUpMethod())
              .addMethod(getRegisterMethod())
              .addMethod(getLoginMethod())
              .addMethod(getPaymentMethod())
              .addMethod(getEconomyMethod())
              .addMethod(getAddUserMethod())
              .addMethod(getQuestMethod())
              .addMethod(getEventMethod())
              .addMethod(getHeartbeatMethod())
              .build();
        }
      }
    }
    return result;
  }
}
