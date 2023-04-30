package br.pucminas.aedsii.jogadornba.filacelula;

import br.pucminas.aedsii.jogadornba.Celula;
import br.pucminas.aedsii.jogadornba.Jogador;

public class Fila {
	private Celula frente;
	private Celula tras;


	private int soma = 0;

	public Fila(Jogador jogador) {
		Celula sentinela = new Celula();
		frente = sentinela;
		tras = sentinela;
	}

	public boolean filaVazia() {
		if (this.frente == this.tras)
			return true;

		return false;
	}

	public void enfileirar(Jogador jogador) {

		Celula novaCelula = new Celula();

		novaCelula.setProximo(tras);
		this.tras = novaCelula;
	}

	public Jogador desenfileirar() {

		if (!filaVazia()) {
			Celula celulaDesenfileirada = frente.getProximo();
			frente.setProximo(celulaDesenfileirada.getProximo());

			if (celulaDesenfileirada == tras)
				tras = frente;

			return (celulaDesenfileirada.getItem());
		}

		return null;
	}

	public void mostrar() {
		if (!filaVazia()) {
			Celula aux = frente.getProximo();

			while (aux != null) {
				aux.getItem().imprimir();
				aux = aux.getProximo();
			}
		} 
	}

	public void obterMediaAltura(Fila fila) {
		if (!filaVazia()) {
			double media = 0;
			int quantJogadores = 0;
			Celula aux = frente.getProximo();

			while (aux != null) {
				quantJogadores++;
				soma += aux.getItem().getAltura();
				aux = aux.getProximo();
			}
			media = soma / quantJogadores;
			
			System.out.println(Math.ceil(media));
		}
	}
}
