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

	public String getTipopago() {
		return tipoPago;
	}

	public void setTipopago(String tipopago) {
		this.tipoPago = tipopago;
	}

	public String getNombretitular() {
		return nombreTitular;
	}

	public void setNombretitular(String nombretitular) {
		this.nombreTitular = nombretitular;
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
