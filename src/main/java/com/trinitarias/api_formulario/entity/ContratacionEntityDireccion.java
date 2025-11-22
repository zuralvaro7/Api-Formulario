package com.trinitarias.api_formulario.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//SE PONE EL ENTITY COMO EL SERVICE
@Entity
//SE PONE EL NOMBRE DE LA TABLA
@Table (name="direccion")
public class ContratacionEntityDireccion {
	//ID CLAVE PRIMARIA
	@Id
	//ID AUTOMATICO
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	//ATRIBUTOS
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
	//CONSTRUCTOR VACIO
	public ContratacionEntityDireccion() {
		
	}
	//CONSTRUCTOR CON ATRIBUTOS
	public ContratacionEntityDireccion(Long id, String tipoVia, String via, String numero, String piso, String puerta, String tipoVivienda, int codPostal, String provincia, String localidad, String pais) {
		super();
		this.id=id;
		this.tipoVia=tipoVia;
		this.via=via;
		this.numero=numero;
		this.piso=piso;
		this.puerta=puerta;
		this.tipoVivienda=tipoVivienda;
		this.codPostal=codPostal;
		this.provincia=provincia;
		this.localidad=localidad;
		this.pais=pais;
	}
	//GETTER Y SETTERS
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipoVia() {
		return tipoVia;
	}
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
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
	public String getTipoVivienda() {
		return tipoVivienda;
	}
	public void setTipoVivienda(String tipoVivienda) {
		this.tipoVivienda = tipoVivienda;
	}
	public int getCodPostal() {
		return codPostal;
	}
	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
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
