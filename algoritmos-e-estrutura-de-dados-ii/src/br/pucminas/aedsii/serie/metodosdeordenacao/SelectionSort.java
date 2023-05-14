package br.pucminas.aedsii.serie.metodosdeordenacao;

import br.pucminas.aedsii.estruturadedados.ArquivoTextoEscrita;
import br.pucminas.aedsii.estruturadedados.ArquivoTextoLeitura;
import br.pucminas.aedsii.estruturadedados.MyIO;
import br.pucminas.aedsii.estruturadedados.Serie;

public class SelectionSort {

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

		selectionSort(sortSeries, tamanho);
	}

	// SelectionSort
	private static void selectionSort(Serie[] sortSeries, int n) {

		int troca = 0;
		int comparacao = 0;

		for (int i = 0; i < (sortSeries.length - 1); i++) {
			int menor = i;

			for (int j = (i + 1); j < sortSeries.length; j++) {


				if ((sortSeries[j].getDuracao().compareTo(sortSeries[j + 1].getDuracao()) > 0)
						|| ((sortSeries[j].getDuracao().compareTo(sortSeries[j + 1].getDuracao()) == 0)
								&& (sortSeries[j].getNome().compareTo(sortSeries[j + 1].getNome()) > 0))) {
					menor = j;
					comparacao++;
				}
			}
			
			Serie temp = sortSeries[i];
			sortSeries[i] = sortSeries[menor];
			sortSeries[menor] = temp;
			troca++;
		}

		for (int i = 0; i < n; i++) {
			sortSeries[i].imprimir();
		}

		// Arquivo log

		long executionTime = System.currentTimeMillis();

		ArquivoTextoEscrita escrita = new ArquivoTextoEscrita("pucminas_selecao.txt");

		escrita.escrever("Matricula: 717623 \t" + "Tempo de execução em milisegundos: " + executionTime
				+ "\t Numero de trocas entre elementos: " + troca + "\t Numero de movimentacoes no vetor: "
				+ comparacao);

		escrita.fecharArquivo();
	}
}