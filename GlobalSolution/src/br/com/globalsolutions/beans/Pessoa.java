package br.com.globalsolutions.beans;

public class Pessoa {
	private String nome;
	private double peso;
	private char sexo;
	private int cpf;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String recebeNome, double recebePeso, char recebeSexo, int recebeCpf) {
		setNome(recebeNome);
		setPeso(recebePeso);
		setSexo(recebeSexo);
		setCpf(recebeCpf);	
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
}
