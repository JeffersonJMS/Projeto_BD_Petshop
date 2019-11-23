package br.cesed.unifacisa.bd2.petshop.beans;

public class VendaAnimal {

	private long notaFiscal;
	private String regAnimal;
	private long matFunc;
	private int dia;
	private int mes;
	private int ano;
	private double comissaoA;
	private double desconto;
	private double valorFinal;
	
	public long getNotaFiscal() {
		return notaFiscal;
	}
	public void setNotaFiscal(long notaFiscal) {
		this.notaFiscal = notaFiscal;
	}
	public String getRegAnimal() {
		return regAnimal;
	}
	public void setRegAnimal(String regAnimal) {
		this.regAnimal = regAnimal;
	}
	public long getMatFunc() {
		return matFunc;
	}
	public void setMatFunc(long matFunc) {
		this.matFunc = matFunc;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getComissaoA() {
		return comissaoA;
	}
	public void setComissaoA(double comissaoA) {
		this.comissaoA = comissaoA;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public double getValorFinal() {
		return valorFinal;
	}
	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}
	
}
