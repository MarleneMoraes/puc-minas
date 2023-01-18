package br.pucminas.algoritmostecnicasprogramacao.listacondicionaisswitch;

import java.util.Scanner;

public class Exercises {
	static Scanner sc = new Scanner(System.in);

	protected static void ex001() {
		/*
		 * Faça um programa que receba o código correspondente ao cargo de um
		 * funcionário e seu salário atual e mostre o cargo, o valor do aumento e seu
		 * novo salário. Os cargos estão listados na tabela abaixo.
		 * 
		 * Código 	Cargo 			Percentual 
		 * 1 		Escriturário 		50% 
		 * 2 		Secretário 			35% 
		 * 3 		Caixa 				20% 
		 * 4		Gerente 			10% 
		 * 5 		Diretor 			Não tem aumento
		 */
		
		System.out.print("Insira o código do cargo: ");
		int codigo = sc.nextInt();

		System.out.print("Insira o salário atual: ");
		float salarioAtual = sc.nextFloat();

		double novoSalario = 0;

		switch (codigo) {
		case 1:
			novoSalario = (salarioAtual * 1.5);
			System.out.println("Cargo 1: Escriturário");
			System.out.println("Aumento: 50%");
			break;
		case 2:
			novoSalario = (salarioAtual * 1.35);
			System.out.println("Cargo 2: Secretário");
			System.out.println("Aumento: 35%");
			break;
		case 3:
			novoSalario = (salarioAtual * 1.2);
			System.out.println("Cargo 3: Caixa");
			System.out.println("Aumento: 20%");
			break;
		case 4:
			novoSalario = (salarioAtual * 1.1);
			System.out.println("Cargo 4: Gerente");
			System.out.println("Aumento: 10%");
			break;
		case 5:
			novoSalario = (salarioAtual * 0);
			System.out.println("Cargo 5: Diretor");
			System.out.println("Aumento: inexistente");
			break;
		default:
			System.out.print("Valor inválido. Tente novamente.");
			break;
		}

		if (codigo == 1 || codigo == 2 || codigo == 3 || codigo == 4 || codigo == 5)
			System.out.printf("Novo salário: R$%.2f", novoSalario);

	}

	protected static void ex002() {
		/*
		 * Faça um programa que receba: a. O código de um produto comprado, supondo que
		 * a digitação do código do produto seja sempre válida, ou seja, um número
		 * inteiro entre 1 e 10. b. O peso do produto em quilos. c. O código do país de
		 * origem, supondo que a digitação do código seja sempre válida, ou seja, um
		 * número inteiro entre 1 e 3.
		 * 
		 * Tabelas:
		 * 
		 * Código do país de origem 	Imposto 
		 * 		1 							0% 
		 * 		2 							15% 
		 * 		3 							25%
		 * 
		 * Código do produto 			Preço por grama 
		 * 		1 a 4 						10 
		 * 		5 a 7 						25 
		 * 		8 a 10 						35
		 * 
		 * Calcule e mostre: 
		 * a) O peso do produto convertido em gramas; 
		 * b) O preço total do produto comprado; 
		 * c) O valor do imposto, sabendo-se que ele é cobrado sobre o preço total do produto 
		 * comprado e depende do país de origem; 
		 * d) O valor total (preço total do produto mais imposto).
		 */
		
		double preco = 0, imposto = 0;

		System.out.print("Peso do produto (em kg): ");
		float peso = sc.nextFloat();

		double pesoGramas = (peso / 1000);

		System.out.print("Código do produto: ");
		int codigo = sc.nextInt();

		switch (codigo) {
		case 1:
		case 2:
		case 3:
		case 4:
			preco = (pesoGramas * 10);
			break;
		case 5:
		case 6:
		case 7:
			preco = (pesoGramas * 25);
			break;
		case 8:
		case 9:
		case 10:
			preco = (pesoGramas * 10);
			break;
		default:
			System.out.print("Código inválido. Tente novamente.");
		}

		if (codigo > 0 && codigo <= 10) {

			System.out.print("Código do país: ");
			int codigoPais = sc.nextInt();

			switch (codigoPais) {
			case 1:
				imposto = preco;

				break;
			case 2:
				imposto = (preco * 1.15);
				break;
			case 3:
				imposto = (preco * 1.25);
				break;
			}

			double valorTotal = (preco + imposto);

			System.out.printf("Peso em gramas: %.2f %n", pesoGramas);
			System.out.printf("Preço do produto: R$%.2f", preco);
			System.out.printf("Valor do imposto: R$%.2f %n", imposto);
			System.out.printf("Valor total: R$%.2f", valorTotal);
		}

	}

