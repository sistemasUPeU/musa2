package com.musa2.entity;

public class Rol_Usuarios {
	private int idrol;
	private int idusuario;
	private String user_create;
	private String date_create;
	private String user_modify;
	private String date_modify;
	private int estado;
	
	public Rol_Usuarios() {
		
	}

	
	public Rol_Usuarios(int idrol, int idusuario, String user_create, String date_create, String user_modify,
			String date_modify, int estado) {
		super();
		this.idrol = idrol;
		this.idusuario = idusuario;
		this.user_create = user_create;
		this.date_create = date_create;
		this.user_modify = user_modify;
		this.date_modify = date_modify;
		this.estado = estado;
	}


	public int getIdrol() {
		return idrol;
	}


	public void setIdrol(int idrol) {
		this.idrol = idrol;
	}


	public int getIdusuario() {
		return idusuario;
	}


	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
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