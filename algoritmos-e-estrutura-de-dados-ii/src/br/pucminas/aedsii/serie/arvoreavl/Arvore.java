package br.pucminas.aedsii.serie.arvoreavl;

import br.pucminas.aedsii.estruturadedados.Serie;

public class Arvore {
private No raiz;
	
	public Arvore() {
		raiz = null;
	}
	
	public Serie pesquisar(Serie chave) {
		return pesquisar(this.raiz, chave);
	}
	
	private Serie pesquisar(No raizSubarvore, Serie chave) {
		
		if (raizSubarvore == null)
			return null;
		else if ((chave.getNome()).equals(raizSubarvore.getItem().getNome()))
			return raizSubarvore.getItem();
		else if ((chave.getNome()).compareTo(raizSubarvore.getItem().getNome()) == 1)
			return pesquisar(raizSubarvore.getDireita(), chave);
		else
			return pesquisar(raizSubarvore.getEsquerda(), chave);
	}

	public void inserir(Serie serie) throws Exception {
		this.raiz = inserir(this.raiz, serie);
	}
	
	private No inserir(No raizSubarvore, Serie serie) throws Exception{
		
		if (raizSubarvore == null)
			raizSubarvore = new No(serie);
		else if ((serie.getNome()).equals(raizSubarvore.getItem().getNome()))
			throw new Exception("Não foi possível inserir o item na árvore: chave já inseriada anteriormente!");
		else if ((serie.getNome()).compareTo(raizSubarvore.getItem().getNome()) == 1)
			raizSubarvore.setEsquerda(inserir(raizSubarvore.getEsquerda(), serie));
		else
			raizSubarvore.setDireita(inserir(raizSubarvore.getDireita(), serie));
			
		return balancear(raizSubarvore);
	}
	
	private No balancear(No raizSubarvore) {
		
		int fatorBalanceamento;
		int fatorBalanceamentoFilho;
		
		fatorBalanceamento = raizSubarvore.getFatorBalanceamento();
		
		if (fatorBalanceamento == 2) {
			fatorBalanceamentoFilho = raizSubarvore.getEsquerda().getFatorBalanceamento();
			if (fatorBalanceamentoFilho == -1) {
				raizSubarvore.setEsquerda(rotacionarEsquerda(raizSubarvore.getEsquerda()));
			}
			
			raizSubarvore = rotacionarDireita(raizSubarvore);
		} else if (fatorBalanceamento == -2) {

			fatorBalanceamentoFilho = raizSubarvore.getDireita().getFatorBalanceamento();
			if (fatorBalanceamentoFilho == 1)
				raizSubarvore.setDireita(rotacionarDireita(raizSubarvore.getDireita()));
			

			raizSubarvore = rotacionarEsquerda(raizSubarvore);
		} else
			raizSubarvore.setAltura();
		
		return raizSubarvore;
	}
	
	private No rotacionarDireita(No p) {
		
		No u = p.getEsquerda();
		No filhoEsquerdaDireita = u.getDireita();
		
		u.setDireita(p);
		p.setEsquerda(filhoEsquerdaDireita);
		
		p.setAltura();
		u.setAltura();
	
		return u;
	}
	
	private No rotacionarEsquerda(No p) {
		
		No z = p.getDireita();
		No filhoDireitaEsquerda = z.getEsquerda();
		
		z.setEsquerda(p);
		p.setDireita(filhoDireitaEsquerda);
		
		p.setAltura();
		z.setAltura();
		
		return z;
	}
	
	public void remover(Serie chaveRemover) throws Exception {
		this.raiz = remover(this.raiz, chaveRemover);
	}
	
	private No remover(No raizSubarvore, Serie chaveRemover) throws Exception {
		
		if (raizSubarvore == null)
			throw new Exception("Não foi possível remover o item da árvore: chave não encontrada!");
		else if ((chaveRemover.getNome()).equals(raizSubarvore.getItem().getNome())) {
			if (raizSubarvore.getEsquerda() == null)
				raizSubarvore = raizSubarvore.getDireita();
			else if (raizSubarvore.getDireita() == null)
				raizSubarvore = raizSubarvore.getEsquerda();
			else
				raizSubarvore.setEsquerda(antecessor(raizSubarvore, raizSubarvore.getEsquerda()));
		} else if ((chaveRemover.getNome()).compareTo(raizSubarvore.getItem().getNome()) == 1)
			raizSubarvore.setDireita(remover(raizSubarvore.getDireita(), chaveRemover));
		else
			raizSubarvore.setEsquerda(remover(raizSubarvore.getEsquerda(), chaveRemover));
			
		return balancear(raizSubarvore);
	}
	
	private No antecessor(No noRetirar, No raizSubarvore) {
		
		if (raizSubarvore.getDireita() != null)
			raizSubarvore.setDireita(antecessor(noRetirar, raizSubarvore.getDireita()));
		else {
			noRetirar.setItem(raizSubarvore.getItem());
			raizSubarvore = raizSubarvore.getEsquerda();
		}	
		
		return balancear(raizSubarvore);
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
