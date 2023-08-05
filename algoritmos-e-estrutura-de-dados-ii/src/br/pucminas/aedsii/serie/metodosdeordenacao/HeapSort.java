package br.pucminas.aedsii.serie.metodosdeordenacao;

import br.pucminas.aedsii.estruturadedados.ArquivoTextoEscrita;
import br.pucminas.aedsii.estruturadedados.ArquivoTextoLeitura;
import br.pucminas.aedsii.estruturadedados.MyIO;
import br.pucminas.aedsii.serie.Serie;

public class HeapSort {

	public static void main(String[] args) {
		MyIO.setCharset("UTF-8");

		int tamanho = 0;

		ArquivoTextoLeitura arqLeitura = new ArquivoTextoLeitura("/tmp/data.txt");

		String string = arqLeitura.ler();

		while (string != null) {
			tamanho += 1;
			string = arqLeitura.ler();
		}

		Serie[] series = new Serie[tamanho];

		for (Serie novo : series) {
			novo.ler();
		}

		arqLeitura.fecharArquivo();

		int inputCount = 0;

		tamanho = MyIO.readInt();

		Serie[] sortSeries = new Serie[tamanho];

		while (inputCount < tamanho) {
			string = MyIO.readLine();
			for (int i = 0; i < series.length; i++) {
				if (string.equals(series[i].getNome())) {
					sortSeries[inputCount] = new Serie(series[i].getNome(), series[i].getFormato(),
							series[i].getDuracao(), series[i].getPaisDeOrigem(), series[i].getIdiomaDeOrigem(),
							series[i].getEmissoraDeTelevisaoOriginal(), series[i].getDataDeInicio(),
							series[i].getNumeroDeTemporadas(), series[i].getNumeroDeEpisodios());
				}
			}
			inputCount++;
		}

		heapSort(sortSeries, tamanho);
	}

	// HeapSort
	private static void heapSort(Serie[] sortSeries, int n) {

		int troca = 0;
		int comparacao = 0;

		Serie[] tmp = new Serie[n + 1];
		for (int i = 0; i < n; i++) {
			tmp[i + 1] = sortSeries[i];
		}
		sortSeries = tmp;

		// Contrução do heap
		for (int tamanho = 2; tamanho <= n; tamanho++) {
			constroi(sortSeries, tamanho, troca);
		}

		// Ordenação propriamente dita
		int tamanho = n;
		while (tamanho > 1) {
			trocar(sortSeries, 1, tamanho--, troca);
			reconstroi(sortSeries, tamanho, comparacao, troca);
		}

		// Alterar o vetor para voltar à posição zero
		tmp = sortSeries;
		sortSeries = new Serie[n];
		for (int i = 0; i < n; i++) {
			sortSeries[i] = tmp[i + 1];
		}

		// Arquivo log

		long executionTime = System.currentTimeMillis();

		ArquivoTextoEscrita escrita = new ArquivoTextoEscrita("pucminas_heapsort.txt");

		escrita.escrever("Matricula: 717623 \t" + "Tempo de execução em milisegundos: " + executionTime
				+ "\t Numero de trocas entre elementos: " + troca + "\t Numero de movimentacoes no vetor: "
				+ comparacao);

		escrita.fecharArquivo();
	}

	private static void constroi(Serie[] sortSeries, int tamanho, int troca) {

		for (int i = tamanho; i > 1
				&& sortSeries[i].getNumeroDeTemporadas() > sortSeries[i / 2].getNumeroDeTemporadas(); i /= 2)
			trocar(sortSeries, i, i / 2, troca);

	}

	private static void reconstroi(Serie[] sortSeries, int tamanho, int comparacao, int troca) {

		int i = 1;

		while (i <= (tamanho / 2)) {
			int filho = getMaiorFilho(sortSeries, i, tamanho, comparacao);

			if ((sortSeries[i].getNumeroDeTemporadas() < sortSeries[filho].getNumeroDeTemporadas())
					|| ((sortSeries[i].getNumeroDeTemporadas() == sortSeries[filho].getNumeroDeTemporadas())
							&& (sortSeries[i].getNome().compareTo(sortSeries[filho].getNome()) < 0))) {
				trocar(sortSeries, i, filho, troca);
				i = filho;
			} else
				i = tamanho;

			comparacao++;
		}
	}

	private static int getMaiorFilho(Serie[] sortSeries, int i, int tamanho, int comparacao) {

		int filho;

		if (2 * i == tamanho
				|| sortSeries[2 * i].getNumeroDeTemporadas() > sortSeries[2 * i + 1].getNumeroDeTemporadas()
				|| (sortSeries[2 * i].getNumeroDeTemporadas() == sortSeries[2 * i + 1].getNumeroDeTemporadas()
						&& sortSeries[2 * i].getNome().compareTo(sortSeries[2 * i + 1].getNome()) > 0)) {
			filho = 2 * i;
		} else
			filho = 2 * i + 1;

		comparacao++;

		return filho;
	}

	private static void trocar(Serie[] sortSeries, int i, int j, int troca) {
		Serie temp = sortSeries[i];

		sortSeries[i] = sortSeries[j];
		sortSeries[j] = temp;

		troca++;
	}
}