package br.cesed.unifacisa.bd2.petshop.testConnection;

import java.sql.Connection;
import java.sql.SQLException;

import br.cesed.unifacisa.bd2.petshop.connection.Conecta;

public class Teste {

	public static void main(String[] args) {
		
		try {
			Connection con = Conecta.criarConexao();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
