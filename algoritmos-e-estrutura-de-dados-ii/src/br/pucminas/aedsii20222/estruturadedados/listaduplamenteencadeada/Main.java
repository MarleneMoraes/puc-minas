package br.pucminas.aedsii20222.estruturadedados.listaduplamenteencadeada;

import java.util.Scanner;

import br.pucminas.aedsii20221.estruturadedados.ArquivoTextoLeitura;
import br.pucminas.aedsii20222.estruturadedados.Jogo;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Jogo[] jogos = preencherJogos();
		Lista lista = preencherLista(jogos, scan);

		lista = procedimentos(jogos, lista, scan);

		lista.mostrar();
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
		Jogo[] jogos = new Jogo[900];

		ArquivoTextoLeitura arqLeitura = new ArquivoTextoLeitura("partidas.txt");

		for (int i = 0; i < jogos.length; i++) {
			String linha = arqLeitura.ler();

			if (linha == null)
				break;

			jogos[i] = Jogo.ler(linha);
		}

		arqLeitura.fecharArquivo();

		return jogos;
	}

	public static Lista preencherLista(Jogo[] jogos, Scanner scan) {
		Lista lista = new Lista();

		String busca = scan.nextLine();

		while (!busca.equals("FIM")) {
			Jogo jogo = buscarJogo(jogos, busca);

			if (jogo != null)
				lista.inserirFim(jogo);

			busca = scan.nextLine();
		}

		return lista;
	}

	public static Lista procedimentos(Jogo[] jogos, Lista lista, Scanner scan) {
		int numeroDeInteracoes = Integer.parseInt(scan.nextLine());
		String opcao, elemento;
		Jogo removido, busca;
		int posicao = 0;

		for (int i = 0; i < numeroDeInteracoes; i++) {
			String linha = scan.nextLine();
			String[] dados = linha.split(" ");
			
			opcao = dados[0];

			switch (opcao) {
			case "II":
				elemento = dados[1];
				busca = buscarJogo(jogos, elemento);

				if (busca != null)
					lista.inserirInicio(busca);
				
				
				break;
			case "I*":
		          posicao = Integer.parseInt(dados[1]);

		          elemento = dados[2];
		          busca = buscarJogo(jogos, elemento);
		  
		          if (busca != null)
		            lista.inserir(busca, posicao);

		          break;
			case "IF":
				elemento = dados[1];
				busca = buscarJogo(jogos, elemento);

				if (busca != null)
					lista.inserirFim(busca);

				break;
			case "RI":

				removido = lista.removerInicio();
				if (removido != null) {
					System.out.println("(R) ");
					removido.imprimir();					
				}

				break;

			case "R*":
				posicao = Integer.parseInt(dados[1]);

				removido = lista.remover(posicao);
				if (removido != null) {
					System.out.println("(R) ");
					removido.imprimir();
					System.out.println();
				}
				break;

			case "RF":
				removido = lista.removerFim();

				if (removido != null) {
					System.out.print("(R) ");
					removido.imprimir();					
				}
				
				break;
			}
		}

		return lista;
	}
}
