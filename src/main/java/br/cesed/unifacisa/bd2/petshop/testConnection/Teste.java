package br.cesed.unifacisa.bd2.petshop.testConnection;

import br.cesed.unifacisa.bd2.petshop.beans.Animal;

public class Teste {
	public static void main(String[] args) throws Exception {
		
		Animal animal = new Animal();
		animal.setRegistro(3); //OBRIGATORIO
		animal.setRaca("arthur"); //OBRIGATORIO
		animal.setDtNasc("03/03/1999");
		animal.setTipo("ROBSON"); //OBRIGATORIO
		animal.setPrecoCompra(600D);
		
		String sql = "INSERT INTO animal(";
		if(animal.getRegistro() == null || animal.getRaca() == null || animal.getTipo() == null) {
			throw new Exception("Dados invalidos");
		}
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
			atributos = atributos + "dtnasc,";
			valores = valores + "'"+animal.getDtNasc().toString() + "'" + ",";
		}
		atributos = atributos.substring(0, atributos.length() -1);
		atributos = atributos + ")";
		valores = valores.substring(0,valores.length() - 1);
		valores = valores + ")";
		sql = sql + atributos + valores;
		System.out.println(sql);
	}
}
