/*
 	Enunciado:
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

public class Ex005 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		double[] velocidade = new double [5];
		byte quantidadeMultas = 0;
		
		System.out.println("RADAR CRISTIANO MACHADO");
		
		
		for (int i = 0; i < velocidade.length; i++) {
			System.out.printf("Digite a velocidade do %dº carro: ", (i+1));
			velocidade[i] = scan.nextDouble();
			
			if (velocidade[i] > 60.0) 
				quantidadeMultas++;
		}
				
		resultado(quantidadeMultas);
		
		scan.close();
				
	}
	

	public static void resultado(int q){
		double v = 150.0 * q;

		System.out.printf("Quantidade de veiculos acima de 60km/h: %d\n", q);
		System.out.printf("Valor total das multas: R$%.2f\n", v);
	}

}