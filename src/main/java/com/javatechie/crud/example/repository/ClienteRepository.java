package com.javatechie.crud.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import com.javatechie.crud.example.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {


    @Procedure(name = "Car.eliminarCliente")
    void eliminarCliente(@Param("id") Integer id);
}

