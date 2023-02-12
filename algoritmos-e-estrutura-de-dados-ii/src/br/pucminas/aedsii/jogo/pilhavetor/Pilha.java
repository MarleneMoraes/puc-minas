package br.pucminas.aedsii.jogo.pilhavetor;

import br.pucminas.aedsii20222.estruturadedados.Jogo;

public class Pilha {
	private Jogo[] pilha;
	private int topo;

	public Pilha() { }

	public Pilha(int tamanho) {

		pilha = new Jogo[tamanho];
		topo = 0;
	}

	public boolean pilhaCheia() {

		if (topo == pilha.length)
			return true;

		return false;
	}

	public boolean pilhaVazia() {

		if (topo == 0)
			return true;

		return false;
	}

	public Jogo desempilhar() {

		Jogo desempilhado;

		if (!pilhaVazia()) {
			topo--;
			desempilhado = pilha[topo];
			return desempilhado;
		}

		return null;
	}

	public void empilhar(Jogo novo) {

		if (!pilhaCheia()) {
			pilha[topo] = novo;
			topo++;
		}
	}

	public Jogo consultarTopo() {

		if (!pilhaVazia())
			return (pilha[topo - 1]);

		return null;
	}
	
	public void mostrar() {

		if (!pilhaVazia()) {
			Jogo jogo;
			int posicao;

			for (int i = 0; i < topo; i++) {
				posicao = i % topo;
				jogo = pilha[posicao];
				jogo.printValues();
			}
		} 
	}
	
}
