package com.musa2.entity;

import java.sql.Date;

public class Vinculo_Curso {
	  private int idcurso;
	  private int idconductor;
	  private int estado;
	  private Date fechaemision;
      private Date fechacaducidad;
      private int resultado;
      private String usercreate;
      private Date datecreate;
      private String usermodify;
      private Date datemodify;
      private int curso;
      private int conductor;
      
	public Vinculo_Curso() {
		super();
	}

	

	public Vinculo_Curso(int idcurso, int idconductor, int estado, Date fechaemision, Date fechacaducidad,
			int resultado, String usercreate, Date datecreate, String usermodify, Date datemodify, int curso,
			int conductor) {
		super();
		this.idcurso = idcurso;
		this.idconductor = idconductor;
		this.estado = estado;
		this.fechaemision = fechaemision;
		this.fechacaducidad = fechacaducidad;
		this.resultado = resultado;
		this.usercreate = usercreate;
		this.datecreate = datecreate;
		this.usermodify = usermodify;
		this.datemodify = datemodify;
		this.curso = curso;
		this.conductor = conductor;
	}



	public int getIdcurso() {
		return idcurso;
	}



	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
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



	public Date getFechaemision() {
		return fechaemision;
	}



	public void setFechaemision(Date fechaemision) {
		this.fechaemision = fechaemision;
	}



	public Date getFechacaducidad() {
		return fechacaducidad;
	}



	public void setFechacaducidad(Date fechacaducidad) {
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



	public Date getDatecreate() {
		return datecreate;
	}



	public void setDatecreate(Date datecreate) {
		this.datecreate = datecreate;
	}



	public String getUsermodify() {
		return usermodify;
	}



	public void setUsermodify(String usermodify) {
		this.usermodify = usermodify;
	}



	public Date getDatemodify() {
		return datemodify;
	}



	public void setDatemodify(Date datemodify) {
		this.datemodify = datemodify;
	}



	public int getCurso() {
		return curso;
	}



	public void setCurso(int curso) {
		this.curso = curso;
	}



	public int getConductor() {
		return conductor;
	}



	public void setConductor(int conductor) {
		this.conductor = conductor;
	}


    

      

}
