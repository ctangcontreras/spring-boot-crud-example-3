package com.javatechie.crud.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.crud.example.entity.Cliente;
import com.javatechie.crud.example.service.ClienteService;

@RestController
public class ClienteController {

    @Autowired
    private ClienteService service;

    @PostMapping("/addCliente")
    public Cliente addUsuario(@RequestBody Cliente product) {
        return service.saveCliente(product);
    }

   
    @GetMapping("/clientes")
    public List<Cliente> findAllClientes() {
        return service.getClientes();
    }

    @GetMapping("/clienteId/{id}")
    public Cliente clienteId(@PathVariable int id) {
        return service.getClienteById(id);
    }

 
    @PostMapping("/updateCliente")
    public Cliente updateCliente(@RequestBody Cliente product) {
        return service.updateCliente(product);
    }

    @GetMapping("/deleteCliente/{id}")
    public Cliente deleteCliente(@PathVariable int id) {
        return service.deleteCliente(id);
    }
}
