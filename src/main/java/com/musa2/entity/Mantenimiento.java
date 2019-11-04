package com.musa2.entity;

import java.util.Date;

public class Mantenimiento {
	private int idMantenimiento;
	private int idVehiculo;
	private int tipoMantenimiento;
	private String Detalle;
	private Date fechaInicio;
	private Date fechaFin;
	private int estado;
	private Date fecValidacionMant;
	private Date fecValidacionOper;
	private int idEmpleado;
	private int idConductor;
	private int idJefeOperaciones;
	private int idJefeMantenimiento;
	private String userCreate;
	private Date dateCreate;
	private String userModify;
	private Date dateModify;
	
	public int getIdMantenimiento() {
		return idMantenimiento;
	}
	public void setIdMantenimiento(int idMantenimiento) {
		this.idMantenimiento = idMantenimiento;
	}
	public int getIdVehiculo() {
		return idVehiculo;
	}
	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}
	public int getTipoMantenimiento() {
		return tipoMantenimiento;
	}
	public void setTipoMantenimiento(int tipoMantenimiento) {
		this.tipoMantenimiento = tipoMantenimiento;
	}
	public String getDetalle() {
		return Detalle;
	}
	public void setDetalle(String detalle) {
		Detalle = detalle;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public Date getFecValidacionMant() {
		return fecValidacionMant;
	}
	public void setFecValidacionMant(Date fecValidacionMant) {
		this.fecValidacionMant = fecValidacionMant;
	}
	public Date getFecValidacionOper() {
		return fecValidacionOper;
	}
	public void setFecValidacionOper(Date fecValidacionOper) {
		this.fecValidacionOper = fecValidacionOper;
	}
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public int getIdJefeOperaciones() {
		return idJefeOperaciones;
	}
	public void setIdJefeOperaciones(int idJefeOperaciones) {
		this.idJefeOperaciones = idJefeOperaciones;
	}
	public int getIdJefeMantenimiento() {
		return idJefeMantenimiento;
	}
	public void setIdJefeMantenimiento(int idJefeMantenimiento) {
		this.idJefeMantenimiento = idJefeMantenimiento;
	}
	public String getUserCreate() {
		return userCreate;
	}
	public void setUserCreate(String userCreate) {
		this.userCreate = userCreate;
	}
	public Date getDateCreate() {
		return dateCreate;
	}
	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}
	public String getUserModify() {
		return userModify;
	}
	public void setUserModify(String userModify) {
		this.userModify = userModify;
	}
	public Date getDateModify() {
		return dateModify;
	}
	public void setDateModify(Date dateModify) {
		this.dateModify = dateModify;
	}
	public int getIdConductor() {
		return idConductor;
	}
	public void setIdConductor(int idConductor) {
		this.idConductor = idConductor;
	}
	public Mantenimiento(int idMantenimiento, int idVehiculo, int tipoMantenimiento, String detalle, Date fechaInicio,
			Date fechaFin, int estado, Date fecValidacionMant, Date fecValidacionOper, int idEmpleado, int idConductor,
			int idJefeOperaciones, int idJefeMantenimiento, String userCreate, Date dateCreate, String userModify,
			Date dateModify) {
		super();
		this.idMantenimiento = idMantenimiento;
		this.idVehiculo = idVehiculo;
		this.tipoMantenimiento = tipoMantenimiento;
		Detalle = detalle;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.estado = estado;
		this.fecValidacionMant = fecValidacionMant;
		this.fecValidacionOper = fecValidacionOper;
		this.idEmpleado = idEmpleado;
		this.idConductor = idConductor;
		this.idJefeOperaciones = idJefeOperaciones;
		this.idJefeMantenimiento = idJefeMantenimiento;
		this.userCreate = userCreate;
		this.dateCreate = dateCreate;
		this.userModify = userModify;
		this.dateModify = dateModify;
	}
	public Mantenimiento() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
