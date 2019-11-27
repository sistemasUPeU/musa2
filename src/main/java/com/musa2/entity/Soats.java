package com.musa2.entity;

public class Soats {
  private int idsoat;
  private int nrodocumento;
  private int nropoliza;
  private String vigenciadesde;
  private String vigenciahasta;
  private String certificadodesde;
  private String certificadohasta;
  private double montoprima;
  private String aseguradora;
  private int idvehiculo;
  private int estado;
public Soats() {
	super();
}
public Soats(int idsoat, int nrodocumento, int nropoliza, String vigenciadesde, String vigenciahasta,
		String certificadodesde, String certificadohasta, double montoprima, String aseguradora, int idvehiculo,
		int estado) {
	super();
	this.idsoat = idsoat;
	this.nrodocumento = nrodocumento;
	this.nropoliza = nropoliza;
	this.vigenciadesde = vigenciadesde;
	this.vigenciahasta = vigenciahasta;
	this.certificadodesde = certificadodesde;
	this.certificadohasta = certificadohasta;
	this.montoprima = montoprima;
	this.aseguradora = aseguradora;
	this.idvehiculo = idvehiculo;
	this.estado = estado;
}
public int getIdsoat() {
	return idsoat;
}
public void setIdsoat(int idsoat) {
	this.idsoat = idsoat;
}
public int getNrodocumento() {
	return nrodocumento;
}
public void setNrodocumento(int nrodocumento) {
	this.nrodocumento = nrodocumento;
}
public int getNropoliza() {
	return nropoliza;
}
public void setNropoliza(int nropoliza) {
	this.nropoliza = nropoliza;
}
public String getVigenciadesde() {
	return vigenciadesde;
}
public void setVigenciadesde(String vigenciadesde) {
	this.vigenciadesde = vigenciadesde;
}
public String getVigenciahasta() {
	return vigenciahasta;
}
public void setVigenciahasta(String vigenciahasta) {
	this.vigenciahasta = vigenciahasta;
}
public String getCertificadodesde() {
	return certificadodesde;
}
public void setCertificadodesde(String certificadodesde) {
	this.certificadodesde = certificadodesde;
}
public String getCertificadohasta() {
	return certificadohasta;
}
public void setCertificadohasta(String certificadohasta) {
	this.certificadohasta = certificadohasta;
}
public double getMontoprima() {
	return montoprima;
}
public void setMontoprima(double montoprima) {
	this.montoprima = montoprima;
}
public String getAseguradora() {
	return aseguradora;
}
public void setAseguradora(String aseguradora) {
	this.aseguradora = aseguradora;
}
public int getIdvehiculo() {
	return idvehiculo;
}
public void setIdvehiculo(int idvehiculo) {
	this.idvehiculo = idvehiculo;
}
public int getEstado() {
	return estado;
}
public void setEstado(int estado) {
	this.estado = estado;
}
  
  
}
