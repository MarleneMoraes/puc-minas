package br.pucminas.aedsii.serie.filacelula;

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
    
		//Criacao da fila
		Fila fila = new Fila ();
		
		String busca = MyIO.readLine();
		
		while(!busca.equals("FIM")){
			buscarSerie(series, fila, busca);
			busca = MyIO.readLine();
		}

		int numeroBuscas =  Integer.parseInt(MyIO.readLine());
		String operacao;
		double media = 0;
		Serie desenfileirado;
		
		for(int i = 0; i < numeroBuscas; i++){
		      busca = MyIO.readLine();
		      
		      operacao = busca.substring(2, busca.length());
		      
		      if (operacao.equals("R")) {
		    	  try {
					desenfileirado = fila.desenfileirar();
					System.out.print("(R) ");
					desenfileirado.imprimir();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		      if (operacao.equals("I")) {

					try {
						fila.enfileirar(series[i]);
						media = fila.obterMediaTemporadas(series);
						System.out.println(media);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
		      }
		 }
		
		try {
			//fila.mostrar(serie);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void buscarSerie(Serie[] series, Fila fila, String nomeSerie) {
	    double media = 0;
	    
	    for (int i = 0; i < series.length; i++) {
		      if(series[i].verificarSerie(nomeSerie)) {
					try {
						fila.enfileirar(series[i]);
						media = fila.obterMediaTemporadas(series);
						System.out.println(media);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
		      }
		 }
	}
	
}
