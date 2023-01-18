package br.pucminas.aedsii20222.estruturadedados.bemformada;

public class Celula {
	private Character item;
	private Celula anterior;
	private Celula proximo;

	public Celula() {
		item = null;
		proximo = null;
	}

	public Celula(Character novo) {
		item = novo;
		proximo = null;
	}


	public Character getItem() {
		return item;
	}

	public void setItem(Character item) {
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
