package br.pucminas.algoritmostecnicasprogramacao.listarepeticaofor;

import java.util.Scanner;

public class Exercises {
	static Scanner sc = new Scanner(System.in);

	protected static void ex001() {
		/*
		 * Um funcionário de uma empresa recebe aumento salarial anualmente. Sabe-se
		 * que: 
		 * 	a. Esse funcionário foi contratado em 2015, com salário inicial de R$
		 * 1000,00. 
		 * 	b. Em 2016, ele recebeu aumento de 1,5% sobre seu salário inicial.
		 * 	c. A partir de 2017 (inclusive), os aumentos salariais sempre corresponderam
		 * ao dobro do percentual do ano anterior. Faça um programa que determine o
		 * salário atual desse funcionário.
		 */

		// salario inicial
		double salario = 1000;
		double percentual = 0.015;
		double novoSalario = salario + (salario * percentual);

		for (int i = 2017; i <= 2020; i++) 
			novoSalario += (novoSalario * (2 * percentual));
		

		System.out.printf("O seu novo salário é de R$%.2f ", novoSalario);
	}

	protected static void ex002() {
		/*
		 * Faça um programa que leia um número N que vai indicar a quantidade de valores
		 * inteiros e positivos que devem ser lidos em sequência. Depois, para cada
		 * valor lido, mostre o número e o seu fatorial.
		 */

		long n = 0;
		int numero = 0;
		int fatorial = 1;

		System.out.print("Digite a quantidade de números inteiros: ");
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
		 * Faça um programa que monte os oito primeiros termos da sequência de
		 * Fibonacci: 0 1 1 2 3 5 8 13 21 34 55 . . . Nesta sequência, os dois primeiros
		 * termos são 0 e 1 e os termos seguintes são calculados fazendo a soma dos dois
		 * anteriores.
		 */

		int a1 = 0;
		int a2 = 1;
		int an = 1;

		System.out.println("Sequência de Fibonacci");
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
		 * jogadores. Faça um programa que receba a idade, o peso e a altura de cada um
		 * dos jogadores, calcule e mostre: a. A quantidade de jogadores com idade
		 * inferior a 18 anos; b. A média das idades dos jogadores de cada time; c. A
		 * média das alturas de todos os jogadores do campeonato; d. A percentagem de
		 * jogadores com mais de 80 quilos entre todos os jogadores do campeonato.
		 */

		long menorDezoito = 0;
		double mediaIdade = 0;
		double mediaAltura = 0;
		long maisOitenta = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.printf("Olá jogador do time %d! Digite os dados abaixo: ", i);

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
		System.out.printf("Média das idades dos jogadores de cada time: %.2f", mediaIdade);
		System.out.printf("Média das alturas de todos os jogadores do campeonato: %.2f", mediaAltura);
		System.out.printf("Percentagem de jogadores com mais de 80 quilos entre todos os jogadores do campeonato: %.2f",
				percentagemMaisOitenta);

	}

	protected static void ex005() {

	}

	protected static void ex006() {
		/*
		 * Faça um programa que leia um número não determinado de pares de valores m e
		 * n, inteiros e positivos, um par de cada vez, e que calcule e mostre a soma de
		 * todos os números inteiros entre m e n (inclusive). A digitação de pares
		 * terminará quando m for maior ou igual a n.
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

		System.out.printf("Soma de todos os números: %d", soma);

	}

}
