package com.trinitarias.api_formulario.dto;

public class ContratacionDatosPersonales {

	private String nombre;
	private String apellidos;
	private String fechaNacimiento;
	private String genero;
	private String nacionalidad;
	private String tipoIdentificacion;
	private String numIdentificacion;
	private String estadocivil;
	
	
	public ContratacionDatosPersonales() {
		// TODO Auto-generated constructor stub
	}


	public ContratacionDatosPersonales(String nombre, String apellidos, String fechaNacimiento, String genero, String nacionalidad,
			String tipoIdentificacion, String numIdentificacion, String estadocivil) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.nacionalidad = nacionalidad;
		this.tipoIdentificacion = tipoIdentificacion;
		this.numIdentificacion = numIdentificacion;
		this.estadocivil = estadocivil;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}


	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}


	public String getNumIdentificacion() {
		return numIdentificacion;
	}


	public void setNumIdentificacion(String numIdentificacion) {
		this.numIdentificacion = numIdentificacion;
	}


	public String getEstadocivil() {
		return estadocivil;
	}


	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}
	

}
