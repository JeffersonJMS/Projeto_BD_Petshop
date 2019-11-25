package br.cesed.unifacisa.bd2.petshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	
	public Funcionario getFuncionarioPorNome(String nome) throws ClassNotFoundException, SQLException{
		Funcionario funcionario = new Funcionario();
		Connection con = Conecta.criarConexao();
		String sql = "SELECT * FROM funcionario where nome = " + nome;
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			ResultSet resultado = preparador.executeQuery();
			funcionario = gerarFuncionario(resultado);
			
		}catch(SQLException e){
			System.out.println("Erro" + e.getMessage());
			
		}
		return funcionario;
	}
	
	
	
	public List<Funcionario> getFuncionario() throws ClassNotFoundException, SQLException{
		List<Funcionario> funcionarios = new ArrayList<>();
		Connection con = Conecta.criarConexao();
		String sql = "SELECT * FROM funcionario";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			ResultSet resultado = preparador.executeQuery();
			while(resultado.next()) {
				funcionarios.add(gerarFuncionario(resultado));
			}
			
			
		}catch(SQLException e){
			System.out.println("Erro" + e.getMessage());
			
		}
		return funcionarios;
	}
	
	
	
	
	private Funcionario gerarFuncionario(ResultSet resultado) throws SQLException {
		Funcionario funcionario = new Funcionario();
		funcionario.setMatricula(resultado.getInt("matricula"));
		funcionario.setNome(resultado.getString("nome"));
		funcionario.setEndereco(resultado.getString("endereco"));
		funcionario.setTelefone(resultado.getString("telefone"));
		funcionario.setSalario(resultado.getDouble("salario"));
		funcionario.setDtNasc(resultado.getString("dtnasc"));
		funcionario.setDtAdm(resultado.getString("dtadm"));
		funcionario.setFuncao(resultado.getString("funcao"));
		funcionario.setDtDemi(resultado.getString("dtdemi"));
		return funcionario;
	}

}
