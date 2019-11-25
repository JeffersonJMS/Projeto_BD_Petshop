package br.cesed.unifacisa.bd2.petshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.cesed.unifacisa.bd2.petshop.beans.Animal;
import br.cesed.unifacisa.bd2.petshop.connection.Conecta;
//CONFIRMAR SE OS NOMES DOS ATRIBUTOS ESTÃO IGUAIS

public class AnimalDAO {
	
	
	public void cadastraAnimal(Animal animal) throws Exception{
		
		Connection con = Conecta.criarConexao();
		String sql = "INSERT INTO animal(";
		if(animal.getRegistro() == null || animal.getRaca() == null || animal.getTipo() == null) {
			throw new Exception("Dados invalidos");
		}
		String atributos = "registro,raca,tipo,";
		String valores =" VALUES(" + animal.getRegistro().toString() + "," + "'"+animal.getRaca().toString() +"'" +  "," + "'"+animal.getTipo().toString() +"'"+ ",";
		if(animal.getPeso() != null) {
			atributos = atributos + "peso,";
			valores = valores + animal.getPeso().toString() + ",";
		}if(animal.getAltura() != null) {
			atributos = atributos + "altura,";
			valores = valores + animal.getAltura().toString() + ",";
		}if(animal.getDtUltMed()!= null) {
			atributos = atributos + "dtultmed,";
			valores = valores + animal.getDtUltMed().toString() + ",";
		}if(animal.getPrecoVenda()!= null) {
			atributos = atributos + "precovenda,";
			valores = valores + animal.getPrecoCompra().toString() + ",";
		}if(animal.getPrecoCompra()!= null) {
			atributos = atributos + "precocompra,";
			valores = valores + animal.getPrecoCompra().toString() + ",";
		}if(animal.getDtNasc()!= null) {
			atributos = atributos + "dtnasc,";
			valores = valores + "'"+animal.getDtNasc().toString() + "'" + ",";
		}
		atributos = atributos.substring(0, atributos.length() -1);
		atributos = atributos + ")";
		valores = valores.substring(0,valores.length() - 1);
		valores = valores + ")";
		sql = sql + atributos + valores;
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.execute();
			preparador.close();
		}catch(SQLException e){
			System.out.println("Erro" + e.getMessage());
		}
	}
	
	
	public List<Animal> getTodosAnimais() throws ClassNotFoundException, SQLException{
		String sql = "SELECT * FROM animal";
		return getArrayAnimais(sql);
	}
	
	public List<Animal> getAnimaisPorTipo(String tipo) throws ClassNotFoundException, SQLException{
		String sql = "SELECT * FROM animal where tipo";
		return getArrayAnimais(sql);
	}
	
	public List<Animal> getAnimaisPorPrecoVenda(Double preco)throws ClassNotFoundException, SQLException{
		String sql = "SELECT * FROM animal where precovenda <=" + preco;
		return getArrayAnimais(sql);
	}
	
	
	private List<Animal> getArrayAnimais(String sql) throws ClassNotFoundException, SQLException{
		List<Animal> animais = new ArrayList<>();
		Connection con = Conecta.criarConexao();
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			ResultSet resultado = preparador.executeQuery();
			while(resultado.next()) {
				animais.add(gerarAnimal(resultado));
			}
			
			
		}catch(SQLException e){
			System.out.println("Erro" + e.getMessage());
			
		}
		return animais;
	}
	
	private Animal gerarAnimal(ResultSet resultado) throws SQLException {
		Animal animal = new Animal();
		animal.setRegistro(resultado.getInt("registro"));
		animal.setTipo(resultado.getString("tipo"));
		animal.setPeso(resultado.getDouble("peso"));
		animal.setAltura(resultado.getDouble("altura"));
		animal.setDtUltMed(resultado.getString("dtultmed"));
		animal.setRaca(resultado.getString("raca"));
		animal.setPrecoCompra(resultado.getDouble("precocompra"));
		animal.setPrecoVenda(resultado.getDouble("precovenda"));
		animal.setDtNasc(resultado.getString("dtnasc"));
		return animal;
	}

}
