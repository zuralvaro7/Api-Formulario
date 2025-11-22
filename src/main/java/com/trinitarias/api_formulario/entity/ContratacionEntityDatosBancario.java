package com.trinitarias.api_formulario.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity //poner @entity como el @service e importar
@Table(name="datos_bancarios") //ponerle nombre a la tabla en la base de datos (preguntar)
public class ContratacionEntityDatosBancario {

	@Id //indicar que esta es la clave primaria 
	//HACE QUE LA BASE DE DATOS GENERE AUTOMATICAMENTE EL ID
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//atributos
	@Column(name="nombre_banco") //indicando que es una columna el nombre que tendra esa columna 
	private String nombreBanco;
	
	@Column(name="iban")
	private String iban;
	
	@Column(name="bic")
	private String bic;
	
	@Column(name="tipo_cuenta")
	private String tipoCuenta;
	
	@Column(name="sucursal")
	private String sucursal;
	//CONSTRUCTOR
	public ContratacionEntityDatosBancario() {
		// TODO Auto-generated constructor stub
	}
	//CONSTRUCTOR
	public ContratacionEntityDatosBancario(Long id, String nombreBanco, String iban, String bic, String tipoCuenta,
			String sucursal) {
		super();
		this.id = id;
		this.nombreBanco = nombreBanco;
		this.iban = iban;
		this.bic = bic;
		this.tipoCuenta = tipoCuenta;
		this.sucursal = sucursal;
	}
	//GETTER Y SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
