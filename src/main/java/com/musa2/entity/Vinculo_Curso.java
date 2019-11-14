package com.musa2.entity;

public class Vinculo_Curso {
	  private int idcursos;
	  private int idconductor;
	  private int estado;
	  private String fechaemision;
      private String fechacaducidad;
      private int resultado;
      private String usercreate;
      private String datecreate;
      private String usermodify;
      private String datemodify;
      
      
      
	public Vinculo_Curso(int idcursos, int idconductor, int estado, String fechaemision, String fechacaducidad,
			int resultado, String usercreate, String datecreate, String usermodify, String datemodify) {
		super();
		this.idcursos = idcursos;
		this.idconductor = idconductor;
		this.estado = estado;
		this.fechaemision = fechaemision;
		this.fechacaducidad = fechacaducidad;
		this.resultado = resultado;
		this.usercreate = usercreate;
		this.datecreate = datecreate;
		this.usermodify = usermodify;
		this.datemodify = datemodify;
	}
	public int getIdcursos() {
		return idcursos;
	}
	public void setIdcursos(int idcursos) {
		this.idcursos = idcursos;
	}
	public int getIdconductor() {
		return idconductor;
	}
	public void setIdconductor(int idconductor) {
		this.idconductor = idconductor;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public String getFechaemision() {
		return fechaemision;
	}
	public void setFechaemision(String fechaemision) {
		this.fechaemision = fechaemision;
	}
	public String getFechacaducidad() {
		return fechacaducidad;
	}
	public void setFechacaducidad(String fechacaducidad) {
		this.fechacaducidad = fechacaducidad;
	}
	public int getResultado() {
		return resultado;
	}
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	public String getUsercreate() {
		return usercreate;
	}
	public void setUsercreate(String usercreate) {
		this.usercreate = usercreate;
	}
	public String getDatecreate() {
		return datecreate;
	}
	public void setDatecreate(String datecreate) {
		this.datecreate = datecreate;
	}
	public String getUsermodify() {
		return usermodify;
	}
	public void setUsermodify(String usermodify) {
		this.usermodify = usermodify;
	}
	public String getDatemodify() {
		return datemodify;
	}
	public void setDatemodify(String datemodify) {
		this.datemodify = datemodify;
	}
      
      

}
