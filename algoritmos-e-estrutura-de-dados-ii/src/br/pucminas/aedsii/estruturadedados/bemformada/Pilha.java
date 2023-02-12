package br.pucminas.aedsii.estruturadedados.bemformada;

public class Pilha {

	private Celula topo;
	private int tamanho;

	public Pilha() {
		Celula sentinela = new Celula();
		topo = sentinela;
		tamanho = 0;
	}

	public boolean pilhaVazia() {
		boolean estaVazia = false;

		if (tamanho == 0)
			estaVazia = true;

		return estaVazia;
	}

	public void empilhar(Character novo) {

		Celula novaCelula;

		novaCelula = new Celula(novo);
		novaCelula.setProximo(topo);
		topo = novaCelula;
		this.tamanho++;
	}

	public Character desempilhar() {

		Celula desempilhado;

		if (!pilhaVazia()) {
			desempilhado = topo;
			topo = topo.getProximo();
			desempilhado.setProximo(null);
			this.tamanho--;

			return (desempilhado.getItem());

		}

		return null;
	}

	public Character consultarTopo() {

		if (!pilhaVazia()) 
			return (topo.getItem());

		return null;
	}
}