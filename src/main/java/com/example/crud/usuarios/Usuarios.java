package com.example.crud.usuarios;

import jakarta.persistence.*;

@Table(name = "usuarios")
@Entity(name = "usuarios")
public class Usuarios {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
}
