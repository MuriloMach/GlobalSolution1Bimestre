package br.com.globalsolutions.teste;

import br.com.globalsolutions.beans.SolicitacaoAdicionais;
import br.com.globalsolutions.beans.SolicitacaoAlimentacao;

public class TesteSolicitacao {

	public static void main(String[] args) {
		
		SolicitacaoAlimentacao solicitacaoalimentacao = new SolicitacaoAlimentacao();
		
		//Construtor Vazio
		solicitacaoalimentacao.setQuantidade(2);
		solicitacaoalimentacao.setId(776532145);
		solicitacaoalimentacao.setTipoAlimento("Pacote de Arroz\n");
		solicitacaoalimentacao.mostrarInformacoes();
		
		//Construtor Cheio
		SolicitacaoAlimentacao solicitacaoalimentacaoDois = new SolicitacaoAlimentacao(1, 668608765, "Pacote de Feijão \n");
		solicitacaoalimentacaoDois.mostrarInformacoes();
		
		SolicitacaoAdicionais solicitacaoadicionais = new SolicitacaoAdicionais();
		
		//Construtor Vazio
		solicitacaoadicionais.setQuantidade(2);
		solicitacaoadicionais.setId(442109876);
		solicitacaoadicionais.setPreferencias("Intolerância a lactose");
		solicitacaoadicionais.setTipoSolicitacao("Roupas masculinas e cobertor \n");
		solicitacaoadicionais.mostrarInformacoes();
		
		//Construtor Cheio
		SolicitacaoAdicionais solicitacaoadicionaisDois = new SolicitacaoAdicionais(3, 950421567, "Intolerância a amedoim", "Roupas Femininas e um travesseiro");
		solicitacaoadicionaisDois.mostrarInformacoes();
		
				
		
	}

}
