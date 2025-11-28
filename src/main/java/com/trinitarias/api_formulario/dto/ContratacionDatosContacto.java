package com.trinitarias.api_formulario.dto;

public class ContratacionDatosContacto {

	private String movil;
	private String fijo;
	private String email;
	private String linkedin;
	private String twitter;
	private String web;
	
	public ContratacionDatosContacto() {
		// TODO Auto-generated constructor stub
	}

	public ContratacionDatosContacto(String movil, String fijo, String email, String linkedin, String twitter, String web) {
		super();
		this.movil = movil;
		this.fijo = fijo;
		this.email = email;
		this.linkedin = linkedin;
		this.twitter = twitter;
		this.web = web;
	}

	public String getMovil() {
		return movil;
	}

	public void setMovil(String movil) {
		this.movil = movil;
	}

	public String getFijo() {
		return fijo;
	}

	public void setFijo(String fijo) {
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
