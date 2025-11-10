package com.trinitarias.api_formulario.dto;

public class ContratacionDireccion {

	private String tipoVia;
	private String via;
	private String numero;
	private String piso;
	private String puerta;
	private String tipoVivienda;
	private int codPostal;
	private String provincia;
	private String localidad;
	private String pais;
	
	public ContratacionDireccion() {
		// TODO Auto-generated constructor stub
	}

	public ContratacionDireccion(String tipovia, String via, String numero, String piso, String puerta,
			String tipovivienda, int codpostal, String provincia, String localidad, String pais) {
		super();
		this.tipoVia = tipovia;
		this.via = via;
		this.numero = numero;
		this.piso = piso;
		this.puerta = puerta;
		this.tipoVivienda = tipovivienda;
		this.codPostal = codpostal;
		this.provincia = provincia;
		this.localidad = localidad;
		this.pais = pais;
	}

	public String getTipovia() {
		return tipoVia;
	}

	public void setTipovia(String tipovia) {
		this.tipoVia = tipovia;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	public String getPuerta() {
		return puerta;
	}

	public void setPuerta(String puerta) {
		this.puerta = puerta;
	}

	public String getTipovivienda() {
		return tipoVivienda;
	}

	public void setTipovivienda(String tipovivienda) {
		this.tipoVivienda = tipovivienda;
	}

	public int getCodpostal() {
		return codPostal;
	}

	public void setCodpostal(int codpostal) {
		this.codPostal = codpostal;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
}
