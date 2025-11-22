package com.trinitarias.api_formulario.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//SE PONE ENTITY COMO EN EL SERVICE
@Entity
//SE PONE EL NOMRBE DE LA TABLA
@Table(name="datos_personales")
public class ContratacionEntityDatosPersonales {

    //SE INDICA LA CLAVE PRIMARIA
    @Id
    //LA TABLA GENERA EL ID AUTOMATICAMENTE
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    //ATRIBUTOS
    private String nombre;
    private String apellidos;
    private String fechaNacimiento;
    private String genero;
    private String nacionalidad;
    private String identificacion;
    private String estadocivil;
    //CONSTRUCTOR VACIO
    public ContratacionEntityDatosPersonales(){

    }
    //CONSTRUCTOR CON ATRIBUTOS
    public ContratacionEntityDatosPersonales(Long id, String nombre, String apellidos, String fechaNacimiento,String genero, String nacionalidad, String identificacion, String estadocivil){
        super();
        this.id=id;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.fechaNacimiento=fechaNacimiento;
        this.genero=genero;
        this.nacionalidad=nacionalidad;
        this.identificacion=identificacion;
        this.estadocivil=estadocivil;
    }
    //GETTER Y SETTERS
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
