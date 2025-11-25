package com.trinitarias.api_formulario.entity;

public class ContratacionEntity {
	//Se indica el entity
	@Entity
	//SE PONE EL NOMBRE DE LA TABLA
	@Table(name="metodoPago")
	//lo mismo que el dto pero siendo simulado para base de datos
	//SE PONE ENTITY COMO EL SERVICE
	//Datos Bancarios
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
	}
	//DATOS CONTACTO
	//Atributos
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
		//CONSTRUCTOR VACIO
	public ContratacionEntityDatosContacto() {
			
	}
		//CONSTRUCTOR CON ATRIBUTOS
	public ContratacionEntityDatosContacto(long id, long movil, long fijo, String email, String linkedin, String twitter, String web) {
			super();
			//PREGUNTAR PORQUE ES AUTONUMERICO
			this.id=id;
			this.movil=movil;
			this.fijo=fijo;
			this.email=email;
			this.linkedin=linkedin;
			this.twitter=twitter;
			this.web=web;
	}
		//DATOS PERSONALES
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
	//Direccion
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
	//Metodo pago
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
}
