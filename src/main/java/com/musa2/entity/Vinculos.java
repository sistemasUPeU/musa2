package com.musa2.entity;

import java.sql.Date;

public class Vinculos {
	private int idvinculo;
	private int tipovinculo;
	private int estado;
	private int idconductor;
	private String descripcion;
	private Date fechainicio;
	private Date fechafin;
	private String usercreate;
	private Date datecreate;
	private String usermodify;
	private Date datemodify;
	private int idpropietario;
	private int idempleado;
	private int idvehiculo;
	
	
	public int getIdvinculo() {
		return idvinculo;
	}

	public void setIdvinculo(int idvinculo) {
		this.idvinculo = idvinculo;
	}

	public int getTipovinculo() {
		return tipovinculo;
	}

	public void setTipovinculo(int tipovinculo) {
		this.tipovinculo = tipovinculo;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getIdconductor() {
		return idconductor;
	}

	public void setIdconductor(int idconductor) {
		this.idconductor = idconductor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechainicio() {
		return fechainicio;
	}

	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}

	public Date getFechafin() {
		return fechafin;
	}

	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
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

	public int getIdpropietario() {
		return idpropietario;
	}

	public void setIdpropietario(int idpropietario) {
		this.idpropietario = idpropietario;
	}

	public int getIdempleado() {
		return idempleado;
	}

	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}

	public int getIdvehiculo() {
		return idvehiculo;
	}

	public void setIdvehiculo(int idvehiculo) {
		this.idvehiculo = idvehiculo;
	}

	public Vinculos() {
		super();
	}
	

	public Vinculos(int idvinculo, int estado) {
		super();
		this.idvinculo = idvinculo;
		this.estado = estado;
	}

	public Vinculos(int idvinculo, int tipovinculo, int estado, int idconductor, String descripcion, Date fechainicio,
			Date fechafin, String usercreate, Date datecreate, String usermodify, Date datemodify, int idpropietario,
			int idempleado, int idvehiculo) {
		super();
		this.idvinculo = idvinculo;
		this.tipovinculo = tipovinculo;
		this.estado = estado;
		this.idconductor = idconductor;
		this.descripcion = descripcion;
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
		this.usercreate = usercreate;
		this.datecreate = datecreate;
		this.usermodify = usermodify;
		this.datemodify = datemodify;
		this.idpropietario = idpropietario;
		this.idempleado = idempleado;
		this.idvehiculo = idvehiculo;
	}

	
	
	
	
	
	
	
	
}
