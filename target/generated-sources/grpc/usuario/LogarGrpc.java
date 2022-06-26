package usuario;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.46.0)",
    comments = "Source: usuario.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LogarGrpc {

  private LogarGrpc() {}

  public static final String SERVICE_NAME = "usuario.Logar";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<usuario.UsuarioRequest,
      usuario.UsuarioResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = usuario.UsuarioRequest.class,
      responseType = usuario.UsuarioResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<usuario.UsuarioRequest,
      usuario.UsuarioResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<usuario.UsuarioRequest, usuario.UsuarioResponse> getLoginMethod;
    if ((getLoginMethod = LogarGrpc.getLoginMethod) == null) {
      synchronized (LogarGrpc.class) {
        if ((getLoginMethod = LogarGrpc.getLoginMethod) == null) {
          LogarGrpc.getLoginMethod = getLoginMethod =
              io.grpc.MethodDescriptor.<usuario.UsuarioRequest, usuario.UsuarioResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  usuario.UsuarioRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  usuario.UsuarioResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LogarMethodDescriptorSupplier("login"))
              .build();
        }
      }
    }
    return getLoginMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LogarStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogarStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogarStub>() {
        @java.lang.Override
        public LogarStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogarStub(channel, callOptions);
        }
      };
    return LogarStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LogarBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogarBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogarBlockingStub>() {
        @java.lang.Override
        public LogarBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogarBlockingStub(channel, callOptions);
        }
      };
    return LogarBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LogarFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogarFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogarFutureStub>() {
        @java.lang.Override
        public LogarFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogarFutureStub(channel, callOptions);
        }
      };
    return LogarFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class LogarImplBase implements io.grpc.BindableService {

    /**
     */
    public void login(usuario.UsuarioRequest request,
        io.grpc.stub.StreamObserver<usuario.UsuarioResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                usuario.UsuarioRequest,
                usuario.UsuarioResponse>(
                  this, METHODID_LOGIN)))
          .build();
    }
  }

  /**
   */
  public static final class LogarStub extends io.grpc.stub.AbstractAsyncStub<LogarStub> {
    private LogarStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogarStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogarStub(channel, callOptions);
    }

    /**
     */
    public void login(usuario.UsuarioRequest request,
        io.grpc.stub.StreamObserver<usuario.UsuarioResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LogarBlockingStub extends io.grpc.stub.AbstractBlockingStub<LogarBlockingStub> {
    private LogarBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogarBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogarBlockingStub(channel, callOptions);
    }

    /**
     */
    public usuario.UsuarioResponse login(usuario.UsuarioRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LogarFutureStub extends io.grpc.stub.AbstractFutureStub<LogarFutureStub> {
    private LogarFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogarFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogarFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<usuario.UsuarioResponse> login(
        usuario.UsuarioRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LogarImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LogarImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((usuario.UsuarioRequest) request,
              (io.grpc.stub.StreamObserver<usuario.UsuarioResponse>) responseObserver);
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

  private static abstract class LogarBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LogarBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return usuario.UsuarioProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Logar");
    }
  }

  private static final class LogarFileDescriptorSupplier
      extends LogarBaseDescriptorSupplier {
    LogarFileDescriptorSupplier() {}
  }

  private static final class LogarMethodDescriptorSupplier
      extends LogarBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LogarMethodDescriptorSupplier(String methodName) {
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
      synchronized (LogarGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LogarFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .build();
        }
      }
    }
    return result;
  }
}
