package com.musa2.entity;

public class Requisitos {
	private int idrequisito;
	private String nombre;
	private int estado;
	private int tiporequisito;
	public Requisitos() {
		super();
	}
	public Requisitos(int idrequisito, String nombre, int estado, int tiporequisito) {
		super();
		this.idrequisito = idrequisito;
		this.nombre = nombre;
		this.estado = estado;
		this.tiporequisito = tiporequisito;
	}
	public int getIdrequisito() {
		return idrequisito;
	}
	public void setIdrequisito(int idrequisito) {
		this.idrequisito = idrequisito;
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
	public int getTiporequisito() {
		return tiporequisito;
	}
	public void setTiporequisito(int tiporequisito) {
		this.tiporequisito = tiporequisito;
	}
	
	
	
	
	
	
}
