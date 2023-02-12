package br.pucminas.aedsii.jogo.arvoreavl;

import br.pucminas.aedsii20222.estruturadedados.Jogo;

public class Arvore {
private No raiz;
	
	public Arvore() {
		raiz = null;
	}
	
	public Jogo pesquisar(int chave) {
		return pesquisar(this.raiz, chave);
	}
	//ano, mes, dia, selecao1
	
	private Jogo pesquisar(No raizSubarvore, int chave) {
		
		if (raizSubarvore == null)
			return null;
		else if (chave == raizSubarvore.getItem().getAno())
			return raizSubarvore.getItem();
		else if (chave > raizSubarvore.getItem().getAno())
			return pesquisar(raizSubarvore.getDireita(), chave);
		else
			return pesquisar(raizSubarvore.getEsquerda(), chave);
	}
	
	public void inserir(Jogo jogo) throws Exception {
		this.raiz = inserir(this.raiz, jogo);
	}

	private No inserir(No raizSubarvore, Jogo jogo) throws Exception{
		
		if (raizSubarvore == null)
			raizSubarvore = new No(jogo);
		else if (jogo.getAno() == raizSubarvore.getItem().getAno())
			throw new Exception("Não foi possível inserir o item na árvore: chave já inseriada anteriormente!");
		else if (jogo.getAno() < raizSubarvore.getItem().getAno())
			raizSubarvore.setEsquerda(inserir(raizSubarvore.getEsquerda(), jogo));
		else
			raizSubarvore.setDireita(inserir(raizSubarvore.getDireita(), jogo));
			
		return balancear(raizSubarvore);
	}
	
	private No balancear(No raizSubarvore) {
		
		int fatorBalanceamento;
		int fatorBalanceamentoFilho;
		
		fatorBalanceamento = raizSubarvore.getFatorBalanceamento();
		
		if (fatorBalanceamento == 2) {
			fatorBalanceamentoFilho = raizSubarvore.getEsquerda().getFatorBalanceamento();
			
			if (fatorBalanceamentoFilho == -1) 
				raizSubarvore.setEsquerda(rotacionarEsquerda(raizSubarvore.getEsquerda()));
			
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
	
	public void remover(Jogo chaveRemover) throws Exception {
		this.raiz = remover(this.raiz, chaveRemover);
	}
	
	private No remover(No raizSubarvore, Jogo chaveRemover) throws Exception {
		
		if (raizSubarvore == null)
			throw new Exception("Não foi possível remover o item da árvore: chave não encontrada!");
		else if (chaveRemover == raizSubarvore.getItem().getAno()) {
			if (raizSubarvore.getEsquerda() == null)
				raizSubarvore = raizSubarvore.getDireita();
			else if (raizSubarvore.getDireita() == null)
				raizSubarvore = raizSubarvore.getEsquerda();
			else
				raizSubarvore.setEsquerda(antecessor(raizSubarvore, raizSubarvore.getEsquerda()));
		} else if (chaveRemover > raizSubarvore.getItem().getAno())
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
			raizSubarvore.getItem().printValues();
			caminhamentoEmOrdem(raizSubarvore.getDireita());
		}
	}
}
