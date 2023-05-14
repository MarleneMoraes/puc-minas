package br.pucminas.aedsii.jogo.metodosdeordenacao.quick;

import java.util.Scanner;

import br.pucminas.aedsii.estruturadedados.ArquivoTextoEscrita;
import br.pucminas.aedsii.estruturadedados.ArquivoTextoLeitura;
import br.pucminas.aedsii.jogo.Jogo;

/**
 * @authors 
 * Marcus Vinicius 
 * Marlene Moraes 
 * Matheus Mello
 *
 */

public class Main {
	public static void main(String[] args) {

		quickSort();

	}

	// Preenchimento do vetor de Jogos atraves da leitura de arquivos
	private static Jogo[] preencherJogos() {
		String PATH = "partidas.txt"; // No VERDE:
										// "tmp\partidas.txt"

		Jogo[] jogos = new Jogo[1000];

		ArquivoTextoLeitura arqLeitura = new ArquivoTextoLeitura(PATH);

		String linha = ArquivoTextoLeitura.ler();

		for (int i = 0; i < jogos.length; i++) {
			if (linha != null)
				jogos[i] = Jogo.ler(linha);

			linha = ArquivoTextoLeitura.ler();
		}

		arqLeitura.fecharArquivo();

		return jogos;
	}

	// Preenchimento do vetor de Jogos atraves da busca inserida no console
	private static Jogo[] preencherVetor(Jogo[] jogos, Scanner scan, int jogosAdd) {
		Jogo[] jogosBuscados = new Jogo[700];

		int numeroBuscas = Integer.parseInt(scan.nextLine());

		for (int i = 0; i < numeroBuscas; i++) {
			String busca = scan.nextLine();

			if (buscarJogo(jogos, busca) != null)
				jogosBuscados[jogosAdd++] = buscarJogo(jogos, busca);

		}

		return jogosBuscados;
	}

	// Busca de jogo solicitada pelo console
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

	// Ordenacao rapida
	public static void quickSort() {
		Scanner scan = new Scanner(System.in);
		Jogo[] jogos = preencherJogos();

		int jogosAdd = 0;
		int comparacao = 0;
		int troca = 0;

		Jogo[] jogosBuscados = preencherVetor(jogos, scan, jogosAdd);

		quickSort(jogosBuscados, jogosAdd);

		criarArquivoLog(comparacao, troca);

		for (Jogo jogo : jogosBuscados) {
			if (jogo != null)
				jogo.imprimir();
		}
		scan.close();
	}

	// Verificacao do maior valor para realizar a troca
	private static boolean maiorValor(Jogo jogo1, Jogo jogo2) {
		int anoJogo1, anoJogo2, mesJogo1, mesJogo2, diaJogo1, diaJogo2;
		String etapaJogo1, etapaJogo2, selecaoJogo1, selecaoJogo2;

		diaJogo1 = jogo1.getDia();
		diaJogo2 = jogo2.getDia();

		mesJogo1 = jogo1.getMes();
		mesJogo2 = jogo2.getMes();

		anoJogo1 = jogo1.getAno();
		anoJogo2 = jogo2.getAno();

		selecaoJogo1 = jogo1.getSelecao1();
		selecaoJogo2 = jogo2.getSelecao2();

		etapaJogo1 = jogo1.getEtapa();
		etapaJogo2 = jogo2.getEtapa();

		if ((anoJogo1 > anoJogo2) || (anoJogo1 == anoJogo2) && (mesJogo1 > mesJogo2)
				|| (anoJogo1 == anoJogo2) && (mesJogo1 == mesJogo2) && (diaJogo1 > diaJogo2)
				|| (anoJogo1 == anoJogo2) && (mesJogo1 == mesJogo2) && (diaJogo1 == diaJogo2)
						&& (etapaJogo1.compareTo(etapaJogo2) > 0)
				|| (anoJogo1 == anoJogo2) && (mesJogo1 == mesJogo2) && (diaJogo1 == diaJogo2)
						&& (etapaJogo1.equals(etapaJogo2)) && (selecaoJogo1.compareTo(selecaoJogo2) == 1))
			return true;

		return false;
	}

	// Metodo de ordenacao rapida
	public static void quickSort(Jogo[] jogos, int n) {
		ordenacao(jogos, 0, n - 1);
	}

	// Ordenacao dos elementos quick
	private static void ordenacao(Jogo[] jogos, int esq, int dir) {

		int part;
		if (esq < dir) {
			part = particao(jogos, esq, dir);
			ordenacao(jogos, esq, part - 1);
			ordenacao(jogos, part + 1, dir);
		}
	}

	// Particiona para ordenacao rapida dos elementos
	private static int particao(Jogo[] jogos, int inicio, int fim) {

		Jogo pivot = jogos[fim];
		int part = inicio - 1;
		for (int i = inicio; i < fim; i++) {

			if (maiorValor(jogos[i], pivot) == true) {
				part++;
				troca(jogos, part, i);
			}
		}
		part++;
		troca(jogos, part, fim);
		return (part);
	}

	// Trocar um elemento pelo outro
	private static void troca(Jogo[] jogos, int i, int j) {
		Jogo temp = jogos[i];
		jogos[i] = jogos[j];
		jogos[j] = temp;
	}

	// Criacao do Arquivo Log
	private static void criarArquivoLog(int comparacao, int troca) {
		long executionTime = System.currentTimeMillis();

		ArquivoTextoEscrita escrita = new ArquivoTextoEscrita("pucminas_quicksort.txt");

		escrita.escrever("Matricula: 717623 \t" + "Tempo de execução em milisegundos: " + executionTime
				+ "\t Numero de trocas entre elementos: " + troca + "\t Numero de movimentacoes no vetor: "
				+ comparacao);

		escrita.fecharArquivo();

	}

}