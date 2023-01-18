package br.pucminas.aedsii20221.estruturadedados.filacelula;

import br.pucminas.aedsii20221.estruturadedados.Serie;

public class Fila {

	private Celula frente;
	private Celula tras;
	private double media = 0;

	private int quantSerie = 0;
	private int soma = 0;

	public Fila() {	
		
		Celula sentinela;

		sentinela = new Celula();
		frente = sentinela;
		tras = sentinela;
	}

	public boolean filaVazia() {

		if (frente == tras)
			return true;

		return false;
	}

	public void enfileirar(Serie serie) {

		Celula novaCelula = new Celula(serie);

		tras.setProximo(novaCelula);
		tras = novaCelula;
		tras = tras.getProximo();
	}

	public Serie desenfileirar() throws Exception {

		if (!filaVazia()) {
			Celula celulaDesenfileirada = frente.getProximo();
			Celula proximaCelula = celulaDesenfileirada.getProximo();
			frente.setProximo(proximaCelula);

			if (celulaDesenfileirada == tras)
				tras = frente;

			return (celulaDesenfileirada.getItem());
		} else
			throw new Exception("Não foi possível desenfileirar nenhum item: a fila está vazia!");
	}

	public void mostrar(Serie serie) throws Exception {

		if (!filaVazia()) {

			Celula aux = frente.getProximo();

			while (aux != null) {
				aux.getItem().imprimir();
				aux = aux.getProximo();
			}
		} else
			throw new Exception("Não foi possível imprimir o conteúdo da fila: a fila está vazia!");
	}

	public double obterMediaTemporadas(Serie[] series) throws Exception {
		
		if (!filaVazia()) {
			Celula aux = frente.getProximo();

			while (aux != null) {
				quantSerie++;
				soma += aux.getItem().getNumeroDeTemporadas();
				aux = aux.getProximo();
			}
			media = soma / quantSerie;
			
			return media;
		} else
			throw new Exception("Não foi possível imprimir o conteúdo da fila: a fila está vazia!");

	}
}
