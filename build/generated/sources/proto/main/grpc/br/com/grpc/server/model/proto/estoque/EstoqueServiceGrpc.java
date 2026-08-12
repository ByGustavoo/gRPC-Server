package br.com.grpc.server.model.proto.estoque;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class EstoqueServiceGrpc {

  private EstoqueServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "estoque.EstoqueService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.grpc.server.model.proto.estoque.ConsultarEstoqueRequest,
      br.com.grpc.server.model.proto.estoque.ConsultarEstoqueResponse> getConsultarEstoqueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConsultarEstoque",
      requestType = br.com.grpc.server.model.proto.estoque.ConsultarEstoqueRequest.class,
      responseType = br.com.grpc.server.model.proto.estoque.ConsultarEstoqueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.grpc.server.model.proto.estoque.ConsultarEstoqueRequest,
      br.com.grpc.server.model.proto.estoque.ConsultarEstoqueResponse> getConsultarEstoqueMethod() {
    io.grpc.MethodDescriptor<br.com.grpc.server.model.proto.estoque.ConsultarEstoqueRequest, br.com.grpc.server.model.proto.estoque.ConsultarEstoqueResponse> getConsultarEstoqueMethod;
    if ((getConsultarEstoqueMethod = EstoqueServiceGrpc.getConsultarEstoqueMethod) == null) {
      synchronized (EstoqueServiceGrpc.class) {
        if ((getConsultarEstoqueMethod = EstoqueServiceGrpc.getConsultarEstoqueMethod) == null) {
          EstoqueServiceGrpc.getConsultarEstoqueMethod = getConsultarEstoqueMethod =
              io.grpc.MethodDescriptor.<br.com.grpc.server.model.proto.estoque.ConsultarEstoqueRequest, br.com.grpc.server.model.proto.estoque.ConsultarEstoqueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConsultarEstoque"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.grpc.server.model.proto.estoque.ConsultarEstoqueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.grpc.server.model.proto.estoque.ConsultarEstoqueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EstoqueServiceMethodDescriptorSupplier("ConsultarEstoque"))
              .build();
        }
      }
    }
    return getConsultarEstoqueMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EstoqueServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EstoqueServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EstoqueServiceStub>() {
        @java.lang.Override
        public EstoqueServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EstoqueServiceStub(channel, callOptions);
        }
      };
    return EstoqueServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static EstoqueServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EstoqueServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EstoqueServiceBlockingV2Stub>() {
        @java.lang.Override
        public EstoqueServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EstoqueServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return EstoqueServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EstoqueServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EstoqueServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EstoqueServiceBlockingStub>() {
        @java.lang.Override
        public EstoqueServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EstoqueServiceBlockingStub(channel, callOptions);
        }
      };
    return EstoqueServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EstoqueServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EstoqueServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EstoqueServiceFutureStub>() {
        @java.lang.Override
        public EstoqueServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EstoqueServiceFutureStub(channel, callOptions);
        }
      };
    return EstoqueServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void consultarEstoque(br.com.grpc.server.model.proto.estoque.ConsultarEstoqueRequest request,
        io.grpc.stub.StreamObserver<br.com.grpc.server.model.proto.estoque.ConsultarEstoqueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConsultarEstoqueMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EstoqueService.
   */
  public static abstract class EstoqueServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EstoqueServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EstoqueService.
   */
  public static final class EstoqueServiceStub
      extends io.grpc.stub.AbstractAsyncStub<EstoqueServiceStub> {
    private EstoqueServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EstoqueServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EstoqueServiceStub(channel, callOptions);
    }

    /**
     */
    public void consultarEstoque(br.com.grpc.server.model.proto.estoque.ConsultarEstoqueRequest request,
        io.grpc.stub.StreamObserver<br.com.grpc.server.model.proto.estoque.ConsultarEstoqueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConsultarEstoqueMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EstoqueService.
   */
  public static final class EstoqueServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<EstoqueServiceBlockingV2Stub> {
    private EstoqueServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EstoqueServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EstoqueServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public br.com.grpc.server.model.proto.estoque.ConsultarEstoqueResponse consultarEstoque(br.com.grpc.server.model.proto.estoque.ConsultarEstoqueRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getConsultarEstoqueMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service EstoqueService.
   */
  public static final class EstoqueServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EstoqueServiceBlockingStub> {
    private EstoqueServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EstoqueServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EstoqueServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.grpc.server.model.proto.estoque.ConsultarEstoqueResponse consultarEstoque(br.com.grpc.server.model.proto.estoque.ConsultarEstoqueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConsultarEstoqueMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EstoqueService.
   */
  public static final class EstoqueServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<EstoqueServiceFutureStub> {
    private EstoqueServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EstoqueServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EstoqueServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.grpc.server.model.proto.estoque.ConsultarEstoqueResponse> consultarEstoque(
        br.com.grpc.server.model.proto.estoque.ConsultarEstoqueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConsultarEstoqueMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONSULTAR_ESTOQUE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONSULTAR_ESTOQUE:
          serviceImpl.consultarEstoque((br.com.grpc.server.model.proto.estoque.ConsultarEstoqueRequest) request,
              (io.grpc.stub.StreamObserver<br.com.grpc.server.model.proto.estoque.ConsultarEstoqueResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getConsultarEstoqueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              br.com.grpc.server.model.proto.estoque.ConsultarEstoqueRequest,
              br.com.grpc.server.model.proto.estoque.ConsultarEstoqueResponse>(
                service, METHODID_CONSULTAR_ESTOQUE)))
        .build();
  }

  private static abstract class EstoqueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EstoqueServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.grpc.server.model.proto.estoque.Estoque.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EstoqueService");
    }
  }

  private static final class EstoqueServiceFileDescriptorSupplier
      extends EstoqueServiceBaseDescriptorSupplier {
    EstoqueServiceFileDescriptorSupplier() {}
  }

  private static final class EstoqueServiceMethodDescriptorSupplier
      extends EstoqueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EstoqueServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (EstoqueServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EstoqueServiceFileDescriptorSupplier())
              .addMethod(getConsultarEstoqueMethod())
              .build();
        }
      }
    }
    return result;
  }
}
