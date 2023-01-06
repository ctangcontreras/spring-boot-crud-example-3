package com.javatechie.crud.example.service;

import com.javatechie.crud.example.entity.Product;
import com.javatechie.crud.example.entity.Sucursal;
import com.javatechie.crud.example.repository.SucursalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SucursalService {
    @Autowired
    private SucursalRepository repository;

    public Sucursal saveSucursal(Sucursal product) {
    	
    	if (product.getCod_sucursal()==null) {
            
		}else {
			
			Sucursal existingProduct = repository.findById(product.getCod_sucursal()).orElse(null);
		        existingProduct.setNombre(product.getNombre());
		        return repository.save(product);
		}
    	
        return repository.save(product);
    }

    public List<Sucursal> saveSucursals(List<Sucursal> products) {
        return repository.saveAll(products);
    }

    public List<Sucursal> getSucursal() {
        return repository.findAll();
    }

    public Sucursal getSucursalById(int id) {
        return repository.findById(id).orElse(null);
    }

 

    public String deleteSucursal(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }

    public Sucursal updateSucursal(Sucursal product) {
    	Sucursal existingProduct = repository.findById(product.getCod_sucursal()).orElse(null);
        existingProduct.setNombre(product.getNombre());
        return repository.save(existingProduct);
    }


}
