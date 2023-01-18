package br.pucminas.aedsii20221.estruturadedados.pesquisabinaria.recursiva;

public class PesquisaBinariaRecursiva {
	public boolean pesquisaBinariaRecursiva(int[] vet, int x) {
		return pesquisaBinariaRecursiva(vet, x, 0, (vet.length - 1));
	}

	public boolean pesquisaBinariaRecursiva(int[] vet, int x, int esq, int dir) {
		boolean resp;
		
		int meio = (esq + dir) / 2;
		
		if (esq > dir) {
			resp = false;
		} else if (x == vet[meio]) {
			resp = true;
		} else if (x > vet[meio]) {
			resp = pesquisaBinariaRecursiva(vet, x, meio + 1, dir);
		} else {
			resp = pesquisaBinariaRecursiva(vet, x, esq, meio - 1);
		}
		
		return resp;
	}
}
