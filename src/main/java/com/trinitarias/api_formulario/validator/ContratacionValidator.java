package com.trinitarias.api_formulario.validator;



import java.time.LocalDate;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.trinitarias.api_formulario.dto.ContratacionDto;

@Component
public class ContratacionValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		ContratacionDto cntcDto = (ContratacionDto) target;
		
		
		//DATOS PERSONALES
		if (cntcDto.getDatosPersonales().getNombre().isBlank()) {
			errors.rejectValue("datosPersonales.nombre", "i18n.nombre.obligatorio", "El campo debe ser obligatorio");
		}
		
		if (cntcDto.getDatosPersonales().getApellidos().isBlank()) {
			errors.rejectValue("datosPersonales.apellido", "i18n.apellido.obligatorio", "El campo debe ser obligatorio");
		}
		LocalDate fechahoy=LocalDate.now();
		LocalDate fechaNacimiento= LocalDate.parse(cntcDto.getDatosPersonales().getFechaNacimiento());
		
		if ( fechaNacimiento.isAfter(fechahoy.minusYears(16))) {
			
		}
		
		
		if (cntcDto.getDatosPersonales().getNacionalidad().isBlank()) {
			errors.rejectValue("datosPersonales.nacionalidad", "i18n.nacionalidad.obligatorio", "El campo debe ser obligatorio");
		}
		
		if (cntcDto.getDatosPersonales().getIdentificacion().isBlank()) {
			errors.rejectValue("datosPersonales.identificacion", "i18n.identificacion.obligatorio", "El campo debe ser obligatorio");
		} else if (cntcDto.getDatosPersonales().getIdentificacion().length()==8) {// validar bien
			errors.rejectValue("datosPersonales.identificacion", "i18n.identificacion.faltan", "El campo no es correcto");
		} else if (cntcDto.getDatosPersonales().getIdentificacion().matches("\\d{8}")) {
			// valida si tiene los 8 numeros y la letra
			errors.rejectValue("datosPersonales.identificacion", "i18n.identificacion.faltan", "Falta la letra");
		}
		
		/*if (cntcDto.getDatosPersonales().getEstadocivil()) {
			
		}*/
		
		//DAT0S CONTACTO
		
		if (cntcDto.getDatosContacto().getEmail().isBlank()) {
			errors.rejectValue("datosContacto.email", "i18n.email.obligatorio", "El campo debe ser obligatorio");
		}
		
		
		//DIRECCION
		if (cntcDto.getDireccion().getTipovia().isBlank()) {
			errors.rejectValue("direccion.tipoVia", "i18n.tipoVia.obligatorio", "El campo debe ser obligatorio");
		}
		if (cntcDto.getDireccion().getVia().isBlank()) {
			errors.rejectValue("direccion.via", "i18n.via.obligatorio", "El campo debe ser obligatorio");
		}
		if (cntcDto.getDireccion().getNumero().isBlank()) {
			errors.rejectValue("direccion.numero", "i18n.numero.obligatorio", "El campo debe ser obligatorio");
		}
		if (cntcDto.getDireccion().getTipovivienda().isBlank()) {
			errors.rejectValue("direccion.tipoVivienda", "i18n.tipoVivienda.obligatorio", "El campo debe ser obligatorio");
		}
		if (cntcDto.getDireccion().getCodpostal()==0) {
			errors.rejectValue("direccion.codPostal", "i18n.codpostal.obligatorio", "El campo debe ser obligatorio");
		}
		if (cntcDto.getDireccion().getProvincia().isBlank()) {
			errors.rejectValue("direccion.provincia", "i18n.provincia.obligatorio", "El campo debe ser obligatorio");
		}
		if (cntcDto.getDireccion().getLocalidad().isBlank()) {
			errors.rejectValue("direccion.localidad", "i18n.localidad.obligatorio", "El campo debe ser obligatorio");
		}
		if (cntcDto.getDireccion().getPais().isBlank()) {
			errors.rejectValue("direccion.pais", "i18n.pais.obligatorio", "El campo debe ser obligatorio");
		}
		
		//METODO DE PAGO
		if (cntcDto.getMetodoPago().getTipopago().isBlank()) {
			errors.rejectValue("metodoPago.tipoPago", "i18n.tipoPago.obligatorio", "El campo debe ser obligatorio");
		}
		if (cntcDto.getMetodoPago().getNombretitular().isBlank()) {
			errors.rejectValue("metodoPago.nombreTitular", "i18n.nombreTitular.obligatorio", "El campo debe ser obligatorio");
		}
		if (cntcDto.getMetodoPago().getFechaCaducidad().isBlank()) {
			errors.rejectValue("metodoPago.fechaCaducidad", "i18n.fechaCaducidad.obligatorio", "El campo debe ser obligatorio");
		}
		if (cntcDto.getMetodoPago().getCvv()==0){
			errors.rejectValue("metodoPago.cvv", "i18n.cvv.obligatorio", "El campo debe ser obligatorio");
		}
		//DATOS BANCARIOS
		if(cntcDto.getDatosBancarios().getNombrebanco().isBlank()) {
			errors.rejectValue("datosBancarios.nombreBanco", "i18n.nombreBanco.obligatorio", "El campo debe ser obligatorio");
		}
		if(cntcDto.getDatosBancarios().getIban().isBlank()) {
			errors.rejectValue("datosBancarios.iban", "i18n.iban.obligatorio", "El campo debe ser obligatorio");
		}
		if(cntcDto.getDatosBancarios().getTipocuenta().isBlank()) {
			errors.rejectValue("datosBancarios.tipoCuenta", "i18n.tipoCuenta.obligatorio", "El campo debe ser obligatorio");
		}
		if(cntcDto.getDatosBancarios().getSucursal().isBlank()) {
			errors.rejectValue("datosBancarios.sucursal", "i18n.sucursal.obligatorio", "El campo debe ser obligatorio");
		}
	}

}
