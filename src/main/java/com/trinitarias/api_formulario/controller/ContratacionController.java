package com.trinitarias.api_formulario.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trinitarias.api_formulario.dto.ContratacionDto;
import com.trinitarias.api_formulario.service.ContratacionService;
import com.trinitarias.api_formulario.validator.ContratacionValidator;

@RestController
@RequestMapping("/api/v1/contratacion")
public class ContratacionController {

	@Autowired
	ContratacionService service;

	@Autowired
	ContratacionValidator validator;

	@GetMapping()
	public ResponseEntity<ArrayList<ContratacionDto>> listarTodo() {
		ArrayList<ContratacionDto> c = service.obtener();
		return ResponseEntity.status(HttpStatus.OK).body(c);

	}

	@GetMapping("/{id}")
	public ResponseEntity<?> listarId(@PathVariable Long id) {
		ContratacionDto c = service.verId(id);
		if (c != null) {
			return ResponseEntity.status(HttpStatus.OK).body(c);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	}

	@PostMapping
	public ResponseEntity<?> crearContratacion(@RequestBody ContratacionDto contratacionDto, Errors errors) {
		validator.validate(contratacionDto, errors);

		if (errors.hasErrors()) {
			//Se ha solucionado el retorno la solucion era poner el metodo
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors.getAllErrors());
		}
		ContratacionDto c = service.crear(contratacionDto);
		if (c != null) {
			return ResponseEntity.status(HttpStatus.CREATED).body(c);
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(c);
		}
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> actualizarContratacion(@PathVariable Long id,
			@RequestBody ContratacionDto contratacionDto) {
		ContratacionDto c = service.actualizar(id, contratacionDto);
		if (c != null) {
			return ResponseEntity.status(HttpStatus.OK).body(c);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(c);
		}

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> borrarContratacion(@PathVariable Long id) {
		boolean c = service.borrar(id);
		if (c) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	}

}