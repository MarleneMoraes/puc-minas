package br.pucminas.aedsii.jogo.filavetor;

import java.util.Scanner;

import br.pucminas.aedsii.estruturadedados.ArquivoTextoLeitura;
import br.pucminas.aedsii.jogo.Jogo;

public class Main {

	public static void main(String[] args) throws Exception {
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

		for (@SuppressWarnings("unused") Jogo jogo : jogos) {
			String linha = ArquivoTextoLeitura.ler();

			if (linha == null)
				break;

			jogo = Jogo.ler(linha);
		}

		arqLeitura.fecharArquivo();

		return jogos;
	}

	public static Fila preencherFila(Jogo[] jogos, Scanner scan) throws Exception {
		Fila fila = new Fila(900);

		String busca = scan.nextLine();

		while (!busca.equals("FIM")) {
			Jogo jogo = buscarJogo(jogos, busca); // add funcao recebe string de busca p/ enfileirar o Jogo e retornar a
													// media

			if (jogo != null) {
				fila.enfileirar(jogo);

				System.out.println((int) fila.obterMediaGols(jogos));
			}

			busca = scan.nextLine();
		}
		return fila;
	}

	public static Fila procedimentos(Jogo[] jogos, Fila fila, Scanner scan) {
		int numeroDeInteracoes = Integer.parseInt(scan.nextLine());
		char caractere;
		String elemento;
		Jogo desenfileirado = null;

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
					} 
					
					System.out.println((int) fila.obterMediaGols(jogos));
				}

			}
		}

		return fila;
	}
}
