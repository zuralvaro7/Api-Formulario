package com.trinitarias.api_formulario.dto;

public class ContratacionDatosPersonales {
	//ATRIBUTOS
	private String nombre;
	private String apellidos;
	private String fechaNacimiento;
	private String genero;
	private String nacionalidad;
	private String identificacion;
	private String estadocivil;
	//CONSTRUCTOR VACIO
	public ContratacionDatosPersonales() {
	
	}
	//CONSTRUCTOR CON ATRIBUTOS
	public ContratacionDatosPersonales(String nombre, String apellidos, String fechaNacimiento, String genero, String nacionalidad,
			String identificacion, String estadocivil) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.nacionalidad = nacionalidad;
		this.identificacion = identificacion;
		this.estadocivil = estadocivil;
	}
	//GETTER Y SETTERS
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


	public String getIdentificacion() {
		return identificacion;
	}


	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}


	public String getEstadocivil() {
		return estadocivil;
	}


	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}
	
	
	
}
