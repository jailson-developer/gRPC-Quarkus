// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: usuario.proto

package usuario;

public final class UsuarioProto {
  private UsuarioProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_usuario_UsuarioRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_usuario_UsuarioRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_usuario_UsuarioResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_usuario_UsuarioResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rusuario.proto\022\007usuario\"0\n\016UsuarioReque" +
      "st\022\017\n\007usuario\030\001 \001(\t\022\r\n\005senha\030\002 \001(\t\"\"\n\017Us" +
      "uarioResponse\022\017\n\007message\030\001 \001(\t2E\n\005Logar\022" +
      "<\n\005login\022\027.usuario.UsuarioRequest\032\030.usua" +
      "rio.UsuarioResponse\"\000B\037\n\007usuarioB\014Usuari" +
      "oProtoP\001\242\002\003HLWb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_usuario_UsuarioRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_usuario_UsuarioRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_usuario_UsuarioRequest_descriptor,
        new java.lang.String[] { "Usuario", "Senha", });
    internal_static_usuario_UsuarioResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_usuario_UsuarioResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_usuario_UsuarioResponse_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}