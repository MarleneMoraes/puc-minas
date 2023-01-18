package br.pucminas.algoritmostecnicasprogramacao.listasequenciais;

import java.util.Scanner;

public class Exercises {
	static Scanner sc = new Scanner(System.in);

	protected static void ex001() {
		/*
		 * Faça um programa que receba três notas e seus respectivos pesos, calcule e
		 * mostre a média ponderada dessas notas.
		 */
		double[] nota = new double[3];
		int[] peso = new int[3];

		System.out.println("Olá! Descubra a média da sua nota aqui.");

		for (int i = 0; i > nota.length; i++) {
			System.out.printf("Digite a sua %dª nota: ", (i + 1));
			nota[i] = sc.nextDouble();

			System.out.printf("Digite o peso da %dª nota: ", (i + 1));
			peso[i] = sc.nextInt();
		}

		double media = ((nota[0] * peso[0]) + (nota[1] * peso[1]) + (nota[2] * peso[2])) / nota.length;

		System.out.printf("A sua média é %.2f ", media);

	}

	protected static void ex002() {
		/*
		 * Faça um programa que receba o salário de um funcionário, calcule e mostre o
		 * novo salário, sabendo-se que este sofreu um aumento de 25%.
		 */

		System.out.println("Parabéns! Você recebeu um aumento!");
		System.out.println("Pode-se conferir o novo salário aqui.");
		System.out.println("Digite o seu salário atual: ");

		float salario = sc.nextFloat();

		double aumento = salario + salario * 0.25;

		System.out.printf("O seu novo salário é %.2f ", aumento);
	}

	protected static void ex003() {
		/*
		 * Faça um programa que receba o salário de um funcionário e o percentual de
		 * aumento, calcule e mostre o valor do aumento e o novo salário.
		 */

		System.out.println("Parabéns! Você recebeu um aumento!");
		System.out.println("Pode-se conferir o novo salário aqui.");
		System.out.print("Digite o seu salário atual: ");

		float salario = sc.nextFloat();

		System.out.print("Digite o percentual de aumento: ");
		float percentual = sc.nextFloat();

		percentual /= 100;

		float aumento = salario + salario * percentual;

		System.out.printf("O seu novo salário é %.2f ", aumento);
	}

	protected static void ex004() {
		/*
		 * Faça um programa que receba o valor de um depósito e o valor da taxa de
		 * juros, calcule e mostre o valor do rendimento e o valor total depois do
		 * rendimento.
		 */
		System.out.println("Vamos conferir o seu rendimento");
		System.out.print("Digite o valor de seu depósito: ");

		float deposito = sc.nextFloat();

		System.out.print("Digite o valor da taxa de juros (em porcentagem): ");
		float juros = sc.nextFloat();

		System.out.print("Digite o tempo em que o depósito foi feito (em meses): ");
		int tempo = sc.nextInt();

		juros /= 100;

		double total = deposito * (1 + juros) * tempo;

		double rendimento = total - deposito;

		System.out.printf("O seu rendimento é de %.2f e seu total é de %.2f ", rendimento, total);
	}

	protected static void ex005() {
		/*
		 * Faça um programa que calcule e mostre a área de um triângulo.
		 */
		System.out.println("Vamos descobrir a área de um triângulo!");
		System.out.print("Digite o valor da base: ");

		float base = sc.nextFloat();

		System.out.print("Digite o valor da altura: ");
		float altura = sc.nextFloat();

		double areaTriangulo = (base * altura) / 2;

		System.out.printf("A área do triângulo é de %.2f ", areaTriangulo);

	}

	protected static void ex006() {
		/*
		 * Faça um programa que calcule e mostre a área de um círculo.
		 */
		System.out.println("Vamos descobrir a área de um círculo!");
		System.out.print("Digite o valor do raio: ");

		float raio = sc.nextFloat();

		double areaCirculo = Math.PI * Math.pow(raio, 2);

		System.out.printf("A área do círculo é de %.2f ", areaCirculo);
	}

