package com.javatechie.crud.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.crud.example.entity.Cliente;
import com.javatechie.crud.example.repository.ClienteRepository;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;

    
    public Cliente saveCliente(Cliente product) {
    	 
        return repository.save(product);
    }

  

    public List<Cliente> getClientes() {
    	
    	List<Cliente> listaCliente =  repository.findAll();
    	 
        return listaCliente;
    }

    public Cliente getClienteById(int id) {
        return repository.findById(id).orElse(null);
    }

 

    public Cliente deleteCliente(int id) {
        repository.eliminarCliente(id);

        Cliente x = new Cliente();
        x.setId(id);
        return x;
    }

    public Cliente updateCliente(Cliente product) {    	 
        return repository.save(product);
    }


}
