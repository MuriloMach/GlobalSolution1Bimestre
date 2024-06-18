package br.com.globalsolutions.beans;

public class Entregador extends Pessoa{
	private int idEntregador;
	private String tipoVeiculo;
	
	public Entregador() {
		
	}
	
	public Entregador(String recebeNome, double recebePeso, char recebeSexo, int recebeCpf, int recebeIdEntregador, String recebeTipoVeiculo) {
		super(recebeNome, recebePeso, recebeSexo, recebeCpf);
		setIdEntregador(recebeIdEntregador);
		setTipoVeiculo(recebeTipoVeiculo);
	}
	
	public int getIdEntregador() {
		return idEntregador;
	}
	public void setIdEntregador(int idEntregador) {
		this.idEntregador = idEntregador;
	}
	public String getTipoVeiculo() {
		return tipoVeiculo;
	}
	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}
	
	public void mostrarInformacoes() {
		System.out.println("Nome: " + getNome() + "\nPeso: " + getPeso() +
							"\nSexo: " + getSexo() + "\nCPF: " + getCpf() +
							"\nID Entregador: " + getIdEntregador() + "\nTipo do Veículo: " + getTipoVeiculo());
	}
}
