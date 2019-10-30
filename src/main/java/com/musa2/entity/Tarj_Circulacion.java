package com.musa2.entity;

public class Tarj_Circulacion {
   private int idtarjetac;
   private int nrodocumento;
   private String fechaemision;
   private String fechavencimiento;
   private int estado;
   private int idvehiculo;
public Tarj_Circulacion() {
	super();
}
public Tarj_Circulacion(int idtarjetac, int nrodocumento, String fechaemision, String fechavencimiento, int estado,
		int idvehiculo) {
	super();
	this.idtarjetac = idtarjetac;
	this.nrodocumento = nrodocumento;
	this.fechaemision = fechaemision;
	this.fechavencimiento = fechavencimiento;
	this.estado = estado;
	this.idvehiculo = idvehiculo;
}
public int getIdtarjetac() {
	return idtarjetac;
}
public void setIdtarjetac(int idtarjetac) {
	this.idtarjetac = idtarjetac;
}
public int getNrodocumento() {
	return nrodocumento;
}
public void setNrodocumento(int nrodocumento) {
	this.nrodocumento = nrodocumento;
}
public String getFechaemision() {
	return fechaemision;
}
public void setFechaemision(String fechaemision) {
	this.fechaemision = fechaemision;
}
public String getFechavencimiento() {
	return fechavencimiento;
}
public void setFechavencimiento(String fechavencimiento) {
	this.fechavencimiento = fechavencimiento;
}
public int getEstado() {
	return estado;
}
public void setEstado(int estado) {
	this.estado = estado;
}
public int getIdvehiculo() {
	return idvehiculo;
}
public void setIdvehiculo(int idvehiculo) {
	this.idvehiculo = idvehiculo;
}
   
   
}
