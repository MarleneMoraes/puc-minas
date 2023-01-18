package br.pucminas.algoritmostecnicasprogramacao.listarepeticaodowhile;

import java.util.Scanner;

public class Exercises {
	static Scanner sc = new Scanner(System.in);

	protected static void ex001() {
		/*
		 * Fa�a um programa que receba um n�mero inteiro maior que 1, verifique se o
		 * n�mero fornecido � primo ou n�o e mostre uma mensagem de n�mero primo ou de
		 * n�mero n�o primo. Um n�mero � primo quando � divis�vel apenas por 1 e por ele
		 * mesmo.
		 */
		System.out.print("N�mero: ");
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
			System.out.printf("%d n�o � um n�mero primo", numero);
		else
			System.out.printf("%d � um n�mero primo", numero);
	}

	protected static void ex002() {
		/*
		 * Fa�a um programa para calcular a �rea de um tri�ngulo, que n�o permita a
		 * entrada de dados inv�lidos, ou seja, medidas menores ou iguais a 0.
		 */
		float base, altura;

		do {
			System.out.println("Vamos descobrir a �rea de um tri�ngulo!");
			System.out.print("Digite o valor da base: ");

			base = sc.nextFloat();

			System.out.print("Digite o valor da altura: ");
			altura = sc.nextFloat();

			double areaTriangulo = (base * altura) / 2;

			System.out.printf("A �rea do tri�ngulo � de %.2f\n", areaTriangulo);
		} while (base <= 0 || altura <= 0);
	}

	protected static void ex003() {
		/*
		 * Fa�a um programa que leia um conjunto n�o determinado de valores, um de cada
		 * vez, e escreva uma tabela com cabe�alho, que deve ser repetido a cada vinte
		 * linhas. A tabela dever� conter o valor lido, seu quadrado, seu cubo e sua
		 * raiz quadrada. Finalize a entrada de dados com um valor negativo ou zero.
		 */

		float numero;
		int linhas = 0;

		do {
			numero = sc.nextFloat();

			if (linhas == 0 || linhas % 20 == 0) {
				System.out.println(
						"N�mero                        Quadrado                     Cubo                     Raiz Quadrada");

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
		 * Fa�a um programa que receba v�rios n�meros, finalizando a entrada de dados
		 * com a digita��o do n�mero 30.000. Calcule e mostre: a) A soma dos n�meros
		 * digitados; b) A quantidade de n�meros digitados; c) A m�dia dos n�meros
		 * digitados; d) O maior n�mero digitado; e) O menor n�mero digitado; f) A m�dia
		 * dos n�meros digitados; g) A porcentagem dos n�meros �mpares entre todos os
		 * n�meros digitados.
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

		System.out.printf("\nSoma dos n�meros digitados: %d\n", soma);
		System.out.printf("Quantidade de n�meros digitados: %d\n", count);
		System.out.printf("M�dia dos n�meros digitados: %.1f\n", media);
		System.out.printf("Maior n�mero digitado: %d\n", maiorNumero);
		System.out.printf("Menor n�mero digitado: %d\n", menorNumero);
		System.out.printf("Porcentagem dos n�meros �mpares entre todos os n�meros digitados: %.2f\n",
				percentualImpares);

	}

	protected static void ex005() {
		/*
		 * Fa�a um programa que receba o valor do sal�rio m�nimo, uma lista contendo a
		 * quantidade de quilowatts gasta por consumidor e o tipo de consumidor
		 * (1-residencial, 2-comercial ou 3-industrial). Termine a entrada de dados com
		 * quantidade de quilowhats igual a zero. Calcule e mostre: a)O valor de cada
		 * quilowatt, sabendo que o quilowatt custa um oitavo do sal�rio m�nimo; b)O
		 * valor a ser pago por cada consumidor (conta final mais acr�scimo). O
		 * acr�scimoencontra-se na tabela a seguir:
		 * 
		 * Tipo % de acr�scimo sobre o valor gasto 1 5 2 10 3 15
		 * 
		 * c)O faturamento geral da empresa; d)A quantidade de consumidores que pagam
		 * entre R$ 500,00 e R$ 1000,00.
		 */

		System.out.println("Consumo de Energia");
		System.out.print("Sal�rio m�nimo: ");
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
				System.out.printf("Valor acr�scimo: %.2f%n", acrescimo);
				System.out.printf("Valor final: %.2f%n", total);
			}
		} while (quantidadeConsumida != 0);

		System.out.printf("Total geral consumido: %.2f\n", geral);
		System.out.printf("Total de consumidores que pagam entre 500 e 1000 reais: %.2f\n ", consumidores);
	}

}
