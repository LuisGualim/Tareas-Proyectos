package com.lg.umg.tarea.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class Microservicio {

	@GetMapping
	public ResponseEntity<String> get() {
		return ResponseEntity.ok ("Se  utilizo el metodo GET");
	}
	
	@PostMapping
	public ResponseEntity<String> post() {
		return ResponseEntity.ok ("Se  utilizo el metodo POST");
	}
	
	@PutMapping
	public ResponseEntity<String> put() {
		return ResponseEntity.ok ("Se  utilizo el metodo PUT");
	}
	
	@DeleteMapping
	public ResponseEntity<String> delete() {
		return ResponseEntity.ok ("Se  utilizo el metodo DELETE");
	}
}
