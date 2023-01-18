package br.pucminas.algoritmostecnicasprogramacao.listarepeticaowhile;

import java.util.Scanner;

public class Exercises {
	static Scanner sc = new Scanner(System.in);

	protected static void ex001() {
		/*
		 * Faça um programa que leia o número de termos e um valor positivo para X,
		 * calcule e mostre o valor da série abaixo. Por definição, o fatorial de um
		 * número natural não definido por: 0! = 1 
		 * Exemplos: 3! = 3 x 2 x 1 = 6n! = n .(n �1).(n �2) ... 3 . 2 . 
		 * 15! = 5 x 4 x 3 x 2 x 1 = 120
		 * 
		 * Observe que: 
		 * - A série termina quando atinge a quantidade de termos que usuário vai desejar 
		 * calcular; 
		 * - Os termos variam entre positivo e negativo.
		 * 
		 * S=-x^2/1! + x^3/2! - x^4/3! + x^5/4!-...,
		 */
		System.out.print("Número de termos: ");
		int termos = sc.nextInt();

		System.out.println("Digite o valor de x: ");
		int valorX = sc.nextInt();

		if (termos > 0) {

			int count = 1;
			double S = 0;

			double numerador = 1;

			while (count <= termos) {
				double denominador = Math.pow(valorX, (count + 1));

				while (numerador <= termos) {
					numerador += (numerador * (termos - 1));
					termos--;
				}

				S += ((-1) * (denominador / numerador));

				numerador++;
				count++;
			}

			System.out.printf("Resultado operação: %.2f", S);
		} else {
			System.out.println("Não é possível calcular.");
		}

	}

	protected static void ex002() {
		/*
		 * Faça um programa que receba duas notas de seis alunos, calcule e mostre: 
		 * 	a) A média aritmética das duas notas de cada aluno; 
		 * 	b) imprima a mensagem que está na tabela; 
		 * 	c) o total de alunos aprovados; 
		 * 	d) o total de alunos de exame; 
		 * 	e) o total de alunos reprovados; 
		 * 	f) a média aritmética da classe.
		 * 
		 * Média Aritmética 	Mensagem 
		 * 		Até 3 			reprovado 
		 * 		>3 e <7 		exame 
		 * 		>=7 			aprovado
		 */

		int alunos = 0;
		int reprovado = 0;
		int exame = 0;
		int aprovado = 0;
		double mediaClasse = 0;

		while (alunos < 6) {
			System.out.print("Digite a primeira nota: ");
			float nota1 = sc.nextFloat();

			System.out.print("Digite a segunda nota: ");
			float nota2 = sc.nextFloat();
			float media = (nota1 + nota2) / 2;

			System.out.printf("Média do aluno: %.2f\n", media);

			if (media <= 3) {
				System.out.println("Reprovado");
				reprovado++;
			} else if (media > 3 && media < 7) {
				System.out.println("Exame");
				exame++;
			} else if (media >= 7 && media <= 10) {
				System.out.println("Aprovado");
				aprovado++;
			}

			mediaClasse += media;
			alunos++;
		}

		System.out.printf("Alunos aprovados: %d\n", aprovado);
		System.out.printf("Alunos reprovados: %d\n", reprovado);
		System.out.printf("Alunos de exames: %d\n", exame);

		mediaClasse /= 6;

		System.out.printf("A média aritmética da classe: %.2f\n", mediaClasse);
	}

