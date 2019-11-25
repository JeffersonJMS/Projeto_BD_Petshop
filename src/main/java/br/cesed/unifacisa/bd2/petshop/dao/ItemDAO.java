package br.cesed.unifacisa.bd2.petshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.cesed.unifacisa.bd2.petshop.beans.Item;
import br.cesed.unifacisa.bd2.petshop.connection.Conecta;

public class ItemDAO {

    public List<Item> getTodosItems() throws ClassNotFoundException, SQLException{
		String sql = "SELECT * FROM item";
		return getArrayItems(sql);
	}
	
	public List<Item> getItemsPorDescricao(String descricao) throws ClassNotFoundException, SQLException{
		String sql = "SELECT * FROM item where descricao =" + descricao;
		return getArrayItems(sql);
    }
    
    public List<Item> getItemsPorTipo(String tipo) throws ClassNotFoundException, SQLException{
		String sql = "SELECT * FROM item where tipo ="+tipo;
		return getArrayItems(sql);
	}
	
	public List<Item> getTotalItemsPorTipo(String tipo)throws ClassNotFoundException, SQLException{
		String sql = "SELECT SUM(*), tipo, quantidade FROM item ";
		return getArrayItems(sql);
    }
    
    public List<Item> getLucroItem(String tipo)throws ClassNotFoundException, SQLException{
		String sql = "SELECT (precoLoja-precoFornecedor) FROM item";
		return getArrayItems(sql);
    }
	
	
	private List<Item> getArrayItems(String sql) throws ClassNotFoundException, SQLException{
		List<Item> items = new ArrayList<>();
		Connection con = Conecta.criarConexao();
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			ResultSet resultado = preparador.executeQuery();
			while(resultado.next()) {
				items.add(gerarItem(resultado));
			}
			
			
		}catch(SQLException e){
			System.out.println("Erro" + e.getMessage());
			
		}
		return items;
	}
	
	private Item gerarItem(ResultSet resultado) throws SQLException {
		Item item = new Item();
        
        item.setCodigo(resultado.getInt("codigo"));
        item.setDescricao(resultado.getString("descricao"));
        item.setTipo(resultado.getString("tipo"));
        item.setPrecoFornecedor(resultado.getDouble("precoFornecedor"));
        item.setPrecoLoja(resultado.getDouble("precoloja"));
        item.setValidade(resultado.getString("validade"));
        item.setQuantidade(resultado.getInt("quantidade"));

		return item;
	}

}
