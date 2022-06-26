package io.quarkus.grpc.examples.hello;

import io.grpc.stub.StreamObserver;
import io.quarkus.grpc.GrpcService;
import usuario.LogarGrpc;
import usuario.UsuarioRequest;
import usuario.UsuarioResponse;

import java.time.LocalDateTime;

@GrpcService
public class UsuarioService extends LogarGrpc.LogarImplBase {

    @Override
    public void login(UsuarioRequest request, StreamObserver<UsuarioResponse> responseObserver) {
        String name = request.getUsuario();
        String message = String.format("[" + LocalDateTime.now() + "] Olá %s essa é uma chamada gRPC", name);
        responseObserver.onNext(UsuarioResponse.newBuilder().setMessage(message).build());
        responseObserver.onCompleted();
    }
}
