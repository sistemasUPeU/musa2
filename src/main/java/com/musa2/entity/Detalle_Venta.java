package com.musa2.entity;

public class Detalle_Venta {
	private int idproducto;
	private int idventa;
	private int cantidad;
	private double preciounitario;
	public Detalle_Venta() {
		super();
	}
	public Detalle_Venta(int idproducto, int idventa, int cantidad, double preciounitario) {
		super();
		this.idproducto = idproducto;
		this.idventa = idventa;
		this.cantidad = cantidad;
		this.preciounitario = preciounitario;
	}
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	public int getIdventa() {
		return idventa;
	}
	public void setIdventa(int idventa) {
		this.idventa = idventa;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPreciounitario() {
		return preciounitario;
	}
	public void setPreciounitario(double preciounitario) {
		this.preciounitario = preciounitario;
	}
	
	
}
