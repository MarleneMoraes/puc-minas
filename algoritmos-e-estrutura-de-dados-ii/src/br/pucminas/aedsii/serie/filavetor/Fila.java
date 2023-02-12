package br.pucminas.aedsii.serie.filavetor;

import br.pucminas.aedsii.estruturadedados.Serie;

public class Fila {

	private Serie[] fila;
	private int frente;
	private int tras;
	private int tamanho;

	public Fila() {	}

	public Fila(int tamanho) {

		this.fila = new Serie[tamanho];
		this.frente = 0;
		this.tras = 0;
		this.tamanho = tamanho;
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

	public void enfileirar(Serie serie) throws Exception {

		int posicao;

		if (!filaCheia()) {
			posicao = tras % tamanho;
			fila[posicao] = serie;
			tras++;
		} 
		
		throw new Exception("Não foi possível enfileirar o novo elemento: a fila está cheia!");
	}

	public Serie desenfileirar() throws Exception {

		if (!filaVazia()) {
			int posicao = frente % tamanho;
			Serie desenfileirado = fila[posicao];
			frente++;
			return desenfileirado;
		} 
		
		throw new Exception("Não foi possível desenfileirar nenhum elemento: a fila está vazia!");
	}

	public void mostrar(Serie serie) throws Exception {

		if (!filaVazia()) {
			int posicao;

			for (int i = frente; i < tras; i++) {
				posicao = i % tamanho;
				serie = fila[posicao];
				serie.imprimir();
			}
		} 

		throw new Exception("Não foi possível mostrar o conteúdo da fila: a fila está vazia!");
	}

	public int obterMediaTemporadas(Serie[] series) {
		int soma = 0;
		int media = 0;
		int cont = 0;

		for (int i = 0; i < fila.length; i++) {
			if (fila[i] != null) {
				soma += fila[i].getNumeroDeTemporadas();
				cont++;
			}
		}
		media = soma / cont;

		return media;
	}
}
