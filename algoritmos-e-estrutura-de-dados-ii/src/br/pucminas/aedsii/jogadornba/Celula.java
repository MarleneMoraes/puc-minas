package br.pucminas.aedsii.jogadornba;

public class Celula {
	private Jogador item;
	private Celula anterior;
	private Celula proximo;

	public Celula() {
		item = new Jogador();
		proximo = null;
	}

	public Celula(Jogador novo) {
		item = novo;
		proximo = null;
	}


	public Jogador getItem() {
		return item;
	}

	public void setItem(Jogador item) {
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