	protected static void ex007() {
		/*
		 * Faça um programa que receba um número positivo e maior que zero, calcule e
		 * mostre: a. O número digitado ao quadrado; b. O número digitado ao cubo; c. A
		 * raiz quadrada do número digitado; d. A raiz cúbica do número digitado.
		 */

		System.out.print("Digite um número positivo e maior que zero: ");
		int numero = sc.nextInt();

		double quadrado = Math.pow(numero, 2);
		double cubo = Math.pow(numero, 3);
		double raizQuadrada = Math.sqrt(numero);
		double raizCubica = Math.cbrt(numero);

		System.out.printf("Quadrado de %d: %.2f\n", numero, quadrado);
		System.out.printf("Cubo de %d: %.2f\n", numero, cubo);
		System.out.printf("Raiz Quadrada de %d: %.2f\n", numero, raizQuadrada);
		System.out.printf("Raiz Cúbica de %d: %.2f", numero, raizCubica);
	}

	protected static void ex008() {
		/*
		 * Sabe-se que : 
		 * 1 pé = 12 polegadas 
		 * 1 jarda = 3 pés 
		 * 1 milha = 1.760 jardas
		 * 
		 * Faça um programa que receba uma medida em pés, faça as conversões a seguir e
		 * mostre os resultados: a) em polegadas; b) em jardas; c) em milhas.
		 */

		System.out.print("Digite uma medida em pés: ");
		float medida = sc.nextFloat();

		float polegadas = (medida * 12);
		float jardas = (medida * 3);
		float milhas = (1760 * jardas);

		System.out.printf("A medida %.2f em pés, em polegadas é %.2f, em jardas é %.2f e em milhas é %.2f", medida,
				polegadas, jardas, milhas);
	}

	protected static void ex009() {
		/*
		 * Faça um programa que receba o ano de nascimento de uma pessoa e o ano atual,
		 * calcule e mostre: 
		 * a. a idade dessa pessoa; 
		 * b. quantos anos ela terá em 2050.
		 */
		
		System.out.println("Quantos anos você terá em 2050?");
        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = sc.nextInt();

        int idade = anoAtual - anoNascimento;
        int idadeFutura = 2050 - anoNascimento;

        System.out.printf("Você tem %d anos. Em 2050, você terá %d anos.", idade, idadeFutura);
	}

	protected static void ex010() {
		/*
		 * O custo ao consumidor de um carro novo é a soma do preço de fábrica com o
		 * percentual de lucro do distribuidor e dos impostos aplicados ao preço de
		 * fábrica. Faça um programa que receba o preço de fábrica de um veículo, o
		 * percentual de lucro do distribuidor e o percentual de impostos, calcule e
		 * mostre: 
		 * a. O valor correspondente ao lucro do distribuidor; 
		 * b. O valor correspondente aos impostos; 
		 * c. O preço final do veículo.
		 */
		
		System.out.print("Preço de fábrica do veículo: ");
        float precoFabrica = sc.nextFloat();

        System.out.print("Insira o percentual de lucro do distribuidor: ");
        float percentualLucro = sc.nextFloat();

        System.out.print("Insira o percentual de impostos: ");
        float percentualImpostos = sc.nextFloat();
        

        float lucro = precoFabrica * (percentualLucro / 100);
        System.out.printf("Lucro do distribuidor: R$%.2f%n", lucro);

        float impostos = precoFabrica * (percentualImpostos / 100);
        System.out.printf("Impostos: R$%.2f\n", impostos);

        float valorFinal = (precoFabrica + lucro + impostos);
        System.out.printf("Preço final do veículo: R$%.2f\n", valorFinal);

	}

	protected static void ex011() {
		/*
		 * Faça um programa que receba o número de horas trabalhadas e o valor do
		 * salário mínimo, calcule e mostre o salário a receber seguindo as regras: 
		 * a. A hora trabalhada vale a metade do salário mínimo; 
		 * b. O salário bruto equivale ao número de horas trabalhadas multiplicado 
		 * pelo valor da hora trabalhada; 
		 * c. O imposto equivale a 3% do salário bruto; d. O salário a receber 
		 * equivale ao salário bruto menos o imposto.
		 */
		
		System.out.print("Salário mínimo: ");
		float salarioMinimo = sc.nextFloat();

		System.out.print("Insira o número de horas trabalhadas: ");
		int horasTrabalhadas = sc.nextInt();

		float valorHora = (salarioMinimo / 2);

		float salarioBruto = (horasTrabalhadas * valorHora);

		double imposto = (salarioBruto * 0.03);

		double salarioFinal = (salarioBruto - imposto);

		System.out.printf("Salário a receber: R$%.2f", salarioFinal);
		
	}

