package br.pucminas.algoritmostecnicasprogramacao.listavetores;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises {
	static Scanner sc = new Scanner(System.in);

	protected static void ex001() {
		/*
		 * Faça um programa que preencha um vetor com oito números inteiros, calcule e
		 * mostre dois vetores resultantes. O primeiro vetor resultante deve conter os
		 * números positivos, o segundo deve conter os números negativos. Cada vetor
		 * resultante vai ter, no máximo, oito posições que poderão não ser
		 * completamente utilizadas.
		 */
		int[] vetor = new int[8];
		int[] positivos = new int[8];
		int[] negativos = new int[8];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um valor: ");
			vetor[i] = sc.nextInt();
		}

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] >= 0)
				positivos[i] = vetor[i];
			else
				negativos[i] = vetor[i];

		}

		System.out.println("N�meros positivos: ");

		for (int i = 0; i < positivos.length; i++) {
			if (positivos[i] != 0)
				System.out.print(positivos[i] + " ");

		}

		System.out.println("\nN�meros negativos: ");

		for (int i = 0; i < negativos.length; i++) {
			if (negativos[i] != 0)
				System.out.print(negativos[i] + " ");

		}

	}

	protected static void ex002() {
		/*
		 * Fa�a um programa que preencha dois vetores, X e Y, com dez n�meros inteiros
		 * cada. Calcule e mostre os seguintes vetores resultantes: a) A soma de X e Y;
		 * b) O produto de X e Y;
		 */

		int[] x = new int[10];
		int[] y = new int[10];
		int[] soma = new int[10];
		int[] produto = new int[10];

		for (int i = 0; i < x.length; i++) {
			System.out.print("Digite um valor para X: ");
			x[i] = sc.nextInt();
		}

		for (int i = 0; i < y.length; i++) {
			System.out.print("Digite um valor para Y: ");
			y[i] = sc.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			soma[i] = x[i] + y[i];
			produto[i] = x[i] * y[i];
		}

		System.out.println("Vetor-soma: ");

		for (int i = 0; i < soma.length; i++)
			System.out.print(soma[i] + " ");

		System.out.println("\nVetor-produto: ");

		for (int i = 0; i < produto.length; i++)
			System.out.print(produto[i] + " ");

	}

	protected static void ex003() {
		/*
		 * Faça um programa que preencha um vetor com dez números inteiros, calcule e
		 * mostre o vetor resultante colocando os elementos em ordem decrescente.
		 */
		int[] vetor = new int[10];
		int[] resultante = new int[10];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um valor: ");
			vetor[i] = sc.nextInt();
		}

		Arrays.sort(vetor);

		int c = 0;
		while (c < vetor.length) {
			//vetor[c] = resultante[d];

			c++;
			//d--;
		}

		System.out.println("Ordem decrescente: ");

		for (int i = 0; i < resultante.length; i++)
			System.out.print(resultante[i] + " ");

	}

	protected static void ex004() {
		/*
		 * Fa�a um programa que receba a temperatura m�dia de cada m�s do ano,
		 * armazenando-as em um vetor. Calcule e mostre a maior e a menor temperatura do
		 * ano e em que m�s ocorreram (quando for imprimir, mostrar o m�s por extenso:
		 * 1- Janeiro, 2- fevereiro, ...) Desconsidere empates.
		 */
		double[] temperatura = new double[12];
		double maior = 0, menor = 0;
		int mesMenor, mesMaior;

		for (int i = 0; i < temperatura.length; i++) {
			System.out.print("Digite a temperatura m�dia do m�s " + (i + 1) + ": ");
			temperatura[i] = sc.nextDouble();
		}

		for (int i = 0; i < temperatura.length; i++) {

			if (i == 0) {
				menor = temperatura[0];
				maior = temperatura[0];
			}

			if (temperatura[i] < menor)
				menor = temperatura[i];

			if (temperatura[i] > maior)
				maior = temperatura[i];

		}

		System.out.println(maior);
		System.out.println(menor);
	}

	protected static void ex005() {

	}

	protected static void ex006() {
		/*
		 * Faça um método que receba como parâmetro um vetor "a" com cinco números reais
		 * e promova a ordenação crescente desses números. O programa principal deverá
		 * imprimir o vetor ordenado.
		 */
		double[] array = new double[5];
		double aux = 0;

		for (int i = 0; i < array.length; i++) {
			System.out.print("Digite um valor real: ");
			array[i] = sc.nextDouble();
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] < array[j]) {
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}

		System.out.println("Vetor ordenado:");

		for (int i = 0; i < array.length; i++)
			System.out.printf("[%.2f] ", array[i]);

	}

	protected static void ex007() {

	}

}
