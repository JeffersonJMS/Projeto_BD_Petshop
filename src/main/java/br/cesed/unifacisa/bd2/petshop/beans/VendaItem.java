package br.cesed.unifacisa.bd2.petshop.beans;

public class VendaItem {

	private long ntFiscal;
	private long itemCod;
	private long funcMat;
	private int dia;
	private int mes;
	private int ano;
	private double comissaoL;
	private double desconto;
	private double valorF;
	
	public long getNtFiscal() {
		return ntFiscal;
	}
	public void setNtFiscal(long ntFiscal) {
		this.ntFiscal = ntFiscal;
	}
	public long getItemCod() {
		return itemCod;
	}
	public void setItemCod(long itemCod) {
		this.itemCod = itemCod;
	}
	public long getFuncMat() {
		return funcMat;
	}
	public void setFuncMat(long funcMat) {
		this.funcMat = funcMat;
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
	public double getComissaoL() {
		return comissaoL;
	}
	public void setComissaoL(double comissaoL) {
		this.comissaoL = comissaoL;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public double getValorF() {
		return valorF;
	}
	public void setValorF(double valorF) {
		this.valorF = valorF;
	}

}
