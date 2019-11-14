package com.musa2.entity;

public class Cursos {
	private int idcursos;
	private String nombrecurso;
	private String nombreinstitucion;
	private String lugar;
	private String fechainicio;
	private String fechafin;
	private int estado;
	
	public Cursos() {
		super();
	}
	public Cursos(int idcursos, String nombrecurso, String nombreinstitucion, String lugar, String fechainicio,
			String fechafin, int estado) {
		super();
		this.idcursos = idcursos;
		this.nombrecurso = nombrecurso;
		this.nombreinstitucion = nombreinstitucion;
		this.lugar = lugar;
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
		this.estado = estado;
	}
	public int getIdcursos() {
		return idcursos;
	}
	public void setIdcursos(int idcursos) {
		this.idcursos = idcursos;
	}
	public String getNombrecurso() {
		return nombrecurso;
	}
	public void setNombrecurso(String nombrecurso) {
		this.nombrecurso = nombrecurso;
	}
	public String getNombreinstitucion() {
		return nombreinstitucion;
	}
	public void setNombreinstitucion(String nombreinstitucion) {
		this.nombreinstitucion = nombreinstitucion;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getFechainicio() {
		return fechainicio;
	}
	public void setFechainicio(String fechainicio) {
		this.fechainicio = fechainicio;
	}
	public String getFechafin() {
		return fechafin;
	}
	public void setFechafin(String fechafin) {
		this.fechafin = fechafin;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	

}