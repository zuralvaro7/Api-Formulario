package com.trinitarias.api_formulario.dto;

public class ContratacionDatosContacto {
	//ATRIBUTOS
	private int movil;
	private int fijo;
	private String email;
	private String linkedin;
	private String twitter;
	private String web;
	//CONTRUCTOR VACIO
	public ContratacionDatosContacto() {
	
	}
	//CONSTRUCTOR CON ATRIBUTOS
	public ContratacionDatosContacto(int movil, int fijo, String email, String linkedin, String twitter, String web) {
		super();
		this.movil = movil;
		this.fijo = fijo;
		this.email = email;
		this.linkedin = linkedin;
		this.twitter = twitter;
		this.web = web;
	}
	//GETTER Y SETTERS
	public int getMovil() {
		return movil;
	}

	public void setMovil(int movil) {
		this.movil = movil;
	}

	public int getFijo() {
		return fijo;
	}

	public void setFijo(int fijo) {
		this.fijo = fijo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}
	
	
	
}
