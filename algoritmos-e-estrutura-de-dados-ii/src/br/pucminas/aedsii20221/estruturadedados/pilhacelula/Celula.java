package br.pucminas.aedsii20221.estruturadedados.pilhacelula;

import br.pucminas.aedsii20221.estruturadedados.Serie;

public class Celula {
	private Serie item;
	private Celula anterior;
	private Celula proximo;

	public Celula() {
		item = new Serie();
		proximo = null;
	}

	public Celula(Serie novo) {
		item = novo;
		proximo = null;
	}


	public Serie getItem() {
		return item;
	}

	public void setItem(Serie item) {
		this.item = item;
	}

	public Celula getProximo() {
		return proximo;
	}

	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}

	public Celula getAnterior() {
		return anterior;
	}

	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}
}
