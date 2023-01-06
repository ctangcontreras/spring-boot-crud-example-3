package com.javatechie.crud.example.controller;

import com.javatechie.crud.example.entity.Sucursal;
import com.javatechie.crud.example.service.SucursalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SucursalController {

    @Autowired
    private SucursalService service;

    @PostMapping("/addSucursal")
    public Sucursal addSucursal(@RequestBody Sucursal product) {
        return service.saveSucursal(product);
    }

    @PostMapping("/addUSucursales")
    public List<Sucursal> addUSucursales(@RequestBody List<Sucursal> products) {
        return service.saveSucursals(products);
    }

    @GetMapping("/sucursales")
    public List<Sucursal> findAllSucursales() {
        return service.getSucursal();
    }

    @GetMapping("/sucursalById/{id}")
    public Sucursal findSucursalById(@PathVariable int id) {
        return service.getSucursalById(id);
    }

 
    @PostMapping("/updateSucursal")
    public Sucursal updateSucursal(@RequestBody Sucursal product) {
        return service.updateSucursal(product);
    }

    @PostMapping("/deleteSucursal/{id}")
    public String deleteSucursal(@PathVariable int id) {
        return service.deleteSucursal(id);
    }
}
