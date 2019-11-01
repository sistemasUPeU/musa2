package com.musa2.entity;

public class Propietarios {
 private int idpropietario;
 private int tipopropietario;
 private int estado;
 private int idpersona;
public Propietarios() {
	super();
}
public Propietarios(int idpropietario, int tipopropietario, int estado, int idpersona) {
	super();
	this.idpropietario = idpropietario;
	this.tipopropietario = tipopropietario;
	this.estado = estado;
	this.idpersona = idpersona;
}
public int getIdpropietario() {
	return idpropietario;
}
public void setIdpropietario(int idpropietario) {
	this.idpropietario = idpropietario;
}
public int getTipopropietario() {
	return tipopropietario;
}
public void setTipopropietario(int tipopropietario) {
	this.tipopropietario = tipopropietario;
}
public int getEstado() {
	return estado;
}
public void setEstado(int estado) {
	this.estado = estado;
}
public int getIdpersona() {
	return idpersona;
}
public void setIdpersona(int idpersona) {
	this.idpersona = idpersona;
}
}
