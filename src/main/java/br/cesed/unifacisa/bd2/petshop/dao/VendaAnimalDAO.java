package br.cesed.unifacisa.bd2.petshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.cesed.unifacisa.bd2.petshop.beans.VendaAnimal;
import br.cesed.unifacisa.bd2.petshop.connection.Conecta;

public class VendaAnimalDAO {

    public List<VendaAnimal> getTodasVendasAnimal() throws ClassNotFoundException, SQLException{
		String sql = "SELECT * FROM vendaAnimal";
		return getArrayItems(sql);
	}
	
	public List<VendaAnimal> getVendaAnimalPorTipo(String tipo) throws ClassNotFoundException, SQLException{
		String sql = "SELECT * FROM vendaAnimal,animal where vendaAnimal.regAnimal = animal.registro AND animal.tipo = "+ tipo ;
		return getArrayItems(sql);
    }
    
    public List<VendaAnimal> getVendaAnimalPorVendedor(String vendedor) throws ClassNotFoundException, SQLException{
		String sql = "SELECT * FROM vendaAnimal, funcionario where tipo = vendaAnimal.matFunc = funcionario.matricula and funcionario.nome ="+vendedor;
		return getArrayItems(sql);
	}
	
	public List<VendaAnimal> getVendaAnimalPorData(int mes, int ano, String tipo)throws ClassNotFoundException, SQLException{
		String sql = "SELECT * FROM vendaAnimal, animal where vendaAnimal.regAnimal = animal.registro and animal.tipo = "+tipo+" and vendaAnimal.mes = "+mes+" and vendaAnimal.ano = "+ano;
		return getArrayItems(sql);
    }

    public List<VendaAnimal> getVendaPorVendedorTipo(long matricula, String tipo)throws ClassNotFoundException, SQLException{
		String sql = "SELECT * FROM vendaAnimal, funcionario, animal where vendaAnimal.matFunc = "+matricula+" animal.tipo = "+tipo+" and funcionario.matricula = "+ matricula;
		return getArrayItems(sql);
    }
	
	private List<VendaAnimal> getArrayItems(String sql) throws ClassNotFoundException, SQLException{
		List<VendaAnimal> vendaAnimal = new ArrayList<>();
		Connection con = Conecta.criarConexao();
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			ResultSet resultado = preparador.executeQuery();
			while(resultado.next()) {
				vendaAnimal.add(gerarVendaAnimal(resultado));
			}
			
			
		}catch(SQLException e){
			System.out.println("Erro" + e.getMessage());
			
		}
		return vendaAnimal;
	}
	
	private VendaAnimal gerarVendaAnimal(ResultSet resultado) throws SQLException {
		VendaAnimal vendaAnimal = new VendaAnimal();
        
        vendaAnimal.setNotaFiscal(resultado.getInt("notaFiscal"));
        vendaAnimal.setRegAnimal(resultado.getString("regAnimal"));
        vendaAnimal.setMatFunc(resultado.getLong("matFunc"));
        vendaAnimal.setDia(resultado.getInt("dia"));
        vendaAnimal.setMes(resultado.getInt("mes"));
        vendaAnimal.setAno(resultado.getInt("ano"));
        vendaAnimal.setComissaoA(resultado.getDouble("comissaoA"));
        vendaAnimal.setDesconto(resultado.getDouble("desconto"));
        vendaAnimal.setValorFinal(resultado.getDouble("valorFinal"));

		return vendaAnimal;
	}

}
