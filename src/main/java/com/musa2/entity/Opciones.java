package com.musa2.entity;

public class Opciones {
	private int idopciones;
	private String nombre;
	private String Descripcion;
	private	String enlace;
	private String icono;
	private int tipo;
	private int orden;
	private int estado;
	private int idpadre;
	public Opciones() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Opciones(int idopciones, String nombre, String descripcion, String enlace, String icono, int tipo, int orden,
			int estado, int idpadre) {
		super();
		this.idopciones = idopciones;
		this.nombre = nombre;
		Descripcion = descripcion;
		this.enlace = enlace;
		this.icono = icono;
		this.tipo = tipo;
		this.orden = orden;
		this.estado = estado;
		this.idpadre = idpadre;
	}
	public int getIdopciones() {
		return idopciones;
	}
	public void setIdopciones(int idopciones) {
		this.idopciones = idopciones;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public String getEnlace() {
		return enlace;
	}
	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}
	public String getIcono() {
		return icono;
	}
	public void setIcono(String icono) {
		this.icono = icono;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public int getOrden() {
		return orden;
	}
	public void setOrden(int orden) {
		this.orden = orden;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public int getIdpadre() {
		return idpadre;
	}
	public void setIdpadre(int idpadre) {
		this.idpadre = idpadre;
	}
	
	
}
