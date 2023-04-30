package br.pucminas.aedsii.jogo.filacelula;

import br.pucminas.aedsii.jogo.Celula;
import br.pucminas.aedsii.jogo.Jogo;

public class Fila {
	private Celula frente;
	private Celula tras;
	private double media = 0;

	private int quantJogo = 0;
	private int soma = 0;

	public Fila() {	
		
		Celula sentinela = new Celula();
		frente = sentinela;
		tras = sentinela;
	}

	public boolean filaVazia() {

		if (frente == tras)
			return true;

		return false;
	}

	public void enfileirar(Jogo jogo) {

		Celula novaCelula = new Celula(jogo);

		tras.setProximo(novaCelula);
		tras = novaCelula;
		tras = tras.getProximo();
	}

	public Jogo desenfileirar() throws Exception {

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

	public void mostrar(Jogo jogo) throws Exception {

		if (!filaVazia()) {

			Celula aux = frente.getProximo();

			while (aux != null) {
				aux.getItem().imprimir();
				aux = aux.getProximo();
			}
		} else
			throw new Exception("Não foi possível imprimir o conteúdo da fila: a fila está vazia!");
	}

	/*public double obterMediaTemporadas(Jogo[] jogos) throws Exception {
		
		if (!filaVazia()) {
			Celula aux = frente.getProximo();

			while (aux != null) {
				quantJogo++;
				soma += aux.getItem().getNumeroDeTemporadas();
				aux = aux.getProximo();
			}
			media = soma / quantJogo;
			
			return media;
		} else
			throw new Exception("Não foi possível imprimir o conteúdo da fila: a fila está vazia!");

	}*/
}
