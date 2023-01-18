package br.pucminas.algoritmostecnicasprogramacao.listastrings;

import java.util.Scanner;

public class Exercises {
	static Scanner sc = new Scanner(System.in);

	protected static void ex001() {
		/*
		 * Faça um programa que receba uma frase, calcule e mostre a quantidade de
		 * palavras da frase digitada.
		 */
		System.out.print("Frase: ");
		String frase = sc.nextLine();
		String[] palavras = frase.split(" ");

		System.out.println("Quantidade de Palavras: " + palavras.length);
	}

	protected static void ex002() {
		/*
		 * Faça um programa para criptografar uma frase dada pelo usuario. A
		 * criptografia troca as vogais da frase por *.
		 * 
		 * Ex.: Frase: EU VOU PARA UMA FESTA 
		 * Saída: ** V** P*R* *M* F*ST*
		 */
		System.out.print("Frase: ");
		String frase = sc.nextLine();

		String[] vogais = { "A", "E", "I", "O", "U" };

		for (int i = 0; i < vogais.length; i++)
			frase = frase.replaceAll(vogais[i], "*");

		System.out.println(frase);

	}

	protected static void ex003() {
		/*
		 * Faca um programa que receba uma palavra e verifique se constitui um
		 * palindromo, ou seja, se a palavra escrita do fim para o comeco fica igual e
		 * palavra escrita do comeco para o fim.
		 * 
		 * Exemplos: RENNER, ANA, MIRIM, ARARA
		 */

		System.out.print("Digite uma palavra: ");
		String palavra = sc.next().toLowerCase();

		String reverso = new StringBuffer(palavra).reverse().toString();

		if (palavra.equals(reverso))
			System.out.printf("A palavra %s é palindromo", palavra);
		else
			System.out.printf("A palavra %s não é palindromo", palavra);

	}

	protected static void ex004() {
		/*
		 * Faça um programa que se comporte como vírus, ou seja, que duplique cada uma
		 * das palavras digitadas pelo usuário. 
		 * 
		 * Exemplo: 
		 * Frase: EU ESTOU NA ESCOLA
		 * Saída: EU EU ESTOU ESTOU NA NA ESCOLA ESCOLA
		 */
		System.out.print("Frase: ");
		String frase = sc.nextLine();
		String[] palavras = frase.split(" ");

		for (int i = 0; i < palavras.length; i++) {
			for (int j = 0; j < 2; j++) {
				if (i == 0) {
					frase = palavras[i];
					frase += " " + palavras[i];
				} else {
					frase += " " + palavras[i];
				}
			}
		}

		System.out.println(frase);
	}

}
