package br.pucminas.aedsii20222.estruturadedados.poo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Jogo[] jogos = new Jogo[400];
		
		String linha = scan.nextLine();
		
		for (int i = 0;  i < jogos.length; i++) {
			if(linha.equals("FIM"))
				break;
			
			 jogos[i] = Jogo.ler(linha);
			 linha = scan.nextLine();
		}
		
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
		        jogos[i].imprimir();
		      
		 }
	}

}
