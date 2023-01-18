package br.pucminas.aedsii20221.estruturadedados.arvoreabb;

import br.pucminas.aedsii20221.estruturadedados.Serie;

public class No {
	private Serie item;
	private No esquerda;
	private No direita;

	public No() {

		item = new Serie();
		esquerda = null;
		direita = null;
	}

	public No(Serie registro) {

		item = registro;
		esquerda = null;
		direita = null;
	}

	public Serie getItem() {
		return item;
	}

	public void setItem(Serie item) {
		this.item = item;
	}

	public No getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(No esquerda) {
		this.esquerda = esquerda;
	}

	public No getDireita() {
		return direita;
	}

	public void setDireita(No direita) {
		this.direita = direita;
	}
}
