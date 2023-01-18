package br.pucminas.aedsii20221.estruturadedados.listavetor;

import br.pucminas.aedsii20221.estruturadedados.Serie;
import br.pucminas.aedsii20221.estruturadedados.MyIO;
import br.pucminas.aedsii20221.estruturadedados.ArquivoTextoLeitura;

public class Main {

	public static void main(String[] args) {
		MyIO.setCharset("UTF-8");
		Serie[] series = new Serie[900];
		
		ArquivoTextoLeitura arqLeitura = new ArquivoTextoLeitura("data.txt"); //ao testar, substituir caminho pelo caminho da pasta do seu computador 
		
		for (int i = 0;  i < series.length; i++) 
			series[i] = Serie.ler();
		

		arqLeitura.fecharArquivo();
    
		Lista lista = new Lista (70);
		
		String busca = MyIO.readLine();
		
		while(!busca.equals("FIM")){
			buscarSerie(series, lista, busca);
			busca = MyIO.readLine();
		}

		int numeroBuscas =  Integer.parseInt(MyIO.readLine());
		String operacao;
		Serie removida;
		String nomeSerie;
		int posicao;
		
		for (int i = 0; i < numeroBuscas; i++) {
			busca = MyIO.readLine();
			operacao = busca.substring(0, 2);

			switch (operacao) {
				case "II":
					nomeSerie = busca.substring(3);

					for (int j = 0; j < series.length; j++) {
						if (nomeSerie.equals(series[j].getNome())) {
							try {
								lista.inserirInicio(series[j]);
							} catch (Exception erro) {
								System.out.println(erro.getMessage());
							}
						}
					}
					break;
				case "IF":
					nomeSerie = busca.substring(3);
					for (int j = 0; j < series.length; j++) {
						if (nomeSerie.equals(series[j].getNome())) {
							try {
								lista.inserirFim(series[j]);
							} catch (Exception erro) {
								System.out.println(erro.getMessage());
							}
						}
					}
					break;
				case "I*":
					posicao = Integer.parseInt(busca.substring(3, 5).trim());
					nomeSerie = busca.substring(5).trim();

					for (int j = 0; j < series.length; j++) {
						if (nomeSerie.equals(series[j].getNome())) {
							try {
								lista.inserir(series[j], posicao);
							} catch (Exception erro) {
								System.out.println(erro.getMessage());
							}
						}
					}
					break;
				case "RI":
					try {
						removida = lista.removerInicio();
						System.out.println("(R) " + removida.getNome());
					} catch (Exception erro) {
						System.out.println(erro.getMessage());
					}
					break;
				case "RF":
					try {
						removida = lista.removerFim();
						System.out.println("(R) " + removida.getNome());
					} catch (Exception erro) {
						System.out.println(erro.getMessage());
					}
					break;
				case "R*":
					posicao = Integer.parseInt(busca.substring(3).trim());
					try {
						removida = lista.remover(posicao);
						System.out.println("(R) " + removida.getNome());
					} catch (Exception erro) {
						System.out.println(erro.getMessage());
					}
					break;
			}
		}
		
		try {
			lista.mostrar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void buscarSerie(Serie[] series, Lista lista, String nomeSerie) {
	    int media = 0;
	    
	    for (int i = 0; i < series.length; i++) {
		      if(series[i].verificarSerie(nomeSerie)) {
		    	  if (lista.listaCheia()) {
						try {
							Serie desempilhado = lista.removerInicio();
							System.out.print("(R) ");
							desempilhado.imprimir();
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
					}

					try {
						lista.inserirFim(series[i]);
						media = lista.obterMediaTemporadas(series);
						System.out.println(media);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
		      }
		 }
	}
	
}
