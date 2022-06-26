package usuario;

import io.quarkus.grpc.MutinyService;

@javax.annotation.Generated(
value = "by Mutiny Grpc generator",
comments = "Source: usuario.proto")
public interface Logar extends MutinyService {

    
    io.smallrye.mutiny.Uni<usuario.UsuarioResponse> login(usuario.UsuarioRequest request);
    
    
    

}