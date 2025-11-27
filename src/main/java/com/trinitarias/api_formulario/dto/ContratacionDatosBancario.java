package com.trinitarias.api_formulario.dto;

public class ContratacionDatosBancario {

	private String nombreBanco;
	private String iban;
	private String bic;
	private String tipoCuenta;
	private String sucursal;
	
	public ContratacionDatosBancario() {
		// TODO Auto-generated constructor stub
	}

	public ContratacionDatosBancario(String nombreBanco, String iban, String bic, String tipoCuenta, String sucursal) {
		super();
		this.nombreBanco = nombreBanco;
		this.iban = iban;
		this.bic = bic;
		this.tipoCuenta = tipoCuenta;
		this.sucursal = sucursal;
	}

	public String getNombreBanco() {
		return nombreBanco;
	}

	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
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

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	
	
	
}
