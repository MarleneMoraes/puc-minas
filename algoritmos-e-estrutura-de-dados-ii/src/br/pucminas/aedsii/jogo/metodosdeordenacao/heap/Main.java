package br.pucminas.aedsii.jogo.metodosdeordenacao.heap;

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

		heapSort();

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

	// Ordenacao por heapsort
	public static void heapSort() {
		Scanner scan = new Scanner(System.in);
		Jogo[] jogos = preencherJogos();

		int n = 0;
		int comparacao = 0;
		int troca = 0;

		Jogo[] jogosBuscados = preencherVetor(jogos, scan, n);

		Jogo[] tmp = new Jogo[n + 1];
		for (int i = 0; i < n; i++) {
			tmp[i + 1] = jogos[i];
		}
		jogos = tmp;

		// Contrução do heap
		for (int tamHeap = 2; tamHeap <= n; tamHeap++) {
			constroi(jogosBuscados, tamHeap);
		}

		// Ordenação propriamente dita
		int tamHeap = n;
		while (tamHeap > 1) {
			troca(jogosBuscados, 1, tamHeap--);
			reconstroi(jogosBuscados, tamHeap);
		}

		// Alterar o vetor para voltar à posição zero
		tmp = jogosBuscados;
		jogos = new Jogo[n];
		for (int i = 0; i < n; i++) {
			jogosBuscados[i] = tmp[i + 1];
		}

		criarArquivoLog(comparacao, troca);

		for (Jogo jogo : jogosBuscados) {
			if (jogo != null)
				jogo.imprimir();
		}
		scan.close();
	}

	// Verificacao do maior valor para realizar a troca
	private static boolean maiorValor(Jogo jogo1, Jogo jogo2) {
		int anoJogo1, anoJogo2, mesJogo1, mesJogo2, diaJogo1, diaJogo2, golsJogo1, golsJogo2;
		String selecaoJogo1, selecaoJogo2;

		diaJogo1 = jogo1.getDia();
		diaJogo2 = jogo2.getDia();

		mesJogo1 = jogo1.getMes();
		mesJogo2 = jogo2.getMes();

		anoJogo1 = jogo1.getAno();
		anoJogo2 = jogo2.getAno();

		selecaoJogo1 = jogo1.getSelecao1();
		selecaoJogo2 = jogo2.getSelecao2();

		golsJogo1 = jogo1.getPlacarSelecao1();
		golsJogo2 = jogo1.getPlacarSelecao2();

		if ((golsJogo1 > golsJogo2) || (golsJogo1 == golsJogo2) && (selecaoJogo1.compareTo(selecaoJogo2) > 0)
				|| (golsJogo1 == golsJogo2) && (selecaoJogo1.equals(selecaoJogo2)) && (anoJogo1 > anoJogo2)
				|| (golsJogo1 == golsJogo2) && (selecaoJogo1.equals(selecaoJogo2)) && (anoJogo1 == anoJogo2)
						&& (mesJogo1 > mesJogo2)
				|| (golsJogo1 == golsJogo2) && (selecaoJogo1.equals(selecaoJogo2)) && (anoJogo1 == anoJogo2)
						&& (mesJogo1 == mesJogo2) && (diaJogo1 > diaJogo2))
			return true;

		return false;
	}

	// Construcao do heapsort
	private static void constroi(Jogo[] jogos, int tamHeap) {

		for (int i = tamHeap; i > 1 && maiorValor(jogos[i], jogos[i / 2]); i /= 2) {
			troca(jogos, i, i / 2);
		}
	}

	// Reconstrucao apos a troca
	private static void reconstroi(Jogo[] jogos, int tamHeap) {
		int i = 1;

		while (i <= (tamHeap / 2)) {
			int filho = 0;
			try {
				filho = getMaiorFilho(jogos, i, tamHeap);
			} catch (Exception e) {
				e.printStackTrace();
			}

			if (maiorValor(jogos[i], jogos[filho])) {
				troca(jogos, i, filho);
				i = filho;
			} else
				i = tamHeap;
		}
	}

	// Pegar o maior valor dos filhos
	private static int getMaiorFilho(Jogo[] jogos, int i, int tamHeap) {

		if (2 * i == tamHeap || maiorValor(jogos[2 * i], jogos[2 * i + 1]))
			return 2 * i;

		return 2 * i + 1;

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

		ArquivoTextoEscrita escrita = new ArquivoTextoEscrita("pucminas_heapsort.txt");

		escrita.escrever("Matricula: 717623 \t" + "Tempo de execução em milisegundos: " + executionTime
				+ "\t Numero de trocas entre elementos: " + troca + "\t Numero de movimentacoes no vetor: "
				+ comparacao);

		escrita.fecharArquivo();

	}

}