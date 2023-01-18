package br.pucminas.aedsii20221.estruturadedados.hashtable;

import br.pucminas.aedsii20221.estruturadedados.Inteiro;

class Main {
  public static void main(String[] args) {
	  	TabelaHashEnderecamentoEmSeparado TabHashEndSeparado;
	  	TabelaHashEnderecamentoAberto TabHashEndAberto;
		Inteiro novo;
		Inteiro pesquisado;
		
		TabHashEndSeparado = new TabelaHashEnderecamentoEmSeparado(7);
		
		novo = new Inteiro(16);
		try {
			TabHashEndSeparado.inserir(novo);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
		
		novo = new Inteiro(5);
		try {
			TabHashEndSeparado.inserir(novo);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
		
		novo = new Inteiro(19);
		try {
			TabHashEndSeparado.inserir(novo);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
		
		novo = new Inteiro(17);
		try {
			TabHashEndSeparado.inserir(novo);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
		
		novo = new Inteiro(21);
		try {
			TabHashEndSeparado.inserir(novo);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
		
		novo = new Inteiro(9);
		try {
			TabHashEndSeparado.inserir(novo);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
		
		novo = new Inteiro(19);
		try {
			TabHashEndSeparado.inserir(novo);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());  // Essa mensagem deve ser exibida.
		}
		
		novo = new Inteiro(1);
		try {
			TabHashEndSeparado.inserir(novo);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
		
		TabHashEndSeparado.imprimir();
		
		pesquisado = TabHashEndSeparado.pesquisar(9);
		if (pesquisado != null) {
			System.out.print("Elemento pesquisado: ");
			pesquisado.imprimir();  // 9
		} else
			System.out.println("Elemento não encontrado!");
			
		pesquisado = TabHashEndSeparado.pesquisar(2);
		if (pesquisado != null) {
			System.out.print("Elemento pesquisado: ");
			pesquisado.imprimir();
		} else
			System.out.println("Elemento não encontrado!");  // Essa mensagem deve ser exibida.
		
		
		TabHashEndAberto = new TabelaHashEnderecamentoAberto(7);
		
		novo = new Inteiro(16);
		try {
			TabHashEndAberto.inserir(novo);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
		
		novo = new Inteiro(5);
		try {
			TabHashEndAberto.inserir(novo);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
		
		novo = new Inteiro(19);
		try {
			TabHashEndAberto.inserir(novo);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
		
		novo = new Inteiro(17);
		try {
			TabHashEndAberto.inserir(novo);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
		
		novo = new Inteiro(21);
		try {
			TabHashEndAberto.inserir(novo);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
		
		novo = new Inteiro(9);
		try {
			TabHashEndAberto.inserir(novo);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
		
		novo = new Inteiro(19);
		try {
			TabHashEndAberto.inserir(novo);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());  // Essa mensagem deve ser exibida.
		}
		
		novo = new Inteiro(1);
		try {
			TabHashEndAberto.inserir(novo);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
		
		TabHashEndAberto.imprimir();
		
		pesquisado = TabHashEndAberto.pesquisar(9);
		if (pesquisado != null) {
			System.out.print("Elemento pesquisado: ");
			pesquisado.imprimir();  // 9
		} else
			System.out.println("Elemento não encontrado!");
			
		pesquisado = TabHashEndAberto.pesquisar(2);
		if (pesquisado != null) {
			System.out.print("Elemento pesquisado: ");
			pesquisado.imprimir();
		} else
			System.out.println("Elemento não encontrado!");  // Essa mensagem deve ser exibida.
  
  }
}