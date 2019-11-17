package com.musa2.entity;

import java.sql.Date;

public class Vehiculos {
    private int idvehiculo;
    private int nropadron;
    private int estado;
    private String placa;
    private String motor;
    private int serie;
    private String anhofabricacion;
    private int pasajerossentados;
    private int pasajerospie;
    private int idvehmodelo;
    private int idvehmarca;
    private int idvehcategoria;
    private String uso;
    private String usercreate;
    private String datecreate;
    private String usermodify;
    private Date datemodify;
	public Vehiculos() {
		super();
	}
	public int getIdvehiculo() {
		return idvehiculo;
	}
	public void setIdvehiculo(int idvehiculo) {
		this.idvehiculo = idvehiculo;
	}
	public int getNropadron() {
		return nropadron;
	}
	public void setNropadron(int nropadron) {
		this.nropadron = nropadron;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public int getSerie() {
		return serie;
	}
	public void setSerie(int serie) {
		this.serie = serie;
	}
	public String getAnhofabricacion() {
		return anhofabricacion;
	}
	public void setAnhofabricacion(String anhofabricacion) {
		this.anhofabricacion = anhofabricacion;
	}
	public int getPasajerossentados() {
		return pasajerossentados;
	}
	public void setPasajerossentados(int pasajerossentados) {
		this.pasajerossentados = pasajerossentados;
	}
	public int getPasajerospie() {
		return pasajerospie;
	}
	public void setPasajerospie(int pasajerospie) {
		this.pasajerospie = pasajerospie;
	}
	public int getIdvehmodelo() {
		return idvehmodelo;
	}
	public void setIdvehmodelo(int idvehmodelo) {
		this.idvehmodelo = idvehmodelo;
	}
	public int getIdvehmarca() {
		return idvehmarca;
	}
	public void setIdvehmarca(int idvehmarca) {
		this.idvehmarca = idvehmarca;
	}
	public int getIdvehcategoria() {
		return idvehcategoria;
	}
	public void setIdvehcategoria(int idvehcategoria) {
		this.idvehcategoria = idvehcategoria;
	}
	public String getUso() {
		return uso;
	}
	public void setUso(String uso) {
		this.uso = uso;
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
	public Date getDatemodify() {
		return datemodify;
	}
	public void setDatemodify(Date datemodify) {
		this.datemodify = datemodify;
	}
    
    
}
