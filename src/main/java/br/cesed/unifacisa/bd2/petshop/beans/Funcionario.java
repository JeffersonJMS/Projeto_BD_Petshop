package br.cesed.unifacisa.bd2.petshop.beans;

public class Funcionario {

	private Integer matricula;
	private String nome;
	private String endereco;
	private String telefone;
	private Double salario;
	private String DtNasc;
	private String DtAdm;
	private String funcao;
	private String DtDemi;
	
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
		return DtNasc;
	}
	public void setDtNasc(String dtNasc) {
		DtNasc = dtNasc;
	}
	public String getDtAdm() {
		return DtAdm;
	}
	public void setDtAdm(String dtAdm) {
		DtAdm = dtAdm;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public String getDtDemi() {
		return DtDemi;
	}
	public void setDtDemi(String dtDemi) {
		DtDemi = dtDemi;
	}
	
}
