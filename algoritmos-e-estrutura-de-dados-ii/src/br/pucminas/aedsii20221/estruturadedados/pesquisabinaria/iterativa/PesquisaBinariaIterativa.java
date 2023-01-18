package br.pucminas.aedsii20221.estruturadedados.pesquisabinaria.iterativa;

public class PesquisaBinariaIterativa {
	boolean pesquisaBinaria(int[] vet, int x) {
		boolean resp = false;
		
		int dir = (vet.length - 1), esq = 0, meio;
		
		while (esq <= dir) {
			meio = (esq + dir) / 2;
			if (x == vet[meio]) {
				resp = true;
				esq = dir + 1;
			} else if (x > vet[meio]) {
				esq = meio + 1;
			} else {
				dir = meio - 1;
			}
		}
		return resp;
	}
}
