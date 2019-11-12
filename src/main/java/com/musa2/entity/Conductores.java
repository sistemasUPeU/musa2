package com.musa2.entity;

public class Conductores {
	private int idconductor;
	private int tipooperador;
	private int codigo;
	private int estado;
	private int idpersona;
	private int nrolicencia;
	private int cursovial;
	private String usercreate;
	private String datecreate;
	private String usermodify;
	private String datemodify;
	private String linc_fechainicio;
	private String linc_fechafin;
	private String clase;
	private int categoria;

	public Conductores() {
		super();
	}
	public Conductores(int idconductor, int tipooperador, int codigo, int estado, int idpersona, int nrolicencia,
			int cursovial, String usercreate, String datecreate, String usermodify, String datemodify,
			String linc_fechainicio, String linc_fechafin, String clase, int categoria) {
		super();
		this.idconductor = idconductor;
		this.tipooperador = tipooperador;
		this.codigo = codigo;
		this.estado = estado;
		this.idpersona = idpersona;
		this.nrolicencia = nrolicencia;
		this.cursovial = cursovial;
		this.usercreate = usercreate;
		this.datecreate = datecreate;
		this.usermodify = usermodify;
		this.datemodify = datemodify;
		this.linc_fechainicio = linc_fechainicio;
		this.linc_fechafin = linc_fechafin;
		this.clase = clase;
		this.categoria = categoria;
	}
	public int getIdconductor() {
		return idconductor;
	}
	public void setIdconductor(int idconductor) {
		this.idconductor = idconductor;
	}
	public int getTipooperador() {
		return tipooperador;
	}
	public void setTipooperador(int tipooperador) {
		this.tipooperador = tipooperador;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	public int getNrolicencia() {
		return nrolicencia;
	}
	public void setNrolicencia(int nrolicencia) {
		this.nrolicencia = nrolicencia;
	}
	public int getCursovial() {
		return cursovial;
	}
	public void setCursovial(int cursovial) {
		this.cursovial = cursovial;
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
	public String getLinc_fechainicio() {
		return linc_fechainicio;
	}
	public void setLinc_fechainicio(String linc_fechainicio) {
		this.linc_fechainicio = linc_fechainicio;
	}
	public String getLinc_fechafin() {
		return linc_fechafin;
	}
	public void setLinc_fechafin(String linc_fechafin) {
		this.linc_fechafin = linc_fechafin;
	}
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	
	
	
	
	

}
