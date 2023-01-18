package br.pucminas.aedsii20222.estruturadedados.filacelula;

import java.util.Scanner;

import br.pucminas.aedsii20222.estruturadedados.ArquivoTextoLeitura;
import br.pucminas.aedsii20222.estruturadedados.Jogo;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Jogo[] jogos = preencherJogos();
		Fila fila = preencherFila(jogos, scan);

		fila = procedimentos(jogos, fila, scan);

		fila.mostrar();
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

		ArquivoTextoLeitura arqLeitura = new ArquivoTextoLeitura("partidas.txt"); // ao testar, substituir por
																					// \tmp\partidas

		for (int i = 0; i < jogos.length; i++) {
			String linha = arqLeitura.ler();

			if (linha == null)
				break;

			jogos[i] = Jogo.ler(linha);
		}

		arqLeitura.fecharArquivo();

		return jogos;
	}

	public static Fila preencherFila(Jogo[] jogos, Scanner scan) {
		Jogo sentinela = null;
		Fila fila = new Fila(sentinela);

		String busca = scan.nextLine();

		while (!busca.equals("FIM")) {
			Jogo jogo = buscarJogo(jogos, busca);

			if (jogo != null)
				fila.empilhar(jogo);

			busca = scan.nextLine();
		}

		return fila;
	}

	public static Fila procedimentos(Jogo[] jogos, Fila fila, Scanner scan) {
		int numeroDeInteracoes = Integer.parseInt(scan.nextLine());
		char caractere;
		String elemento;
		Jogo desempilhado;

		for (int i = 0; i < numeroDeInteracoes; i++) {
			String linha = scan.nextLine();
			caractere = linha.charAt(0);

			if (caractere == 'D') {
				desempilhado = fila.desempilhar();
				if (desempilhado != null) {
					System.out.print("(D) ");
					desempilhado.imprimir();
				}
			}

			if (caractere == 'E') {
				elemento = linha.substring(2);

				Jogo jogo = buscarJogo(jogos, elemento);

				if (jogo != null)
					fila.empilhar(jogo);
			}
		}

		return fila;
	}
}
