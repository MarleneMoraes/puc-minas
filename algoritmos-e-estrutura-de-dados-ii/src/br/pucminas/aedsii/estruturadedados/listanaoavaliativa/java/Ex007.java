/*	
  	Enunciado:
 	Faça um programa, em Java, que apresente o menu de opções a seguir:
 	
 	Menu de opções: 
	1. Média Aritmética 
	2. Média Ponderada 
	3. Média Aritmética e Ponderada 
	4. Sair 
	Digite a opção desejada: 
 
	Na opção 1, receba três números reais, calcule e exiba a média aritmética correspondente. 
	Na  opção  2,  receba  três  números  reais  e  seus  respectivos  pesos,  calcule  e  mostre  a 
	correspondente média ponderada. 
	Na  opção  3,  receba  três  números  reais  e  seus  respectivos  pesos,  calcule  e  mostre  as 
	correspondentes médias aritmética e ponderada. 
	 
	Verifique  a  possibilidade  de  opção  inválida.  Nesse  caso,  o  programa  deve  exibir  uma 
	mensagem de erro. 
	 
	A  exibição  do  menu  de  opções  deve  ser  implementada  como  um  método,  assim  como  o 
	cálculo de cada uma das opções apresentadas nesse menu. 
	 
 */

/**
 * Java's List
 * 
 * @author MarleneMoraes
 * @date 20 set 2022
 * */


package br.pucminas.aedsii.estruturadedados.listanaoavaliativa.java;

import java.util.Locale;
import java.util.Scanner;

public class Ex007 {
	public static void main(String[] args) {
		menu();

	}


	public static void menu(){
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);

		System.out.println("Menu de opcoes:");
		System.out.println("1. Média Aritmética");
		System.out.println("2. Média Ponderada");
		System.out.println("3. Média Aritmética e Ponderada");
		System.out.println("4. Sair");
		System.out.print("Digite a opção desejada:");
		
		int option = scan.nextInt();
		
		switch (option) {
			case 1:
				arithmetic();
				break;
			case 2: 
				weighted();
				break;
			case 3: 
				arithmetic();
				weighted();
				break;
			case 4: 
				break;
			default:
				System.out.println("Opcao invalida");
		}
		
		scan.close();
	}
	
	public static void arithmetic() {
		Scanner scan = new Scanner (System.in);

		double avg = 0;
		double[] vector = new double[3];
		
		for(int i = 0; i < vector.length; i++){
			System.out.print("Digite um valor: ");
			vector[i] = scan.nextDouble();
			avg += vector[i];
		}

		avg /= 3;
		System.out.printf("Média Aritmética: %.2f", avg);
		scan.close();
	}
	
	public static void weighted() {
		Scanner scan = new Scanner (System.in);
		int sumP = 0;
		double avg = 0;
		double[] vector = new double[3];
		int[] weight = new int[3];
		
		
		for(int i = 0; i < vector.length; i++){
			System.out.print("Digite um valor: ");
			vector[i] = scan.nextDouble();
		
			System.out.print("Digite o peso desse valor: ");
			weight[i] = scan.nextInt();

			avg += (vector[i]*weight[i]);
			sumP += weight[i];
		}

		avg /= sumP;
				
		System.out.printf("Média Ponderada: %.2f", avg);
		
		scan.close();
	}

}