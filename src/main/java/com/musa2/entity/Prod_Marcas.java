package com.musa2.entity;

public class Prod_Marcas {
	private int idprodmarca;
	private String nombre;
	private int estado;
	public Prod_Marcas() {
	}
	public Prod_Marcas(int idprodmarca, String nombre, int estado) {
		super();
		this.idprodmarca = idprodmarca;
		this.nombre = nombre;
		this.estado = estado;
	}
	public int getIdprodmarca() {
		return idprodmarca;
	}
	public void setIdprodmarca(int idprodmarca) {
		this.idprodmarca = idprodmarca;
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
