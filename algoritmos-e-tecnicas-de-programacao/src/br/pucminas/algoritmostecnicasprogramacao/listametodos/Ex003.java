package br.pucminas.algoritmostecnicasprogramacao.listametodos;

import java.util.Scanner;

public class Ex003 {
	/*
	 * Faça um programa que tenha um método que leia cinco valores inteiros,
	 * determine e mostre o maior e o menor deles.
	 */

	static Scanner sc = new Scanner(System.in);

	static void maiorEMenor() {

		int maior = 0;
		int menor = 0;

		for (int i = 0; i < 5; i++) {
			System.out.print("Digite um valor: ");
			int valor = sc.nextInt();

			if (i == 0 || valor > maior)
				maior = valor;

			if (i == 0 || valor < menor)
				menor = valor;

		}

		System.out.printf("Maior valor: %d\nMenor valor: %d", maior, menor);
	}

	public static void main(String[] args) {
		System.out.println("MAIOR E MENOR VALOR");

		maiorEMenor();
	}
}
