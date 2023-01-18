/*	
 	Faca um programa, em Java, que simule um radar na Av. Cristiano Machado. Esse radar
	deve receber a velocidade de cinco veiculos, calcular e exibir a quantidade de veiculos
	com velocidade acima de 60 km/h. O radar tambem deve informar o total arrecadado com
	multas, considerando que o valor de cada multa e de R$ 150,00 e que veiculos com
	velocidade superior a 60 km/h serao multados.
 */

/**
 * Java's List
 * 
 * @author MarleneMoraes
 * @date 20 set 2022
 * */


package br.pucminas.aedsii20222.estruturadedados.listanaoavaliativa.java;

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
		
		int opcao = scan.nextInt();
		
		switch (opcao) {
			case 1:
				mediaAritmetica();
				break;
			case 2: 
				mediaPonderada();
				break;
			case 3: 
				mediaAritmetica();
				mediaPonderada();
				break;
			case 4: 
				break;
			default:
				System.out.println("Opcao invalida");
		}
		

		scan.close();
	}
	
	public static void mediaAritmetica() {
		Scanner scan = new Scanner (System.in);

		double m = 0;
		double[] v = new double[3];
		
		for(int i = 0; i < v.length; i++){
			System.out.print("Digite um valor: ");
			v[i] = scan.nextDouble();
			m += v[i];
		}

		m /= 3;
		System.out.printf("Média Aritmética: %.2f", m);
		scan.close();
	}
	
	public static void mediaPonderada() {
		Scanner scan = new Scanner (System.in);
		int sumP = 0;
		double m = 0;
		double[] v = new double[3];
		int[] p = new int[3];
		
		
		for(int i = 0; i < v.length; i++){
			System.out.print("Digite um valor: ");
			v[i] = scan.nextDouble();
		
			System.out.print("Digite o peso desse valor: ");
			p[i] = scan.nextInt();

			m += (v[i]*p[i]);
			sumP += p[i];
		}

		m /= sumP;
				
		System.out.printf("Média Ponderada: %.2f", m);
		
		scan.close();
	}

}