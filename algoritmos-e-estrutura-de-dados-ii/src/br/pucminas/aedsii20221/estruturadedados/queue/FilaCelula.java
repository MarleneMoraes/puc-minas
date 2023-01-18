package br.pucminas.aedsii20221.estruturadedados.queue;

import br.pucminas.aedsii20221.estruturadedados.Celula;
import br.pucminas.aedsii20221.estruturadedados.Inteiro;

public class FilaCelula {
	private Celula frente;
	private Celula tras;

	public FilaCelula() {
		Celula sentinela = new Celula();
		frente = sentinela;
		tras = sentinela;
	}

	public boolean filaVazia() {

		boolean resp;

		if (frente == tras)
			resp = true;
		else
			resp = false;

		return resp;
	}

	public void enfileirar(Inteiro novo) {

		Celula novaCelula = new Celula(novo);

		tras.setProximo(novaCelula);
		tras = novaCelula;
		// tras = tras.getProximo();
	}

	public Inteiro desenfileirar() throws Exception {

		Celula celulaDesenfileirada;
		Celula proximaCelula;

		if (!filaVazia()) {

			celulaDesenfileirada = frente.getProximo();
			proximaCelula = celulaDesenfileirada.getProximo();
			frente.setProximo(proximaCelula);

			if (celulaDesenfileirada == tras) // se a célula retirada for a última célula da fila
				tras = frente;

			return (celulaDesenfileirada.getItem());
		} else
			throw new Exception("Não foi possível desenfileirar nenhum item: a fila está vazia!");
	}

	public void imprimir() throws Exception {

		Celula aux;

		if (!filaVazia()) {
			System.out.println("Conteúdo da fila:");

			aux = frente.getProximo();

			while (aux != null) {
				aux.getItem().imprimir();
				aux = aux.getProximo();
			}
		} else
			throw new Exception("Não foi possível imprimir o conteúdo da fila: a fila está vazia!");
	}
}
