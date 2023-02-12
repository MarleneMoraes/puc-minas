package br.pucminas.aedsii.jogo.listavetor;

import br.pucminas.aedsii20222.estruturadedados.Jogo;

public class Lista {
	private Jogo[] lista;
	private int primeiro;
	private int ultimo;
	private int tamanho;

	public Lista() { }

	public Lista(int tamanho) {
		this.lista = new Jogo[tamanho];
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

	public void inserirInicio(Jogo novo) {
		if (!listaCheia()) {
			for (int i = 0; i < ultimo; i++)
				lista[i + 1] = lista[i];

			this.lista[0] = novo;
			this.tamanho++;
			this.ultimo++;
		}
	}

	public void inserir(Jogo novo, int posicao) {

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

	public void inserirFim(Jogo novo) {

		if (!listaCheia()) {
			this.lista[ultimo + 1] = novo;
			this.tamanho++;
			this.ultimo++;

		}
	}

	public Jogo removerInicio() {

		Jogo removido;

		if (!listaVazia()) {
			removido = lista[0];
			for (int i = 0; i < ultimo; i++) {
				lista[i] = lista[i + 1];
			}

			ultimo--;

			return removido;
		}

		return null;
	}

	public Jogo remover(int posicao) {

		if (!listaVazia()) {
			if ((posicao >= 0) && (posicao < tamanho)) {

				Jogo removido = lista[posicao];
				tamanho--;

				for (int i = posicao; i < tamanho; i++)
					lista[i] = lista[i + 1];

				ultimo--;

				return removido;
			}
		}

		return null;
	}

	public Jogo removerFim() {

		if (!listaVazia()) {
			Jogo removido = lista[ultimo];
			lista[ultimo] = null;

			ultimo--;

			return removido;
		}

		return null;

	}

	public void mostrar() {

		if (!listaVazia()) {

			for (int i = primeiro; i < ultimo; i++) {
				System.out.print("[" + i + "]");
				lista[i].printValues();
			}
		}
	}
}
