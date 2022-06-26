package usuario;

import static usuario.LogarGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@javax.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: usuario.proto")
public final class MutinyLogarGrpc implements io.quarkus.grpc.MutinyGrpc {
    private MutinyLogarGrpc() {}

    public static MutinyLogarStub newMutinyStub(io.grpc.Channel channel) {
        return new MutinyLogarStub(channel);
    }

    
    public static final class MutinyLogarStub extends io.grpc.stub.AbstractStub<MutinyLogarStub> implements io.quarkus.grpc.MutinyStub {
        private LogarGrpc.LogarStub delegateStub;

        private MutinyLogarStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = LogarGrpc.newStub(channel);
        }

        private MutinyLogarStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = LogarGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected MutinyLogarStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MutinyLogarStub(channel, callOptions);
        }

        
        public io.smallrye.mutiny.Uni<usuario.UsuarioResponse> login(usuario.UsuarioRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::login);
        }

    }

    
    public static abstract class LogarImplBase implements io.grpc.BindableService {

        private String compression;
        /**
        * Set whether the server will try to use a compressed response.
        *
        * @param compression the compression, e.g {@code gzip}
        */
        public LogarImplBase withCompression(String compression) {
        this.compression = compression;
        return this;
        }


        
        public io.smallrye.mutiny.Uni<usuario.UsuarioResponse> login(usuario.UsuarioRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            usuario.LogarGrpc.getLoginMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            usuario.UsuarioRequest,
                                            usuario.UsuarioResponse>(
                                            this, METHODID_LOGIN, compression)))
                    .build();
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
        private final String compression;

        MethodHandlers(LogarImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_LOGIN:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((usuario.UsuarioRequest) request,
                            (io.grpc.stub.StreamObserver<usuario.UsuarioResponse>) responseObserver,
                            compression,
                            serviceImpl::login);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }

}