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
		return ContratacionDto.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ContratacionDto cntcDto = (ContratacionDto) target;

		// DATOS PERSONALES
		validateDatosPersonales(errors, cntcDto);

		// DATOS CONTACTO
		validateDatosContacto(errors, cntcDto);

		// DIRECCION
		validateDireccion(errors, cntcDto);

		// METODO DE PAGO
		validateMetodoPago(errors, cntcDto);

		// DATOS BANCARIOS
		validateDatosBancarios(errors, cntcDto);

	}

	private void validateDatosPersonales(Errors errors, ContratacionDto cntcDto) {
		if (cntcDto.getDatosPersonales().getNombre().isBlank()) {
			errors.rejectValue("datosPersonales.nombre", "i18n.nombre.obligatorio", "El campo debe ser obligatorio");
		}

		if (cntcDto.getDatosPersonales().getApellidos().isBlank()) {
			errors.rejectValue("datosPersonales.apellido", "i18n.apellido.obligatorio",
					"El campo debe ser obligatorio");
		}

		// Valida si es mayor de 16 años solo cuando el campo esta con información
		if (!cntcDto.getDatosPersonales().getFechaNacimiento().isBlank()) {
			LocalDate fechahoy = LocalDate.now();
			LocalDate fechaNacimiento = LocalDate.parse(cntcDto.getDatosPersonales().getFechaNacimiento());

			if (fechaNacimiento.isAfter(fechahoy.minusYears(16))) {
				errors.rejectValue("datosPersonales.fechaNacimiento", "i18n.fechaNacimiento.obligatorio",
						"La edad tiene que ser de mas de 16 años");
			}
		}

		if (cntcDto.getDatosPersonales().getNacionalidad().isBlank()) {
			errors.rejectValue("datosPersonales.nacionalidad", "i18n.nacionalidad.obligatorio",
					"El campo debe ser obligatorio");
		}

		// Valida la letra del dni
		String dni = cntcDto.getDatosPersonales().getIdentificacion();
		char letra = validarDNI(dni);

		if (cntcDto.getDatosPersonales().getIdentificacion().isBlank()) {
			errors.rejectValue("datosPersonales.identificacion", "i18n.identificacion.obligatorio",
					"El campo debe ser obligatorio");
		} else if (cntcDto.getDatosPersonales().getIdentificacion().matches("\\d{8}")) {
			// valida si tiene los 8 numeros y la letra
			errors.rejectValue("datosPersonales.identificacion", "i18n.identificacion.faltan", "Falta la letra");
		} else if (dni.charAt(8) != letra) {// validar letra del dni
			errors.rejectValue("datosPersonales.identificacion", "i18n.identificacion.faltan",
					"La letra no es correcta");
		}
	}

	private char validarDNI(String dni) {
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		char letra = 0;
		try {
			int dniIndice = Integer.parseInt(dni.substring(0, 8)) % 23;
			letra = letras.charAt(dniIndice);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return letra;
	}

	private void validateDatosContacto(Errors errors, ContratacionDto cntcDto) {
		if (cntcDto.getDatosContacto().getMovil() == 0) {
			errors.rejectValue("datosContacto.movil", "i18n.movil.obligatorio", "El campo debe ser obligatorio");
		} else if (String.valueOf(cntcDto.getDatosContacto().getMovil()).length() != 9) {
			errors.rejectValue("datosContacto.movil", "i18n.movil.obligatorio", "El campo debe tener 9 dijitos");
		}

		if (String.valueOf(cntcDto.getDatosContacto().getFijo()).length() != 9) {
			errors.rejectValue("datosContacto.fijo", "i18n.fijo.obligatorio", "El campo debe tener 9 dijitos");
		}

		if (cntcDto.getDatosContacto().getEmail().isBlank()) {
			errors.rejectValue("datosContacto.email", "i18n.email.obligatorio", "El campo debe ser obligatorio");
		}
	}

	private void validateDireccion(Errors errors, ContratacionDto cntcDto) {
		if (cntcDto.getDireccion().getTipoVia().isBlank()) {
			errors.rejectValue("direccion.tipoVia", "i18n.tipoVia.obligatorio", "El campo debe ser obligatorio");
		}
		if (cntcDto.getDireccion().getVia().isBlank()) {
			errors.rejectValue("direccion.via", "i18n.via.obligatorio", "El campo debe ser obligatorio");
		}
		if (cntcDto.getDireccion().getNumero().isBlank()) {
			errors.rejectValue("direccion.numero", "i18n.numero.obligatorio", "El campo debe ser obligatorio");
		}
		if (cntcDto.getDireccion().getTipoVivienda().isBlank()) {
			errors.rejectValue("direccion.tipoVivienda", "i18n.tipoVivienda.obligatorio",
					"El campo debe ser obligatorio");
		}
		if (String.valueOf(cntcDto.getDireccion().getCodPostal()).length() == 0) {
			errors.rejectValue("direccion.codPostal", "i18n.codpostal.obligatorio", "El campo debe ser obligatorio");
		} else if (String.valueOf(cntcDto.getDireccion().getCodPostal()).length() != 5) {
			errors.rejectValue("direccion.codPostal", "i18n.codpostal.incompleto", "El campo debe tener 5 digitos");
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
	}

	private void validateMetodoPago(Errors errors, ContratacionDto cntcDto) {
		if (cntcDto.getMetodoPago().getTipoPago().isBlank()) {
			errors.rejectValue("metodoPago.tipoPago", "i18n.tipoPago.obligatorio", "El campo debe ser obligatorio");
		}
		if (cntcDto.getMetodoPago().getNombreTitular().isBlank()) {
			errors.rejectValue("metodoPago.nombreTitular", "i18n.nombreTitular.obligatorio",
					"El campo debe ser obligatorio");
		}
		if (cntcDto.getMetodoPago().getFechaCaducidad().isBlank()) {
			errors.rejectValue("metodoPago.fechaCaducidad", "i18n.fechaCaducidad.obligatorio",
					"El campo debe ser obligatorio");
		}
		if (String.valueOf(cntcDto.getMetodoPago().getCvv()).length() == 0) {
			errors.rejectValue("metodoPago.cvv", "i18n.cvv.obligatorio", "El campo debe ser obligatorio");
		} else if (String.valueOf(cntcDto.getMetodoPago().getCvv()).length() != 3) {
			errors.rejectValue("metodoPago.cvv", "i18n.cvv.faltan", "El campo debe tener 3 digitos");
		}
	}

	private void validateDatosBancarios(Errors errors, ContratacionDto cntcDto) {
		if (cntcDto.getDatosBancarios().getNombreBanco().isBlank()) {
			errors.rejectValue("datosBancarios.nombreBanco", "i18n.nombreBanco.obligatorio",
					"El campo debe ser obligatorio");
		}
		if (cntcDto.getDatosBancarios().getIban().isBlank()) {
			errors.rejectValue("datosBancarios.iban", "i18n.iban.obligatorio", "El campo debe ser obligatorio");
		} else if (cntcDto.getDatosBancarios().getIban().length() != 20) {
			errors.rejectValue("datosBancarios.iban", "i18n.iban.incompleto", "El campo debe tener 20 digitos");
		}
		if (cntcDto.getDatosBancarios().getTipoCuenta().isBlank()) {
			errors.rejectValue("datosBancarios.tipoCuenta", "i18n.tipoCuenta.obligatorio",
					"El campo debe ser obligatorio");
		}
		if (cntcDto.getDatosBancarios().getSucursal().isBlank()) {
			errors.rejectValue("datosBancarios.sucursal", "i18n.sucursal.obligatorio", "El campo debe ser obligatorio");
		}
	}
}