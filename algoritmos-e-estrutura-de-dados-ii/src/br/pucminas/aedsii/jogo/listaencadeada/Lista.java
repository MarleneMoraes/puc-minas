package br.pucminas.aedsii.jogo.listaencadeada;

import br.pucminas.aedsii.jogo.Celula;
import br.pucminas.aedsii.jogo.Jogo;

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
		
		if (primeiro == ultimo)
			return true;
		
		return false;
	}

	public void inserir(Jogo novo, int posicao) {

		Celula anterior, novaCelula, proximaCelula;

		if ((posicao >= 0) && (posicao <= tamanho)) {
			anterior = primeiro;
			for (int i = 0; i < posicao; i++)
				anterior = anterior.getProximo();

			novaCelula = new Celula(novo);

			proximaCelula = anterior.getProximo();

			anterior.setProximo(novaCelula);
			novaCelula.setProximo(proximaCelula);

			proximaCelula.setAnterior(novaCelula);
			novaCelula.setAnterior(anterior);

			if (posicao == tamanho)
				ultimo = novaCelula;

			tamanho++;

		}
	}

	public void inserirInicio(Jogo jogo) {
		Celula novaCelula = new Celula(jogo);

		primeiro.getProximo().setAnterior(novaCelula);
		novaCelula.setProximo(primeiro.getProximo());
		novaCelula.setAnterior(primeiro);
		primeiro.setProximo(novaCelula);

		tamanho++;
	}

	public void inserirFim(Jogo jogo) {
		Celula novaCelula = new Celula(jogo);

		ultimo.setProximo(novaCelula);
		novaCelula.setAnterior(ultimo);
		ultimo = novaCelula;

		tamanho++;
	}

	public Jogo remover(int posicao) {

		if (!listaVazia()) {
			if (posicao <= tamanho) {
				Celula removida = primeiro.getProximo();

				for (int i = 0; i < posicao; i++) {
					if (removida != null)
						removida = removida.getProximo();
				}

				if (removida != ultimo) {
					Celula anterior = removida.getAnterior();
					Celula proximo = removida.getProximo();

					anterior.setProximo(proximo);
					proximo.setAnterior(anterior);

					removida.setAnterior(null);
					removida.setProximo(null);

					return removida.getItem();
				} else
					return removerFim();
			}

		}

		return null;
	}

	public Jogo removerInicio() {

		if (!listaVazia()) {

			Celula removida = primeiro.getProximo();
			removida.getProximo().setAnterior(primeiro);
			primeiro.setProximo(removida.getProximo());

			removida.setAnterior(null);
			removida.setProximo(null);

			tamanho--;

			return removida.getItem();
		}
		return null;
	}

	public Jogo removerFim() {

		if (!listaVazia()) {
			Celula removida = ultimo;

			Celula penultima = ultimo.getAnterior();
			penultima.setProximo(null);
			removida.setAnterior(null);

			ultimo = penultima;

			tamanho--;

			return (removida.getItem());
		}

		return null;
	}

	public void mostrar() {
		int posicao = 0;

		if (!listaVazia()) {
			Celula aux = primeiro.getProximo();

			while (aux != null) {
				System.out.print("[" + (posicao++) + "]");
				aux.getItem().imprimir();
				aux = aux.getProximo();
			}
		}
	}
}
