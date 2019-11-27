package com.musa2.entity;

public class Kardex {
	private int idkardex;
	private String tipomovimiento;
	private int concepto;
	private int estado;
	private String fecha;
	private int nrocomprobante;
	private int nroserie;
	private String usercreate;
	private String datecreate;
	private String usermodify;
	private String datemodify;
	private int idpedido;
	private int idempleado;
	private int  idtipocomprobante;
	private String error;

	public Kardex() {
	}

	public Kardex(int idkardex, String tipomovimiento, int concepto, int estado, String fecha, int nrocomprobante,
			int nroserie, String usercreate, String datecreate, String usermodify, String datemodify, int idpedido,
			int idempleado, int idtipocomprobante, String error) {
		super();
		this.idkardex = idkardex;
		this.tipomovimiento = tipomovimiento;
		this.concepto = concepto;
		this.estado = estado;
		this.fecha = fecha;
		this.nrocomprobante = nrocomprobante;
		this.nroserie = nroserie;
		this.usercreate = usercreate;
		this.datecreate = datecreate;
		this.usermodify = usermodify;
		this.datemodify = datemodify;
		this.idpedido = idpedido;
		this.idempleado = idempleado;
		this.idtipocomprobante = idtipocomprobante;
		this.error = error;
	}

	public Kardex(String tipomovimiento, int concepto, int estado, String fecha, int nrocomprobante, int nroserie,
			String usercreate, String datecreate, String usermodify, String datemodify, int idpedido, int idempleado,
			int idtipocomprobante, String error) {
		super();
		this.tipomovimiento = tipomovimiento;
		this.concepto = concepto;
		this.estado = estado;
		this.fecha = fecha;
		this.nrocomprobante = nrocomprobante;
		this.nroserie = nroserie;
		this.usercreate = usercreate;
		this.datecreate = datecreate;
		this.usermodify = usermodify;
		this.datemodify = datemodify;
		this.idpedido = idpedido;
		this.idempleado = idempleado;
		this.idtipocomprobante = idtipocomprobante;
		this.error = error;
	}

	public int getIdkardex() {
		return idkardex;
	}

	public void setIdkardex(int idkardex) {
		this.idkardex = idkardex;
	}

	public String getTipomovimiento() {
		return tipomovimiento;
	}

	public void setTipomovimiento(String tipomovimiento) {
		this.tipomovimiento = tipomovimiento;
	}

	public int getConcepto() {
		return concepto;
	}

	public void setConcepto(int concepto) {
		this.concepto = concepto;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
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

	public int getIdpedido() {
		return idpedido;
	}

	public void setIdpedido(int idpedido) {
		this.idpedido = idpedido;
	}

	public int getIdempleado() {
		return idempleado;
	}

	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}

	public int getIdtipocomprobante() {
		return idtipocomprobante;
	}

	public void setIdtipocomprobante(int idtipocomprobante) {
		this.idtipocomprobante = idtipocomprobante;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
}

