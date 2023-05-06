package br.pucminas.aedsii.jogadornba.pilhavetor;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import br.pucminas.aedsii.estruturadedados.MyIO;
import br.pucminas.aedsii.jogadornba.Jogador;

public class Main {
	public static void main(String[] args) throws Exception {
	      MyIO.setCharset("UTF-8");
	      
	      Scanner scan = new Scanner(System.in);
	      Jogador[] jogadores = preencherJogadores();
	      Pilha pilha = preencherPilha(jogadores, scan);

	      pilha = procedimentos(jogadores, pilha, scan);

	      pilha.mostrar();

	      scan.close();
	    }

	    // Metodos

	   public static Jogador buscarJogador(Jogador[] jogador, int id) {
	      for (int i = 0; i < jogador.length; i++) {
	         if (jogador[i] == null)
	            continue;

	         if (jogador[i].verificarJogador(id))
	            return jogador[i];
	      }

	      return null;
	   }

	   public static boolean isFim(String s) {
	      return (s.length() == 3 && s.equals("FIM"));
	   }

	   public static Jogador[] preencherJogadores() throws FileNotFoundException {
	      Jogador[] jogadores = new Jogador[4000];
	      Scanner arqLeitura = new Scanner(new File("jogadores.txt"));

	      int i = -1;

	      while (arqLeitura.hasNextLine()) {
	         String linha = arqLeitura.nextLine();
	         if (i != -1) {
	            jogadores[i] = Jogador.ler(linha);
	         }
	         i++;
	      }
	      arqLeitura.close();

	      return jogadores;
	   }

	   public static Pilha preencherPilha(Jogador[] jogadores, Scanner scan) {
	      Jogador jogador = new Jogador();
	      Pilha pilha = new Pilha(4000);

	      String busca = scan.nextLine();

	      while (!isFim(busca)) {
	         int id = Integer.parseInt(busca);
	         jogador = buscarJogador(jogadores, id);

	         if (jogadores != null) 
	            pilha.empilhar(jogador);
	         

	         busca = scan.nextLine();
	      }
	      return pilha;
	   }

	   public static Pilha procedimentos(Jogador[] jogadores, Pilha pilha, Scanner scan) throws Exception {
	      int numeroDeInteracoes = Integer.parseInt(scan.nextLine());
	      char caractere;
	      Jogador desempilhado;

	      for (int i = 0; i < numeroDeInteracoes; i++) {
	         String linha = scan.nextLine();
	         caractere = linha.charAt(0);

	         if (caractere == 'R') {
	            desempilhado = pilha.desempilhar();
	            if (desempilhado != null) {
	               System.out.printf("(R) %s \n", desempilhado.getNome());
	            }
	         }

	         if (caractere == 'I') {
	            int elemento = Integer.parseInt(linha.substring(2));

	            Jogador jogador = buscarJogador(jogadores, elemento);

	            if (jogador != null)
	               pilha.empilhar(jogador);
	         }
	      }
	      return pilha;
	   }
}