	protected static void ex003() {
		/*
		 * Faça um programa que receba: 
		 * 	a. O código do estado de origem da carga de um caminhão, supondo que 
		 * a digitação do código do estado seja sempre válida, ou seja, um número 
		 * inteiro entre 1 e 5. 
		 * 	b. O peso da carga do caminhão em toneladas. 
		 * 	c. O código da carga, supondo que a digitação do código seja sempre 
		 * válida, ou seja, um número inteiro entre 10 e 40.
		 * 
		 * Tabelas: 
		 * Código do estado 			Imposto 
		 * 		1 						35% 
		 * 		2 						25% 
		 * 		3 						15% 
		 * 		4 						5% 
		 * 		5 						ISENTO
		 * 
		 * Código da carga 				Preço por grama 
		 * 		10 a 20 					100 
		 * 		21 a 30 					250 
		 * 		31 a 40 					340
		 * 
		 * Calcule e mostre: 
		 * - O peso da carga do caminhão convertido em quilos; 
		 * - O preço da carga do caminhão; 
		 * - O valor do imposto, sabendo-se que o imposto é cobrado sobre o preço 
		 * da carga do caminhão e depende do estado de origem; 
		 * - O valor total transportado pelo caminhão, preço da carga mais imposto.
		 */

		double carga = 0, imposto = 0;

		System.out.print("Código do estado de origem: ");
		int codigoEstado = sc.nextInt();

		System.out.print("Peso da carga do caminhão (em toneladas): ");
		float peso = sc.nextFloat();

		System.out.print("Código da carga:");
		int codigoCarga = sc.nextInt();

		if (codigoCarga >= 10 && codigoCarga <= 40) {
			double pesoQuilos = (peso * 1000);

			if (codigoCarga >= 10 && codigoCarga <= 20) {
				carga = (pesoQuilos * 1000 * 100);
				carga = sc.nextFloat();
			} else if (codigoCarga >= 21 && codigoCarga <= 30) {
				carga = (pesoQuilos * 1000 * 250);
				carga = sc.nextFloat();
			} else if (codigoCarga >= 31 && codigoCarga <= 40) {
				carga = (pesoQuilos * 1000 * 340);
				carga = sc.nextFloat();
			}

			switch (codigoEstado) {
			case 1:
				imposto = (carga * 0.35);
				break;
			case 2:
				imposto = (carga * 0.25);
				break;
			case 3:
				imposto = (carga * 0.15);
				break;
			case 4:
				imposto = (carga * 0.05);
				break;
			case 5:
				break;
			default:
				System.out.println("Código inválido. Tente novamente.");
			}

			double valorTotal = (carga + imposto);
			System.out.printf("Peso da carga do caminhão convertido em quilos: %.2f", pesoQuilos);
			System.out.printf("Preço da carga do caminhão: R$%.2f", carga);
			System.out.printf("Valor do imposto: R$%.2f", imposto);
			System.out.printf("Valor total: R$%.2f", valorTotal);

		} else {
			System.out.println("ERRO. Tente novamente.");
		}

	}

	protected static void ex004() {
		/*
		 * Faça um programa que apresente o menu a seguir, permita ao usuário escolher a
		 * opção desejada, receba os dados necessários para executar a operação e mostre
		 * o resultado. Verifique a possibilidade de opção inválida e não se preocupe
		 * com restrições, como salário negativo.
		 * 
		 * Menu de opções: 
		 * 	1. Imposto 
		 * 	2. Novo Salário 
		 * 	3. Classificação
		 * 
		 * Digite a opção desejada.
		 * 
		 * Na opção 1: receber o salário de um funcionário, calcular e mostrar o valor
		 * do imposto usando as regras a seguir: Salário Imposto Menor que R$500,00 5%
		 * De R$500,00 a R$850,00 10% Acima de R$850 15%
		 * 
		 * Na opção 2: receber o salário de um funcionário, calcular e mostrar o valor
		 * do novo salário, usando as regras a seguir: Salário Aumento > R$1500,00
		 * R$25,00 >= R$750,00 e <= R$1500,00 R$50,00 >= R$450,00 e < R$750 R$75,00 <
		 * R$450,00 R$100,00
		 * 
		 * Na opção 3: receber o salário de um funcionário e mostrar sua classificação
		 * usando a tabela a seguir: Salário Classificação Até R$700,00 (inclusive) Mal
		 * remunerado Maiores que R$700,00 Bem remunerado
		 */

		System.out.println("MENU DE OPÇÕES");
		System.out.println("-----------------");
		System.out.println("1. Imposto");
		System.out.println("2. Novo Salário");
		System.out.println("3. Classificação");
		System.out.print("\nDigite a opção desejada: ");
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("IMPOSTO");
			System.out.print("Informe o salário: ");
			float salario = sc.nextFloat();

			double imposto;

			if (salario < 500) 
				imposto = (salario * 0.05);
			else if (salario >= 500 && salario <= 850) 
				imposto = (salario * 0.1);
			else
				imposto = (salario * 0.15);

			System.out.printf("Valor do imposto: R$%.2f", imposto);
			break;
		case 2:
			System.out.println("NOVO SALÁRIO");
			System.out.print("Informe o salário atual: ");
			float salarioAtual = sc.nextFloat();

			double novoSalario;

			if (salarioAtual < 1500)
				novoSalario = (salarioAtual + 25);
			else if (salarioAtual >= 750 && salarioAtual <= 1500)
				novoSalario = (salarioAtual + 50);
			else if (salarioAtual >= 450 && salarioAtual < 750)
				novoSalario = (salarioAtual + 75);
			else 
				novoSalario = (salarioAtual + 100);

			System.out.printf("Valor do novo salário: R$%.2f", novoSalario);
			break;
		case 3:
			System.out.println("CLASSIFICAÇÃO");
			System.out.print("Informe o salário: ");
			salario = sc.nextFloat();

			if (salario <= 700)
				System.out.println("Mal remunerado");
			else 
				System.out.println("Bem remunerado");
			break;
		default:
			System.out.println("Opção inválida. Tente novamente.");
		}
	}

}
