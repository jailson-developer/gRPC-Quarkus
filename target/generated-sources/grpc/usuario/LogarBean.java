package usuario;

import io.grpc.BindableService;
import io.quarkus.grpc.GrpcService;
import io.quarkus.grpc.MutinyBean;

@javax.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: usuario.proto")
public class LogarBean extends MutinyLogarGrpc.LogarImplBase implements BindableService, MutinyBean {

    private final Logar delegate;

    LogarBean(@GrpcService Logar delegate) {
       this.delegate = delegate;
    }

    @Override
    public io.smallrye.mutiny.Uni<usuario.UsuarioResponse> login(usuario.UsuarioRequest request) {
       try {
         return delegate.login(request);
       } catch (UnsupportedOperationException e) {
          throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
       }
    }

}