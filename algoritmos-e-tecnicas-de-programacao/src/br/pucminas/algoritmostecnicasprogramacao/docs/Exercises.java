package br.pucminas.algoritmostecnicasprogramacao.docs;

import java.util.Scanner;

public class Exercises {
	static Scanner sc = new Scanner(System.in);

	protected static String ex001() {
		/*
		 * Suponha que você está desenvolvendo um software para controle de estoque que
		 * precisa informar como está a quantidade de pacotes de uma ração A: 
		 * a. se suficiente, para quantidades superiores a 100; 
		 * b. em alerta, para quantidades entre 100 e 50; 
		 * c. e abaixo do ideal, para quantidades menores do que 50.
		 * Faça um programa que imprima o status do estoque como base na entrada da
		 * quantidade atual.
		 */

		System.out.print("Quantidade de pacotes de ração A:");

		int racao = sc.nextInt();
		sc.close();

		if (racao > 100) 
			return "Suficiente";
		else if (racao <= 100 && racao >= 50)
			return "Em alerta";
		else 
			return "Abaixo do ideal";
		
	}

	protected static String ex002() {
		/*
		 * Faça um programa que leia três números reais representando os lados de um
		 * triângulo e informe se seu triângulo é Equilátero, Isósceles ou Escaleno.
		 */
		
		float[] lado = new float[3];
		
		for (int i = 0; i < lado.length; i++) {
			System.out.printf("Informe o tamanho do %dº lado do triângulo: ");
			lado[i] = sc.nextFloat();
		}

		if ((lado[0] == lado[1]) && (lado[1] == lado[2])) 
			return "Seu triângulo é equilátero.";
		else if (((lado[0] == lado[1]) && (lado[0] != lado[2])) || ((lado[1] == lado[2]) && (lado[0] != lado[1])))
			return "Seu triângulo é isósceles.";
		else
			return "Seu triângulo é escaleno.";
	}

	protected static String ex003() {
		/*
		 * A nota final de um estudante é calculada a partir de três notas atribuídas,
		 * respectivamente, a um trabalho de laboratório, a uma avaliação semestral e a
		 * um exame final. A média das três notas mencionadas obedece aos pesos a
		 * seguir: Nota Peso Trabalho de laboratório 2 Avaliação semestral 3 Exame final
		 * 5
		 * 
		 * Faça um programa que receba 3 notas, calcule e mostre a média ponderada e o
		 * conceito que segue a tabela: Média ponderada Conceito >=8 e <=10 A >=7 e < 8
		 * B >=6 e < 7 C >=5 e < 6 D >=0 e < 5 E
		 */

		float[] nota = new float[3];
		
		for (int i = 0; i < nota.length; i++) {
			System.out.printf("Insira o valor da %dª nota: ", (i+1));
			nota[i] = sc.nextFloat();
		}
		

		float media = ((nota[0] * 2) + (nota[1] * 3) + (nota[2] * 5)) / (2 + 3 + 5);

		if (media >= 8 && media <= 10) 
			return "Conceito A";
		else if (media >= 7 && media < 8)
			return "Conceito B";
		else if (media >= 6 && media < 7)
			return "Conceito C";
		else if (media >= 5 && media < 6)
			return "Conceito D";
		else 
			return "Conceito E";
		
	}

	protected static void ex004() {
		/*
		 * Faça um programa que receba três números e mostre-os em ordem crescente.
		 * Suponha que o usuário digite três números diferentes.
		 */

		int[] numero = new int[3];
		
		for (int i = 0; i < numero.length; i++) {
			System.out.printf("Insira o %dº valor:", (i+1));
			numero[i] = sc.nextInt();
		}
		
		if (numero[0] < numero[1] && numero[1] < numero[2]) 
			System.out.printf("A ordem dos valores são: %d, %d, %d", numero[0], numero[1], numero[2]);
		else if (numero[0] > numero[1] && numero[1] > numero[2]) 
			System.out.printf("A ordem dos valores são:  %d, %d, %d", numero[2], numero[1], numero[0]);
		
	}

	protected static String ex005() {
		/*
		 * Faça um programa que receba um número inteiro e verifique se é par ou ímpar.
		 */

		System.out.print("Insira um valor:");
		int numero = sc.nextInt();
		sc.close();

		if (numero % 2 == 0) 
			return "Este valor é par.";
		else
			return "Este valor é impar.";
		

	}

