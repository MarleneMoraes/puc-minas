package br.pucminas.aedsii.serie.arvoreavl;

import br.pucminas.aedsii.estruturadedados.ArquivoTextoEscrita;
import br.pucminas.aedsii.estruturadedados.ArquivoTextoLeitura;
import br.pucminas.aedsii.estruturadedados.MyIO;
import br.pucminas.aedsii.serie.Serie;

public class Main {
	public static void main(String[] args) throws Exception {
		MyIO.setCharset("UTF-8");
		Serie[] series = new Serie[900];
		int comparacao = 0;

		ArquivoTextoLeitura arqLeitura = new ArquivoTextoLeitura("data.txt"); // ao testar, substituir caminho pelo
																				// caminho da pasta do seu computador

		for (int i = 0; i < series.length; i++) {
			if (i != 0)
				series[i] = Serie.ler();
		}

		arqLeitura.fecharArquivo();

		Arvore arvore = new Arvore();

		String busca = MyIO.readLine();
		Serie serie = new Serie();

		while (!busca.equals("FIM")) {
			serie.setNome(busca);

			if (arvore.pesquisar(serie) == null)
				arvore.inserir(serie);

			busca = MyIO.readLine();
		}
		
		int numeroBuscas =  MyIO.readInt();
		
		for(int i = 0; i < numeroBuscas; i++){
		    serie.setNome(busca);
		    
		    if(arvore.pesquisar(serie) != null)
		    	System.out.println("SIM");
		    else 
		    	System.out.println("NAO");
		    
		    comparacao++;
		 }
		
		try {
			arvore.caminhamentoEmOrdem();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		// Arquivo log

		long executionTime = System.currentTimeMillis();

		ArquivoTextoEscrita escrita = new ArquivoTextoEscrita("pucminas_arvoreAVL.txt");

		escrita.escrever("Matricula: 717623 \t" + "Tempo de execução em milisegundos: " + executionTime
				+ "\t Numero de comparacoes realizadas: "
				+ comparacao);

		escrita.fecharArquivo();
	}


}
