package br.pucminas.algoritmostecnicasprogramacao.docs;

import java.util.Scanner;

public class Exercises {
	static Scanner sc = new Scanner(System.in);

	protected static String ex001() {
		/*
		 * Suponha que voc� est� desenvolvendo um software para controle de estoque que
		 * precisa informar como est� a quantidade de pacotes de uma ra��o A:
		 * a. se suficiente, para quantidades superiores a 100;
		 * b. em alerta, para quantidades entre 100 e 50;
		 * c. e abaixo do ideal, para quantidades menores do que 50.
		 * Fa�a um programa que imprima o status do estoque como base na entrada da
		 * quantidade atual.
		 */

		System.out.print("Quantidade de pacotes de ra��o A:");

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
		 * Fa�a um programa que leia tr�s n�meros reais representando os lados de um
		 * tri�ngulo e informe se seu tri�ngulo � Equil�tero, Is�sceles ou Escaleno.
		 */

		float[] lado = new float[3];

		for (int i = 0; i < lado.length; i++) {
			System.out.printf("Informe o tamanho do %d� lado do tri�ngulo: ");
			lado[i] = sc.nextFloat();
		}

		if ((lado[0] == lado[1]) && (lado[1] == lado[2]))
			return "Seu tri�ngulo � equil�tero.";
		else if (((lado[0] == lado[1]) && (lado[0] != lado[2])) || ((lado[1] == lado[2]) && (lado[0] != lado[1])))
			return "Seu tri�ngulo � is�sceles.";
		else
			return "Seu tri�ngulo � escaleno.";
	}

	protected static String ex003() {
		/*
		 * A nota final de um estudante � calculada a partir de tr�s notas atribu�das,
		 * respectivamente, a um trabalho de laborat�rio, a uma avalia��o semestral e a
		 * um exame final. A m�dia das tr�s notas mencionadas obedece aos pesos a
		 * seguir: Nota Peso Trabalho de laborat�rio 2 Avalia��o semestral 3 Exame final
		 * 5
		 * 
		 * Fa�a um programa que receba 3 notas, calcule e mostre a m�dia ponderada e o
		 * conceito que segue a tabela: M�dia ponderada Conceito >=8 e <=10 A >=7 e < 8
		 * B >=6 e < 7 C >=5 e < 6 D >=0 e < 5 E
		 */

		float[] nota = new float[3];

		for (int i = 0; i < nota.length; i++) {
			System.out.printf("Insira o valor da %d� nota: ", (i + 1));
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
		 * Fa�a um programa que receba tr�s n�meros e mostre-os em ordem crescente.
		 * Suponha que o usu�rio digite tr�s n�meros diferentes.
		 */

		int[] numero = new int[3];

		for (int i = 0; i < numero.length; i++) {
			System.out.printf("Insira o %d� valor:", (i + 1));
			numero[i] = sc.nextInt();
		}

		if (numero[0] < numero[1] && numero[1] < numero[2])
			System.out.printf("A ordem dos valores s�o: %d, %d, %d", numero[0], numero[1], numero[2]);
		else if (numero[0] > numero[1] && numero[1] > numero[2])
			System.out.printf("A ordem dos valores s�o:  %d, %d, %d", numero[2], numero[1], numero[0]);

	}

	protected static String ex005() {
		/*
		 * Fa�a um programa que receba um n�mero inteiro e verifique se � par ou �mpar.
		 */

		System.out.print("Insira um valor:");
		int numero = sc.nextInt();
		sc.close();

		if (numero % 2 == 0)
			return "Este valor � par.";
		else
			return "Este valor � impar.";

	}

	protected static void ex006() {
		/*
		 * Fa�a um programa que receba o c�digo correspondente ao cargo de um
		 * funcion�rio e seu sal�rio atual e mostre o cargo, o valor do aumento e seu
		 * novo sal�rio. Os cargos est�o na tabela abaixo:
		 * 
		 * C�d Cargo Percentual 1 Escritur�rio 50% 2 Secret�rio 35% 3 Caixa 20% 4
		 * Gerente 10% 5 Diretor N�o tem aumento
		 */

		double novoSalario = 0;

		System.out.print("Insere c�digo do cargo: ");
		int codigo = sc.nextInt();

		System.out.print("Insira o sal�rio atual: ");
		float salario = sc.nextFloat();

		if (codigo == 1) {
			novoSalario = (salario * 1.5);
			System.out.println("Cargo 1: Escritur�rio\nAumento: 50% ");
			System.out.printf("Novo sal�rio: R$%.2f", novoSalario);
		} else if (codigo == 2) {
			novoSalario = (salario * 1.35);
			System.out.println("Cargo 2: Secret�rio\nAumento: 35%");
			System.out.printf("Novo sal�rio: R$%.2f", novoSalario);
		} else if (codigo == 3) {
			novoSalario = (salario * 1.2);
			System.out.println("Cargo 3: Caixa\nAumento: 20%");
			System.out.printf("Novo sal�rio: R$%.2f", novoSalario);
		} else if (codigo == 4) {
			novoSalario = (salario * 1.1);
			System.out.println("Cargo 4: Gerente\nAumento: 10%");
			System.out.printf("Novo sal�rio: R$%.2f", novoSalario);
		} else if (codigo == 5) {
			novoSalario = salario + (salario * 0);
			System.out.println("Cargo 5: Diretor\nAumento: inexistente");
			System.out.printf("Novo sal�rio: R$%.2f", novoSalario);
		} else {
			System.out.println("C�digo inv�lido. Tente novamente.");
		}
	}

	protected static void ex007() {
		/*
		 * Fa�a um programa que receba o valor do sal�rio m�nimo, o n�mero de horas
		 * trabalhadas, o n�mero de dependentes do funcion�rio e a quantidade de horas
		 * extras trabalhadas. Calcule e mostre o sal�rio a receber do funcion�rio de
		 * acordo com as regras a seguir: - O valor da hora trabalhada � igual a 1/5 do
		 * sal�rio m�nimo; - O sal�rio do m�s � igual ao n�mero de horas trabalhadas
		 * multiplicado pelo valor da hora trabalhada; - Para cada dependente,
		 * acrescentar R$ 32,00; - Para cada hora extra trabalhada, calcular o valor da
		 * hora trabalhada acrescida de 50%; - O sal�rio bruto � igual ao sal�rio do m�s
		 * mais o valor dos dependentes mais o valor das horas extras; - Calcular o
		 * valor do imposto de renda de acordo com a tabela a seguir:
		 * 
		 * IRRF Sal�rio bruto Isento Inferior a R$200,00 10% De R$200,00 at� R$500,00
		 * 20% Superior a R$500,00
		 * 
		 * O sal�rio l�quido � igual ao sal�rio bruto menos o IRRF; A gratifica��o ser�
		 * de acordo com a tabela a seguir:
		 * 
		 * Sal�rio l�quido Gratifica��o At� R$350,00 R$100,00 Superior a R$350,00
		 * R$50,00
		 * 
		 * O sal�rio a receber do funcion�rio � igual ao sal�rio l�quido mais a
		 * gratifica��o
		 */

		System.out.print("Sal�rio m�nimo: ");
		float salarioMinimo = sc.nextFloat();

		System.out.print("Horas trabalhadas: ");
		int horas = sc.nextInt();

		System.out.print("N�mero de dependentes: ");
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

		System.out.printf("Sal�rio a receber: %.2f", salario);
	}

}
