package br.cesed.unifacisa.petshop.beans;

public class Funcionario {

	private long matricula;
	private String nome;
	private String endereco;
	private String telefone;
	private double salario;
	private String DtNasc;
	private String DtAdm;
	private String funcao;
	private String DtDemi;
	public long getMatricula() {
		return matricula;
	}
	public void setMatricula(long matricula) {
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
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
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
