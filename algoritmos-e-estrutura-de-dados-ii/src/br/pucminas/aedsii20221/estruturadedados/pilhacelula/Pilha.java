package br.pucminas.aedsii20221.estruturadedados.pilhacelula;

import br.pucminas.aedsii20221.estruturadedados.Serie;

public class Pilha {

	private Celula fundo;
	private Celula topo;
	private double media = 0;

	private int quantSerie = 0;
	private int soma = 0;

	public Pilha() {	
		
		Celula sentinela = new Celula();
		fundo = sentinela;
		topo = sentinela;
	}

	public boolean pilhaVazia() {

		if (topo == fundo)
			return true;

		return false;
	}

	public void empilhar(Serie serie) {

		Celula novaCelula = new Celula(serie);
		novaCelula.setProximo(topo);
		topo = novaCelula;
	}

	public Serie desempilhar() throws Exception {

		Celula desempilhado;

		if (!pilhaVazia()) {
			desempilhado = topo;
			topo = topo.getProximo();
			desempilhado.setProximo(null);
			return (desempilhado.getItem());
		} else
			throw new Exception("Não foi possível desempilhar: a pilha está vazia!");
	}
	
	public Serie consultarTopo() throws Exception {

		if (!pilhaVazia()) {
			return (topo.getItem());
		} else
			throw new Exception("Não foi possível consultar o topo da pilha: a pilha está vazia!");
	}

	public void mostrar() throws Exception {

		if (!pilhaVazia()) {
			Celula aux = topo.getProximo();

			while (aux != null) {
				aux.getItem().imprimir();
				aux = aux.getProximo();
			}
		} else
			throw new Exception("Não foi possível imprimir o conteúdo da fila: a fila está vazia!");
	}

	public double obterMediaTemporadas(Serie[] series) throws Exception {
		
		if (!pilhaVazia()) {
			Celula aux = topo.getProximo();

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
