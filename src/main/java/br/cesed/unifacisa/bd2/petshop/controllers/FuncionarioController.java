package br.cesed.unifacisa.bd2.petshop.controllers;

import java.sql.SQLException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cesed.unifacisa.bd2.petshop.beans.Animal;
import br.cesed.unifacisa.bd2.petshop.beans.Funcionario;
import br.cesed.unifacisa.bd2.petshop.dao.AnimalDAO;
import br.cesed.unifacisa.bd2.petshop.dao.FuncionarioDAO;

@RestController
@RequestMapping("funcionario")
public class FuncionarioController {
	

	@PostMapping()
	public ResponseEntity<Funcionario> createFuncionario(@RequestBody Funcionario funcionario) throws ClassNotFoundException, SQLException{
		FuncionarioDAO dao = new FuncionarioDAO();
		dao.criarFuncionario(funcionario);
		return new ResponseEntity<>(funcionario,HttpStatus.CREATED);
	}
	
	

}
