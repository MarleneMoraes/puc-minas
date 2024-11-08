package br.pucminas.aedsii.estruturadedados;

public class Celula {
	private Inteiro item;
	private Celula anterior;
	private Celula proximo;

	public Celula() {
		item = new Inteiro();
		proximo = null;
	}

	public Celula(Inteiro novo) {
		item = novo;
		proximo = null;
	}


	public Inteiro getItem() {
		return item;
	}

	public void setItem(Inteiro item) {
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
