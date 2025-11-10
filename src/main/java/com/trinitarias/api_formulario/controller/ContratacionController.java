package com.trinitarias.api_formulario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

@RestController
@RequestMapping("/api/v1/contratacion")
public class ContratacionController {
	
	@Autowired
	ContratacionService service;
	
	@GetMapping()
	public ResponseEntity<?> listarTodo(){
		ContratacionDto c=service.obtener();
		return ResponseEntity.status(HttpStatus.OK).body(c);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> listarId(@PathVariable Long id){
		ContratacionDto c=service.verId(id);
		if(true) {
			return ResponseEntity.status(HttpStatus.OK).body(c);			
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	}
	
	@PostMapping
	public ResponseEntity<?> crearContratacion(@RequestBody ContratacionDto contratacionDto){
		ContratacionDto c;
		if(true) {
			return ResponseEntity.status(HttpStatus.CREATED).body(c);
		} else {
			return ResponseEntity.status(HttpStatus.CREATED).body(c);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> actualizarContratacion(@PathVariable Long id, @RequestBody ContratacionDto contratacionDto){
		ContratacionDto c;
		if(true) {
			return ResponseEntity.status(HttpStatus.OK).body(c);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(c);
		}
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> borrarContratacion(@PathVariable Long id, @RequestBody ContratacionDto contratacionDto){
		ContratacionDto c;
		if(true) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(c);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	}
	
}