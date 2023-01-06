package com.javatechie.crud.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue
	private Integer cod_usuario;
	private String nombre;
	private String user;
	private String password;
	private Integer cod_sucursal;

	public Integer getCod_usuario() {
		return cod_usuario;
	}

	public void setCod_usuario(Integer cod_usuario) {
		this.cod_usuario = cod_usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getCod_sucursal() {
		return cod_sucursal;
	}

	public void setCod_sucursal(Integer cod_sucursal) {
		this.cod_sucursal = cod_sucursal;
	}

}
