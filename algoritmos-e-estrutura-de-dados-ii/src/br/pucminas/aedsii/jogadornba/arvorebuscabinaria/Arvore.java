package br.pucminas.aedsii.jogadornba.arvorebuscabinaria;

public class Arvore {
	private No raiz;

	public Arvore() {
		raiz = null;
	}

	// Metodo pesquisar recursivo
	public Jogador pesquisar(String chave) {
		return pesquisar(this.raiz, chave);
	}

	// Metodo pesquisar solicitando o no da subarvore
	// e a chave que gostaria de buscar
	private Jogador pesquisar(No raizSubarvore, String chave) {

		if (raizSubarvore == null)
			return null;
		else if (chave.equals(raizSubarvore.getItem().getNome()))
			return raizSubarvore.getItem();
		else if (chave.compareTo(raizSubarvore.getItem().getNome()) > 0)
			return pesquisar(raizSubarvore.getDireita(), chave);
		else
			return pesquisar(raizSubarvore.getEsquerda(), chave);
	}

	// Metodo inserir recursivo
	public void inserir(Jogador novo) throws Exception {
		this.raiz = inserir(this.raiz, novo);
	}

	// Metodo inserir solicitando o no da subarvore
	// e a chave que gostaria de adicionar
	private No inserir(No raizSubarvore, Jogador novo) throws Exception {

		if (raizSubarvore == null)
			raizSubarvore = new No(novo);
		else if (novo == raizSubarvore.getItem())
			throw new Exception("Não foi possível inserir o item na árvore: chave já inseriada anteriormente!");
		else if (novo.getNome().compareTo(raizSubarvore.getItem().getNome()) < 0)
			raizSubarvore.setEsquerda(inserir(raizSubarvore.getEsquerda(), novo));
		else
			raizSubarvore.setDireita(inserir(raizSubarvore.getDireita(), novo));

		return raizSubarvore;
	}

	// Metodo remover recursivo
	public void remover(String chaveRemover) throws Exception {
		this.raiz = remover(this.raiz, chaveRemover);
	}

	// Metodo pesquisar solicitando o no da subarvore
	// e a chave que gostaria de remover
	private No remover(No raizSubarvore, String chaveRemover) throws Exception {

		if (raizSubarvore == null)
			throw new Exception("Não foi possível remover o item da árvore: chave não encontrada!");
		else if (chaveRemover.equals(raizSubarvore.getItem().getNome())) {
			if (raizSubarvore.getEsquerda() == null)
				raizSubarvore = raizSubarvore.getDireita();
			else if (raizSubarvore.getDireita() == null)
				raizSubarvore = raizSubarvore.getEsquerda();
			else
				raizSubarvore.setEsquerda(antecessor(raizSubarvore, raizSubarvore.getEsquerda()));
		} else if (chaveRemover.compareTo(raizSubarvore.getItem().getNome()) > 0)
			raizSubarvore.setDireita(remover(raizSubarvore.getDireita(), chaveRemover));
		else
			raizSubarvore.setEsquerda(remover(raizSubarvore.getEsquerda(), chaveRemover));

		return raizSubarvore;
	}

	private No antecessor(No noRetirar, No raizSubarvore) {

		if (raizSubarvore.getDireita() != null)
			raizSubarvore.setDireita(antecessor(noRetirar, raizSubarvore.getDireita()));
		else {
			noRetirar.setItem(raizSubarvore.getItem());
			raizSubarvore = raizSubarvore.getEsquerda();
		}

		return raizSubarvore;
	}

	// Metodo impressao recursivo
	public void caminhamentoEmOrdem(String chave) {
		caminhamentoEmOrdem(this.raiz, chave);
	}

	private void caminhamentoEmOrdem(No raizSubarvore, String chave) {
		if (raizSubarvore != null) {
			if (chave.equals(raizSubarvore.getItem().getNome())) {
				raizSubarvore.getItem().imprimir();
			} else if (chave.compareTo(raizSubarvore.getItem().getNome()) > 0) {
				raizSubarvore.getItem().imprimir();
				caminhamentoEmOrdem(raizSubarvore.getDireita(), chave);
			} else {
				raizSubarvore.getItem().imprimir();
				caminhamentoEmOrdem(raizSubarvore.getEsquerda(), chave);
			}
		}
	}
}