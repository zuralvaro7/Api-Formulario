package com.trinitarias.api_formulario.dto;

public class ContratacionDatosBancario {
	//ATRIBUTOS
	private String nombreBanco;
	private String iban;
	private String bic;
	private String tipoCuenta;
	private String sucursal;
	//CONSTRUCTOR VACIO
	public ContratacionDatosBancario() {
		
	}
	//CONSTRUCTOR CON ATRIBUTOS
	public ContratacionDatosBancario(String nombrebanco, String iban, String bic, String tipocuenta, String sucursal) {
		super();
		this.nombreBanco = nombrebanco;
		this.iban = iban;
		this.bic = bic;
		this.tipoCuenta = tipocuenta;
		this.sucursal = sucursal;
	}
	//GETTER Y SETTERS
	public String getNombrebanco() {
		return nombreBanco;
	}

	public void setNombrebanco(String nombrebanco) {
		this.nombreBanco = nombrebanco;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public String getTipocuenta() {
		return tipoCuenta;
	}

	public void setTipocuenta(String tipocuenta) {
		this.tipoCuenta = tipocuenta;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
	
	
}
