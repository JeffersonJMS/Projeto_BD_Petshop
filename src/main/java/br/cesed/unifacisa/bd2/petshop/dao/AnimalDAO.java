package br.cesed.unifacisa.bd2.petshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.cesed.unifacisa.bd2.petshop.beans.Animal;
import br.cesed.unifacisa.bd2.petshop.connection.Conecta;

public class AnimalDAO {
	
	
	public void cadastraAnimal(Animal animal) throws SQLException, ClassNotFoundException{
		Connection con = Conecta.criarConexao();
		String sql = "INSERT INTO animal(";
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
			atributos = atributos + "dtanasc,";
			valores = valores + "'"+animal.getDtNasc().toString() + "'" + ",";
		}
		atributos = atributos.substring(0, atributos.length() -1);
		atributos = atributos + ")";
		//REMOVER ULTIMA VIRGULA
		valores = valores.substring(0,valores.length() - 1);
		valores = valores + ")";
		sql = sql + atributos + valores;
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.execute();
			
			
			
		}catch(SQLException e){
			System.out.println("Erro" + e.getMessage());
			
		}
	}

}
