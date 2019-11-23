package br.cesed.unifacisa.bd2.petshop.beans;

public class Item {

	private Integer codigo;
	private String descricao;
	private String tipo;
	private Double precoFornecedor;
	private Double precoLoja;
	private String validade;
	private Integer quantidade;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
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
	public Double getPrecoFornecedor() {
		return precoFornecedor;
	}
	public void setPrecoFornecedor(Double precoFornecedor) {
		this.precoFornecedor = precoFornecedor;
	}
	public Double getPrecoLoja() {
		return precoLoja;
	}
	public void setPrecoLoja(Double precoLoja) {
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
