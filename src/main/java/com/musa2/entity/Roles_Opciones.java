package com.musa2.entity;

public class Roles_Opciones {
	private int idrol;
	private int idopcion;
	private String date_create;
	public Roles_Opciones() {
	}
	public Roles_Opciones(int idrol, int idopcion, String date_create) {
		super();
		this.idrol = idrol;
		this.idopcion = idopcion;
		this.date_create = date_create;
	}
	public int getIdrol() {
		return idrol;
	}
	public void setIdrol(int idrol) {
		this.idrol = idrol;
	}
	public int getIdopcion() {
		return idopcion;
	}
	public void setIdopcion(int idopcion) {
		this.idopcion = idopcion;
	}
	public String getDate_create() {
		return date_create;
	}
	public void setDate_create(String date_create) {
		this.date_create = date_create;
	}
	
	
}
