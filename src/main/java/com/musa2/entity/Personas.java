package com.musa2.entity;

public class Personas {
	private int idpersona;
	private String nombre;
	private String apellido;
	private int tipodoc;
	private int nrodoc;
	private char sexo;
	private String fechanac;
	private String direccion;
	private int estado;
	private String telefono;
	private String usercreate;
	private String datecreate;
	private String usermodify;
	private String datemodify;
	private int idubigeo;

	public Personas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personas(int idpersona, String nombre, String apellido, int tipodoc, int nrodoc, char sexo, String fechanac,
			String direccion, int estado, String telefono, String usercreate, String datecreate, String usermodify,
			String datemodify, int idubigeo) {
		super();
		this.idpersona = idpersona;
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipodoc = tipodoc;
		this.nrodoc = nrodoc;
		this.sexo = sexo;
		this.fechanac = fechanac;
		this.direccion = direccion;
		this.estado = estado;
		this.telefono = telefono;
		this.usercreate = usercreate;
		this.datecreate = datecreate;
		this.usermodify = usermodify;
		this.datemodify = datemodify;
		this.idubigeo = idubigeo;
	}

	public Personas(String nombre, String apellido, int tipodoc, int nrodoc, char sexo, String fechanac,
			String direccion, int estado, String telefono, String usercreate, String datecreate, int idubigeo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipodoc = tipodoc;
		this.nrodoc = nrodoc;
		this.sexo = sexo;
		this.fechanac = fechanac;
		this.direccion = direccion;
		this.estado = estado;
		this.telefono = telefono;
		this.usercreate = usercreate;
		this.datecreate = datecreate;
		this.idubigeo = idubigeo;
	}

	public Personas(int idpersona, String nombre, String apellido, int tipodoc, int nrodoc, char sexo, String fechanac,
			String direccion, int estado, String telefono, String usermodify, String datemodify, int idubigeo) {
		super();
		this.idpersona = idpersona;
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipodoc = tipodoc;
		this.nrodoc = nrodoc;
		this.sexo = sexo;
		this.fechanac = fechanac;
		this.direccion = direccion;
		this.estado = estado;
		this.telefono = telefono;
		this.usermodify = usermodify;
		this.datemodify = datemodify;
		this.idubigeo = idubigeo;
	}

	public int getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getTipodoc() {
		return tipodoc;
	}

	public void setTipodoc(int tipodoc) {
		this.tipodoc = tipodoc;
	}

	public int getNrodoc() {
		return nrodoc;
	}

	public void setNrodoc(int nrodoc) {
		this.nrodoc = nrodoc;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getFechanac() {
		return fechanac;
	}

	public void setFechanac(String fechanac) {
		this.fechanac = fechanac;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
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

	public int getIdubigeo() {
		return idubigeo;
	}

	public void setIdubigeo(int idubigeo) {
		this.idubigeo = idubigeo;
	}

}
