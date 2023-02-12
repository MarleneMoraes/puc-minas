package br.pucminas.aedsii.serie.listavetor;

import br.pucminas.aedsii.estruturadedados.Serie;

public class Lista {

	private Serie[] lista;
	private int primeiro;
	private int ultimo;
	private int tamanho;

	public Lista() { }

	public Lista(int tamanho) {

		lista = new Serie[tamanho];
		this.tamanho = 0;
		this.primeiro = 0;
		this.ultimo = 0;
	}

	public boolean listaVazia() {

		if (this.primeiro == this.ultimo)
			return true;

		return false;
	}

	public boolean listaCheia() {

		if (ultimo == lista.length)
			return true;

		return false;
	}

	public void inserir(Serie novo, int posicao) throws Exception {

		if (!listaCheia()) {
			if ((posicao >= 0) && (posicao <= tamanho)) {
				for (int i = ultimo; i > posicao; i--)
					lista[i] = lista[i - 1];

				this.lista[posicao] = novo;

				this.tamanho++;
				this.ultimo++;
			} else
				throw new Exception("Não foi possível inserir o item na lista: posição informada é inválida!");
		} else
			throw new Exception("Não foi possível inserir o item na lista: a lista está cheia!");
	}

	public void inserirInicio(Serie novo) throws Exception {

		if (!listaCheia()) {

			for (int i = 0; i < ultimo; i++)
				lista[i + 1] = lista[i];

			this.lista[0] = novo;
			this.tamanho++;
			this.ultimo++;

		} else
			throw new Exception("Não foi possível inserir o item na lista: a lista está cheia!");
	}

	public void inserirFim(Serie novo) throws Exception {

		if (!listaCheia()) {
			this.lista[ultimo + 1] = novo;
			this.tamanho++;
			this.ultimo++;

		} else
			throw new Exception("Não foi possível inserir o item na lista: a lista está cheia!");
	}

	public Serie remover(int posicao) throws Exception {

		if (!listaVazia()) {
			if ((posicao >= 0) && (posicao < tamanho)) {

				Serie removido = lista[posicao];
				this.tamanho--;

				for (int i = posicao; i < tamanho; i++)
					lista[i] = lista[i + 1];

				this.ultimo--;

				return removido;
			} else
				throw new Exception("Não foi possível remover o item da lista: posição informada é inválida!");
		} else
			throw new Exception("Não foi possível remover o item da lista: a lista está vazia!");
	}

	public Serie removerInicio() throws Exception {

		if (!listaVazia()) {
			Serie removido = lista[0];

			for (int i = 0; i < ultimo; i++)
				lista[i] = lista[i + 1];

			this.ultimo--;

			return removido;
		} else
			throw new Exception("Não foi possível remover o item da lista: a lista está vazia!");

	}

	public Serie removerFim() throws Exception {

		if (!listaVazia()) {
			Serie removido = lista[ultimo];
			lista[ultimo] = null;

			this.ultimo--;

			return removido;
		} else 
			throw new Exception("Não foi possível remover o item da lista: a lista está vazia!");

	}

	public void mostrar() throws Exception {
		if (!listaVazia()) {
			Serie serie;
			int posicao;

			for (int i = 0; i < this.ultimo; i++) {
				posicao = i % this.ultimo;
				serie = lista[posicao];
				serie.imprimir();
			}
		}

		throw new Exception("Não foi possível mostrar o conteúdo da fila: a fila está vazia!");
	}

	public int obterMediaTemporadas(Serie[] series) {
		int soma = 0;
		int media = 0;
		int cont = 0;

		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				soma += lista[i].getNumeroDeTemporadas();
				cont++;
			}
		}
		
		media = soma / cont;

		return media;
	}
}
