package br.pucminas.aedsii20222.estruturadedados.metodosdeordenacao;

import java.util.Scanner;
import br.pucminas.aedsii20222.estruturadedados.ArquivoTextoLeitura;
import br.pucminas.aedsii20222.estruturadedados.Jogo;

/**
 * @authors 
 * Marcus Vinicius 
 * Marlene Moraes 
 * Matheus Mello
 *
 */
public class QuickSort {
	public static void main(String[] args) {
		Jogo[] jogos = new Jogo[1000];

		ArquivoTextoLeitura arqLeitura = new ArquivoTextoLeitura("/tmp/partidas.txt");

		String linha = arqLeitura.ler();

		for (int i = 0; i < jogos.length; i++) {
			jogos[i] = Jogo.ler(linha);

			linha = arqLeitura.ler();
		}

		arqLeitura.fecharArquivo();

		Scanner scan = new Scanner(System.in);

		Jogo[] jogosBuscados = new Jogo[1000];

		int numeroBuscas = Integer.parseInt(scan.nextLine());
		int jogosAdd = 0;

		for (int i = 0; i < numeroBuscas; i++) {
			String busca = scan.nextLine();

			if (buscarJogo(jogos, busca) != null)
				jogosBuscados[jogosAdd++] = buscarJogo(jogos, busca);

		}

		quickSort(jogosBuscados, jogosAdd);

		for (Jogo jogo : jogosBuscados)
			jogo.imprimir();

		scan.close();
	}

	// busca de jogo
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

	public static void quickSort(Jogo[] jogos, int n) {
		ordenacao(jogos, 0, n - 1);
	}

	private static void ordenacao(Jogo[] jogos, int esq, int dir) {

		int part;
		if (esq < dir) {
			part = particao(jogos, esq, dir);
			ordenacao(jogos, esq, part - 1);
			ordenacao(jogos, part + 1, dir);
		}
	}

	private static int particao(Jogo[] jogos, int inicio, int fim) {
		// ano, mes, dia, etapa, selecao 1

		Jogo pivot = jogos[fim];
		int part = inicio - 1;
		for (int i = inicio; i < fim; i++) {

			if (maiorValor(jogos[i], pivot) ==true) {
				part++;
				troca(jogos, part, i);
			}
		}
		part++;
		troca(jogos, part, fim);
		return (part);
	}

	private static boolean maiorValor(Jogo jogo1, Jogo jogo2) {
		int anoJogo1, anoJogo2, mesJogo1, mesJogo2, diaJogo1, diaJogo2;
		String etapaJogo1, etapaJogo2, selecaoJogo1, selecaoJogo2;

		diaJogo1 = jogo1.getDia();
		diaJogo2 = jogo2.getDia();

		mesJogo1 = jogo1.getMes();
		mesJogo2 = jogo2.getMes();

		anoJogo1 = jogo1.getAno();
		anoJogo2 = jogo2.getAno();

		etapaJogo1 = jogo1.getEtapa();
		etapaJogo2 = jogo2.getEtapa();

		selecaoJogo1 = jogo1.getSelecao1();
		selecaoJogo2 = jogo2.getSelecao2();

		if (anoJogo1 > anoJogo2)
			return true;

		if (anoJogo1 == anoJogo2) {
			if (mesJogo1 > mesJogo2)
				return true;

			if (mesJogo1 == mesJogo2) {
				if (diaJogo1 > diaJogo2)
					return true;

				if (diaJogo1 == diaJogo2) {
					if (etapaJogo1.compareTo(etapaJogo2) == 1)
						return true;

					if (etapaJogo1.equals(etapaJogo2)) {
						if (etapaJogo1.compareTo(etapaJogo2) == 1)
							return true;

						if (etapaJogo1.equals(etapaJogo2)) {
							if (selecaoJogo1.compareTo(selecaoJogo2) == 1)
								return true;
						}
					}
				}
			}
		}
		return false;
	}

	private static void troca(Jogo[] jogos, int i, int j) {
		Jogo temp = jogos[i];
		jogos[i] = jogos[j];
		jogos[j] = temp;
	}
}