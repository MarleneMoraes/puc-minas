package br.pucminas.aedsii20221.estruturadedados.arvoreavl;

import br.pucminas.aedsii20221.estruturadedados.Serie;

public class No {
	private Serie item;
	private int altura;
	private No esquerda;
	private No direita;
	
	public No() {
		this.item = new Serie();
		this.altura = 0;
		this.esquerda = null;
		this.direita = null;
	}
	
	public No(Serie registro) {
		item = registro;
		altura = 0;
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

	public int getAltura() {
		return altura;
	}

	public void setAltura() {
		
		int alturaEsq, alturaDir;
		
		if (this.direita == null)
			alturaDir = -1;
		else
			alturaDir = this.direita.getAltura();
		
		if (this.esquerda == null)
			alturaEsq = -1;
		else
			alturaEsq = this.esquerda.getAltura();
		
		if (alturaEsq > alturaDir)
			this.altura = alturaEsq + 1;
		else
			this.altura = alturaDir + 1;
	}
	
	public int getFatorBalanceamento() {
		
		int alturaEsq, alturaDir;
		
		if (this.direita == null)
			alturaDir = -1;
		else
			alturaDir = this.direita.getAltura();
		
		if (this.esquerda == null)
			alturaEsq = -1;
		else
			alturaEsq = this.esquerda.getAltura();
		
		return (alturaEsq - alturaDir);
	}
}
