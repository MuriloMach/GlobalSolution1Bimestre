package br.com.globalsolutions.beans;

public class Receptor extends Pessoa{
	private String localPedido;

	//Construtor Vazio
	public Receptor() {
		
	}
	
	//Construtor Cheio
	public Receptor(String recebeNome, double recebePeso, char recebeSexo, int recebeCpf, String recebeLocalPedido) {
		super(recebeNome, recebePeso, recebeSexo, recebeCpf);
		setLocalPedido(recebeLocalPedido);
	}
	
	public String getLocalPedido() {
		return localPedido;
	}

	public void setLocalPedido(String localPedido) {
		this.localPedido = localPedido;
	}
	
	public void mostrarInformacoes() {
		System.out.println("Nome: " + getNome() + 
							"\nPeso: " + getPeso() + "\nSexo: " + getSexo() + "\nCPF: " + getCpf() +
							"\nLocal Pedido: " + getLocalPedido());
	}

}
