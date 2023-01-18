package br.pucminas.aedsii20221.estruturadedados.list;

import br.pucminas.aedsii20221.estruturadedados.Inteiro;

public class Main {

	public static void main(String[] args) {

		Inteiro novo, removido;
		ListaVetor listaLinear = new ListaVetor(4);

		novo = new Inteiro(1);
		try {
			listaLinear.inserir(novo, 0); // 1
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		novo = new Inteiro(11);
		try {
			listaLinear.inserir(novo, 0); // 11 - 1
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		novo = new Inteiro(21);
		try {
			listaLinear.inserir(novo, 3); // 11 - 1
		} catch (Exception erro) {
			System.out.println(erro.getMessage()); // Essa mensagem de erro deve ser exibida.
		}

		novo = new Inteiro(21);
		try {
			listaLinear.inserir(novo, 2); // 11 - 1 - 21
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		novo = new Inteiro(4);
		try {
			listaLinear.inserir(novo, 2); // 11 - 1 - 4 - 21
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		novo = new Inteiro(20);
		try {
			listaLinear.inserir(novo, 3); // 11 - 1 - 4 - 21
		} catch (Exception erro) {
			System.out.println(erro.getMessage()); // Essa mensagem de erro deve ser exibida.
		}

		try {
			listaLinear.imprimir(); // 11 - 1 - 4 - 21
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		try {
			removido = listaLinear.remover(1);
			System.out.print("Item removido: "); // 1
			removido.imprimir();
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		try {
			listaLinear.imprimir(); // 11 - 4 - 21
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		try {
			removido = listaLinear.remover(3);
			System.out.print("Item removido: ");
			removido.imprimir();
		} catch (Exception erro) {
			System.out.println(erro.getMessage()); // Essa mensagem deve ser exibida.
		}

		try {
			removido = listaLinear.remover(1);
			System.out.print("Item removido: "); // 4
			removido.imprimir();
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		try {
			listaLinear.imprimir(); // 11 - 21
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		ListaEncadeada listaEncadeada = new ListaEncadeada();

		novo = new Inteiro(1);
		try {
			listaEncadeada.inserir(novo, 0); // 1
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		novo = new Inteiro(11);
		try {
			listaEncadeada.inserir(novo, 0); // 11 - 1
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		novo = new Inteiro(21);
		try {
			listaEncadeada.inserir(novo, 3); // 11 - 1
		} catch (Exception erro) {
			System.out.println(erro.getMessage()); // Essa mensagem de erro deve ser exibida.
		}

		novo = new Inteiro(21);
		try {
			listaEncadeada.inserir(novo, 2); // 11 - 1 - 21
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		novo = new Inteiro(4);
		try {
			listaEncadeada.inserir(novo, 2); // 11 - 1 - 4 - 21
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		try {
			listaEncadeada.imprimir(); // 11 - 1 - 4 - 21
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		try {
			removido = listaEncadeada.remover(1);
			System.out.print("Item removido: "); // 1
			removido.imprimir();
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		try {
			listaEncadeada.imprimir(); // 11 - 4 - 21
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		try {
			removido = listaEncadeada.remover(3);
			System.out.print("Item removido: ");
			removido.imprimir();
		} catch (Exception erro) {
			System.out.println(erro.getMessage()); // Essa mensagem deve ser exibida.
		}

		try {
			removido = listaEncadeada.remover(1);
			System.out.print("Item removido: "); // 4
			removido.imprimir();
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		try {
			listaEncadeada.imprimir(); // 11 - 21
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
	}

}
