package com.trinitarias.api_formulario.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	//HAY QUE PONER EL @ENTITY COMO CONTROLLER Y SERVICE
	@Entity
	//TABLA DE LA BBDD A LA QUE VAN LOS DATOS (en minuscula)
	@Table(name="datos_contacto")
public class ContratacionEntityDatosContacto {
		//INDICA LA CLAVE PRIMARIA
		@Id
		//HACE QUE LA TABLA DE DATOS GENERE AUTOMATICAMENTE EL ID
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
		//ATRIBUTOS
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
		//GETTERS Y SETTERS
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public long getMovil() {
			return movil;
		}
		public void setMovil(long movil) {
			this.movil = movil;
		}
		public long getFijo() {
			return fijo;
		}
		public void setFijo(long fijo) {
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
}
