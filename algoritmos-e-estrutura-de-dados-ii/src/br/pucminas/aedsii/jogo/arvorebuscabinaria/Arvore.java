package br.pucminas.aedsii.jogo.arvorebuscabinaria;

import br.pucminas.aedsii.jogo.Jogo;

public class Arvore {
	private No raiz;

	public Arvore() {
		raiz = null;
	}

	public Jogo pesquisar(String chave) {
		return pesquisar(this.raiz, chave);
	}

	private Jogo pesquisar(No raizSubarvore, String chave) {
		if (raizSubarvore == null)
			return null;
		else if (chave.equals(raizSubarvore.getItem().getSelecao1()))
			return raizSubarvore.getItem();
		else if (chave.compareTo(raizSubarvore.getItem().getSelecao1()) > 0)
			return pesquisar(raizSubarvore.getDireita(), chave);
		else
			return pesquisar(raizSubarvore.getEsquerda(), chave);
	}

	public void inserir(Jogo novo) {
		this.raiz = inserir(this.raiz, novo);
	}

	private No inserir(No raizSubarvore, Jogo novo) {

		if (raizSubarvore == null)
			raizSubarvore = new No(novo);
		else if (novo.getAno() == raizSubarvore.getItem().getAno()) {
			if (novo.getMes() == raizSubarvore.getItem().getMes()) {
				if (novo.getDia() == raizSubarvore.getItem().getDia()) {
					if (novo == raizSubarvore.getItem())
						System.out
								.println("Nao foi possivel inserir o item na arvore: chave ja inserida anteriormente!");
					else if (novo.getSelecao1().compareTo(raizSubarvore.getItem().getSelecao1()) < 0)
						raizSubarvore.setEsquerda(inserir(raizSubarvore.getEsquerda(), novo));
					else
						raizSubarvore.setDireita(inserir(raizSubarvore.getDireita(), novo));

				} else if (novo.getDia() < raizSubarvore.getItem().getDia())
					raizSubarvore.setEsquerda(inserir(raizSubarvore.getEsquerda(), novo));
				else
					raizSubarvore.setDireita(inserir(raizSubarvore.getDireita(), novo));
			} else if (novo.getMes() < raizSubarvore.getItem().getMes())
				raizSubarvore.setEsquerda(inserir(raizSubarvore.getEsquerda(), novo));
			else
				raizSubarvore.setDireita(inserir(raizSubarvore.getDireita(), novo));
		} else if (novo.getAno() < raizSubarvore.getItem().getAno())
			raizSubarvore.setEsquerda(inserir(raizSubarvore.getEsquerda(), novo));
		else
			raizSubarvore.setDireita(inserir(raizSubarvore.getDireita(), novo));

		return raizSubarvore;
	}

	public void remover(Jogo chaveRemover) throws Exception {
		this.raiz = remover(this.raiz, chaveRemover);
	}

	private No remover(No raizSubarvore, Jogo chaveRemover) {

		if (raizSubarvore == null)
			System.out.println("Nao foi possivel remover o item da arvore: chave nao encontrada!");
		else if (chaveRemover.getAno() == raizSubarvore.getItem().getAno()) {
			if (chaveRemover.getMes() == raizSubarvore.getItem().getMes()) {
				if (chaveRemover.getDia() == raizSubarvore.getItem().getDia()) {
					if (chaveRemover == raizSubarvore.getItem())
						System.out
								.println("Nao foi possivel inserir o item na arvore: chave ja inserida anteriormente!");
					else if (chaveRemover.getSelecao1().compareTo(raizSubarvore.getItem().getSelecao1()) < 0)
						raizSubarvore.setEsquerda(inserir(raizSubarvore.getEsquerda(), chaveRemover));
					else
						raizSubarvore.setDireita(inserir(raizSubarvore.getDireita(), chaveRemover));

					return raizSubarvore;

				} else if (chaveRemover.getDia() < raizSubarvore.getItem().getDia())
					raizSubarvore.setEsquerda(inserir(raizSubarvore.getEsquerda(), chaveRemover));
				else
					raizSubarvore.setDireita(inserir(raizSubarvore.getDireita(), chaveRemover));
			} else if (chaveRemover.getMes() < raizSubarvore.getItem().getMes())
				raizSubarvore.setEsquerda(inserir(raizSubarvore.getEsquerda(), chaveRemover));
			else
				raizSubarvore.setDireita(inserir(raizSubarvore.getDireita(), chaveRemover));
		} else if (chaveRemover.getAno() < raizSubarvore.getItem().getAno())
			raizSubarvore.setEsquerda(inserir(raizSubarvore.getEsquerda(), chaveRemover));
		else
			raizSubarvore.setDireita(inserir(raizSubarvore.getDireita(), chaveRemover));

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

	public void caminhamentoEmOrdem(String chave) {
		caminhamentoEmOrdem(this.raiz, chave);
	}

	private void caminhamentoEmOrdem(No raizSubarvore, String chave) {
		if (raizSubarvore != null) {
			if (chave.equals(raizSubarvore.getItem().getSelecao1())) {
				raizSubarvore.getItem().imprimir();
			} else if (chave.compareTo(raizSubarvore.getItem().getSelecao1()) > 0) {
				raizSubarvore.getItem().imprimir();
				caminhamentoEmOrdem(raizSubarvore.getDireita(), chave);
			} else {
				raizSubarvore.getItem().imprimir();
				caminhamentoEmOrdem(raizSubarvore.getEsquerda(), chave);
			}
		}
	}
}
