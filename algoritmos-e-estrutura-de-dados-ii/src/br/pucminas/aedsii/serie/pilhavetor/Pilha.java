package br.pucminas.aedsii.serie.pilhavetor;

import br.pucminas.aedsii.serie.Serie;

public class Pilha {

	private Serie[] pilha;
	private int topo;

	public Pilha() {	}

	public Pilha(int tamanho) {

		pilha = new Serie[tamanho];
		topo = 0;
	}

	public boolean pilhaVazia() {

		if (topo == 0)
			return true;

		return false;
	}

	public boolean pilhaCheia() {

		if (topo == pilha.length)
			return true;

		return false;
	}

	public void empilhar(Serie serie) throws Exception {

		if (!pilhaCheia()) {
			pilha[topo] = serie;
			topo++;
		} else
			throw new Exception("Não foi possível empilhar: a pilha está cheia!");
	}

	public Serie desempilhar() throws Exception {

		if (!pilhaVazia()) {
			topo--;
			Serie desempilhado = pilha[topo];
			return desempilhado;
		} else
			throw new Exception("Não foi possível desempilhar: a pilha está vazia!");
	}

	public void mostrar() throws Exception {

		if (!pilhaVazia()) {
			Serie serie;
			int posicao;

			for (int i = 0; i < topo; i++) {
				posicao = i % topo;
				serie = pilha[posicao];
				serie.imprimir();
			}
		} 

		throw new Exception("Não foi possível mostrar o conteúdo da fila: a fila está vazia!");
	}
	
	public Serie consultarTopo() throws Exception {

		if (!pilhaVazia()) {
			return (pilha[topo - 1]);
		} else
			throw new Exception("Não foi possível consultar o elemento do topo da pilha: a pilha está vazia!");
	}

	public int obterMediaTemporadas(Serie[] series) {
		int soma = 0;
		int media = 0;
		int cont = 0;

		for (int i = 0; i < pilha.length; i++) {
			if (pilha[i] != null) {
				soma += pilha[i].getNumeroDeTemporadas();
				cont++;
			}
		}
		media = soma / cont;

		return media;
	}
}
