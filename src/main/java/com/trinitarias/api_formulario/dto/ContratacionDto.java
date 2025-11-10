package com.trinitarias.api_formulario.dto;

public class ContratacionDto {

	private Long id;
	private static Long cont;
	private ContratacionDatosBancario datosBancarios;
	private ContratacionDatosContacto datosContacto;
	private ContratacionDatosPersonales datosPersonales;
	private ContratacionDireccion direccion;
	private ContratacionMetodoPago metodoPago;
	
	public ContratacionDto() {
		// TODO Auto-generated constructor stub
	}

	public ContratacionDto(Long id, ContratacionDatosBancario datosBancarios, ContratacionDatosContacto datosContacto,
			ContratacionDatosPersonales datosPersonales, ContratacionDireccion direccion,
			ContratacionMetodoPago metodoPago) {
		super();
		this.id = ++cont;
		this.datosBancarios = datosBancarios;
		this.datosContacto = datosContacto;
		this.datosPersonales = datosPersonales;
		this.direccion = direccion;
		this.metodoPago = metodoPago;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ContratacionDatosBancario getDatosBancarios() {
		return datosBancarios;
	}

	public void setDatosBancarios(ContratacionDatosBancario datosBancarios) {
		this.datosBancarios = datosBancarios;
	}

	public ContratacionDatosContacto getDatosContacto() {
		return datosContacto;
	}

	public void setDatosContacto(ContratacionDatosContacto datosContacto) {
		this.datosContacto = datosContacto;
	}

	public ContratacionDatosPersonales getDatosPersonales() {
		return datosPersonales;
	}

	public void setDatosPersonales(ContratacionDatosPersonales datosPersonales) {
		this.datosPersonales = datosPersonales;
	}

	public ContratacionDireccion getDireccion() {
		return direccion;
	}

	public void setDireccion(ContratacionDireccion direccion) {
		this.direccion = direccion;
	}

	public ContratacionMetodoPago getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(ContratacionMetodoPago metodoPago) {
		this.metodoPago = metodoPago;
	}
	
	
	
	
}
