package com.example.crud.controller;


import com.example.crud.usuarios.Usuarios;
import com.example.crud.usuarios.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("usuarios")
public class CrudController {
    @Autowired // para injetar essa dependência na classe
    private UsuariosRepository repository;
    @GetMapping("/")
    public ResponseEntity<List<Usuarios>> getAll(){
        return ResponseEntity.status(200).body(repository.findAll());
    }
}
