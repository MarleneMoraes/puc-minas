package br.pucminas.aedsii20221.estruturadedados.metodosdeordenacao;

import br.pucminas.aedsii20221.estruturadedados.ArquivoTextoEscrita;
import br.pucminas.aedsii20221.estruturadedados.ArquivoTextoLeitura;
import br.pucminas.aedsii20221.estruturadedados.MyIO;
import br.pucminas.aedsii20221.estruturadedados.Serie;

public class QuickSort {

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

		quicksort(sortSeries, tamanho, 0, sortSeries.length-1);
	}

	// BubbleSort
	private static void quicksort(Serie[] sortSeries, int n, int esq, int dir) {

		int troca = 0;
		int comparacao = 0;

		if (esq < dir) {
			int part = particao(sortSeries, esq, dir, troca, comparacao);
			quicksort(sortSeries, esq, part - 1, part);
			quicksort(sortSeries, part + 1, dir, part);
		}

		for (int i = 0; i < n; i++) {
			sortSeries[i].imprimir();
		}

		// Arquivo log

		long executionTime = System.currentTimeMillis();

		ArquivoTextoEscrita escrita = new ArquivoTextoEscrita("pucminas_bolha.txt");

		escrita.escrever("Matricula: 717623 \t" + "Tempo de execução em milisegundos: " + executionTime
				+ "\t Numero de trocas entre elementos: " + troca + "\t Numero de movimentacoes no vetor: "
				+ comparacao);

		escrita.fecharArquivo();
	}
	
	private static boolean comparar(Serie serie1, Serie serie2, int comparacao) {

		if (serie1.getNumeroDeEpisodios() < serie2.getNumeroDeEpisodios()) {
			comparacao++;
			return true;
		} else if (serie1.getNumeroDeEpisodios() == serie2.getNumeroDeEpisodios()) {
			if (serie1.getNome().compareTo(serie2.getNome()) < 0) 
				return true;
		}
		return false;
	}

	private static int particao(Serie[] vetOrd, int inicio, int fim, int troca, int comparacao) {

		Serie pivot = vetOrd[fim];
		int part = inicio - 1;
		for (int i = inicio; i < fim; i++) {
			if (comparar(vetOrd[i], pivot, comparacao) == true) {
				part++;
				trocar(vetOrd, part, i, troca);
			}
		}
		part++;
		trocar(vetOrd, part, fim, troca);
		return (part);
	}

	private static void trocar(Serie[] vetOrd, int i, int j, int troca) {
		Serie temp = vetOrd[i];
		vetOrd[i] = vetOrd[j];
		vetOrd[j] = temp;
		troca++;
	}
}