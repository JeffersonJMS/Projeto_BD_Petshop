package br.cesed.unifacisa.petshop;

import java.sql.Connection;
import java.sql.SQLException;

public class App {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
			Connection con = Conecta.criarConexao();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
