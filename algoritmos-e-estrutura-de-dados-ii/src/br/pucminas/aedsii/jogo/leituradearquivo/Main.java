package br.pucminas.aedsii.jogo.leituradearquivo;

import java.util.Scanner;
import br.pucminas.aedsii20222.estruturadedados.ArquivoTextoLeitura;
import br.pucminas.aedsii20222.estruturadedados.Jogo;

public class Main {
	public static void main(String[] args) {
		Jogo[] jogos = new Jogo[900];
		
		ArquivoTextoLeitura arqLeitura = new ArquivoTextoLeitura("C:\\_workspace\\puc-minas\\algoritmos-e-estrutura-de-dados-ii\\src\\br\\pucminas\\aedsii20222\\estruturadedados\\leituradearquivo\\partidas.txt"); //ao testar, substituir caminho pelo caminho da pasta do seu computador 
		
		String linha = arqLeitura.ler(); 
		
		for (int i = 0;  i < jogos.length; i++) {
			jogos[i] = Jogo.ler(linha);
			
			linha = arqLeitura.ler();
		}

		arqLeitura.fecharArquivo();
    
		
		Scanner scan = new Scanner(System.in);
		int numeroBuscas =  Integer.parseInt(scan.nextLine());
		
		for(int i = 0; i < numeroBuscas; i++){
		      String busca = scan.nextLine();
		      buscarJogo(jogos, busca);
		 }
		
		scan.close();
	}
	
	
	public static void buscarJogo(Jogo[] jogos, String busca) {
		String[] dadosJogo = busca.split(";");
		String[] data = dadosJogo[0].split("/");
		
		int dia = Integer.parseInt(data[0]);
	    int mes = Integer.parseInt(data[1]);
	    int ano = Integer.parseInt(data[2]);
	    String selecao = dadosJogo[1];
	    
	    for (int i = 0; i < jogos.length; i++) {
		      if(jogos[i].verificarJogo(dia,mes,ano,selecao))
		        jogos[i].printValues();
		      
		 }
	}
}