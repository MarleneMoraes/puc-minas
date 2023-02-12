package br.pucminas.aedsii.serie.pilhavetor;

import br.pucminas.aedsii.estruturadedados.ArquivoTextoLeitura;
import br.pucminas.aedsii.estruturadedados.MyIO;
import br.pucminas.aedsii.estruturadedados.Serie;

public class Main {

	public static void main(String[] args) {
		MyIO.setCharset("UTF-8");
		Serie[] series = new Serie[900];
		
		ArquivoTextoLeitura arqLeitura = new ArquivoTextoLeitura("data.txt"); //ao testar, substituir caminho pelo caminho da pasta do seu computador 
		
		for (int i = 0;  i < series.length; i++) 
			series[i] = Serie.ler();
		

		arqLeitura.fecharArquivo();
    
		//Criacao da pilha
		Pilha pilha = new Pilha (70);
		
		String busca = MyIO.readLine();
		
		while(!busca.equals("FIM")){
			buscarSerie(series, pilha, busca);
			busca = MyIO.readLine();
		}

		int numeroBuscas =  Integer.parseInt(MyIO.readLine());
		String operacao;
		int media = 0;
		Serie desempilhado;
		
		for(int i = 0; i < numeroBuscas; i++){
		      busca = MyIO.readLine();
		      
		      operacao = busca.substring(2, busca.length());
		      
		      if (operacao.equals("R")) {
		    	  try {
					desempilhado = pilha.desempilhar();
					System.out.print("(R) ");
					desempilhado.imprimir();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		      if (operacao.equals("I")) {
		    	  if (pilha.pilhaCheia()) {
						try {
							desempilhado = pilha.desempilhar();
							System.out.print("(R) ");
							desempilhado.imprimir();
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
					}

					try {
						pilha.empilhar(series[i]);
						media = pilha.obterMediaTemporadas(series);
						System.out.println(media);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
		      }
		 }
		
		try {
			pilha.mostrar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void buscarSerie(Serie[] series, Pilha pilha, String nomeSerie) {
	    int media = 0;
	    
	    for (int i = 0; i < series.length; i++) {
		      if(series[i].verificarSerie(nomeSerie)) {
		    	  if (pilha.pilhaCheia()) {
						try {
							Serie desempilhado = pilha.desempilhar();
							System.out.print("(R) ");
							desempilhado.imprimir();
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
					}

					try {
						pilha.empilhar(series[i]);
						media = pilha.obterMediaTemporadas(series);
						System.out.println(media);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
		      }
		 }
	}
	
}
