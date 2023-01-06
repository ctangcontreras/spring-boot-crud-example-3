package com.javatechie.crud.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sucursal")
public class Sucursal {

	@Id
	@GeneratedValue
	private Integer cod_sucursal;
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCod_sucursal() {
		return cod_sucursal;
	}

	public void setCod_sucursal(Integer cod_sucursal) {
		this.cod_sucursal = cod_sucursal;
	}

}