	protected static void ex012() {
		/*
		 * Um trabalhador recebeu seu salário e o depositou em sua conta bancária. Esse
		 * trabalhador emitiu dois cheques e agora deseja saber seu saldo atual. Sabe-se
		 * que cada operação bancária de retirada paga CPMF de 0,38% e o saldo inicial
		 * da conta está zerado.
		 */
		float[] cheque = new float[2];
		
		System.out.print("Insira o seu salário: ");
		float salario = sc.nextFloat();

		for (int i=0; i < cheque.length; i++) {
			System.out.printf("Valor do %d cheque: ", (i+1));
			cheque[i] = sc.nextFloat();
		}
		
		double CPMF = 0.0038;
		double saldoAtual = salario - ((cheque[0] + (CPMF * cheque[0])) + (cheque[1] + (CPMF * cheque[1])));

		System.out.printf("Saldo atual: R$%.2f", saldoAtual);
	}

	protected static void ex013() {
		/*
		 * Pedro comprou um saco de ração com peso em quilos. Ele possui dois gatos,
		 * para os quais fornece a quantidade de ração em gramas. A quantidade diária de
		 * ração fornecida para cada gato é sempre a mesma. Faça um programa que receba
		 * o peso do saco de ração e a quantidade de ração fornecida para cada gato,
		 * calcule e mostre quanto restará de ração no saco após cinco dias.
		 */
		
		System.out.print("Insira o peso do saco de ração (em g): ");
        float pesoRacao = sc.nextFloat();

        System.out.print("Insira a quantidade diária fornecida para cada gato (em g): ");
        float quantidadeRacao = sc.nextFloat();
        sc.close();

        float racao = pesoRacao - ((quantidadeRacao * 2) * 5);

        System.out.printf("Peso de ração após 5 dias: %.2fg", racao);

	}

	protected static void ex014() {
		/*
		 * Cada degrau de uma escala tem X de altura. Faça um programa que receba essa
		 * altura e a altura que o usuário deseja alcançar subindo a escada, calcule e
		 * mostre quantos degraus ele deverá subir para atingir seu objetivo, sem se
		 * preocupar com a altura do usuário. Todas as medidas fornecidas devem estar em
		 * metros.
		 */

		System.out.print("Altura do degrau (em m): ");
		float alturaDegrau = sc.nextFloat();

		System.out.print("Altura que deseja alcançar (em m): ");
		float alturaTotal = sc.nextFloat();

		int degraus = (int) (alturaTotal / alturaDegrau);

		System.out.printf("Para atingir seu objetivo, deverá subir %d degraus", degraus);
	}

	protected static void ex015() {
		/*
		 * Sabe-se que o quilowatt de energia custa um quinto do salário mínimo. Faça um
		 * programa que receba o valor do salário mínimo e a quantidade de quilowatts
		 * consumida por uma residência, calcule e mostre: 
		 * a. O valor de cada quilowatt;
		 * b. O valor a ser pago por essa residência; 
		 * c. O valor a ser pago com desconto de 15%.
		 */
		
		System.out.print("Insira o valor do sal�rio m�nimo: ");
        float salarioMinimo = sc.nextFloat();
        double quilowatt = (salarioMinimo * 0.2);

        System.out.printf("Valor de cada quilowatt: R$%.2f%n", quilowatt);

        System.out.print("Insira a quantidade de quilowatts consumida na resid�ncia: ");
        float quantidadeQuilowatt = sc.nextFloat();

        double valorTotal = (quantidadeQuilowatt * quilowatt);

        System.out.printf("Valor a ser pago: R$%.2f%n", valorTotal);

        double valorDesconto = (valorTotal - (valorTotal * 0.15));

        System.out.printf("Valor com desconto: R$%.2f", valorDesconto);

	}

