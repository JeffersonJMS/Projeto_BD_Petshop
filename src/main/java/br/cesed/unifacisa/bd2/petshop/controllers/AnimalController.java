package br.cesed.unifacisa.bd2.petshop.controllers;

import java.sql.SQLException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.cesed.unifacisa.bd2.petshop.beans.Animal;
import br.cesed.unifacisa.bd2.petshop.dao.AnimalDAO;

@RestController
@RequestMapping("animal")
public class AnimalController {
	
	@GetMapping
	public ResponseEntity<String> getAnimais(){
		return new ResponseEntity<>("Robson",HttpStatus.OK);
	}
	
	
	@PostMapping()
	public ResponseEntity<Animal> createAnimal(@RequestBody Animal animal) throws ClassNotFoundException, SQLException{
		AnimalDAO dao = new AnimalDAO();
		dao.cadastraAnimal(animal);
		return new ResponseEntity<Animal>(animal,HttpStatus.CREATED);
	}

}
