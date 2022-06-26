package io.quarkus.grpc.examples.hello;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import usuario.LogarGrpc;
import usuario.MutinyLogarGrpc;
import usuario.UsuarioResponse;
import usuario.UsuarioRequest;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
class UsuarioServiceTest {

    private ManagedChannel channel;

    @BeforeEach
    public void init() {
        channel = ManagedChannelBuilder.forAddress("localhost", 9001).usePlaintext().build();
    }

    @AfterEach
    public void cleanup() throws InterruptedException {
        channel.shutdown();
        channel.awaitTermination(10, TimeUnit.SECONDS);
    }

    @Test
    public void testHelloWorldServiceUsingBlockingStub() {
        LogarGrpc.LogarBlockingStub client = LogarGrpc.newBlockingStub(channel);
        UsuarioResponse reply = client
                .login(UsuarioRequest.newBuilder().setUsuario("neo-blocking").build());
        assertThat(reply.getMessage()).isEqualTo("Hello neo-blocking");
    }

    @Test
    public void testHelloWorldServiceUsingMutinyStub() {
        UsuarioResponse reply = MutinyLogarGrpc.newMutinyStub(channel)
                .login(UsuarioRequest.newBuilder().setUsuario("neo-blocking").build())
                .await().atMost(Duration.ofSeconds(5));
        assertThat(reply.getMessage()).isEqualTo("Hello neo-blocking");
    }

}
