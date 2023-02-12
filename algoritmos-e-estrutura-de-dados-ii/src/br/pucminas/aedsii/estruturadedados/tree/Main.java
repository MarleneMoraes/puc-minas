package br.pucminas.aedsii.estruturadedados.tree;

import br.pucminas.aedsii.estruturadedados.Inteiro;

class Main {
  public static void main(String[] args) {
	  	ArvoreABB abb = new ArvoreABB();
	  	ArvoreAVL avl = new ArvoreAVL();
		Inteiro novo;
		Inteiro pesquisado;
		
		novo = new Inteiro(26);
		try {
			abb.inserir(novo);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
		
		novo = new Inteiro(11);
		try {
			abb.inserir(novo);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
		
		novo = new Inteiro(21);
		try {
			abb.inserir(novo);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
		
		novo = new Inteiro(50);
		try {
			abb.inserir(novo);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
		
		novo = new Inteiro(4);
		try {
			abb.inserir(novo);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
		
		System.out.println("Caminhamento central na árvore:");
		abb.caminhamentoEmOrdem();   // 4 - 11 - 21 - 26 - 50
		
		pesquisado = abb.pesquisar(11);
		if (pesquisado != null) {
			System.out.print("Elemento pesquisado: ");  // 11
			pesquisado.imprimir();
		} else
			System.out.println("O elemento não foi encontrado na árvore!");
		
		try {
			abb.remover(11);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
		
		System.out.println("Caminhamento central na árvore:");
		abb.caminhamentoEmOrdem();   // 4 - 21 - 26 - 50
		
		pesquisado = abb.pesquisar(11);
		if (pesquisado != null) {
			System.out.print("Elemento pesquisado: ");
			pesquisado.imprimir();
		} else
			System.out.println("O elemento pesquisado não foi encontrado na árvore!");  // Essa mensagem deve ser exibida.

		
		novo = new Inteiro(26);
		try {
			avl.inserir(novo);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
		
		novo = new Inteiro(11);
		try {
			avl.inserir(novo);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
		
		novo = new Inteiro(21);
		try {
			avl.inserir(novo);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
		
		novo = new Inteiro(50);
		try {
			avl.inserir(novo);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
		
		novo = new Inteiro(4);
		try {
			avl.inserir(novo);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
		
		System.out.println("Caminhamento central na árvore:");
		avl.caminhamentoEmOrdem();   // 4 - 11 - 21 - 26 - 50
		
		pesquisado = avl.pesquisar(11);
		if (pesquisado != null) {
			System.out.print("Elemento pesquisado: ");  // 11
			pesquisado.imprimir();
		} else
			System.out.println("O elemento não foi encontrado na árvore!");
		
		try {
			avl.remover(11);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
		
		System.out.println("Caminhamento central na árvore:");
		avl.caminhamentoEmOrdem();   // 4 - 21 - 26 - 50
		
		pesquisado = avl.pesquisar(11);
		if (pesquisado != null) {
			System.out.print("Elemento pesquisado: ");
			pesquisado.imprimir();
		} else
    System.out.println("O elemento pesquisado não foi encontrado na árvore!");  // Essa mensagem deve ser exibida.
	
  }
}




