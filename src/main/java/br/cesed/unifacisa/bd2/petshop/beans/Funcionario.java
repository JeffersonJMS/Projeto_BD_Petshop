package br.cesed.unifacisa.bd2.petshop.beans;

public class Funcionario {

	private Integer matricula;
	private String nome;
	private String endereco;
	private String telefone;
	private Double salario;
	private String dtNasc;
	private String dtAdm;
	private String funcao;
	private String dtDemi;
	
	public Integer getMatricula() {
		return matricula;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public String getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(String dtNasc) {
		this.dtNasc = dtNasc;
	}
	public String getDtAdm() {
		return dtAdm;
	}
	public void setDtAdm(String dtAdm) {
		this.dtAdm = dtAdm;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public String getDtDemi() {
		return dtDemi;
	}
	public void setDtDemi(String dtDemi) {
		this.dtDemi = dtDemi;
	}
	
}
