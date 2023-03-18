package br.pucminas.aedsii.jogadornba.poo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Jogador[] jogador = new Jogador[2];
		
		String linha = scan.nextLine();
		
		for (int i = 0;  i < jogador.length; i++) {
			if(linha.equals("FIM"))
				break;
			
			jogador[i] = Jogador.ler(linha);
			 linha = scan.nextLine();
		}
		
		int numeroBuscas =  Integer.parseInt(scan.nextLine());
		
		for(int i = 0; i < numeroBuscas; i++){
		      String busca = scan.nextLine();
		      buscarJogador(jogador, busca);
		 }
		
		scan.close();
	}
	
	
	public static void buscarJogador(Jogador[] jogador, String busca) {
		
		int id = Integer.parseInt(busca);
	    
	    for (int i = 0; i < jogador.length; i++) {
		      if(jogador[i].verificarJogador(id))
		        jogador[i].imprimir();
		 }
	}

}
