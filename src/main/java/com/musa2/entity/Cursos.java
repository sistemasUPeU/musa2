package com.musa2.entity;

import java.sql.Date;

public class Cursos {
	private int idcursos;
	private String nombrecurso;
	private String nombreinstitucion;
	private String lugar;
	private Date fechainicio;
	private Date fechafin;
	private int estado;
	
	public Cursos() {
		super();
	}
	public Cursos(int idcursos, String nombrecurso, String nombreinstitucion, String lugar, Date fechainicio,
			Date fechafin, int estado) {
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
	public Date getFechainicio() {
		return fechainicio;
	}
	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}
	public Date getFechafin() {
		return fechafin;
	}
	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	

}