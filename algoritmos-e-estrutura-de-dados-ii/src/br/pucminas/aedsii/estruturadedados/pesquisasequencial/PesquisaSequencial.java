package br.pucminas.aedsii.estruturadedados.pesquisasequencial;

public class PesquisaSequencial {

	boolean pesquisaSequencial(int[] vet, int x) {
		boolean resp = false;
		
		int n = vet.length;
		
		for (int i = 0; i < n; i++) {
			if (vet[i] == x) {
				resp = true;
				i = n;
			}
		}
		
		return resp;
	}
}
