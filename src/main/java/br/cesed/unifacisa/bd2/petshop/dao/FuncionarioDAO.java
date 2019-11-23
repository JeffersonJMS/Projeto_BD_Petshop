package br.cesed.unifacisa.bd2.petshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.cesed.unifacisa.bd2.petshop.beans.Funcionario;
import br.cesed.unifacisa.bd2.petshop.connection.Conecta;

public class FuncionarioDAO {
	
	public void criarFuncionario(Funcionario funcionario) throws ClassNotFoundException, SQLException {
		Connection con = Conecta.criarConexao();
		String sql = "INSERT INTO funcionario(matricula,"
				+ "nome,endereco,telefone,salario,dtnasc,dtadm,funcao,dtdemi)"
				+ "VALUES  (?,?,?,?,?,?,?,?,?)";
		if(funcionario.getSalario() == null) {
			sql = "INSERT INTO funcionario(matricula,"
					+ "nome,endereco,telefone,dtnasc,dtadm,funcao+dtdemi)"
					+ "VALUES  (?,?,?,?,?,?,?,?)";
		}else if (funcionario.getTelefone() == null) {
		sql = "INSERT INTO funcionario(matricula,"
				+ "nome,endereco,salario,dtnasc,dtadm,funcao,dtdemi)"
				+ "VALUES  (?,?,?,?,?,?,?,?)";
		}
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			if(funcionario.getSalario() == null) {
				
			}else if(funcionario.getTelefone() == null) {
				
			}
			//LOGICA DE SETAR OS ATRIBUTOS
			preparador.execute();
			
			
			
		}catch(SQLException e){
			System.out.println("Erro" + e.getMessage());
			
		}
	}

}
