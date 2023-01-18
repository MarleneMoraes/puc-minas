package br.pucminas.aedsii20222.estruturadedados.arvorebuscabinaria;

public class Arvore {
	private No raiz;

	public Arvore() {
		raiz = null;
	}

	public Jogo pesquisar(String chave) {
		return pesquisar(this.raiz, chave);
	}

	private Jogo pesquisar(No raizSubarvore, String chave) {

		buscarJogo(jogos, chave);

		if (raizSubarvore == null)
			return null;
		/*
		 * else if (chave.compareTo(raizSubarvore.getItem().getNome()) == 0) return
		 * raizSubarvore.getItem(); else if
		 * (chave.compareTo(raizSubarvore.getItem().getNome()) > 0) return
		 * pesquisar(raizSubarvore.getDireita(), chave); else return
		 * pesquisar(raizSubarvore.getEsquerda(), chave);
		 */
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
				            System.out.println("Nao foi possivel inserir o item na arvore: chave ja inserida anteriormente!");
				        else if (novo.getSelecao1().compareTo(raizSubarvore.getItem().getNome()) < 0) //novo menor que raiz subarvore
				            raizSubarvore.setEsquerda(inserir(raizSubarvore.getEsquerda(), novo));
				        else
				            raizSubarvore.setDireita(inserir(raizSubarvore.getDireita(), novo));

				        return raizSubarvore;

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
			throw new Exception("Nao foi possivel remover o item da arvore: chave nao encontrada!");
		else if (chaveRemover.getNome().equals(raizSubarvore.getItem().getNome())) {
			if (raizSubarvore.getEsquerda() == null)
				raizSubarvore = raizSubarvore.getDireita();
			else if (raizSubarvore.getDireita() == null)
				raizSubarvore = raizSubarvore.getEsquerda();
			else
				raizSubarvore.setEsquerda(antecessor(raizSubarvore, raizSubarvore.getEsquerda()));
		} else if (chaveRemover.getNome().compareTo(raizSubarvore.getItem().getNome()) > 0)
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

	public void caminhamentoEmOrdem() {
		caminhamentoEmOrdem(this.raiz);
	}

	private void caminhamentoEmOrdem(No raizSubarvore) {

		if (raizSubarvore != null) {
			caminhamentoEmOrdem(raizSubarvore.getEsquerda());
			raizSubarvore.getItem().imprimir();
			caminhamentoEmOrdem(raizSubarvore.getDireita());
		}
	}
}
