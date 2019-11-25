package com.musa2.entity;

import java.sql.Date;

public class Ventas {
	private int idventa;
	private int idcaja;
	private int nrocomprobante;
	private int nroserie;
	private Date fecha;
	private double total;
	private double subtotal;
	private double igv;
	private int estado;
	private int idpersona;
	private int idtipocomprobante;
	private int idtipoventa;
	private int idpedido;
	private String usercreate;
	private Date datecreate;
	private String usermodify;
	private Date datemodify;
	public Ventas() {
		super();
	}
	public Ventas(int idventa, int idcaja, int nrocomprobante, int nroserie, Date fecha, double total, double subtotal,
			double igv, int estado, int idpersona, int idtipocomprobante, int idtipoventa, int idpedido,
			String usercreate, Date datecreate, String usermodify, Date datemodify) {
		super();
		this.idventa = idventa;
		this.idcaja = idcaja;
		this.nrocomprobante = nrocomprobante;
		this.nroserie = nroserie;
		this.fecha = fecha;
		this.total = total;
		this.subtotal = subtotal;
		this.igv = igv;
		this.estado = estado;
		this.idpersona = idpersona;
		this.idtipocomprobante = idtipocomprobante;
		this.idtipoventa = idtipoventa;
		this.idpedido = idpedido;
		this.usercreate = usercreate;
		this.datecreate = datecreate;
		this.usermodify = usermodify;
		this.datemodify = datemodify;
	}
	public int getIdventa() {
		return idventa;
	}
	public void setIdventa(int idventa) {
		this.idventa = idventa;
	}
	public int getIdcaja() {
		return idcaja;
	}
	public void setIdcaja(int idcaja) {
		this.idcaja = idcaja;
	}
	public int getNrocomprobante() {
		return nrocomprobante;
	}
	public void setNrocomprobante(int nrocomprobante) {
		this.nrocomprobante = nrocomprobante;
	}
	public int getNroserie() {
		return nroserie;
	}
	public void setNroserie(int nroserie) {
		this.nroserie = nroserie;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public double getIgv() {
		return igv;
	}
	public void setIgv(double igv) {
		this.igv = igv;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public int getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}
	public int getIdtipocomprobante() {
		return idtipocomprobante;
	}
	public void setIdtipocomprobante(int idtipocomprobante) {
		this.idtipocomprobante = idtipocomprobante;
	}
	public int getIdtipoventa() {
		return idtipoventa;
	}
	public void setIdtipoventa(int idtipoventa) {
		this.idtipoventa = idtipoventa;
	}
	public int getIdpedido() {
		return idpedido;
	}
	public void setIdpedido(int idpedido) {
		this.idpedido = idpedido;
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
