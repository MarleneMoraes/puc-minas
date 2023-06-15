package br.pucminas.aedsii.jogadornba.listaencadeada;

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
		Lista lista = preencherLista(jogadores, scan);

		lista = procedimentos(jogadores, lista, scan);

		lista.mostrar();

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
		Scanner arqLeitura = new Scanner(new File(
				"jogadores.txt"));

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

	public static Lista preencherLista(Jogador[] jogadores, Scanner scan) {
		Jogador jogador = new Jogador();
		Lista lista = new Lista();

		String busca = scan.nextLine();

		while (!isFim(busca)) {
			int id = Integer.parseInt(busca);
			jogador = buscarJogador(jogadores, id);

			if (jogadores != null)
				lista.inserirFim(jogador);

			busca = scan.nextLine();
		}
		return lista;
	}

	public static Lista procedimentos(Jogador[] jogadores, Lista lista, Scanner scan) throws Exception {
		int numeroDeInteracoes = Integer.parseInt(scan.nextLine());
		String caractere;
		int id, posicao;
		Jogador jogador;

		for (int i = 0; i < numeroDeInteracoes; i++) {
			String linha = scan.nextLine();
			String[] dados = linha.split(" ");

			caractere = dados[0];

			switch (caractere) {
			case "II":
				id = Integer.parseInt(dados[1]);
				jogador = buscarJogador(jogadores, id);

				if (jogador != null)
					lista.inserirInicio(jogador);

				break;
			case "I*":
				id = Integer.parseInt(dados[1]);
				posicao = Integer.parseInt(dados[2]);
				jogador = buscarJogador(jogadores, id);

				if (jogador != null)
					lista.inserir(jogador, posicao);

				break;
			case "IF":
				id = Integer.parseInt(dados[1]);
				jogador = buscarJogador(jogadores, id);

				if (jogador != null)
					lista.inserirFim(jogador);

				break;
			case "RI":
				jogador = lista.removerInicio();
				
				if(jogador != null)
					System.out.printf("(R) %s \n", jogador.getNome());

				break;

			case "R*":
				posicao = Integer.parseInt(dados[1]);

				jogador = lista.remover(posicao);
				
				if(jogador != null)
					System.out.printf("(R) %s \n", jogador.getNome());

				break;

			case "RF":
				jogador = lista.removerFim();
				
				if(jogador != null)
					System.out.printf("(R) %s \n", jogador.getNome());

				break;
			}
		}

		return lista;
	}

}
