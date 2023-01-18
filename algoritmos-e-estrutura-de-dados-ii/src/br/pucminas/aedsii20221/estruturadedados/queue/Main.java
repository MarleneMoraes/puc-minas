package br.pucminas.aedsii20221.estruturadedados.queue;

import br.pucminas.aedsii20221.estruturadedados.Inteiro;

public class Main {

	public static void main(String[] args) {
		FilaVetor filaVetor;
		FilaCelula filaCelula;
		Inteiro novo;
		Inteiro desenfileirado;

		filaVetor = new FilaVetor(4);

		novo = new Inteiro(14);
		try {
			filaVetor.enfileirar(novo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		novo = new Inteiro(10);
		try {
			filaVetor.enfileirar(novo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		novo = new Inteiro(21);
		try {
			filaVetor.enfileirar(novo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		novo = new Inteiro(3);
		try {
			filaVetor.enfileirar(novo);
		} catch (Exception e) {
			System.out.println(e.getMessage()); // Exibe essa mensagem
		}

		try {
			filaVetor.imprimir(); // 14 - 10 - 21
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			desenfileirado = filaVetor.desenfileirar();
			System.out.print("Desenfileirado: ");
			desenfileirado.imprimir(); // 14
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			desenfileirado = filaVetor.desenfileirar();
			System.out.print("Desenfileirado: ");
			desenfileirado.imprimir(); // 10
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		novo = new Inteiro(3);
		try {
			filaVetor.enfileirar(novo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		novo = new Inteiro(20);
		try {
			filaVetor.enfileirar(novo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			filaVetor.imprimir(); // 21 - 3 - 20
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		filaCelula = new FilaCelula();

		novo = new Inteiro(14);
		filaCelula.enfileirar(novo);

		novo = new Inteiro(10);
		filaCelula.enfileirar(novo);

		novo = new Inteiro(21);
		filaCelula.enfileirar(novo);

		try {
			filaCelula.imprimir(); // 14 - 10 - 21
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			desenfileirado = filaCelula.desenfileirar();
			System.out.print("Desenfileirado: ");
			desenfileirado.imprimir(); // 14
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			desenfileirado = filaCelula.desenfileirar();
			System.out.print("Desenfileirado: ");
			desenfileirado.imprimir(); // 10
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		novo = new Inteiro(3);
		filaCelula.enfileirar(novo);

		novo = new Inteiro(20);
		filaCelula.enfileirar(novo);

		try {
			filaCelula.imprimir(); // 21 - 3 - 20
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
