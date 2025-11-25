package com.trinitarias.api_formulario.validator;

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
		
		if (cntcDto.getDatosPersonales().getNombre().isBlank()) {
			errors.rejectValue("datosPersonales.nombre", "i18n.nombre.obligatorio", "El campo debe es obligatorio");
		}
	}

}
