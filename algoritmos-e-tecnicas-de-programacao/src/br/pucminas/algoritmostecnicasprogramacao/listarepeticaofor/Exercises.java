package br.pucminas.algoritmostecnicasprogramacao.listarepeticaofor;

import java.util.Scanner;

public class Exercises {
	static Scanner sc = new Scanner(System.in);

	protected static void ex001() {
		/*
		 * Um funcion�rio de uma empresa recebe aumento salarial anualmente. Sabe-se
		 * que: 
		 * 	a. Esse funcion�rio foi contratado em 2015, com sal�rio inicial de R$
		 * 1000,00. 
		 * 	b. Em 2016, ele recebeu aumento de 1,5% sobre seu sal�rio inicial.
		 * 	c. A partir de 2017 (inclusive), os aumentos salariais sempre corresponderam
		 * ao dobro do percentual do ano anterior. Fa�a um programa que determine o
		 * sal�rio atual desse funcion�rio.
		 */

		// salario inicial
		double salario = 1000;
		double percentual = 0.015;
		double novoSalario = salario + (salario * percentual);

		for (int i = 2017; i <= 2020; i++) 
			novoSalario += (novoSalario * (2 * percentual));
		

		System.out.printf("O seu novo sal�rio � de R$%.2f ", novoSalario);
	}

	protected static void ex002() {
		/*
		 * Fa�a um programa que leia um n�mero N que vai indicar a quantidade de valores
		 * inteiros e positivos que devem ser lidos em sequ�ncia. Depois, para cada
		 * valor lido, mostre o n�mero e o seu fatorial.
		 */

		long n = 0;
		int numero = 0;
		int fatorial = 1;

		System.out.print("Digite a quantidade de n�meros inteiros: ");
		n = sc.nextLong();

		for (int i = 0; i < n; i++) {
			System.out.print("Digite o valor: ");
			numero = sc.nextInt();
			int j = numero;

			for (fatorial = 1; j > 1; j--) 
				fatorial *= j;
			

			System.out.printf("Valor: %d \nFatorial: %d \n", numero, fatorial);
		}
	}

	protected static void ex003() {
		/*
		 * Fa�a um programa que monte os oito primeiros termos da sequ�ncia de
		 * Fibonacci: 0 1 1 2 3 5 8 13 21 34 55 . . . Nesta sequ�ncia, os dois primeiros
		 * termos s�o 0 e 1 e os termos seguintes s�o calculados fazendo a soma dos dois
		 * anteriores.
		 */

		int a1 = 0;
		int a2 = 1;
		int an = 1;

		System.out.println("Sequ�ncia de Fibonacci");
		System.out.printf("%d %d ", a1, a2);

		for (int i = 2; i < 8; i++) {
			an = a2 + a1;
			a1 = a2;
			a2 = an;

			System.out.printf("%d ", an);
		}
	}

	protected static void ex004() {
		/*
		 * Em um campeonato de futebol existem cinco times e cada um possui onze
		 * jogadores. Fa�a um programa que receba a idade, o peso e a altura de cada um
		 * dos jogadores, calcule e mostre: a. A quantidade de jogadores com idade
		 * inferior a 18 anos; b. A m�dia das idades dos jogadores de cada time; c. A
		 * m�dia das alturas de todos os jogadores do campeonato; d. A percentagem de
		 * jogadores com mais de 80 quilos entre todos os jogadores do campeonato.
		 */

		long menorDezoito = 0;
		double mediaIdade = 0;
		double mediaAltura = 0;
		long maisOitenta = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.printf("Ol� jogador do time %d! Digite os dados abaixo: ", i);

			for (int j = 0; j <= 10; j++) {
				System.out.printf("Idade: ");
				int idade = sc.nextInt();

				System.out.printf("Peso: ");
				float peso = sc.nextFloat();

				System.out.printf("Altura: ");
				float altura = sc.nextFloat();

				if (idade < 18) 
					menorDezoito++;
				

				mediaIdade += idade;
				mediaAltura += altura;

				if (peso > 80.0) 
					maisOitenta++;
				

			}

			mediaIdade /= 11;
		}

		mediaAltura /= (5 * 11);
		double percentagemMaisOitenta = ((5 * 11) * 100) / maisOitenta;

		System.out.printf("Quantidade de jogadores com idade inferior a 18 anos: %d", menorDezoito);
		System.out.printf("M�dia das idades dos jogadores de cada time: %.2f", mediaIdade);
		System.out.printf("M�dia das alturas de todos os jogadores do campeonato: %.2f", mediaAltura);
		System.out.printf("Percentagem de jogadores com mais de 80 quilos entre todos os jogadores do campeonato: %.2f",
				percentagemMaisOitenta);

	}

	protected static void ex005() {

	}

	protected static void ex006() {
		/*
		 * Fa�a um programa que leia um n�mero n�o determinado de pares de valores m e
		 * n, inteiros e positivos, um par de cada vez, e que calcule e mostre a soma de
		 * todos os n�meros inteiros entre m e n (inclusive). A digita��o de pares
		 * terminar� quando m for maior ou igual a n.
		 */

		int m = 0;
		int n = 0;
		int soma = 0;

		for (int i = m; i >= n; i++) {
			System.out.println("Digite o valor de m: ");
			m = sc.nextInt();

			System.out.println("Digite o valor de n: ");
			n = sc.nextInt();

			soma += (m + n);
		}

		System.out.printf("Soma de todos os n�meros: %d", soma);

	}

}
