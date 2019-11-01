package com.musa2.entity;

public class Prod_Categorias {
	private int idprodcategoria;
	private String nombre;
	private int estado;
	public Prod_Categorias() {
	}
	public Prod_Categorias(int idprodcategoria, String nombre, int estado) {
		super();
		this.idprodcategoria = idprodcategoria;
		this.nombre = nombre;
		this.estado = estado;
	}
	public int getIdprodcategoria() {
		return idprodcategoria;
	}
	public void setIdprodcategoria(int idprodcategoria) {
		this.idprodcategoria = idprodcategoria;
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
