package br.pucminas.aedsii.serie.leituradearquivo;

import br.pucminas.aedsii.estruturadedados.ArquivoTextoLeitura;
import br.pucminas.aedsii.estruturadedados.MyIO;
import br.pucminas.aedsii.estruturadedados.Serie;

public class LeituraDeArquivo {
	public static void main(String[] args) {
		MyIO.setCharset("UTF-8");
		Serie[] series = new Serie[900];
		
		ArquivoTextoLeitura arqLeitura = new ArquivoTextoLeitura("C:\\_workspace\\puc-minas\\algoritmos-e-estrutura-de-dados-ii\\src\\br\\pucminas\\aedsii20221\\estruturadedados\\leituradearquivo\\data.txt"); //ao testar, substituir caminho pelo caminho da pasta do seu computador 
		
		for (int i = 0;  i < series.length; i++) 
			series[i] = Serie.ler();
		

		arqLeitura.fecharArquivo();
    
		int numeroBuscas =  Integer.parseInt(MyIO.readLine());
		
		for(int i = 0; i < numeroBuscas; i++){
		      String busca = MyIO.readLine();
		      buscarSerie(series, busca);
		 }
	}
	
	public static void buscarSerie(Serie[] series, String nomeSerie) {
	    
	    for (int i = 0; i < series.length; i++) {
		      if(series[i].verificarSerie(nomeSerie))
		        series[i].imprimir();
		 }
	}
}