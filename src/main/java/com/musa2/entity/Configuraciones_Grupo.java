package com.musa2.entity;

import java.sql.Date;

public class Configuraciones_Grupo {
	private int idconfiggrupo;
	private int cantidadgrupos;
	private int intervalo;
	private String horainicio;
	private String horafin;
	private int cantidadvehiculo;
	private int idparadero;
	private String usercreate;
	private String datecreate;
	private String usermodify;
	private String datemodify;
	private int idcronogrma;
	private int estado;
	
	public Configuraciones_Grupo() {

	}

	public Configuraciones_Grupo(int idconfiggrupo, int cantidadgrupos, int intervalo, String horainicio,
			String horafin, int cantidadvehiculo, int idparadero, String usercreate, String datecreate,
			String usermodify, String datemodify, int idcronogrma, int estado) {
		super();
		this.idconfiggrupo = idconfiggrupo;
		this.cantidadgrupos = cantidadgrupos;
		this.intervalo = intervalo;
		this.horainicio = horainicio;
		this.horafin = horafin;
		this.cantidadvehiculo = cantidadvehiculo;
		this.idparadero = idparadero;
		this.usercreate = usercreate;
		this.datecreate = datecreate;
		this.usermodify = usermodify;
		this.datemodify = datemodify;
		this.idcronogrma = idcronogrma;
		this.estado = estado;
	}

	public int getIdconfiggrupo() {
		return idconfiggrupo;
	}

	public void setIdconfiggrupo(int idconfiggrupo) {
		this.idconfiggrupo = idconfiggrupo;
	}

	public int getCantidadgrupos() {
		return cantidadgrupos;
	}

	public void setCantidadgrupos(int cantidadgrupos) {
		this.cantidadgrupos = cantidadgrupos;
	}

	public int getIntervalo() {
		return intervalo;
	}

	public void setIntervalo(int intervalo) {
		this.intervalo = intervalo;
	}

	public String getHorainicio() {
		return horainicio;
	}

	public void setHorainicio(String horainicio) {
		this.horainicio = horainicio;
	}

	public String getHorafin() {
		return horafin;
	}

	public void setHorafin(String horafin) {
		this.horafin = horafin;
	}

	public int getCantidadvehiculo() {
		return cantidadvehiculo;
	}

	public void setCantidadvehiculo(int cantidadvehiculo) {
		this.cantidadvehiculo = cantidadvehiculo;
	}

	public int getIdparadero() {
		return idparadero;
	}

	public void setIdparadero(int idparadero) {
		this.idparadero = idparadero;
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

	public int getIdcronogrma() {
		return idcronogrma;
	}

	public void setIdcronogrma(int idcronogrma) {
		this.idcronogrma = idcronogrma;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	
	
	
	
	
}