	protected static void ex003() {
		/*
		 * Em uma fábrica trabalham 15 pessoas entre homens e mulheres divididos em três
		 * classes:
		 * 
		 * Peças por mês 										Classe 
		 * 	Trabalhadores que fazem até 30 peças por mês 			1
		 * 	Trabalhadores que fazem de 30 a 35 peças por mês 		2 
		 * 	Trabalhadores que fazem mais de 35 peças por mês 		3
		 * 
		 * A classe 1 recebe salário mínimo(R$1000,00). 
		 * A classe 2 recebe salário mínimo mais 3% deste salário por peça, acima das 30 peças iniciais. 
		 * A classe 3 recebe salário mínimo mais 5% deste salário por peça, acima das 30 peças iniciais.
		 * 
		 * Faça um programa que receba o número do operário, o número de peças fabricadas por ele no mês, 
		 * o sexo do operário, e que também calcule e mostre:
		 * a) O número do operário e seu salário; 
		 * b) O total da folha de pagamento da fábrica; 
		 * c) O número total de peças fabricadas no mês; 
		 * d) A média de peças fabricadas pelos homens; 
		 * e) A média de peças fabricadas pelas mulheres; 
		 * f) O número do operário ou operária de maior salário.
		 */

		int trabalhadores = 0, operarioMaiorSalario = 0, totalPecas = 0;
		float mediaPecasMasculino = 0, mediaPecasFeminino = 0, totalFolha = 0;
		double maiorSalario = 0;

		while (trabalhadores < 15) {
			System.out.print("\nNúmero do operário: ");
			int numeroOperario = sc.nextInt();

			System.out.print("Número de peças:");
			int pecas = sc.nextInt();

			System.out.print("Gênero do operário: ");
			char genero = sc.next().charAt(0);

			double salario;

			if (pecas <= 30) 
				salario = 1000;
			else if (pecas > 30 || pecas < 35) 
				salario = (1000 + ((1000 * 0.03) * (pecas - 30)));
			else 
				salario = (1000 + ((1000 * 0.05) * (pecas - 35)));

			if (maiorSalario < salario) {
				maiorSalario = salario;
				operarioMaiorSalario = numeroOperario;
			}

			if (genero == 'M' || genero == 'm')
				mediaPecasMasculino++;
			else if (genero == 'F' || genero == 'f')
				mediaPecasFeminino++;
			else 
				System.out.println("ERRO. Tente Novamente.");

			System.out.printf("Operário nº %d       Salário R$%.2f", numeroOperario, salario);

			totalFolha += salario;
			totalPecas += pecas;
			trabalhadores++;
		}

		System.out.printf("Total da folha de pagamento da fábrica: %.2f\n", totalFolha);
		System.out.printf("Número total de peças fabricadas no mês: %d\n", totalPecas);
		System.out.printf("Média de peças fabricadas pelos homens: %d\n", mediaPecasMasculino);
		System.out.printf("Média de peças fabricadas pelas mulheres: %d\n", mediaPecasFeminino);
		System.out.printf("Número do operário ou operária de maior salário: %d\n", operarioMaiorSalario);
	}

	protected static void ex004() {
		/*
		 * Faça um programa que receba o valor de uma dívida e mostre uma tabela com os
		 * seguintes dados: valor da dívida, valor dos juros, quantidade de parcelas e
		 * valor da parcela.
		 * 
		 * Quantidade de parcelas 					% de juros sobre o valor inicial da dívida 
		 * 		1 											0 
		 * 		3 											10 
		 * 		6											15 
		 * 		9 											20 
		 * 		12											25
		 * 
		 * Exemplo de saída do programa 
		 * Valor da Dívida 		Valor dos juros 		Quant. de parcelas 		Valor da parcela 
		 * R$1000,00 				0 						1 						R$1000,00 
		 * R$1100,00 				100						3 						R$366,67
		 * R$1150,00 				150 					6 						R$191,67
		 */
		int parcelas = 1;
		float valorJuros = 0, valorParcela = 0;

		System.out.print("Digite o valor da dívida: ");
		float divida = sc.nextFloat();

		System.out.println(
				"Valor da Dívida			Valor dos juros			Quantidade de parcelas			Valor da parcela");

		while (parcelas <= 12) {
			valorJuros = (divida - 1000);
			valorParcela = (divida / parcelas);

			if (parcelas == 1) {
				System.out.printf("%.2f				%.2f					%d					%.2f%n", divida,
						valorJuros, parcelas, valorParcela);

				divida += 100;
				parcelas += 2;
			} else {
				System.out.printf("%.2f				%.2f					%d					%.2f%n", divida,
						valorJuros, parcelas, valorParcela);
				divida += 50;
				parcelas += 3;
			}

		}

	}

