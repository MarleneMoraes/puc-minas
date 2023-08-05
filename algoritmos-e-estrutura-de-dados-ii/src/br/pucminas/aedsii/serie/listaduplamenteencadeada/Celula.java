package br.pucminas.aedsii.serie.listaduplamenteencadeada;

import br.pucminas.aedsii.serie.Serie;

public class Celula {
	private Serie item;
	private Celula anterior;
	private Celula proximo;

	public Celula() {
		this.item = new Serie();
		this.anterior = null;
		this.proximo = null;
	}

	public Celula(Serie serie) {
		this.item = serie;
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
