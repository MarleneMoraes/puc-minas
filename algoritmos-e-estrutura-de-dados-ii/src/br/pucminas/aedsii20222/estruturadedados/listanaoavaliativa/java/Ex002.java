/*	
 	Enunciado:
 	Faça um programa, em Java, que exiba o menu de opcoes a seguir:
		Menu de opcoes:
			1. Soma de dois numeros
			2. Raiz quadrada de um numero
		Digite a opcao desejada:
	Receba a opcao do usuario e os dados necessarios para executar cada operacao; execute a
	operacao escolhida e exiba o resultado para o usuario.
 */

/**
 * Java's List
 * 
 * @author MarleneMoraes
 * @date 20 set 2022
 * */

package br.pucminas.aedsii20222.estruturadedados.listanaoavaliativa.java;

import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Menu de opcoes:");
		System.out.println("1. Soma de dois numeros");
		System.out.println("2. Raiz quadrada de um numero");
		System.out.print("Digite a opção desejada:");

		int opcao = scan.nextInt();

		switch (opcao) {
			case 1:

				int[] inteiros = new int[2];

				for (int i = 0; i < inteiros.length; i++) {
					System.out.print("Digite um numero inteiro: ");
					inteiros[i] = scan.nextInt();
				}

				System.out.println("Soma: " + sum(inteiros[0], inteiros[1]));
				break;
			case 2:
				System.out.print("Digite um valor: ");
				double valor = scan.nextDouble();

				System.out.println("Raiz Quadrada: " + squareRoot(valor));
				break;
			default:
				System.out.println("Opcao invalida");
		}

		scan.close();
	}

	public static double sum(double v1, double v2) {
		return v1 + v2;
	}

	public static double squareRoot(double v) {
		return Math.sqrt(v);
	}

}