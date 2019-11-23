package br.cesed.unifacisa.petshop;

import java.sql.Connection;
import java.sql.SQLException;

public class Teste {

	public static void main(String[] args) {
		try {
			Connection con = Conecta.criarConexao();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		}catch (SQLException e) {
			// TODO: handle exception
		}
	}

}
