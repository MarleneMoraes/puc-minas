package br.pucminas.aedsii20222.estruturadedados.filavetor;

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
		Jogo[] jogos = new Jogo[1000];

		ArquivoTextoLeitura arqLeitura = new ArquivoTextoLeitura("partidas.txt"); // ao testar, substituir \tmp\partidas

		for (Jogo jogo : jogos) {
			String linha = arqLeitura.ler();

			if (linha == null)
				break;

			jogo = Jogo.ler(linha);
		}

		arqLeitura.fecharArquivo();

		return jogos;
	}

	public static Fila preencherFila(Jogo[] jogos, Scanner scan) {
		Fila fila = new Fila(900);

		String busca = scan.nextLine();

		while (!busca.equals("FIM")) {
			Jogo jogo = buscarJogo(jogos, busca); // add funcao recebe string de busca p/ enfileirar o Jogo e retornar a
													// media

			if (jogo != null) {
				fila.enfileirar(jogo);

				// fila.obterMediaGols();
			}

			busca = scan.nextLine();
		}
		return fila;
	}

	public static Fila procedimentos(Jogo[] jogos, Fila fila, Scanner scan) {
		int numeroDeInteracoes = Integer.parseInt(scan.nextLine());
		char caractere;
		String elemento;
		Jogo desenfileirado;

		for (int i = 0; i < numeroDeInteracoes; i++) {
			String linha = scan.nextLine();
			caractere = linha.charAt(0);
			System.out.println(caractere);

			if (caractere == 'D') {
				try {
					desenfileirado = fila.desenfileirar();
				} catch (Exception e) {
					e.printStackTrace();
				}

				System.out.print("(D) ");
				desenfileirado.imprimir();
			}

			if (caractere == 'E') {
				elemento = linha.substring(2);

				Jogo jogo = buscarJogo(jogos, elemento);

				if (jogo != null) {
					try {
						fila.enfileirar(jogo);
					} catch (Exception e) {
						e.printStackTrace();
					} // chama a mesma função
						// fila.obterMediaGols();
				}

			}
		}

		return fila;
	}
}
