package br.cesed.unifacisa.bd2.petshop.beans;

public class Item {

	private long codigo;
	private String descricao;
	private String tipo;
	private double precoFornecedor;
	private double precoLoja;
	private String validade;
	private Integer quantidade;
	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPrecoFornecedor() {
		return precoFornecedor;
	}
	public void setPrecoFornecedor(double precoFornecedor) {
		this.precoFornecedor = precoFornecedor;
	}
	public double getPrecoLoja() {
		return precoLoja;
	}
	public void setPrecoLoja(double precoLoja) {
		this.precoLoja = precoLoja;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
}
