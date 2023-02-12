package br.pucminas.aedsii.estruturadedados.list;

import br.pucminas.aedsii.estruturadedados.Celula;
import br.pucminas.aedsii.estruturadedados.Inteiro;

public class ListaDuplamenteEncadeada {

	private Celula primeiro;
	private Celula ultimo;
	private int tamanho;

	public ListaDuplamenteEncadeada() {

		Celula sentinela;

		sentinela = new Celula();

		primeiro = sentinela;
		ultimo = sentinela;

		tamanho = 0;
	}

	public boolean listaVazia() {

		boolean resp;

		if (primeiro == ultimo)
			resp = true;
		else
			resp = false;

		return resp;
	}

	public void inserirFinal(Inteiro novo) {

		Celula novaCelula;

		novaCelula = new Celula(novo);

		ultimo.setProximo(novaCelula);
		novaCelula.setAnterior(ultimo);

		ultimo = novaCelula;

		tamanho++;

	}

	public Inteiro removerFinal() throws Exception {

		Celula removida, penultima;

		if (!listaVazia()) {

			removida = ultimo;

			penultima = ultimo.getAnterior();
			penultima.setProximo(null);
			removida.setAnterior(null);

			ultimo = penultima;

			tamanho--;

			return (removida.getItem());
		} else
			throw new Exception("Não foi possível remover o último item da lista: a lista está vazia!");
	}

	public void imprimir() throws Exception {

		Celula aux;

		if (!listaVazia()) {
			System.out.println("Conteúdo da lista:");
			aux = primeiro.getProximo();
			while (aux != null) {
				aux.getItem().imprimir();
				aux = aux.getProximo();
			}
		} else
			throw new Exception("Não foi possível imprimir o conteúdo da lista: a lista está vazia!");
	}
}