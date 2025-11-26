package com.trinitarias.api_formulario.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="metodoPago")
public class ContratacionEntity {

	//ID AUTOGENERADO
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;

	//DATOS BANCARIOS
	@Column(name="nombre_banco")
	private String nombreBanco;

	@Column(name="iban")
	private String iban;

	@Column(name="bic")
	private String bic;

	@Column(name="tipo_cuenta")
	private String tipoCuenta;

	@Column(name="sucursal")
	private String sucursal;

	//DATOS CONTACTO
	@Column(name="movil")
	private long movil;

	@Column(name="fijo")
	private long fijo;

	@Column(name="email")
	private String email;

	@Column(name="linkedin")
	private String linkedin;

	@Column(name="twitter")
	private String twitter;

	@Column(name="web")
	private String web;

	//DATOS PERSONALES
	@Column(name="nombre")
	private String nombre;

	@Column(name="apellidos")
	private String apellidos;

	@Column(name="fechaNacimiento")
	private String fechaNacimiento;

	@Column(name="genero")
	private String genero;

	@Column(name="nacionalidad")
	private String nacionalidad;

	@Column(name="identificacion")
	private String identificacion;

	@Column(name="estadocivil")
	private String estadocivil;

	//DIRECCION
	@Column(name="tipoVia")
	private String tipoVia;

	@Column(name="via")
	private String via;

	@Column(name="numero")
	private String numero;

	@Column(name="piso")
	private String piso;

	@Column(name="puerta")
	private String puerta;

	@Column(name="tipoVivienda")
	private String tipoVivienda;

	@Column(name="codPostal")
	private int codPostal;

	@Column(name="provincia")
	private String provincia;

	@Column(name="localidad")
	private String localidad;

	@Column(name="pais")
	private String pais;

	//METODO PAGO
	@Column(name="tipoPago")
	private String tipoPago;

	@Column(name="nombreTitular")
	private String nombreTitular;

	@Column(name="fechaCaducidad")
	private String fechaCaducidad;

	@Column(name="cvv")
	private int cvv;

	//CONSTRUCTOR VACIO
	public ContratacionEntity() {}

	//CONSTRUCTOR CON ATRIBUTOS
	public ContratacionEntity(String nombreBanco, String iban, String bic, String tipoCuenta, String sucursal,
			long movil, long fijo, String email, String linkedin, String twitter, String web, String nombre,
			String apellidos, String fechaNacimiento, String genero, String nacionalidad, String identificacion,
			String estadocivil, String tipoVia, String via, String numero, String piso, String puerta,
			String tipoVivienda, int codPostal, String provincia, String localidad, String pais, String tipoPago,
			String nombreTitular, String fechaCaducidad, int cvv) {
		
		this.nombreBanco = nombreBanco;
		this.iban = iban;
		this.bic = bic;
		this.tipoCuenta = tipoCuenta;
		this.sucursal = sucursal;
		this.movil = movil;
		this.fijo = fijo;
		this.email = email;
        this.linkedin = linkedin;
        this.twitter = twitter;
        this.web = web;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
        this.identificacion = identificacion;
        this.estadocivil = estadocivil;
        this.tipoVia = tipoVia;
        this.via = via;
        this.numero = numero;
        this.piso = piso;
        this.puerta = puerta;
        this.tipoVivienda = tipoVivienda;
        this.codPostal = codPostal;
        this.provincia = provincia;
        this.localidad = localidad;
        this.pais = pais;
        this.tipoPago = tipoPago;
        this.nombreTitular = nombreTitular;
        this.fechaCaducidad = fechaCaducidad;
        this.cvv = cvv;
	}
}