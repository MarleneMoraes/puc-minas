package br.pucminas.algoritmostecnicasprogramacao.listarepeticaodowhile;

import java.util.Scanner;

public class Exercises {
	static Scanner sc = new Scanner(System.in);

	protected static void ex001() {
		/*
		 * Faça um programa que receba um número inteiro maior que 1, verifique se o
		 * número fornecido é primo ou não e mostre uma mensagem de número primo ou de
		 * número não primo. Um número é primo quando é divisível apenas por 1 e por ele
		 * mesmo.
		 */
		System.out.print("Número: ");
		int numero = sc.nextInt();

		int divisor = 0;
		int count = 1;

		do {
			if (numero % count == 0) {
				divisor++;
				count++;
			}
		} while (count <= numero);

		if (divisor > 2)
			System.out.printf("%d não é um número primo", numero);
		else
			System.out.printf("%d é um número primo", numero);
	}

	protected static void ex002() {
		/*
		 * Faça um programa para calcular a área de um triângulo, que não permita a
		 * entrada de dados inválidos, ou seja, medidas menores ou iguais a 0.
		 */
		float base, altura;

		do {
			System.out.println("Vamos descobrir a área de um triângulo!");
			System.out.print("Digite o valor da base: ");

			base = sc.nextFloat();

			System.out.print("Digite o valor da altura: ");
			altura = sc.nextFloat();

			double areaTriangulo = (base * altura) / 2;

			System.out.printf("A área do triângulo é de %.2f\n", areaTriangulo);
		} while (base <= 0 || altura <= 0);
	}

	protected static void ex003() {
		/*
		 * Faça um programa que leia um conjunto não determinado de valores, um de cada
		 * vez, e escreva uma tabela com cabeçalho, que deve ser repetido a cada vinte
		 * linhas. A tabela deverá conter o valor lido, seu quadrado, seu cubo e sua
		 * raiz quadrada. Finalize a entrada de dados com um valor negativo ou zero.
		 */

		float numero;
		int linhas = 0;

		do {
			numero = sc.nextFloat();

			if (linhas == 0 || linhas % 20 == 0) {
				System.out.println(
						"Número                        Quadrado                     Cubo                     Raiz Quadrada");

			}
			linhas++;

			if (numero > 0) {
				double quadrado = Math.pow(numero, 2);
				double cubo = Math.pow(numero, 3);
				double raiz = Math.sqrt(numero);

				System.out.printf(
						"%.2f                        %.2f                       %.2f                       %.2f\n",
						numero, quadrado, cubo, raiz);
			}

		} while (numero > 0);

	}

	protected static void ex004() {
		/*
		 * Faça um programa que receba vários números, finalizando a entrada de dados
		 * com a digitação do número 30.000. Calcule e mostre: a) A soma dos números
		 * digitados; b) A quantidade de números digitados; c) A média dos números
		 * digitados; d) O maior número digitado; e) O menor número digitado; f) A média
		 * dos números digitados; g) A porcentagem dos números ímpares entre todos os
		 * números digitados.
		 */

		int soma = 0;
		int count = 0;
		int impares = 0;
		int maiorNumero = 0;
		int menorNumero = 0;

		System.out.print("Digite um valor: ");
		int numero = sc.nextInt();

		do {
			soma += numero;
			count++;

			if (numero % 2 != 0)
				impares++;

			if (numero > maiorNumero)
				maiorNumero = numero;

			if (numero < menorNumero || menorNumero == 0)
				menorNumero = numero;

			System.out.print("Digite um valor: ");
			numero = sc.nextInt();
		} while (numero != 30000);

		float media = (soma / count);

		float percentualImpares = (impares / count);

		System.out.printf("\nSoma dos números digitados: %d\n", soma);
		System.out.printf("Quantidade de números digitados: %d\n", count);
		System.out.printf("Média dos números digitados: %.1f\n", media);
		System.out.printf("Maior número digitado: %d\n", maiorNumero);
		System.out.printf("Menor número digitado: %d\n", menorNumero);
		System.out.printf("Porcentagem dos números ímpares entre todos os números digitados: %.2f\n",
				percentualImpares);

	}

	protected static void ex005() {
		/*
		 * Faça um programa que receba o valor do salário mínimo, uma lista contendo a
		 * quantidade de quilowatts gasta por consumidor e o tipo de consumidor
		 * (1-residencial, 2-comercial ou 3-industrial). Termine a entrada de dados com
		 * quantidade de quilowhats igual a zero. Calcule e mostre: a)O valor de cada
		 * quilowatt, sabendo que o quilowatt custa um oitavo do salário mínimo; b)O
		 * valor a ser pago por cada consumidor (conta final mais acréscimo). O
		 * acréscimoencontra-se na tabela a seguir:
		 * 
		 * Tipo % de acréscimo sobre o valor gasto 1 5 2 10 3 15
		 * 
		 * c)O faturamento geral da empresa; d)A quantidade de consumidores que pagam
		 * entre R$ 500,00 e R$ 1000,00.
		 */

		System.out.println("Consumo de Energia");
		System.out.print("Salário mínimo: ");
		float salario = sc.nextFloat();
		float valorQuilowatts = (salario / 8);
		float quantidadeConsumida;
		float geral = 0;
		double acrescimo = 0, consumidores = 0;

		do {
			System.out.print("Quantidade de KW consumida: ");
			quantidadeConsumida = sc.nextFloat();

			if (quantidadeConsumida != 0) {
				float gasto = (valorQuilowatts * quantidadeConsumida);
				System.out.print("Tipo do consumidor \n1-Residencial\n 2-Comercial\n 3-Industrial");
				int tipo = sc.nextInt();

				switch (tipo) {
				case 1:
					acrescimo = (gasto * 0.05);
					break;
				case 2:
					acrescimo = (gasto * 0.1);
					break;
				case 3:
					acrescimo = (gasto * 0.15);
					break;
				}

				double total = (gasto + acrescimo);
				geral += total;

				if (total >= 500 && total <= 1000) 
					consumidores += 1;
				
				System.out.printf("Valor gasto: %.2f%n", gasto);
				System.out.printf("Valor acréscimo: %.2f%n", acrescimo);
				System.out.printf("Valor final: %.2f%n", total);
			}
		} while (quantidadeConsumida != 0);

		System.out.printf("Total geral consumido: %.2f\n", geral);
		System.out.printf("Total de consumidores que pagam entre 500 e 1000 reais: %.2f\n ", consumidores);
	}

}
