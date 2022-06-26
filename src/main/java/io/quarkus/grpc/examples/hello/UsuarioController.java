package io.quarkus.grpc.examples.hello;

import io.quarkus.grpc.GrpcClient;
import usuario.Logar;
import usuario.LogarGrpc;
import usuario.UsuarioRequest;
import usuario.UsuarioResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/usuarios")
public class UsuarioController {

    @GrpcClient("logarService")
    LogarGrpc.LogarBlockingStub logarServiceBlocking;

    @GrpcClient
    Logar logarService;

    @GET
    @Path("/logar/{name}")
    public String logar(String name) {
        UsuarioResponse reply = logarServiceBlocking.login(UsuarioRequest.newBuilder().setUsuario(name).build());
        return reply.getMessage();

    }
}
