package com.trinitarias.api_formulario.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//SE PONE ENTITY COMO EL SERVICE
@Entity
//SE PONE EL NOMBRE DE LA TABLA
@Table(name="metodoPago")
public class ContratacionEntityMetodoPago {
	//ID CLAVE PRIMARIA
	@Id
	//ID GENERADO AUTOMATICAMENTE
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	//ATRIBUTOS
	private String tipoPago;
	private String nombreTitular;
	private String fechaCaducidad;
	private int cvv;
	//CONSTRUCTOR VACIO
	public ContratacionEntityMetodoPago() {
		
	}
	//CONSTRUCTOR CON ATRIBUTOS
	public ContratacionEntityMetodoPago(Long id, String tipoPago, String nombreTitular, String fechaCaducidad, int cvv) {
		super();
		this.id=id;
		this.tipoPago=tipoPago;
		this.nombreTitular=nombreTitular;
		this.fechaCaducidad=fechaCaducidad;
		this.cvv=cvv;
	}
	//GETTER Y SETTERS
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipoPago() {
		return tipoPago;
	}
	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}
	public String getNombreTitular() {
		return nombreTitular;
	}
	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
}
