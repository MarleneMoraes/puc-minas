package br.pucminas.aedsii.jogadornba.filacelula;

import br.pucminas.aedsii.jogadornba.Celula;
import br.pucminas.aedsii.jogadornba.Jogador;

public class Fila {
	private Celula frente;
	private Celula tras;

	private double media = 0;
	private int quantJogadores = 0;
	private int soma = 0;

	public Fila() {
		Celula sentinela = new Celula();
		frente = sentinela;
		tras = sentinela;
	}

	private boolean filaVazia() {
		if (this.frente == this.tras)
			return true;

		return false;
	}

	public void enfileirar(Jogador novo) {

		Celula novaCelula = new Celula(novo);

		tras.setProximo(novaCelula);
		tras = novaCelula;
	}

	public Jogador desenfileirar() {
		if (!filaVazia()) {

			Celula celulaDesenfileirada = frente.getProximo();
			Celula proximaCelula = celulaDesenfileirada.getProximo();
			frente.setProximo(proximaCelula);

			if (celulaDesenfileirada == tras)
				tras = frente;

			return (celulaDesenfileirada.getItem());
		}

		return null;
	}

	public void mostrar() {

		if (!filaVazia()) {
			Celula aux = frente.getProximo();
			int i = 0;

			while (aux != null) {
				System.out.print("[" + i + "] ");
				aux.getItem().imprimir();
				aux = aux.getProximo();
				i++;
			}
		}
	}

	public double obterMediaAltura() {

		if (!filaVazia()) {
			Celula aux = frente.getProximo();

			while (aux != null) {
				quantJogadores++;
				soma += aux.getItem().getAltura();
				aux = aux.getProximo();
			}
		}

		media = soma / quantJogadores;

		return media;
	}
}