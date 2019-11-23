package br.cesed.unifacisa.bd2.petshop.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("animal")
public class AnimalController {
	
	@GetMapping
	public ResponseEntity<String> getAnimais(){
		return new ResponseEntity<>("Robson",HttpStatus.OK);
	}

}
