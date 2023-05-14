package br.pucminas.aedsii.jogo.metodosdeordenacao.merge;

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

		mergeSort();

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
	public static void mergeSort() {
		Scanner scan = new Scanner(System.in);
		Jogo[] jogos = preencherJogos();

		int jogosAdd = 0;
		int comparacao = 0;
		int troca = 0;

		Jogo[] jogosBuscados = preencherVetor(jogos, scan, jogosAdd);

		mergesort(jogosBuscados, 0, jogosAdd);

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
		String localJogo1, localJogo2;

		diaJogo1 = jogo1.getDia();
		diaJogo2 = jogo2.getDia();

		mesJogo1 = jogo1.getMes();
		mesJogo2 = jogo2.getMes();

		anoJogo1 = jogo1.getAno();
		anoJogo2 = jogo2.getAno();

		localJogo1 = jogo1.getLocal();
		localJogo2 = jogo2.getLocal();

		// local ano mes dia
		if ((localJogo1.compareTo(localJogo2) > 0) || (localJogo1.equals(localJogo2)) && (anoJogo1 > anoJogo2)
				|| (localJogo1.equals(localJogo2)) && (anoJogo1 == anoJogo2) && (mesJogo1 > mesJogo2)
				|| (localJogo1.equals(localJogo2)) && (anoJogo1 == anoJogo2) && (mesJogo1 > mesJogo2)
						&& (diaJogo1 > diaJogo2))
			return true;

		return false;
	}

	// Ordenacao por mergesort
	private static void mergesort(Jogo[] jogos, int esq, int dir) {
		if (esq < dir) {
			int meio = (esq + dir) / 2;
			mergesort(jogos, esq, meio);
			mergesort(jogos, meio + 1, dir);
			intercalar(jogos, esq, meio, dir);
		}
	}

	// Intercala os elementos localizados entre as posicoes esquerda e direita
	private static void intercalar(Jogo[] jogos, int esq, int meio, int dir) {

		int n1, n2, i, j, k;

		n1 = meio - esq + 1;
		n2 = dir - meio;

		Jogo[] a1 = new Jogo[n1];
		Jogo[] a2 = new Jogo[n2];

		for (i = 0; i < n1; i++)
			a1[i] = jogos[esq + i];

		for (j = 0; j < n2; j++)
			a2[j] = jogos[meio + j + 1];

		for (i = j = 0, k = esq; (i < n1 && j < n2); k++) {
			if (maiorValor(a1[i], a2[j]))
				jogos[k] = a2[j++];
			else
				jogos[k] = a1[i++];
		}

		if (i == n1)
			for (; k <= dir; k++)
				jogos[k] = a2[j++];

		else
			for (; k <= dir; k++)
				jogos[k] = a1[i++];

	}

	// Criacao do Arquivo Log
	private static void criarArquivoLog(int comparacao, int troca) {
		long executionTime = System.currentTimeMillis();

		ArquivoTextoEscrita escrita = new ArquivoTextoEscrita("pucminas_mergesort.txt");

		escrita.escrever("Matricula: 717623 \t" + "Tempo de execução em milisegundos: " + executionTime
				+ "\t Numero de trocas entre elementos: " + troca + "\t Numero de movimentacoes no vetor: "
				+ comparacao);

		escrita.fecharArquivo();

	}

}