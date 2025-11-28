package com.trinitarias.api_formulario.entity;

import com.trinitarias.api_formulario.dto.ContratacionDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="contrataciones")
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
	private String movil;

	@Column(name="fijo")
	private String fijo;

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

	@Column(name="tipoIdentificacion")
	private String tipoIdentificacion;
	
	@Column(name="numeroIdentificacion")
	private String numeroIdentificacion;

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
	private String codPostal;

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
	private String cvv;

	//CONSTRUCTOR VACIO
	public ContratacionEntity() {}

	//CONSTRUCTOR CON ATRIBUTOS
	public ContratacionEntity(Long id, String nombreBanco, String iban, String bic, String tipoCuenta, String sucursal,
			String movil, String fijo, String email, String linkedin, String twitter, String web, String nombre,
			String apellidos, String fechaNacimiento, String genero, String nacionalidad, String tipoIdentificacion,
			String numeroIdentificacion, String estadocivil, String tipoVia, String via, String numero, String piso,
			String puerta, String tipoVivienda, String codPostal, String provincia, String localidad, String pais,
			String tipoPago, String nombreTitular, String fechaCaducidad, String cvv) {
		super();
		this.id = id;
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
		this.tipoIdentificacion = tipoIdentificacion;
		this.numeroIdentificacion = numeroIdentificacion;
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

	public String getMovil() {
		return movil;
	}

	public void setMovil(String movil) {
		this.movil = movil;
	}

	public String getFijo() {
		return fijo;
	}

	public void setFijo(String fijo) {
		this.fijo = fijo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
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

	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public String getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
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

	public String getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(String codPostal) {
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

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public static ContratacionEntity transformFromDtoToEntity(ContratacionDto dto) {
    	ContratacionEntity entity = new ContratacionEntity();
    	// DATOS PERSONALES
		entity.setNombre(dto.getDatosPersonales().getNombre());
		entity.setApellidos(dto.getDatosPersonales().getApellidos());
		entity.setFechaNacimiento(dto.getDatosPersonales().getFechaNacimiento());
		entity.setGenero(dto.getDatosPersonales().getGenero());
		entity.setNacionalidad(dto.getDatosPersonales().getNacionalidad());
		entity.setNumeroIdentificacion(dto.getDatosPersonales().getNumIdentificacion());
		entity.setEstadocivil(dto.getDatosPersonales().getEstadocivil());
		
		// DATOS CONTACTO
		entity.setMovil(dto.getDatosContacto().getMovil());
		entity.setFijo(dto.getDatosContacto().getFijo());
		entity.setEmail(dto.getDatosContacto().getEmail());
		entity.setLinkedin(dto.getDatosContacto().getLinkedin());
		entity.setTwitter(dto.getDatosContacto().getTwitter());
		entity.setWeb(dto.getDatosContacto().getWeb());
		
		// DIRECCION
		entity.setTipoVia(dto.getDireccion().getTipoVia());
		entity.setVia(dto.getDireccion().getVia());
		entity.setNumero(dto.getDireccion().getNumero());
		entity.setPiso(dto.getDireccion().getPiso());
		entity.setPuerta(dto.getDireccion().getPuerta());
		entity.setTipoVivienda(dto.getDireccion().getTipoVivienda());
		entity.setCodPostal(dto.getDireccion().getCodPostal());
		entity.setProvincia(dto.getDireccion().getProvincia());
		entity.setLocalidad(dto.getDireccion().getLocalidad());
		entity.setPais(dto.getDireccion().getPais());

		// METODO DE PAGO
		entity.setTipoPago(dto.getMetodoPago().getTipoPago());
		entity.setNombreTitular(dto.getMetodoPago().getNombreTitular());
    	entity.setFechaCaducidad(dto.getMetodoPago().getFechaCaducidad());
    	entity.setCvv(dto.getMetodoPago().getCvv());
		
		
		// DATOS BANCARIOS
		entity.setNombreBanco(dto.getDatosBancarios().getNombreBanco());
		entity.setIban(dto.getDatosBancarios().getIban());
		entity.setBic(dto.getDatosBancarios().getBic());
		entity.setTipoCuenta(dto.getDatosBancarios().getTipoCuenta());
		entity.setSucursal(dto.getDatosBancarios().getSucursal());
    	
    	return entity;
    }
}