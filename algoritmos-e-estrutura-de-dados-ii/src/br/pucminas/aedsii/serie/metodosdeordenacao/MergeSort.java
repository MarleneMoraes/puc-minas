package br.pucminas.aedsii.serie.metodosdeordenacao;

import br.pucminas.aedsii.estruturadedados.ArquivoTextoEscrita;
import br.pucminas.aedsii.estruturadedados.ArquivoTextoLeitura;
import br.pucminas.aedsii.estruturadedados.MyIO;
import br.pucminas.aedsii.estruturadedados.Serie;

public class MergeSort {

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

		for (Serie novo : series)
			novo.ler();

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

		int troca = 0;
		int comparacao = 0;

		mergeSort(sortSeries, tamanho, troca, comparacao);
		// Arquivo log

		long executionTime = System.currentTimeMillis();

		ArquivoTextoEscrita escrita = new ArquivoTextoEscrita("pucminas_mergesort.txt");

		escrita.escrever("Matricula: 717623 \t" + "Tempo de execução em milisegundos: " + executionTime
				+ "\t Numero de trocas entre elementos: " + troca + "\t Numero de movimentacoes no vetor: "
				+ comparacao);

		escrita.fecharArquivo();
	}

	// MergeSort
	private static void mergeSort(Serie[] sortSeries, int n, int troca, int comparacao) {
		int esq = 0;
		int dir = (sortSeries.length - 1);

		sortSeries = mergeSort(sortSeries, esq, dir, troca, comparacao);

		for (int i = 0; i < n; i++)
			sortSeries[i].imprimir();

	}

	private static Serie[] mergeSort(Serie[] sortSeries, int esq, int dir, int troca, int comparacao) {

		if (esq < dir) {
			int meio = (esq + dir) / 2;
			mergeSort(sortSeries, esq, meio, troca, comparacao);
			mergeSort(sortSeries, meio + 1, dir, troca, comparacao);
			intercalar(sortSeries, esq, meio, dir, comparacao);
		}

		return sortSeries;

	}

	private static void intercalar(Serie[] sortSeries, int esq, int meio, int dir, int comparacao) {

		int i, j, k;

		int n1 = meio - esq + 1;
		int n2 = dir - meio;

		Serie[] a1 = new Serie[n1];
		Serie[] a2 = new Serie[n2];

		for (i = 0; i < n1; i++)
			a1[i] = sortSeries[esq + i];

		for (j = 0; j < n2; j++)
			a2[j] = sortSeries[meio + j + 1];

		for (i = j = 0, k = esq; (i < n1 && j < n2); k++) {
			comparacao++;
			if ((a1[i].getIdiomaDeOrigem().compareTo(a2[j].getIdiomaDeOrigem()) < 0)
					|| (a1[i].getIdiomaDeOrigem().compareTo(a2[j].getIdiomaDeOrigem()) == 0
							&& a1[i].getNome().compareTo(a2[j].getNome()) < 0))
				sortSeries[k] = a1[i++];
			else
				sortSeries[k] = a2[j++];
		}

		if (i == n1) {
			for (; k <= dir; k++)
				sortSeries[k] = a2[j++];
		} else {
			for (; k <= dir; k++)
				sortSeries[k] = a1[i++];
		}
	}
}