	protected static void ex005() {
		/*
		 * Faça um programa que receba o salário de um funcionário chamado Carlos.
		 * Sabe-se que outro funcionário, João, tem salário equivalente a um terço do
		 * salário de Carlos. Carlos aplicará seu salário integralmente na caderneta de
		 * poupança, que está rendendo 2% ao mês, e João aplicará seu salário
		 * integralmente no fundo de renda fixa, que está rendendo 5% ao mês. O programa
		 * deverá calcular e mostrar a quantidade de meses necessários para que o valor
		 * pertencente a João igual e/ou ultrapasse o valor pertencente a Carlos.
		 */
		System.out.println("Redimento de contas");
		System.out.print("Salário de Carlos: ");
		float salarioCarlos = sc.nextFloat();

		float salarioJoao = (salarioCarlos / 3);

		float rendimentoCarlos = 0, rendimentoJoao = 0;
		int meses = 0;

		while (salarioJoao <= salarioCarlos) {

			rendimentoCarlos = ((salarioCarlos * 2) / 100);
			rendimentoJoao = ((salarioJoao * 5) / 100);

			salarioCarlos += rendimentoCarlos;
			salarioJoao += rendimentoJoao;

			meses++;
		}

		System.out.printf("O rendimento de João iguala ou ultrapassa o rendimento de Carlos em %d meses", meses);
	}

	protected static void ex006() {
		/*
		 * Faça um programa para ler o código, o sexo (M-masculino, F-feminino) e o
		 * número de horas/aula dadas mensalmente pelos professores de uma universidade,
		 * sabendo-se que cada hora/aula vale R$ 30,00. Emita uma listagem contendo o
		 * código, o salário bruto e o salário líquido (levando em consideração os
		 * descontos explicados a seguir) de todos os professores. Mostre também a média
		 * dos salários líquidos dos professores do sexo masculino e a média dos
		 * salários líquidos dos professores do sexo feminino. Considere: 
		 * a) desconto para homens, 10% e, para mulheres, 5%; 
		 * b) as informações terminarão quando for lido o código = 99999
		 */

		int codigo = 0;

		while (codigo != 99999) {
			System.out.print("Código: ");
			codigo = sc.nextInt();

			System.out.print("Sexo: ");
			char genero = sc.next().charAt(0);

			System.out.print("Número de horas/aula trabalhadas: ");
			int horaAula = sc.nextInt();

			double salarioBruto = horaAula * 30;

			double salarioLiquido;

			if (genero == 'M' || genero == 'm') {
				salarioLiquido = salarioBruto - (salarioBruto * 0.1);
				System.out.printf("Salário bruto: %.2f\nSalário líquido: %.2f\n", salarioBruto, salarioLiquido);
			} else if (genero == 'F' || genero == 'f') {
				salarioLiquido = salarioBruto - (salarioBruto * 0.05);
				System.out.printf("Salário bruto: %.2f\nSalário líquido: %.2\n", salarioBruto, salarioLiquido);
			} else {
				System.out.print("Valor inválido");
			}
		}
	}

	protected static void ex007() {
		/*
		 * Uma empresa decidiu fazer um levantamento em relação aos candidatos que se
		 * apresentarem para preenchimento de vagas em seu quadro de funcionários.
		 * Supondo que você seja o programador dessa empresa, faça um programa que leia,
		 * para cada candidato, a idade, o sexo (M ou F) e a experiência no serviço (S
		 * ou N). Para encerrar a entrada de dados, digite zero para a idade. O programa
		 * também deve calcular e mostrar: 
		 * a) O número de candidatos do sexo feminino;
		 * b) O número de candidatos do sexo masculino; 
		 * c) A idade média dos homens que já têm experiência no serviço; 
		 * d) A porcentagem dos homens com mais de 45 anos entre o total dos homens; 
		 * e) O número de mulheres com idade inferior a 21 anos e com experiência no serviço; 
		 * f) A menor idade entre as mulheres que já têm experiência no serviço.
		 */
		int idade = 1, candidatoFeminino = 0, candidatoMasculino = 0, experienciaHomens = 0, candidatosMais45 = 0,
				menorIdadeFeminino = 0, candidatoFemininoMenor21 = 0;
		float mediaIdadeHomens = 0;


		while (idade != 0) {
			System.out.println("CANDIDATOS DA EMPRESA");
			System.out.println("Olá, candidato(a)! Digite os campos abaixo:");

			System.out.print("Idade: ");
			idade = sc.nextInt();

			System.out.print("Gênero: ");
			char genero = sc.next().charAt(0);

			System.out.print("Possui experiência? ");
			char experiencia = sc.next().charAt(0);

			if (genero == 'F' || genero == 'f') {
				candidatoFeminino++;
				if (experiencia == 'S' || experiencia == 's') {
					if (idade < menorIdadeFeminino) {
						menorIdadeFeminino = idade;
					}

					if (idade < 21) {
						candidatoFemininoMenor21++;
					}
				}
			} else if (genero == 'M' || genero == 'm') {
				candidatoMasculino++;

				if (experiencia == 'S' || experiencia == 's') {
					experienciaHomens++;
					mediaIdadeHomens += idade;
				}

				if (idade > 45) {
					candidatosMais45++;
				}
			}

			mediaIdadeHomens /= experienciaHomens;
			candidatosMais45 /= candidatoMasculino;

			System.out.printf("Número de candidatas: %d", candidatoFeminino);
			System.out.printf("Número de candidatos: %d", candidatoMasculino);
			System.out.printf("Idade Média dos homens com experiência: %.0f", mediaIdadeHomens);
			System.out.printf("Porcentagem dos homens com mais de 45 anos entre o total dos homens: %d por cento",
					candidatosMais45);
			System.out.printf("Mulheres com idade menos de 21 anos e com experiência: %d", candidatoFemininoMenor21);
			System.out.printf("A menor idade entre as mulheres que já têm experiência: %d", menorIdadeFeminino);
		}

	}

