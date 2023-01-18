package br.pucminas.aedsii20221.estruturadedados.metodosdeordenacao;

import br.pucminas.aedsii20221.estruturadedados.ArquivoTextoEscrita;
import br.pucminas.aedsii20221.estruturadedados.ArquivoTextoLeitura;
import br.pucminas.aedsii20221.estruturadedados.MyIO;
import br.pucminas.aedsii20221.estruturadedados.Serie;

public class InsertSort {

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

		insertSort(sortSeries, tamanho);
	}

	// BubbleSort
	private static void insertSort(Serie[] sortSeries, int n) {

		int troca = 0;
		int comparacao = 0;

		for (int i = 1; i < n; i++) {

			Serie tmp = sortSeries[i];
			int j = i - 1;

			while ((j >= 0) && (sortSeries[j].getEmissoraDeTelevisaoOriginal()
					.compareTo(tmp.getEmissoraDeTelevisaoOriginal()) > 0
					|| ((sortSeries[j].getEmissoraDeTelevisaoOriginal()
							.compareTo(tmp.getEmissoraDeTelevisaoOriginal()) == 0
							&& sortSeries[j].getNome().compareTo(tmp.getNome()) > 0)))) {
				comparacao++;
				sortSeries[j + 1] = sortSeries[j];
				troca++;
				j--;
			}
			sortSeries[j + 1] = tmp;
			troca++;

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
}