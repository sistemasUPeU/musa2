package com.musa2.entity;

public class Mant_Accion_Mantenimiento {
	private int idmantacciones;
	private int idmantenimiento;
	private int estado;
	public int getIdmantacciones() {
		return idmantacciones;
	}
	public void setIdmantacciones(int idmantacciones) {
		this.idmantacciones = idmantacciones;
	}
	public int getIdmantenimiento() {
		return idmantenimiento;
	}
	public void setIdmantenimiento(int idmantenimiento) {
		this.idmantenimiento = idmantenimiento;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public Mant_Accion_Mantenimiento(int idmantacciones, int idmantenimiento, int estado) {
		super();
		this.idmantacciones = idmantacciones;
		this.idmantenimiento = idmantenimiento;
		this.estado = estado;
	}
	public Mant_Accion_Mantenimiento() {
		super();
	}

}
