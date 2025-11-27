package com.trinitarias.api_formulario.dto;

public class ContratacionMetodoPago {

	private String tipoPago;
	private String nombreTitular;
	private String fechaCaducidad;
	private int cvv;

	public ContratacionMetodoPago() {
		// TODO Auto-generated constructor stub
	}
	
	public ContratacionMetodoPago(String tipoPago, String nombreTitular, String fechaCaducidad, int cvv) {
		super();
		this.tipoPago = tipoPago;
		this.nombreTitular = nombreTitular;
		this.fechaCaducidad = fechaCaducidad;
		this.cvv = cvv;
	}

	public String getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}

	public String getNombreTitular() {
		return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	

	
}
