package com.musa2.entity;

public class Productos {
	private int idproducto;
	private String descripcion;
	private String nombre;
	private int stockactual;
	private int estado;
	private int precioref;
	private int stockmin;
	private int stockmaximo;
	private String usercreate;
	private String datecreate;
	private String usermodify;
	private String datemodify;
	private int idprodcategoria;
	private int idprodmarca;
	private int idprodunidadmed;
	
	public Productos() {
		
	}

	public Productos(int idproducto,String nombre, String descripcion, int stockactual, int estado, int precioref, int stockmin,
			int stockmaximo, String usercreate, String datecreate, String usermodify, String datemodify,
			int idprodcategoria, int idprodmarca, int idprodunidadmed) {
		super();
		this.idproducto = idproducto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.stockactual = stockactual;
		this.estado = estado;
		this.precioref = precioref;
		this.stockmin = stockmin;
		this.stockmaximo = stockmaximo;
		this.usercreate = usercreate;
		this.datecreate = datecreate;
		this.usermodify = usermodify;
		this.datemodify = datemodify;
		this.idprodcategoria = idprodcategoria;
		this.idprodmarca = idprodmarca;
		this.idprodunidadmed = idprodunidadmed;
	}

	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getStockactual() {
		return stockactual;
	}

	public void setStockactual(int stockactual) {
		this.stockactual = stockactual;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getPrecioref() {
		return precioref;
	}

	public void setPrecioref(int precioref) {
		this.precioref = precioref;
	}

	public int getStockmin() {
		return stockmin;
	}

	public void setStockmin(int stockmin) {
		this.stockmin = stockmin;
	}

	public int getStockmaximo() {
		return stockmaximo;
	}

	public void setStockmaximo(int stockmaximo) {
		this.stockmaximo = stockmaximo;
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

	public int getIdprodcategoria() {
		return idprodcategoria;
	}

	public void setIdprodcategoria(int idprodcategoria) {
		this.idprodcategoria = idprodcategoria;
	}

	public int getIdprodmarca() {
		return idprodmarca;
	}

	public void setIdprodmarca(int idprodmarca) {
		this.idprodmarca = idprodmarca;
	}

	public int getIdprodunidadmed() {
		return idprodunidadmed;
	}

	public void setIdprodunidadmed(int idprodunidadmed) {
		this.idprodunidadmed = idprodunidadmed;
	}
	
	
}
