package br.cesed.unifacisa.bd2.petshop.beans;

public class VendaAnimal {

	private Integer notaFiscal;
	private String regAnimal;
	private Long matFunc;
	private Integer dia;
	private Integer mes;
	private Integer ano;
	private Double comissaoA;
	private Double desconto;
	private Double valorFinal;
	
	public Integer getNotaFiscal() {
		return notaFiscal;
	}
	public void setNotaFiscal(Integer notaFiscal) {
		this.notaFiscal = notaFiscal;
	}
	public String getRegAnimal() {
		return regAnimal;
	}
	public void setRegAnimal(String regAnimal) {
		this.regAnimal = regAnimal;
	}
	public Long getMatFunc() {
		return matFunc;
	}
	public void setMatFunc(Long matFunc) {
		this.matFunc = matFunc;
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
	public Double getComissaoA() {
		return comissaoA;
	}
	public void setComissaoA(Double comissaoA) {
		this.comissaoA = comissaoA;
	}
	public Double getDesconto() {
		return desconto;
	}
	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	public Double getValorFinal() {
		return valorFinal;
	}
	public void setValorFinal(Double valorFinal) {
		this.valorFinal = valorFinal;
	}
	
}
