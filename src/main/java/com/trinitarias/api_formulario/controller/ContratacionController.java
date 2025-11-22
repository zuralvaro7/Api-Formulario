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
//SE PONE REST CONTROLLER PARA IDENTIFICARLO COMO CONTROLER
@RestController
//RUTA PARA ACCEDER AL CONTROLLER
@RequestMapping("/api/v1/contratacion")
public class ContratacionController {
	//LINKEA CON EL SERVICE
	@Autowired
	ContratacionService service;
	//VER TODOS LOS DTO
	@GetMapping()
	//TIPO RESPONSEENTITY PORQUE VA A DEVOLVER UN OBJETO DE ESTE TIPO
	public ResponseEntity<?> listarTodo(){
		//ACCEDE AL METODO OBTENER DEL SERVICE
		ContratacionDto c=service.obtener();
		//DEVUELVE OK Y EL CUERPO
		return ResponseEntity.status(HttpStatus.OK).body(c);
		
	}
	//MUESTRA UN OBJETO SEGUN SU ID
	@GetMapping("/{id}")
	//DEVUELVE UN RESPONSEENTITY SEGUN EL ID
	public ResponseEntity<?> listarId(@PathVariable Long id){
		//ACCEDE AL METODO DEL SERVICE Y LE PASA EL ID
		ContratacionDto c=service.verId(id);
		//SI NO ES NULL
		if(c!=null) {
			//DEVUELVE OK Y EL CUERPO
			return ResponseEntity.status(HttpStatus.OK).body(c);			
		} else {
			//SI ES NULL DEVUELVE NOT_FOUND Y UN CUERPO NULL
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	}
	//SUBE UN OBEJTO CON SUS DATOS EN EL BODY
	@PostMapping
	//DEVUELVE UN RESPONSEENTITY
	public ResponseEntity<?> crearContratacion(@RequestBody ContratacionDto contratacionDto){
		//ACCEDE AL METODO CREAR DEL SERVICE Y LE PASA POR EL BODY LOS DATOS DEL OBJETO
		ContratacionDto c=service.crear(contratacionDto);
		if(c) {
			//DEVUELVE CREATED Y EL CUERPO DEL C
			return ResponseEntity.status(HttpStatus.CREATED).body(c);
		} else {
			return ResponseEntity.status(HttpStatus.CREATED).body(c);
		}
	}
	//ACTUALIZA EL OBJETO SEGUN EL ID
	@PutMapping("/{id}")
	//DEVUELVE UN RESPONSEENTITY
	public ResponseEntity<?> actualizarContratacion(@PathVariable Long id, @RequestBody ContratacionDto contratacionDto){
		//ACCEDE A TRAVES DEL METODO ACTUALIZAR DEL SERVICED Y LE PASA EL ID POR LA RUTA Y LOS DATOS DEL OBJETO POR EL BODY 
		ContratacionDto c=service.actualizar(id, contratacionDto);
		//SI SE HACE CORRECTAMENTE DEVUELVE OK Y EL CUERPO DEL OBJETO
		if(c) {
			return ResponseEntity.status(HttpStatus.OK).body(c);
			//SINO DEVUELVE NOT_FOUND Y EL CUERPO DEL OBJETO
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(c);
		}
		
	}
	//BORRAR OBJETO SEGUN ID
	@DeleteMapping("/{id}")
	//DEVUELVE UN RESPONSEENTITY Y MANDA EL ID POR LA RUTA
	public ResponseEntity<?> borrarContratacion(@PathVariable Long id){
		//ACCEDE AL METODO BORRAR DEL SERVICE Y LE MANDA EL ID
		boolean c=service.borrar(id);
		//SI ES CORRECTO DEVUELVE NO_CONTENT Y UN CUERPO NULL
		if(c) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		} else {
			//SINO DEVUELVE UN NOT_FOUND Y EL CUERPO NULL
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	}
	
}