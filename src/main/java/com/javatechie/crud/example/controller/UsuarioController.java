package com.javatechie.crud.example.controller;

import com.javatechie.crud.example.dto.UsuarioDto;
import com.javatechie.crud.example.entity.Product;
import com.javatechie.crud.example.entity.Usuario;
import com.javatechie.crud.example.service.ProductService;
import com.javatechie.crud.example.service.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @PostMapping("/addUsuario")
    public Usuario addUsuario(@RequestBody Usuario product) {
        return service.saveUsuario(product);
    }

    @PostMapping("/addUsuarios")
    public List<Usuario> addUsuarios(@RequestBody List<Usuario> products) {
        return service.saveUsuarios(products);
    }

    @GetMapping("/usuarios")
    public List<UsuarioDto> findAllusuarios() {
        return service.getUsuarios();
    }

    @GetMapping("/usuarioById/{id}")
    public Usuario findUsuarioById(@PathVariable int id) {
        return service.getUsuarioById(id);
    }

 
    @PostMapping("/updateUsuario")
    public Usuario updateUsuario(@RequestBody Usuario product) {
        return service.updateUsuario(product);
    }

    @PostMapping("/deleteUsuario/{id}")
    public String deleteUsuario(@PathVariable int id) {
        return service.deleteUsuario(id);
    }
}
