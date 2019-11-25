package br.cesed.unifacisa.bd2.petshop.beans;

public class VendaItem {

	private Integer ntFiscal;
	private Long itemCod;
	private Long funcMat;
	private Integer dia;
	private Integer mes;
	private Integer ano;
	private Double comissaoL;
	private Double desconto;
	private Double valorF;
	
	public Integer getNtFiscal() {
		return ntFiscal;
	}
	public void setNtFiscal(Integer ntFiscal) {
		this.ntFiscal = ntFiscal;
	}
	public Long getItemCod() {
		return itemCod;
	}
	public void setItemCod(Long itemCod) {
		this.itemCod = itemCod;
	}
	public Long getFuncMat() {
		return funcMat;
	}
	public void setFuncMat(Long funcMat) {
		this.funcMat = funcMat;
	}
	public Integer getDia() {
		return dia;
	}
	public void setDia(Integer dia) {
		this.dia = dia;
	}
	public Integer getMes() {
		return mes;
	}
	public void setMes(Integer mes) {
		this.mes = mes;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public Double getComissaoL() {
		return comissaoL;
	}
	public void setComissaoL(Double comissaoL) {
		this.comissaoL = comissaoL;
	}
	public Double getDesconto() {
		return desconto;
	}
	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	public Double getValorF() {
		return valorF;
	}
	public void setValorF(Double valorF) {
		this.valorF = valorF;
	}
	
}
