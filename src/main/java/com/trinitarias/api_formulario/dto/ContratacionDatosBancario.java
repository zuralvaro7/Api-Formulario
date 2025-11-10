package com.trinitarias.api_formulario.dto;

public class ContratacionDatosBancario {

	private String nombrebanco;
	private String iban;
	private String bic;
	private String tipocuenta;
	private String sucursal;
	
	public ContratacionDatosBancario() {
		// TODO Auto-generated constructor stub
	}

	public ContratacionDatosBancario(String nombrebanco, String iban, String bic, String tipocuenta, String sucursal) {
		super();
		this.nombrebanco = nombrebanco;
		this.iban = iban;
		this.bic = bic;
		this.tipocuenta = tipocuenta;
		this.sucursal = sucursal;
	}

	public String getNombrebanco() {
		return nombrebanco;
	}

	public void setNombrebanco(String nombrebanco) {
		this.nombrebanco = nombrebanco;
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
		return tipocuenta;
	}

	public void setTipocuenta(String tipocuenta) {
		this.tipocuenta = tipocuenta;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
	
	
}
