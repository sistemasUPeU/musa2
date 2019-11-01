package com.musa2.entity;

public class Ubigeo {
private int idubigeo;
private int codubigeo;
private int coddepto;
private String departamento;
private int codprov;
private String provincia;
private int coddist;
private String distrito;
private int estado;
public Ubigeo() {
}
public Ubigeo(int idubigeo, int codubigeo, int coddepto, String departamento, int codprov, String provincia,
		int coddist, String distrito, int estado) {
	super();
	this.idubigeo = idubigeo;
	this.codubigeo = codubigeo;
	this.coddepto = coddepto;
	this.departamento = departamento;
	this.codprov = codprov;
	this.provincia = provincia;
	this.coddist = coddist;
	this.distrito = distrito;
	this.estado = estado;
}
public Ubigeo(int codubigeo, int coddepto, String departamento, int codprov, String provincia, int coddist,
		String distrito, int estado) {
	super();
	this.codubigeo = codubigeo;
	this.coddepto = coddepto;
	this.departamento = departamento;
	this.codprov = codprov;
	this.provincia = provincia;
	this.coddist = coddist;
	this.distrito = distrito;
	this.estado = estado;
}
public int getIdubigeo() {
	return idubigeo;
}
public void setIdubigeo(int idubigeo) {
	this.idubigeo = idubigeo;
}
public int getCodubigeo() {
	return codubigeo;
}
public void setCodubigeo(int codubigeo) {
	this.codubigeo = codubigeo;
}
public int getCoddepto() {
	return coddepto;
}
public void setCoddepto(int coddepto) {
	this.coddepto = coddepto;
}
public String getDepartamento() {
	return departamento;
}
public void setDepartamento(String departamento) {
	this.departamento = departamento;
}
public int getCodprov() {
	return codprov;
}
public void setCodprov(int codprov) {
	this.codprov = codprov;
}
public String getProvincia() {
	return provincia;
}
public void setProvincia(String provincia) {
	this.provincia = provincia;
}
public int getCoddist() {
	return coddist;
}
public void setCoddist(int coddist) {
	this.coddist = coddist;
}
public String getDistrito() {
	return distrito;
}
public void setDistrito(String distrito) {
	this.distrito = distrito;
}
public int getEstado() {
	return estado;
}
public void setEstado(int estado) {
	this.estado = estado;
}

}