	protected static void ex008() {
		/*
		 * Faça um programa que apresente o menu de opções a seguir, permita ao usuário
		 * escolher a opção desejada, receba os dados necessários para executar a
		 * operação e mostre o resultado. Verifique a possibilidade de opção inválida e
		 * não se preocupe com restrições do tipo salário inválido. Menu de opções: 1.
		 * Imposto 2. Novo salário 3. Classificação 4. Finalizar o programa Digite a
		 * opção desejada.
		 * 
		 * Na opção 1: receber o salário de um funcionário, calcular e mostrar o valor
		 * do imposto usando as regras a seguir. Salários %imposto <R$1000,00 5
		 * >=R$1000,00 e <R$2000,00 10 >=R$2000,00 15
		 * 
		 * Na opção 2: receber o salário de um funcionário, calcular e mostrar o valor
		 * do novo salário usando as regras a seguir. Salários Aumento >R$2000,00
		 * R$25,00 >=R$1500,00 e <=R$2000,00 R$50,00 >=R$1000,00 e <R$1500,00 R$75,00
		 * <R$1000,00 R$100,00
		 * 
		 * Na opção 3: receber o salário de um funcionário e mostrar sua classificação
		 * usando esta tabela: Salários Classificação <R$1000,00 Mal remunerado
		 * >=R$1000,00 Bem remunerado
		 */

		System.out.println("MENU DE OPÇÕES");
		System.out.println("-----------------");
		System.out.println("1. Imposto");
		System.out.println("2. Novo Salário");
		System.out.println("3. Classificação");
		System.out.println("4. Finalizar o programa");
		System.out.print("\nDigite a opção desejada: ");
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("IMPOSTO");
			System.out.print("Informe o salário: ");
			float salario = sc.nextFloat();

			double imposto;

			if (salario < 1000)
				imposto = (salario * 0.05);
			else if (salario >= 1000 && salario < 2000)
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

			if (salarioAtual > 2000) 
				novoSalario = (salarioAtual + 25);
			else if (salarioAtual >= 1500 && salarioAtual <= 2000)
				novoSalario = (salarioAtual + 50);
			else if (salarioAtual >= 1000 && salarioAtual < 1500)
				novoSalario = (salarioAtual + 75);
			else 
				novoSalario = (salarioAtual + 100);

			System.out.printf("Valor do novo salário: R$%.2f", novoSalario);
			break;
			
		case 3:
			System.out.println("CLASSIFICAÇÃO");
			System.out.print("Informe o salário: ");
			salario = sc.nextFloat();

			if (salario < 1000) 
				System.out.println("Mal remunerado");
			else 
				System.out.println("Bem remunerado");
			break;
			
		case 4:
			System.out.print("Programa Finalizado");
			break;
			
		default:
			System.out.println("Opção inválida. Tente novamente.");
		}
	}

}