	protected static void ex006() {
		/*
		 * Faça um programa que receba o código correspondente ao cargo de um
		 * funcionário e seu salário atual e mostre o cargo, o valor do aumento e seu
		 * novo salário. Os cargos estão na tabela abaixo:
		 * 
		 * Cód Cargo Percentual 1 Escriturário 50% 2 Secretário 35% 3 Caixa 20% 4
		 * Gerente 10% 5 Diretor Não tem aumento
		 */

		double novoSalario = 0;

		System.out.print("Insere código do cargo: ");
		int codigo = sc.nextInt();

		System.out.print("Insira o salário atual: ");
		float salario = sc.nextFloat();

		if (codigo == 1) {
			novoSalario = (salario * 1.5);
			System.out.println("Cargo 1: Escriturário\nAumento: 50% ");
			System.out.printf("Novo salário: R$%.2f", novoSalario);
		} else if (codigo == 2) {
			novoSalario = (salario * 1.35);
			System.out.println("Cargo 2: Secretário\nAumento: 35%");
			System.out.printf("Novo salário: R$%.2f", novoSalario);
		} else if (codigo == 3) {
			novoSalario = (salario * 1.2);
			System.out.println("Cargo 3: Caixa\nAumento: 20%");
			System.out.printf("Novo salário: R$%.2f", novoSalario);
		} else if (codigo == 4) {
			novoSalario = (salario * 1.1);
			System.out.println("Cargo 4: Gerente\nAumento: 10%");
			System.out.printf("Novo salário: R$%.2f", novoSalario);
		} else if (codigo == 5) {
			novoSalario = salario + (salario * 0);
			System.out.println("Cargo 5: Diretor\nAumento: inexistente");
			System.out.printf("Novo salário: R$%.2f", novoSalario);
		} else {
			System.out.println("Código inválido. Tente novamente.");
		}
	}

	protected static void ex007() {
		/*
		 * Faça um programa que receba o valor do salário mínimo, o número de horas
		 * trabalhadas, o número de dependentes do funcionário e a quantidade de horas
		 * extras trabalhadas. Calcule e mostre o salário a receber do funcionário de
		 * acordo com as regras a seguir: - O valor da hora trabalhada é igual a 1/5 do
		 * salário mínimo; - O salário do mês é igual ao número de horas trabalhadas
		 * multiplicado pelo valor da hora trabalhada; - Para cada dependente,
		 * acrescentar R$ 32,00; - Para cada hora extra trabalhada, calcular o valor da
		 * hora trabalhada acrescida de 50%; - O salário bruto é igual ao salário do mês
		 * mais o valor dos dependentes mais o valor das horas extras; - Calcular o
		 * valor do imposto de renda de acordo com a tabela a seguir:
		 * 
		 * IRRF Salário bruto Isento Inferior a R$200,00 10% De R$200,00 até R$500,00
		 * 20% Superior a R$500,00
		 * 
		 * O salário líquido é igual ao salário bruto menos o IRRF; A gratificação será
		 * de acordo com a tabela a seguir:
		 * 
		 * Salário líquido Gratificação Até R$350,00 R$100,00 Superior a R$350,00
		 * R$50,00
		 * 
		 * O salário a receber do funcionário é igual ao salário líquido mais a
		 * gratificação
		 */

		System.out.print("Salário mínimo: ");
		float salarioMinimo = sc.nextFloat();

		System.out.print("Horas trabalhadas: ");
		int horas = sc.nextInt();

		System.out.print("Número de dependentes: ");
		int dependente = sc.nextInt();

		System.out.print("Horas extras trabalhadas: ");
		int horasExtras = sc.nextInt();

		float valorHora = (salarioMinimo / 5);
		float salario = (horas * valorHora);

		double valorHoraExtra = (1.5 * horasExtras);

		double salarioBruto = (salario + (dependente * 32) + valorHoraExtra);

		double irrf;

		if (salarioBruto < 200)
			irrf = 0;
		else if (salarioBruto >= 200 && salarioBruto <= 500)
			irrf = 0.1;
		else 
			irrf = 0.2;
		

		float salarioLiquido = (float) (salarioBruto - irrf);

		if (salarioLiquido <= 350)
			salario = salarioLiquido + 100;
		else
			salario = salarioLiquido + 50;

		System.out.printf("Salário a receber: %.2f", salario);
	}

}
