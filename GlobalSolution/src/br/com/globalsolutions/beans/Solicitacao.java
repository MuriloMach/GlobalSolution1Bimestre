package br.com.globalsolutions.beans;

public class Solicitacao {
	private int Quantidade;
	private int id;
	
	//Construtor Vazio
	public Solicitacao() {
	}
	
	public Solicitacao(int recebeQuantidade, int recebeId) {
		setQuantidade(recebeQuantidade);
		setId(recebeId);
	}
	
	
	public int getQuantidade() {
		return Quantidade;
	}
	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
