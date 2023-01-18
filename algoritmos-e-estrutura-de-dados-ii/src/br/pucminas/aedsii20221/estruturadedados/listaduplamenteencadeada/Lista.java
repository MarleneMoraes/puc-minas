package br.pucminas.aedsii20221.estruturadedados.listaduplamenteencadeada;

import br.pucminas.aedsii20221.estruturadedados.Serie;

public class Lista {

	private Celula primeiro;
	private Celula ultimo;
	private int tamanho;

	public Lista() {	
		Celula sentinela = new Celula();
		this.primeiro = sentinela;
		this.ultimo = sentinela;
		this.tamanho = 0;
	}

	public boolean listaVazia() {

		if (this.primeiro == this.ultimo)
			return true;

		return false;
	}

	public void inserir(Serie serie, int posicao) throws Exception {

		if ((posicao >= 0) && (posicao <= tamanho)) {
			Celula anterior = this.primeiro;
			for (int i = 0; i < posicao; i++)
				anterior = anterior.getProximo();

			Celula novaCelula = new Celula(serie);

			Celula proximaCelula = anterior.getProximo();

			anterior.setProximo(novaCelula);
			novaCelula.setProximo(proximaCelula);

			proximaCelula.setAnterior(novaCelula);
			novaCelula.setAnterior(anterior);

			if (posicao == this.tamanho)
				this.ultimo = novaCelula;

			this.tamanho++;

		} else
			throw new Exception("Não foi possível inserir o item na lista: a posição informada é inválida!");
	}

	public void inserirInicio(Serie serie) {
		Celula novaCelula = new Celula(serie);

		this.primeiro.getProximo().setAnterior(novaCelula);
		novaCelula.setProximo(this.primeiro.getProximo());
		novaCelula.setAnterior(this.primeiro);
		this.primeiro.setProximo(novaCelula);

		this.tamanho++;
	}

	public void inserirFim(Serie serie) {
		Celula novaCelula = new Celula(serie);

		this.ultimo.setProximo(novaCelula);
		novaCelula.setAnterior(ultimo);
		this.ultimo = novaCelula;

		this.tamanho++;
	}

	public Serie remover(int posicao) throws Exception {

		if (!listaVazia()) {
			if (posicao <= tamanho) {
				Celula removida = primeiro.getProximo();
				
				for (int i = 0; i < posicao; i++)
					removida = removida.getProximo();

				if (!(removida == ultimo)) {
					Celula anterior = removida.getAnterior();
					Celula proximo = removida.getProximo();

					anterior.setProximo(proximo);
					proximo.setAnterior(anterior);

					removida.setAnterior(null);
					removida.setProximo(null);
					return removida.getItem();
				} else
					return removerFim();

			} else
				throw new Exception(
						"Não foi possível remover o item " + posicao + " da lista: a lista não possui valores na posicao!");
		} else
			throw new Exception("Não foi possível remover o último item da lista: a lista está vazia!");
	}

	public Serie removerInicio() throws Exception {
		if (!listaVazia()) {

			Celula removida = this.primeiro.getProximo();
			removida.getProximo().setAnterior(primeiro);
			this.primeiro.setProximo(removida.getProximo());

			removida.setAnterior(null);
			removida.setProximo(null);

			this.tamanho--;

			return removida.getItem();
		} else
			throw new Exception("Não foi possível remover o último item da lista: a lista está vazia!");
	}

	public Serie removerFim() throws Exception {
		if (!listaVazia()) {
			Celula removida = ultimo;

			Celula penultima = ultimo.getAnterior();
			penultima.setProximo(null);
			removida.setAnterior(null);

			this.ultimo = penultima;

			this.tamanho--;

			return (removida.getItem());
		} else
			throw new Exception("Não foi possível remover o último item da lista: a lista está vazia!");
	}

	public void mostrar() throws Exception {
		int posicao = 0;

		if (!listaVazia()) {
			Celula aux = primeiro.getProximo();
			while (aux != null) {
				System.out.print("[" + (posicao++) + "]");
				aux.getItem().imprimir();
				aux = aux.getProximo();
			}
		} else
			throw new Exception("Não foi possível imprimir o conteúdo da lista: a lista está vazia!");
	}

	public double obterMediaTemporadas(Serie[] series) throws Exception {
		int quantidade = 0;
		int soma = 0;
		double media = 0;
		
		if (!listaVazia()) {
			Celula aux = this.ultimo;

			while (aux != null) {
				quantidade++;
				soma += aux.getItem().getNumeroDeTemporadas();
				aux = aux.getProximo();
			}
			media = soma / quantidade;
			
			return media;
		} else
			throw new Exception("Não foi possível imprimir o conteúdo da fila: a fila está vazia!");

	}
}
