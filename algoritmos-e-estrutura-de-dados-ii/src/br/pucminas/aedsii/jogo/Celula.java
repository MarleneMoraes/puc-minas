package br.pucminas.aedsii.jogo;

public class Celula {
	private Jogo item;
	private Celula anterior;
	private Celula proximo;

	public Celula() {
		item = new Jogo();
		proximo = null;
	}

	public Celula(Jogo novo) {
		item = novo;
		proximo = null;
	}


	public Jogo getItem() {
		return item;
	}

	public void setItem(Jogo item) {
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
