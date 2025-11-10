package com.trinitarias.api_formulario.dto;

public class ContratacionMetodoPago {

	private String tipopago;
	private String nombretitular;
	
	private int cvv;

	public ContratacionMetodoPago() {
		// TODO Auto-generated constructor stub
	}
	
	public ContratacionMetodoPago(String tipopago, String nombretitular, int cvv) {
		super();
		this.tipopago = tipopago;
		this.nombretitular = nombretitular;
		this.cvv = cvv;
	}

	public String getTipopago() {
		return tipopago;
	}

	public void setTipopago(String tipopago) {
		this.tipopago = tipopago;
	}

	public String getNombretitular() {
		return nombretitular;
	}

	public void setNombretitular(String nombretitular) {
		this.nombretitular = nombretitular;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	
}
