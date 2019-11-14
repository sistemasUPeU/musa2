package com.musa2.entity;

import java.sql.Date;

public class VinculosRequisitos {
	private int idvinculo;
	private int idrequisitos;
	private Date fechainicio;
	private Date fechafin;
	private String enlacedoc;
	private int estado;
	public VinculosRequisitos(int idvinculo, int idrequisitos, Date fechainicio, Date fechafin, String enlacedoc,
			int estado) {
		super();
		this.idvinculo = idvinculo;
		this.idrequisitos = idrequisitos;
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
		this.enlacedoc = enlacedoc;
		this.estado = estado;
	}
	public VinculosRequisitos() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdvinculo() {
		return idvinculo;
	}
	public void setIdvinculo(int idvinculo) {
		this.idvinculo = idvinculo;
	}
	public int getIdrequisitos() {
		return idrequisitos;
	}
	public void setIdrequisitos(int idrequisitos) {
		this.idrequisitos = idrequisitos;
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
	public String getEnlacedoc() {
		return enlacedoc;
	}
	public void setEnlacedoc(String enlacedoc) {
		this.enlacedoc = enlacedoc;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
}
