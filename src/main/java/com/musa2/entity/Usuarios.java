package com.musa2.entity;

public class Usuarios {
 private int idusuario;
 private String login;
 private String password;
 private int estado;
 private int idpersona;
 private String user_create;
 private String date_create;
 private String user_modify;
 private String date_modify;

public Usuarios() {
	super();
	// TODO Auto-generated constructor stub
}

public Usuarios(int idusuario, String login, String password, int estado, int idpersona, String user_create,
		String date_create, String user_modify, String date_modify) {
	super();
	this.idusuario = idusuario;
	this.login = login;
	this.password = password;
	this.estado = estado;
	this.idpersona = idpersona;
	this.user_create = user_create;
	this.date_create = date_create;
	this.user_modify = user_modify;
	this.date_modify = date_modify;
}

public Usuarios(String login, String password, int idpersona, String user_create) {
	super();
	this.login = login;
	this.password = password;
	this.idpersona = idpersona;
	this.user_create = user_create;
	
}

public Usuarios(int idusuario, String login, String password, int idpersona, String user_modify) {
	super();
	this.idusuario = idusuario;
	this.login = login;
	this.password = password;
	this.idpersona = idpersona;
	this.user_modify = user_modify;
	
}

public int getIdusuario() {
	return idusuario;
}

public void setIdusuario(int idusuario) {
	this.idusuario = idusuario;
}

public String getLogin() {
	return login;
}

public void setLogin(String login) {
	this.login = login;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
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

public String getUser_create() {
	return user_create;
}

public void setUser_create(String user_create) {
	this.user_create = user_create;
}

public String getDate_create() {
	return date_create;
}

public void setDate_create(String date_create) {
	this.date_create = date_create;
}

public String getUser_modify() {
	return user_modify;
}

public void setUser_modify(String user_modify) {
	this.user_modify = user_modify;
}

public String getDate_modify() {
	return date_modify;
}

public void setDate_modify(String date_modify) {
	this.date_modify = date_modify;
}

}