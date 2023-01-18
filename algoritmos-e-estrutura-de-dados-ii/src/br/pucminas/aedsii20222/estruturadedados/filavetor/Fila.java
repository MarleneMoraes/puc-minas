package br.pucminas.aedsii20222.estruturadedados.filavetor;

import br.pucminas.aedsii20222.estruturadedados.Jogo;

public class Fila {
	private Jogo[] fila;
	private int frente;
	private int tras;
	private int tamanho;

	public Fila(int tamanho) {

		fila = new Jogo[tamanho];
		frente = 0;
		tras = 0;
		this.tamanho = tamanho;
	}

	public Fila() {

		fila = new Jogo[0];
		frente = 0;
		tras = 0;
		this.tamanho = 0;
	}

	public boolean filaVazia() {

		if (frente == tras)
			return true;
		
		return false;
	}

	public boolean filaCheia() {

		if (((tras + 1) % tamanho) == (frente % tamanho))
			return true;
		
		return false;
	}

	public void enfileirar(Jogo novo) throws Exception {

		if (!filaCheia()) {
			int posicao = tras % tamanho;
			fila[posicao] = novo;
			tras++;
		} else
			throw new Exception("Não foi possível enfileirar o novo elemento: a fila está cheia!");
	}

	public Jogo desenfileirar() throws Exception {

		if (!filaVazia()) {
			int posicao = frente % tamanho;
			Jogo desenfileirado = fila[posicao];
			frente++;
			return desenfileirado;
		} else
			throw new Exception("Não foi possível desenfileirar nenhum elemento: a fila está vazia!");
	}

	public void mostrar() throws Exception {

		if (!filaVazia()) {
			int posicao;
			
			for (int i = frente; i < tras; i++) {
				posicao = i % tamanho;
				fila[posicao].imprimir();
			}
		} else
			throw new Exception("Não foi possível mostrar o conteúdo da fila: a fila está vazia!");
	}
}
