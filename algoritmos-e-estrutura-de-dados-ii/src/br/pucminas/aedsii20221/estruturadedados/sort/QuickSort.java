package br.pucminas.aedsii20221.estruturadedados.sort;

public class QuickSort {
	public void sort(int[] array, int n) {
		quicksort(array, 0, n - 1);
	}

	/**
	 * Algoritmo de ordenação Quicksort.
	 * 
	 * @param int esq: início da partição a ser ordenada
	 * @param int dir: fim da partição a ser ordenada
	 */
	private void quicksort(int[] array, int esq, int dir) {

		int part;
		if (esq < dir) {
			part = particao(array, esq, dir);
			quicksort(array, esq, part - 1);
			quicksort(array, part + 1, dir);
		}
	}

	private int particao(int[] array, int inicio, int fim) {
			
		int pivot = array[fim];
		int part = inicio - 1;
		for (int i = inicio; i < fim; i++) {
			if (array[i] < pivot) {
				part++;
				swap(array, part, i);
			}
		}
		part++;
		swap(array, part, fim);
		return (part);
	}

	private void swap(int[] array, int i, int j) {

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
