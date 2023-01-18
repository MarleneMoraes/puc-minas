package br.pucminas.aedsii20221.estruturadedados.sort;

public class Insercao {
	void sort(int[] array, int n) {
		for (int i = 1; i < n; i++) {
			int tmp = array[i];
			int j = i - 1;

			while ((j >= 0) && (array[j] > tmp)) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = tmp;
		}
	}
}
