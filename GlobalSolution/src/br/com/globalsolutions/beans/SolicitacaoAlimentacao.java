package br.com.globalsolutions.beans;

public class SolicitacaoAlimentacao extends Solicitacao {
	private String tipoAlimento;

	public SolicitacaoAlimentacao() {	
	}
	public SolicitacaoAlimentacao(int recebeQuantidade, int recebeId, String recebeTipoAlimento) {
		super(recebeQuantidade, recebeId);
		setTipoAlimento(recebeTipoAlimento);
	}
	public String getTipoAlimento() {
		return tipoAlimento;
	}

	public void setTipoAlimento(String tipoAlimento) {
		this.tipoAlimento = tipoAlimento;
	}
	
	public void mostrarInformacoes() {
		System.out.println("Quantidade: " + getQuantidade() + "\nID: " + getId() + 
							"\nTipo de Alimento: " + getTipoAlimento());
	}
}
