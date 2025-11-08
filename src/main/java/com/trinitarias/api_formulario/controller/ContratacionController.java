package com.trinitarias.api_formulario.controller;

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

@RestController
@RequestMapping("/api/v1/contratacion")
public class ContratacionController {

	@GetMapping()
	public ResponseEntity<?> listarTodo(){
		return ResponseEntity.status(HttpStatus.OK).body(null);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> listarId(@PathVariable Long id){
		return ResponseEntity.status(HttpStatus.OK).body(null);
	}
	
	@PostMapping
	public ResponseEntity<?> crearContratacion(@RequestBody ContratacionDto contratacionDto){
		return ResponseEntity.status(HttpStatus.CREATED).body(null);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> actualizarContratacion(@PathVariable Long id, @RequestBody ContratacionDto contratacionDto){
		return ResponseEntity.status(HttpStatus.OK).body(null);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> borrarContratacion(@PathVariable Long id, @RequestBody ContratacionDto contratacionDto){
		return ResponseEntity.status(HttpStatus.OK).body(null);
	}
	
}