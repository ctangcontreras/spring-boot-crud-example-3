package com.javatechie.crud.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.crud.example.dto.UsuarioDto;
import com.javatechie.crud.example.entity.Sucursal;
import com.javatechie.crud.example.entity.Usuario;
import com.javatechie.crud.example.repository.SucursalRepository;
import com.javatechie.crud.example.repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private SucursalRepository sucursalRepository;
    
    public Usuario saveUsuario(Usuario product) {
    	
    	if (product.getCod_usuario()==null) {
            
		}else {
			
			Usuario existingProduct = repository.findById(product.getCod_usuario()).orElse(null);
		        existingProduct.setNombre(product.getNombre());
		        existingProduct.setUser(product.getUser());
		        existingProduct.setPassword(product.getPassword());
		        existingProduct.setCod_sucursal(product.getCod_sucursal());
		        
		        return repository.save(existingProduct);
		}
        return repository.save(product);
    }

    public List<Usuario> saveUsuarios(List<Usuario> products) {
        return repository.saveAll(products);
    }

    public List<UsuarioDto> getUsuarios() {
    	
    	List<Usuario> listaUsuario =  repository.findAll();
    	
    	List<UsuarioDto> listaUsuarioDto = new ArrayList<UsuarioDto>();
    	UsuarioDto dto = null;
    	Sucursal sucursal = null;
    	for (Usuario usuario : listaUsuario) {
    		
    		sucursal = sucursalRepository.findById(usuario.getCod_sucursal()).orElse(null);
			
    		dto = new UsuarioDto(usuario.getCod_usuario(), usuario.getNombre(), usuario.getUser(), usuario.getPassword(), 
    				usuario.getCod_sucursal(), sucursal.getNombre());
    		listaUsuarioDto.add(dto);
		}
    	
    	
        return listaUsuarioDto;
    }

    public Usuario getUsuarioById(int id) {
        return repository.findById(id).orElse(null);
    }

 

    public String deleteUsuario(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }

    public Usuario updateUsuario(Usuario product) {
    	Usuario existingProduct = repository.findById(product.getCod_usuario()).orElse(null);
        existingProduct.setNombre(product.getNombre());
        existingProduct.setUser(product.getUser());
        existingProduct.setPassword(product.getPassword());
        existingProduct.setCod_sucursal(product.getCod_sucursal());
        return repository.save(existingProduct);
    }


}
