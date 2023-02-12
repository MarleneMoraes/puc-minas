package br.pucminas.aedsii.estruturadedados.stack;

import br.pucminas.aedsii.estruturadedados.Inteiro;

public class Main {

	public static void main(String[] args) {
		PilhaVetor pilhaVetor;
		PilhaCelula pilhaCelula;
		Inteiro novo;
		Inteiro topo;
		Inteiro desempilhado;

		pilhaVetor = new PilhaVetor(4);

		novo = new Inteiro(25);
		try {
			pilhaVetor.empilhar(novo);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		novo = new Inteiro(10);
		try {
			pilhaVetor.empilhar(novo);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		novo = new Inteiro(21);
		try {
			pilhaVetor.empilhar(novo);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		novo = new Inteiro(3);
		try {
			pilhaVetor.empilhar(novo);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		novo = new Inteiro(20);
		try {
			pilhaVetor.empilhar(novo);
		} catch (Exception erro) {
			System.out.println(erro.getMessage()); // Essa mensagem deve ser exibida.
		}

		try {
			topo = pilhaVetor.consultarTopo();
			System.out.print("Elemento do topo da pilha: ");
			topo.imprimir(); // 3
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		try {
			desempilhado = pilhaVetor.desempilhar();
			System.out.print("Elemento desempilhado: ");
			desempilhado.imprimir(); // 3
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		try {
			topo = pilhaVetor.consultarTopo();
			System.out.print("Elemento do topo da pilha: ");
			topo.imprimir(); // 21
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
		
		pilhaCelula = new PilhaCelula();

		novo = new Inteiro(25);
		try {
			pilhaCelula.empilhar(novo);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		novo = new Inteiro(10);
		try {
			pilhaCelula.empilhar(novo);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		novo = new Inteiro(21);
		try {
			pilhaCelula.empilhar(novo);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		novo = new Inteiro(3);
		try {
			pilhaCelula.empilhar(novo);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		try {
			topo = pilhaCelula.consultarTopo();
			System.out.print("Elemento do topo da pilha: ");
			topo.imprimir(); // 3
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		try {
			desempilhado = pilhaCelula.desempilhar();
			System.out.print("Elemento desempilhado: ");
			desempilhado.imprimir(); // 3
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		try {
			topo = pilhaCelula.consultarTopo();
			System.out.print("Elemento do topo da pilha: ");
			topo.imprimir(); // 21
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
	}
	
	

}
