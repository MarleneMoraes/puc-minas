package br.pucminas.aedsii.jogadornba.filavetor;

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
		Fila fila = preencherFila(jogadores, scan);

		fila = procedimentos(jogadores, fila, scan);

		fila.mostrar();

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
			if (i != -1)
				jogadores[i] = Jogador.ler(linha);
			
			i++;
		}
		arqLeitura.close();

		return jogadores;
	}

	public static Fila preencherFila(Jogador[] jogadores, Scanner scan) {
		Fila fila = new Fila();

		String busca = scan.nextLine();

		while (!isFim(busca)) {
			int id = Integer.parseInt(busca);
			Jogador jogador = buscarJogador(jogadores, id);

			if (jogadores != null) {
				fila.enfileirar(jogador);

				System.out.println((int) Math.floor(fila.obterMediaAltura()));
			}

			busca = scan.nextLine();
		}

		return fila;
	}

	public static Fila procedimentos(Jogador[] jogadores, Fila fila, Scanner scan) throws Exception {
		int numeroDeInteracoes = Integer.parseInt(scan.nextLine());
		char caractere;
		Jogador desenfileirado;

		for (int i = 0; i < numeroDeInteracoes; i++) {
			String linha = scan.nextLine();
			caractere = linha.charAt(0);

			if (caractere == 'R') {
				desenfileirado = fila.desenfileirar();
				if (desenfileirado != null) {
					System.out.printf("(R) %s \n", desenfileirado.getNome());
				}
			}

			if (caractere == 'I') {
				int elemento = Integer.parseInt(linha.substring(2));

				Jogador jogador = buscarJogador(jogadores, elemento);

				if (jogador != null)
					fila.enfileirar(jogador);

				System.out.println((int) Math.floor(fila.obterMediaAltura()));
			}
		}

		return fila;
	}
}