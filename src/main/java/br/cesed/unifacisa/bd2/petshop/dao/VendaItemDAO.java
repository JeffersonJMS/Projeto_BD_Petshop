package br.cesed.unifacisa.bd2.petshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.cesed.unifacisa.bd2.petshop.beans.VendaItem;
import br.cesed.unifacisa.bd2.petshop.connection.Conecta;

public class VendaItemDAO {
	
	
	public void criarVendaItem(VendaItem vendaItem) throws ClassNotFoundException, SQLException {
		Connection con = Conecta.criarConexao();
		String sql = "INSERT INTO vendaitem VALUES (?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, vendaItem.getNtFiscal());
			preparador.setLong(2, vendaItem.getItemCod());
			preparador.setLong(3, vendaItem.getFuncMat()); 
			preparador.setInt(4, vendaItem.getDia());
			preparador.setInt(5, vendaItem.getMes());
			preparador.setInt(6, vendaItem.getAno());
			preparador.setDouble(7, vendaItem.getComissaoL());
			if(vendaItem.getDesconto() != null) {
				preparador.setDouble(8, vendaItem.getDesconto());
			}
			
			preparador.setDouble(9, vendaItem.getValorF());
			
			preparador.execute();
			
			
			
		}catch(SQLException e){
			System.out.println("Erro" + e.getMessage());
			
		}
	}
	
	public void atualizarNotaFiscalPorNotaFiscal(Integer ntFiscal,Integer new_ntFiscal) throws ClassNotFoundException, SQLException {
		Connection con = Conecta.criarConexao();
		String sql = "UPDATE vendaitem SET ntfiscal = ? where ntfiscal = ?";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, new_ntFiscal);
			preparador.setInt(2, ntFiscal);
			preparador.execute();
			preparador.close();
			
			
			
		}catch(SQLException e){
			System.out.println("Erro" + e.getMessage());
			
		}
	}
	public void atualizarCodItemPorNtFiscal(Integer ntFiscal,Long itemCod) throws ClassNotFoundException, SQLException {
		Connection con = Conecta.criarConexao();
		String sql = "UPDATE vendaitem SET itemcod = ? where ntfiscal = ?";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setLong(1, itemCod);
			preparador.setInt(2, ntFiscal);
			preparador.execute();
			preparador.close();
			
			
			
		}catch(SQLException e){
			System.out.println("Erro" + e.getMessage());
			
		}
	}

}
