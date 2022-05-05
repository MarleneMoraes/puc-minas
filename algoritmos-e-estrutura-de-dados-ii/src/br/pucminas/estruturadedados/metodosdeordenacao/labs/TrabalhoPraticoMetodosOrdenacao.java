package br.pucminas.estruturadedados.metodosdeordenacao.labs;

public class TrabalhoPraticoMetodosOrdenacao {
	void bubbleSort(int[] array, int n) {
		for (int i = (n - 1); i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {

					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
	
	void insertion(int[] array, int n) {
		for (int i = (n - 1); i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {

					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
	
	void selection (int[] array, int n) {
		for (int i = 0; i < (n - 1); i++) {
			int menor = i;
			for (int j = (i + 1); j < n; j++) {
				if (array[menor] > array[j]) {
					menor = j;
				}
			}
			int temp = array[i];
			array[i] = array[menor];
			array[menor] = temp;
		}
	}
}
