package com.musa2.entity;

public class Usuarios_Opciones {
	private int idusuario;
	private int idopcion;
	private String user_create;
	private String date_create;
	private String user_modify;
	private String date_modify;
	
	public Usuarios_Opciones() {
		
	}

	public Usuarios_Opciones(int idusuario, int idopcion, String user_create, String date_create, String user_modify,
			String date_modify) {
		super();
		this.idusuario = idusuario;
		this.idopcion = idopcion;
		this.user_create = user_create;
		this.date_create = date_create;
		this.user_modify = user_modify;
		this.date_modify = date_modify;
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public int getIdopcion() {
		return idopcion;
	}

	public void setIdopcion(int idopcion) {
		this.idopcion = idopcion;
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
