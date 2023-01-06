package com.javatechie.crud.example.repository;

import com.javatechie.crud.example.entity.Product;
import com.javatechie.crud.example.entity.Sucursal;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SucursalRepository extends JpaRepository<Sucursal,Integer> {
}

