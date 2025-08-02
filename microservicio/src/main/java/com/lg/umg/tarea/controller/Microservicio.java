package com.lg.umg.tarea.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/microservicio")
public class Microservicio {

	@GetMapping("/get")
	public String getMicroservicio() {
		return "Se  utilizo el metodo GET";
	}
	
	@PostMapping("/post")
	public String postMicroservicio() {
		return "Se  utilizo el metodo POST";
	}
	
	@PutMapping("/put")
	public String putMicroservicio() {
		return "Se  utilizo el metodo PUT";
	}
	
	@DeleteMapping("/delete")
	public String deleteMicroservicio() {
		return "Se  utilizo el metodo DELETE";
	}
}
