package com.musa2.entity;

public class Vinculos {
	private int idvinculo;
	private int tipovinculo;
	private int estado;
	private int idconductor;
	private String descripcion;
	private String fechainicio;
	private String fechafin;
	private String usercreate;
	private String datecreate;
	private String usermodify;
	private String datemodify;
	private int idpropietario;
	private int idempleado;
	private int idvehiculo;
	
	public Vinculos() {
		super();
	}
	
	
	/*
	 * * Constructor para hacer vinculo con el Propietario
	 */
	public Vinculos(int idvinculo, int tipovinculo, int estado, int idconductor, String descripcion, String fechainicio,
			String fechafin, String usercreate, String datecreate, String usermodify, String datemodify,
			int idpropietario, int idempleado) {
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
	}
	
	/*
	 * * Constructor para hacer vinculo con el Conductor
	 */
	public Vinculos(int idvinculo, int tipovinculo, int estado, String descripcion, String fechainicio, String fechafin,
			String usercreate, String datecreate, String usermodify, String datemodify, int idpropietario,
			int idempleado, int idvehiculo) {
		super();
		this.idvinculo = idvinculo;
		this.tipovinculo = tipovinculo;
		this.estado = estado;
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
