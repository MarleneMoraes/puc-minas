package br.pucminas.aedsii20221.estruturadedados;

public class Inteiro {
	private int valor;

	public Inteiro(int valor) {
		this.valor = valor;
	}

	public Inteiro() {
		valor = 0;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public void imprimir() {
		System.out.println("Valor -> " + valor);
	}
}
