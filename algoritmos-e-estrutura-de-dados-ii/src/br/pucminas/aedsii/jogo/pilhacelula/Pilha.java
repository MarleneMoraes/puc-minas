package br.pucminas.aedsii.jogo.pilhacelula;

import br.pucminas.aedsii.jogo.Celula;
import br.pucminas.aedsii.jogo.Jogo;

public class Pilha {
	private Celula fundo;
	private Celula topo;

	public Pilha(Jogo jogo) {
		Celula sentinela = new Celula();
		fundo = sentinela;
		topo = sentinela;
	}

	public boolean pilhaVazia() {
		if (this.fundo == this.topo)
			return true;

		return false;
	}

	public void empilhar(Jogo jogo) {

		Celula novaCelula = new Celula();

		novaCelula.setProximo(topo);
		this.topo = novaCelula;
	}

	public Jogo desempilhar() {

		if (!pilhaVazia()) {
			Celula desempilhado = topo;
			topo = topo.getProximo();
			desempilhado.setProximo(null);
			return (desempilhado.getItem());
		}

		return null;
	}

	public Jogo consultarTopo() {

		if (!pilhaVazia())
			return (topo.getItem());

		return null;
	}

	public void mostrar() {
		Jogo jogo = null;
		if (!pilhaVazia()) {
			int index = 0;
			Pilha temp = new Pilha(jogo);
			Celula i = this.topo;

			while (i != this.fundo) {
				temp.empilhar(i.getItem());
				i = i.getProximo();
			}

			i = temp.topo;

			while (i != temp.fundo) {
				System.out.println("[" + (index++) + "]" + i.getItem());
				i = i.getProximo();
			}

		}
	}
}
