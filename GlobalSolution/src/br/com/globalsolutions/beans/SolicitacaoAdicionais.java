package br.com.globalsolutions.beans;

public class SolicitacaoAdicionais extends Solicitacao{
	private String preferencias;
	private String tipoSolicitacao;
	
	//Construtor Vazio 
	public SolicitacaoAdicionais() {
	}
	
	//Construtor Cheio
	public SolicitacaoAdicionais(int recebeQuantidade, int recebeId, String recebePreferencias, String recebeTipoSolicitacao) {
		super(recebeQuantidade, recebeId);
		setPreferencias(recebePreferencias);
		setTipoSolicitacao(recebeTipoSolicitacao);
	}
	public String getPreferencias() {
		return preferencias;
	}
	public void setPreferencias(String preferencias) {
		this.preferencias = preferencias;
	}
	public String getTipoSolicitacao() {
		return tipoSolicitacao;
	}
	public void setTipoSolicitacao(String tipoSolicitacao) {
		this.tipoSolicitacao = tipoSolicitacao;
	}
	
	public void mostrarInformacoes() {
		System.out.println("Quantidade: " + getQuantidade() + "\nID: " + getId() +
							"\nPreferências: " + getPreferencias() + "\nTipo de Solicitação: " + getTipoSolicitacao());
	}

}
