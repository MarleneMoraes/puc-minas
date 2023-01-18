package br.pucminas.aedsii20222.estruturadedados.pilhavetor;

import java.util.Scanner;

import br.pucminas.aedsii20222.estruturadedados.ArquivoTextoLeitura;
import br.pucminas.aedsii20222.estruturadedados.Jogo;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Jogo[] jogos = preencherJogos();
		Pilha pilha = preencherPilha(jogos, scan);

		pilha = procedimentos(jogos, pilha, scan);

		pilha.mostrar();
		scan.close();
	}

	// Metodos

	public static Jogo buscarJogo(Jogo[] jogos, String busca) {
		String[] dadosJogo = busca.split(";");
		String[] data = dadosJogo[0].split("/");

		int dia = Integer.parseInt(data[0]);
		int mes = Integer.parseInt(data[1]);
		int ano = Integer.parseInt(data[2]);
		String selecao = dadosJogo[1];

		for (Jogo jogo : jogos) {
			if (jogo == null)
				break;

			if (jogo.verificarJogo(dia, mes, ano, selecao))
				return jogo;
		}

		return null;
	}

	public static Jogo[] preencherJogos() {
		Jogo[] jogos = new Jogo[1000];
		
		ArquivoTextoLeitura arqLeitura = new ArquivoTextoLeitura("partidas.txt"); //ao testar, substituir por \tmp\partidas.txt
		
		for (int i = 0;  i < jogos.length; i++) {
			String linha = arqLeitura.ler(); 
	  
			if(linha == null) 
				break;
			  
			jogos[i] = Jogo.ler(linha);
		}

		arqLeitura.fecharArquivo();

		return jogos;
	}

	public static Pilha preencherPilha(Jogo[] jogos, Scanner scan) {
		Pilha pilha = new Pilha(900);
		  
		String busca = scan.nextLine();
  
		while(!busca.equals("FIM")){
		  Jogo jogo = buscarJogo(jogos, busca); //add função recebe string de busca p/ enfileirar o Jogo e retornar a média

		  if (jogo != null)
			pilha.empilhar(jogo);
		  
		  
		  busca = scan.nextLine();
		 }

		return pilha;
	}

	public static Pilha procedimentos(Jogo[] jogos, Pilha pilha, Scanner scan) {
		int numeroDeInteracoes = Integer.parseInt(scan.nextLine());
		char caractere;
		String elemento;
		Jogo desempilhado;
	  
		for(int i = 0; i < numeroDeInteracoes; i++){
		  String linha = scan.nextLine();
		  caractere = linha.charAt(0);
		  
		  if(caractere == 'D') {
			desempilhado = pilha.desempilhar();
			if(desempilhado != null){
			  System.out.print("(D) ");
			  desempilhado.imprimir();
			}
		  }
			 
		  if(caractere == 'E') {
			elemento = linha.substring(2);
			
			Jogo jogo = buscarJogo(jogos, elemento);
			
			if(jogo != null){
				pilha.empilhar(jogo);
				//jogo.obterMediaGols();
			}
			  
		  }
		}

		return pilha;
	}
}
