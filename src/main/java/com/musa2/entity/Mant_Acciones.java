package com.musa2.entity;

public class Mant_Acciones {
	private int idmantacciones;
	private int idaccionpadre;
	private String nombre;
	private int tipo;
	private int estado;
	private String descripcion;
	private int orden;
	public int getIdmantacciones() {
		return idmantacciones;
	}
	public void setIdmantacciones(int idmantacciones) {
		this.idmantacciones = idmantacciones;
	}
	public int getIdaccionpadre() {
		return idaccionpadre;
	}
	public void setIdaccionpadre(int idaccionpadre) {
		this.idaccionpadre = idaccionpadre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getOrden() {
		return orden;
	}
	public void setOrden(int orden) {
		this.orden = orden;
	}
	public Mant_Acciones(int idmantacciones, int idaccionpadre, String nombre, int tipo, int estado, String descripcion,
			int orden) {
		super();
		this.idmantacciones = idmantacciones;
		this.idaccionpadre = idaccionpadre;
		this.nombre = nombre;
		this.tipo = tipo;
		this.estado = estado;
		this.descripcion = descripcion;
		this.orden = orden;
	}
	public Mant_Acciones() {
		super();
	}

}
