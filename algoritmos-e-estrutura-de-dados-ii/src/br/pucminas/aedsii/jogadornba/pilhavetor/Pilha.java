package br.pucminas.aedsii.jogadornba.pilhavetor;

import br.pucminas.aedsii.jogadornba.Jogador;

public class Pilha {
	private Jogador pilha[];
	private int topo;

	public Pilha(int tamanho) {
		pilha = new Jogador[tamanho];
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

	public Jogador desempilhar() {
		if (!pilhaVazia()) {
			topo--;
			Jogador desempilhado = pilha[topo];
			return desempilhado;
		}

		return null;
	}

	public void empilhar(Jogador novo) {
		if (!pilhaCheia()) {
			pilha[topo] = novo;
			topo++;
		}
	}

	public Jogador consultarTopo() {
		if (!pilhaVazia())
			return (pilha[topo - 1]);

		return null;
	}

	public void mostrar() {
		if (!pilhaVazia()) {
			for (int i = 0; i < topo; i++) {
				System.out.print("[" + i + "] ");
				pilha[i].imprimir();
			}
		}
	}
}
