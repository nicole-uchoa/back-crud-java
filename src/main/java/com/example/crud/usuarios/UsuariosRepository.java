package com.example.crud.usuarios;

import org.springframework.data.jpa.repository.JpaRepository;

//Este padrão é usado para abstrair o acesso a dados, fornecendo uma interface consistente para interagir com fontes de dados
public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
}
