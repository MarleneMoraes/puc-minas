package br.pucminas.aedsii.jogadornba.pilhacelula;

import br.pucminas.aedsii.jogadornba.Celula;
import br.pucminas.aedsii.jogadornba.Jogador;

public class Pilha {
	private Celula fundo;
	private Celula topo;

	public Pilha(Jogador jogador) {
		Celula sentinela = new Celula();
		fundo = sentinela;
		topo = sentinela;
	}

	public boolean pilhaVazia() {
		if (this.fundo == this.topo)
			return true;

		return false;
	}

	public void empilhar(Jogador jogador) {
		Celula novaCelula = new Celula();

		novaCelula.setProximo(topo);
		this.topo = novaCelula;
	}

	public Jogador desempilhar() {
		if (!pilhaVazia()) {
			Celula desempilhado = topo;
			topo = topo.getProximo();
			desempilhado.setProximo(null);
			return (desempilhado.getItem());
		}

		return null;
	}

	public Jogador consultarTopo() {
		if (!pilhaVazia())
			return (topo.getItem());

		return null;
	}

	public void mostrar() {
		Jogador jogador = null;
		if (!pilhaVazia()) {
			int index = 0;
			Pilha temp = new Pilha(jogador);
			Celula i = this.topo;

			while (i != this.fundo) {
				temp.empilhar(i.getItem());
				i = i.getProximo();
			}

			i = temp.topo;

			while (i != temp.fundo) {
				System.out.print("[" + (index++) + "] ");
				i.getItem().imprimir();
				i = i.getProximo();
			}

		}
	}
	}
