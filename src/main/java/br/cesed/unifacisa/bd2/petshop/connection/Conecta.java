package br.cesed.unifacisa.bd2.petshop.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conecta {

	private static final String URL = "jdbc:postgresql://localhost:5432/Pet-Shop";
	private static final String USER = "postgres";
	private static final String PASS = "root";
	
	public static Connection criarConexao() throws ClassNotFoundException, SQLException{
		Class.forName("org.postgresql.Driver");
		Connection conecta = DriverManager.getConnection(URL,USER,PASS);
		
		if(conecta != null) {
			System.out.println("Conexao efetuada com sucesso");
			return conecta;
		}
		return null;
	}
}
