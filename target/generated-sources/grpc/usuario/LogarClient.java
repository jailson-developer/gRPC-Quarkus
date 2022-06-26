package usuario;

import java.util.function.BiFunction;

import io.quarkus.grpc.MutinyClient;

@javax.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: usuario.proto")
public class LogarClient implements Logar, MutinyClient<MutinyLogarGrpc.MutinyLogarStub> {

    private final MutinyLogarGrpc.MutinyLogarStub stub;

    public LogarClient(String name, io.grpc.Channel channel, BiFunction<String, MutinyLogarGrpc.MutinyLogarStub, MutinyLogarGrpc.MutinyLogarStub> stubConfigurator) {
       this.stub = stubConfigurator.apply(name,MutinyLogarGrpc.newMutinyStub(channel));
    }

    private LogarClient(MutinyLogarGrpc.MutinyLogarStub stub) {
       this.stub = stub;
    }

    public LogarClient newInstanceWithStub(MutinyLogarGrpc.MutinyLogarStub stub) {
        return new LogarClient(stub);
    }

    @Override
    public MutinyLogarGrpc.MutinyLogarStub getStub() {
       return stub;
    }

    @Override
    public io.smallrye.mutiny.Uni<usuario.UsuarioResponse> login(usuario.UsuarioRequest request) {
       return stub.login(request);
    }

}