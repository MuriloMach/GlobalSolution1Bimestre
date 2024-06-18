package br.com.globalsolutions.teste;

import br.com.globalsolutions.beans.Entregador;
import br.com.globalsolutions.beans.Receptor;

public class TestePessoa {

	public static void main(String[] args) {
		
		Receptor receptor = new Receptor();
		
		//Construtor Vazio
		receptor.setNome("Pedro Assis");
		receptor.setPeso(60.70);
		receptor.setSexo('M');
		receptor.setCpf(123456789);
		receptor.setLocalPedido("Avenida Paulista,1090 \n");
		
		receptor.mostrarInformacoes();

		//Construtor Cheio
		Receptor receptorDois = new Receptor("Manuel Alves", 90.60, 'M', 987654321,"Avenida Jaguaribe \n");
		receptorDois.mostrarInformacoes();
		
		
		Entregador entregador = new Entregador();
	
		//Construtor Vazio II
		entregador.setNome("Cleide Teixeira");
		entregador.setPeso(55.99);
		entregador.setSexo('F');
		entregador.setCpf(333456789);
		entregador.setIdEntregador(999870);
		entregador.setTipoVeiculo("Moto Fiat \n");
		
		entregador.mostrarInformacoes();
		
		//Construtor Cheio II
		Entregador entregadorDois = new Entregador("João Pedro Reis", 70.10, 'M', 435678072, 888564, "Moto Bmw");
		entregadorDois.mostrarInformacoes();
		
		
	}
}
