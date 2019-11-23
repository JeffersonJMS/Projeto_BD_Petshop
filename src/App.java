import java.sql.Connection;
import java.sql.SQLException;

public class App {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
			Connection con = Conecta.criarConexao();
		} catch (Exception e) {
		}
		
	}

}