	protected static void ex016() {
		/*
		 * Faça um programa que receba o custo de um espetáculo teatral e o preço do
		 * convite desse espetáculo. Esse programa deverá calcular e mostrar a
		 * quantidade de convites que devem ser vendidos para que pelo menos o custo do
		 * espetáculo seja alcançado.
		 */

		System.out.print("Custo do espetáculo: ");
		float custo = sc.nextFloat();

		System.out.print("Preço do convite: ");
		float precoConvite = sc.nextFloat();

		int quantidadeConvite = (int) (custo / precoConvite);

		System.out.printf("Para atingir seu objetivo, deverá vender %d convites", quantidadeConvite);
	}

	protected static void ex017() {
		/*
		 * Faça um programa para ler o número de um funcionário, a quantidade de horas
		 * trabalhadas e o valor que recebe por hora. O programa deve calcular e mostrar
		 * o salário deste funcionário.
		 */

		System.out.println("Olá! Descubra o valor do seu salário.");
		System.out.print("Digite o seu número de funcionário: ");
		int id = sc.nextInt();

		System.out.print("Quantas horas trabalhadas realizou? ");
		int horas = sc.nextInt();

		System.out.print("Valor por hora: ");
		float valor = sc.nextInt();

		float salario = (valor * horas);

		System.out.printf("O salário do funcionário %d é R$%.2f", id, salario);
	}

	protected static void ex018() {
		/*
		 * Faça um programa que calcule e mostre a área de um trapézio.
		 */

		System.out.println("Olá! Descubra o valor da área de um trapézio.");
		System.out.print("Digite o valor da base maior: ");
		float baseMaior = sc.nextFloat();

		System.out.print("Digite o valor da base menor: ");
		float baseMenor = sc.nextFloat();

		System.out.print("Digite o valor da altura: ");
		float altura = sc.nextFloat();

		double area = (((baseMaior + baseMenor) * altura) / 2);

		System.out.printf("Área do trapézio: %.2f ", area);
	}

	protected static void ex019() {
		/*
		 * Faça um programa que leia o número total de prestações de um consórcio, o
		 * total de prestações pagas e o valor atual da prestação. O código deve
		 * calcular e apresentar o saldo devedor atual.
		 */

		System.out.println("Olá! Descubra o seu saldo devedor.");
		System.out.print("Digite o número total de prestações: ");
		int prestacaoTotal = sc.nextInt();

		System.out.print("Digite o número de prestações pagas: ");
		int prestacaoAtual = sc.nextInt();

		System.out.print("Digite o valor atual da prestação: ");
		float valorAtual = sc.nextFloat();
		sc.close();

		float valorTotal = (valorAtual * prestacaoTotal);

		double saldoDevedor = valorTotal - (valorAtual * (prestacaoTotal - prestacaoAtual));

		System.out.printf("Saldo devedor atual é de %.2f", saldoDevedor);

	}

	protected static void ex020() {
		/*
		 * Escreva um programa para ler o número de eleitores de um município, o número
		 * de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada
		 * um representa em relação ao total de eleitores.
		 */

		System.out.println("Olá, saiba o percentual desta eleição!");
		System.out.print("Digite o número de eleitores do município: ");
		int eleitores = sc.nextInt();

		System.out.print("Digite o número de votos brancos: ");
		int brancos = sc.nextInt();

		System.out.print("Digite o número de votos nulos: ");
		int nulos = sc.nextInt();

		System.out.print("Digite o número de votos válidos: ");
		int validos = sc.nextInt();

		double percentualBrancos = (brancos / eleitores);
		float percentualNulos = (float) (nulos / eleitores);
		float percentualValidos = (float) (validos / eleitores);

		System.out.print("Os votos dos eleitores desse município foram de" + percentualBrancos + "% brancos, "
				+ percentualNulos + "% nulos, e " + percentualValidos + "% válidos.");
	}

}
