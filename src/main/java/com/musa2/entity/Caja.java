package com.musa2.entity;

import java.sql.Date;

public class Caja {
	private int idcaja;
	private int idempleado;
	private int tipo;
	private Date fechainicio;
	private Date fechafin;
	private double montoapertura;
	private double montocierre;
	private int estado; 
	private String usercreate;
	private Date datecreate;
	private String usermodify;
	private Date datemodify;
	
	public Caja() {
		super();
	}

	public Caja(int idcaja, int idempleado, int tipo, Date fechainicio, Date fechafin, double montoapertura,
			double montocierre, int estado, String usercreate, Date datecreate, String usermodify, Date datemodify) {
		super();
		this.idcaja = idcaja;
		this.idempleado = idempleado;
		this.tipo = tipo;
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
		this.montoapertura = montoapertura;
		this.montocierre = montocierre;
		this.estado = estado;
		this.usercreate = usercreate;
		this.datecreate = datecreate;
		this.usermodify = usermodify;
		this.datemodify = datemodify;
	}

	public int getIdcaja() {
		return idcaja;
	}

	public void setIdcaja(int idcaja) {
		this.idcaja = idcaja;
	}

	public int getIdempleado() {
		return idempleado;
	}

	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
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

	public double getMontoapertura() {
		return montoapertura;
	}

	public void setMontoapertura(double montoapertura) {
		this.montoapertura = montoapertura;
	}

	public double getMontocierre() {
		return montocierre;
	}

	public void setMontocierre(double montocierre) {
		this.montocierre = montocierre;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
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
	
	
}
