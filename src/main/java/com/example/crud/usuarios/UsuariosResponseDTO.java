package com.example.crud.usuarios;

// DTO data trust object => padrão de projeto que facilita a transferência de dados entre diferentes partes de um sistema
// transfere dados entre camadas da aplicação - encapsula os dados
public record UsuariosResponseDTO(Long id, String name) {
    public UsuariosResponseDTO(Usuarios usuarios){
        this(usuarios.getId(), usuarios.getName());
    }
}
