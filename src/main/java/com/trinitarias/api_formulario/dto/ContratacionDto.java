package com.trinitarias.api_formulario.dto;

	//CONTIENE TODOS LOS DTOS
public class ContratacionDto {
	//ATRIBUTOS (OBJETOS REFERENCIA A LOS OTROS DTO)
	private Long id;
	private static Long cont;
	private ContratacionDatosBancario datosBancarios;
	private ContratacionDatosContacto datosContacto;
	private ContratacionDatosPersonales datosPersonales;
	private ContratacionDireccion direccion;
	private ContratacionMetodoPago metodoPago;
	//CONSTRUCTOR VACIO
	public ContratacionDto() {
		
	}
	//CONSTRUCTOR CON ATRIBUTOS
	public ContratacionDto(ContratacionDatosBancario datosBancarios, ContratacionDatosContacto datosContacto,
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
	//GETTER Y SETTERS
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
