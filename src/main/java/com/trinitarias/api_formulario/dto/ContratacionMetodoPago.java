package com.trinitarias.api_formulario.dto;

public class ContratacionMetodoPago {
	//ATRIBUTOS
	private String tipoPago;
	private String nombreTitular;
	private String fechaCaducidad;
	private int cvv;
	//CONSTRUCTOR VACIO
	public ContratacionMetodoPago() {
		
	}
	//CONSTRUCTOR CON ATRIBUTOS
	public ContratacionMetodoPago(String tipopago, String nombretitular, String fechaCaducidad, int cvv) {
		super();
		this.tipoPago = tipopago;
		this.nombreTitular = nombretitular;
		this.fechaCaducidad = fechaCaducidad;
		this.cvv = cvv;
	}
	//GETTER Y SETTERS
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
