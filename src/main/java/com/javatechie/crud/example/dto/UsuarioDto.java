package com.javatechie.crud.example.dto;

public class UsuarioDto {

	private Integer cod_usuario;
	private String nombre;
	private String user;
	private String password;
	private Integer cod_sucursal;
	private String sucursal;

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

	public UsuarioDto() {
		super();
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public UsuarioDto(Integer cod_usuario, String nombre, String user, String password, Integer cod_sucursal,
			String sucursal) {
		super();
		this.cod_usuario = cod_usuario;
		this.nombre = nombre;
		this.user = user;
		this.password = password;
		this.cod_sucursal = cod_sucursal;
		this.sucursal = sucursal;
	}
}
