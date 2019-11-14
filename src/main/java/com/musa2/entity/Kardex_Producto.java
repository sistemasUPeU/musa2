package com.musa2.entity;

public class Kardex_Producto {
 private int idkardex_producto;
 private Productos idproducto;
 private int preciounitario;
 private int preciototal;
 private int cantidad;
 private Kardex idkardex;
 
 
public Kardex_Producto() {
	super();
}


public Kardex_Producto(int idkardex_producto, Productos idproducto, int preciounitario, int preciototal, int cantidad,
		Kardex idkardex) {
	super();
	this.idkardex_producto = idkardex_producto;
	this.idproducto = idproducto;
	this.preciounitario = preciounitario;
	this.preciototal = preciototal;
	this.cantidad = cantidad;
	this.idkardex = idkardex;
}


public int getIdkardex_producto() {
	return idkardex_producto;
}


public void setIdkardex_producto(int idkardex_producto) {
	this.idkardex_producto = idkardex_producto;
}


public Productos getIdproducto() {
	return idproducto;
}


public void setIdproducto(Productos idproducto) {
	this.idproducto = idproducto;
}


public int getPreciounitario() {
	return preciounitario;
}


public void setPreciounitario(int preciounitario) {
	this.preciounitario = preciounitario;
}


public int getPreciototal() {
	return preciototal;
}


public void setPreciototal(int preciototal) {
	this.preciototal = preciototal;
}


public int getCantidad() {
	return cantidad;
}


public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}


public Kardex getIdkardex() {
	return idkardex;
}


public void setIdkardex(Kardex idkardex) {
	this.idkardex = idkardex;
}




}