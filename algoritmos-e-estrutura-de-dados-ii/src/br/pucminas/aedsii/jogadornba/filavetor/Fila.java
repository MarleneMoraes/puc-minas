package br.pucminas.aedsii.jogadornba.filavetor;

import br.pucminas.aedsii.jogadornba.Jogador;

public class Fila {
	private Jogador[] fila;
	private int frente;
	private int tras;
	private int tamanho = 6;

	public Fila(int tamanho) {
		if (tamanho <= 0) 
			throw new IllegalArgumentException("tamanho precisa ser maior que 0");
		
		fila = new Jogador[tamanho];
		frente = 0;
		tras = 0;
		this.tamanho = tamanho;

	}

	public Fila() {
		fila = new Jogador[6];
		frente = 6;
		tras = 6;
		this.tamanho = 6;
	}

	public boolean filaVazia() {
		if (frente == tras)
			return true;

		return false;
	}

	public boolean filaCheia() {
		if (((tras + 1) % tamanho) == (frente % tamanho) 
				&& tamanho > 0) 
			return true;
		
		return false;
	}

	public void enfileirar(Jogador jogador) {
		if (!filaCheia()) {
			int posicao = tras % tamanho;
			fila[posicao] = jogador;
			tras++;
		}
	}

	public Jogador desenfileirar() {
		if (!filaVazia()) {
			int posicao = frente % tamanho;
			Jogador desenfileirado = fila[posicao];
			frente++;
			return desenfileirado;
		}
		
		return null; 
	}

	public void mostrar() {
		if (!filaVazia()) {
			int posicao;
			for (int i = frente; i < tras; i++) {
				posicao = i % tamanho;
				System.out.printf("[%d] ", posicao);
				fila[posicao].imprimir();
			}
		}
	}

	public double obterMediaAltura() {
		int posicao;
		double soma = 0.0;
		double resultado = 0.0;

		if (!filaVazia()) {
			for (int i = frente; i < tras; i++) {
				posicao = i % tamanho;
				soma += fila[posicao].getAltura();
			}
		}

		resultado = soma / tamanho;
		return resultado;
	}
}