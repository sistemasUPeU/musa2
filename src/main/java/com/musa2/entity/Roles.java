package com.musa2.entity;

public class Roles {
	private int idrol;
	private String nombre;
	private int estado;
	
	public Roles() {
		
	}

	public Roles(int idrol, String nombre, int estado) {
		super();
		this.idrol = idrol;
		this.nombre = nombre;
		this.estado = estado;
	}

	public Roles(String nombre, int estado) {
		super();
		this.nombre = nombre;
		this.estado = estado;
	}

	public Roles(String nombre) {
		super();
		this.nombre = nombre;
	}

	public int getIdrol() {
		return idrol;
	}

	public void setIdrol(int idrol) {
		this.idrol = idrol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
}
