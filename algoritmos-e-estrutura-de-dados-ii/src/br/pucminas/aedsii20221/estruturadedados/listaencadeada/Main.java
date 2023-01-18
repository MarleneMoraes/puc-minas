package br.pucminas.aedsii20221.estruturadedados.listaencadeada;

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
    
		Lista lista = new Lista();
		
		String busca = MyIO.readLine();
		
		while(!busca.equals("FIM")){
			buscarSerie(series, lista, busca);
			busca = MyIO.readLine();
		}

		int numeroBuscas =  Integer.parseInt(MyIO.readLine());
		String operacao;
		int posicao;
		Serie serie;
		Serie removida;
		
		for(int i = 0; i < numeroBuscas; i++){
		      busca = MyIO.readLine();
		      
		      operacao = busca.substring(0, 2);
		      
		      switch (operacao) {

				case "II":
					busca = busca.substring(3);
					
					for (int j = 0; j < series.length; j++) {
						serie = series[j];
						
						if (busca.equals(serie.getNome())) {
							lista.inserirInicio(serie);
							break;
						}
					}
					break;

				case "IF":
					busca = busca.substring(3);
					for (int j = 0; j < series.length; j++) {
						serie = series[j];
						
						if (busca.equals(serie.getNome())) {
							lista.inserirFim(serie);
							break;
						}
					}
					break;

				case "I*":
					posicao = Integer.parseInt(busca.substring(3, 5).trim());
					busca = busca.substring(5).trim();

					for (int j = 0; j < series.length; j++) {
						serie = series[j];
						
						if (busca.equals(serie.getNome())) {
							try {
								lista.inserir(serie, posicao);
							} catch (Exception erro) {
								System.out.println(erro.getMessage());
							}
							break;
						}
					}
					break;

				case "RI":
					try {
						removida = lista.removerInicio();
						
						System.out.print("(R) ");
						System.out.println(removida.getNome());
					} catch (Exception erro) {
						System.out.println(erro.getMessage());
					}
					break;

				case "RF":
					try {
						removida = lista.removerFim();
						
						System.out.print("(R) ");
						System.out.println(removida.getNome());
					} catch (Exception erro) {
						System.out.println(erro.getMessage());
					}
					break;

				case "R*":
					posicao = Integer.parseInt(busca.substring(3).trim());
					
					try {
						removida = lista.remover(posicao);
						System.out.print("(R) ");
						System.out.println(removida.getNome());
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
	    double media = 0;
	    
	    for (int i = 0; i < series.length; i++) {
		      if(series[i].verificarSerie(nomeSerie)) {
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
