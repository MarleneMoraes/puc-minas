package br.pucminas.aedsii.jogadornba.listavetor;

import br.pucminas.aedsii.jogadornba.Jogador;

public class Lista {
	private Jogador[] lista;
	private int primeiro;
	private int ultimo;
	private int tamanho;

	public Lista() {
	}

	public Lista(int tamanho) {
		this.lista = new Jogador[tamanho];
		this.primeiro = 0;
		this.ultimo = 0;
		this.tamanho = 0;
	}

	public boolean listaVazia() {
		if (this.primeiro == this.ultimo)
			return true;

		return false;
	}

	public boolean listaCheia() {
		if (this.ultimo == lista.length)
			return true;

		return false;
	}

	public void inserirInicio(Jogador novo) {
		if (!listaCheia()) {

			for (int i = 0; i < ultimo; i++)
				lista[i + 1] = lista[i];

			this.lista[0] = novo;
			this.tamanho++;
			this.ultimo++;
		}
	}

	public void inserir(Jogador novo, int posicao) {

		if (!listaCheia()) {
			if ((posicao >= 0) && (posicao <= tamanho)) {
				for (int i = ultimo; i > posicao; i--)
					this.lista[i] = lista[i - 1];

				this.lista[posicao] = novo;

				this.ultimo++;
				this.tamanho++;
			}
		}
	}

	public void inserirFim(Jogador novo) {

		if (!listaCheia()) {
			this.lista[ultimo + 1] = novo;
			this.tamanho++;
			this.ultimo++;
		}
	}

	public Jogador removerInicio() {

		if (!listaVazia()) {
			Jogador removido = lista[0];
			for (int i = 0; i < ultimo; i++) {
				lista[i] = lista[i + 1];
			}

			ultimo--;

			return removido;
		}

		return null;
	}

	public Jogador remover(int posicao) {

		if (!listaVazia()) {
			if ((posicao >= 0) && (posicao < tamanho)) {

				Jogador removido = lista[posicao];
				tamanho--;

				for (int i = posicao; i < tamanho; i++)
					lista[i] = lista[i + 1];

				ultimo--;

				return removido;
			}
		}

		return null;
	}

	public Jogador removerFim() {

		if (!listaVazia()) {
			Jogador removido = lista[ultimo];
			lista[ultimo] = null;

			ultimo--;

			return removido;
		}

		return null;

	}

	public void mostrar() {
		if (!listaVazia()) {
			int i = 1;

			for (Jogador jogador : lista) {
				if (jogador != null) {
					System.out.print("[" + i + "]");
					lista[i].imprimir();
					i++;
				}
			}
		}
	}
}
