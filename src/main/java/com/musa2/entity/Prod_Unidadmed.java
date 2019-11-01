package com.musa2.entity;

public class Prod_Unidadmed {
	private int idprodunidadmed;
	private String nombrelargo;
	private String nombrecorto;
	private int estado;
	public Prod_Unidadmed() {
	}
	public Prod_Unidadmed(int idprodunidadmed, String nombrelargo, String nombrecorto, int estado) {
		super();
		this.idprodunidadmed = idprodunidadmed;
		this.nombrelargo = nombrelargo;
		this.nombrecorto = nombrecorto;
		this.estado = estado;
	}
	public int getIdprodunidadmed() {
		return idprodunidadmed;
	}
	public void setIdprodunidadmed(int idprodunidadmed) {
		this.idprodunidadmed = idprodunidadmed;
	}
	public String getNombrelargo() {
		return nombrelargo;
	}
	public void setNombrelargo(String nombrelargo) {
		this.nombrelargo = nombrelargo;
	}
	public String getNombrecorto() {
		return nombrecorto;
	}
	public void setNombrecorto(String nombrecorto) {
		this.nombrecorto = nombrecorto;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
}
