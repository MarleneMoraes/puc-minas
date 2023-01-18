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

public class Ex007 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Menu de opcoes:");
		System.out.println("1. Média Aritmética");
		System.out.println("2. Média Ponderada");
		System.out.println("3. Média Aritmética e Ponderada");
		System.out.println("4. Sair");
		System.out.print("Digite a opção desejada:");
		
		int opcao = scan.nextInt();
		double media;
		
		switch (opcao) {
			case 1:
				media = mediaAritmetica();
				System.out.printf("Média Aritmética: %.2f", media);
				break;
			case 2: 
				media = mediaPonderada();
				System.out.printf("Média Ponderada: %.2f", media);
				break;
			case 3: 
				medias();
				break;
			case 4: 
				break;
			default:
				System.out.println("Opcao invalida");
		}
		

		scan.close();
	}
	
	public static double mediaAritmetica() {
		Scanner scan = new Scanner (System.in);
		System.out.print("Digite um valor: ");
		double valor1 = scan.nextDouble();
		
		System.out.print("Digite outro numero inteiro: ");
		double valor2 = scan.nextDouble();
		
		System.out.print("Digite outro numero inteiro: ");
		double valor3 = scan.nextDouble();
		
		double mediaAritmetica = (valor1 + valor2 + valor3) / 3;
		
		scan.close();
		
		return mediaAritmetica;
	}
	
	public static double mediaPonderada() {
		Scanner scan = new Scanner (System.in);
		System.out.print("Digite um valor: ");
		double valor1 = scan.nextDouble();
		
		System.out.print("Digite o peso desse valor: ");
		int peso1 = scan.nextInt();
		
		System.out.print("Digite outro numero inteiro: ");
		double valor2 = scan.nextDouble();
		
		System.out.print("Digite o peso desse valor: ");
		int peso2 = scan.nextInt();
		
		System.out.print("Digite outro numero inteiro: ");
		double valor3 = scan.nextDouble();
		
		System.out.print("Digite o peso desse valor: ");
		int peso3 = scan.nextInt();
		
		double mediaPonderada = ((valor1*peso1) + (valor2*peso2) + (valor3*peso3) / (peso1 + peso2 + peso3));
		
		scan.close();
		
		return mediaPonderada;
	}
	
	public static void medias() {
		double media = mediaAritmetica();
		System.out.printf("Média Aritmética: %.2f\n", media);
		
		media = mediaPonderada();
		System.out.printf("Média Ponderada: %.2f\n", media);
		
	}
	
	

}
