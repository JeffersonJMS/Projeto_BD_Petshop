package br.cesed.unifacisa.petshop.testeConnection;

import java.sql.Connection;
import java.sql.SQLException;

import br.cesed.unifacisa.petshop.connection.Conecta;

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
