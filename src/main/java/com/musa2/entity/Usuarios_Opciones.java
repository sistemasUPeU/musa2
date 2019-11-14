package com.musa2.entity;

public class Usuarios_Opciones {
	private int idusuario;
	private int idopcion;
	private int idopcion2;
	private int idopcion3;	
	private String user_create;
	private String date_create;
	private String user_modify;
	private String date_modify;
	private int estado;
	
	public Usuarios_Opciones() {
		
	}

	public Usuarios_Opciones(int idusuario, int idopcion, int idopcion2, int idopcion3, String user_create,
			String date_create, String user_modify, String date_modify, int estado) {
		super();
		this.idusuario = idusuario;
		this.idopcion = idopcion;
		this.idopcion2 = idopcion2;
		this.idopcion3 = idopcion3;
		this.user_create = user_create;
		this.date_create = date_create;
		this.user_modify = user_modify;
		this.date_modify = date_modify;
		this.estado = estado;
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

	public int getIdopcion2() {
		return idopcion2;
	}

	public void setIdopcion2(int idopcion2) {
		this.idopcion2 = idopcion2;
	}

	public int getIdopcion3() {
		return idopcion3;
	}

	public void setIdopcion3(int idopcion3) {
		this.idopcion3 = idopcion3;
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

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
	
	
}
