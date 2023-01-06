package com.javatechie.crud.example.repository;

import com.javatechie.crud.example.entity.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
}

