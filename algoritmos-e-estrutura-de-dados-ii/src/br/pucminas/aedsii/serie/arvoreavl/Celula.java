package br.pucminas.aedsii.serie.arvoreavl;

import br.pucminas.aedsii.estruturadedados.Serie;

public class Celula {
	private Serie item;
	private Celula anterior;
	private Celula proximo;

	public Celula(Serie nova) {
		this.item = nova;
		this.anterior = null;
		this.proximo = null;
	}

	public Celula() {
		this.item = new Serie();
		this.anterior = null;
		this.proximo = null;
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
