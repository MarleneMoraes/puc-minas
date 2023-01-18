/*	
 	Faça um programa, em Java, que exiba o menu de opções a seguir:
		Menu de opções:
			1. Soma de dois números
			2. Raiz quadrada de um número
		Digite a opção desejada:
	Receba a opção do usuário e os dados necessários para executar cada operação; execute a
	operação escolhida e exiba o resultado para o usuário.
 */

/**
 * Java's Exercices from college 
 * 
 * @author MarleneMoraes
 * created on 13 Feb 2022
 * */

package br.pucminas.aedsii20221.estruturadedados.naoavaliativos.listajava;

import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Menu de opcoes:");
		System.out.println("1. Soma de dois numeros");
		System.out.println("2. Raiz quadrada de um numero");
		System.out.print("Digite a opção desejada:");
		
		int opcao = scan.nextInt();
		
		switch (opcao) {
			case 1:
				somar();
				break;
			case 2: 
				raizQuadrada();
				break;
			default:
				System.out.println("Opcao invalida");
		}
		

		scan.close();
	}
	
	public static double somar() {
		Scanner scan = new Scanner (System.in);
		System.out.print("Digite um valor: ");
		double valor1 = scan.nextDouble();
		
		System.out.print("Digite outro numero inteiro: ");
		double valor2 = scan.nextDouble();
		
		double soma = valor1 + valor2;
		
		scan.close();
		
		return soma;
	}
	
	public static double raizQuadrada() {
		Scanner scan = new Scanner (System.in);
		System.out.print("Digite um valor: ");
		double valor = scan.nextDouble();
		
		double raiz = Math.sqrt(valor);
		
		scan.close();
		
		return raiz;
	}

}
