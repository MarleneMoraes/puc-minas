package br.pucminas.aedsii.estruturadedados.queue;

import br.pucminas.aedsii.estruturadedados.Inteiro;

public class FilaVetor {
	private Inteiro[] fila;
	private int frente;
	private int tras;
	private int tamanho;

	public FilaVetor (int tamanho) {
		fila = new Inteiro[tamanho];
		frente = 0;
		tras = 0;
		this.tamanho = tamanho;
	}

	public boolean filaVazia() {
		boolean resp;

		if (frente == tras)
			resp = true;
		else
			resp = false;

		return resp;
	}

	public boolean filaCheia() {

		boolean resp;

		if (((tras + 1) % tamanho) == (frente % tamanho))
			resp = true;
		else
			resp = false;

		return resp;
	}

	public void enfileirar(Inteiro novo) throws Exception {

		int posicao;

		if (!filaCheia()) {
			posicao = tras % tamanho;
			fila[posicao] = novo;
			tras++;
		} else
			throw new Exception("Não foi possível enfileirar o novo elemento: a fila está cheia!");
	}

	public Inteiro desenfileirar() throws Exception {

		Inteiro desenfileirado;
		int posicao;

		if (!filaVazia()) {
			posicao = frente % tamanho;
			desenfileirado = fila[posicao];
			frente++;
			return desenfileirado;
		} else
			throw new Exception("Não foi possível desenfileirar nenhum elemento: a fila está vazia!");
	}

	public void imprimir() throws Exception {

		int posicao;
		if (!filaVazia()) {
			System.out.println("Conteúdo da fila:");
			
			for (int i = frente; i < tras; i++) {
				posicao = i % tamanho;
				System.out.print("Posição: " + posicao + ": ");
				fila[posicao].imprimir();
			}
		} else
			throw new Exception("Não foi possível mostrar o conteúdo da fila: a fila está vazia!");
	}
}
