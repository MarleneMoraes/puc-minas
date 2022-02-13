/*	
 	Faça um programa, em Java, que simule um radar na Av. Cristiano Machado. Esse radar
	deve receber a velocidade de cinco veículos, calcular e exibir a quantidade de veículos
	com velocidade acima de 60 km/h. O radar também deve informar o total arrecadado com
	multas, considerando que o valor de cada multa é de R$ 150,00 e que veículos com
	velocidade superior a 60 km/h serão multados.
 */

/**
 * Java's Exercices from college 
 * 
 * @author MarleneMoraes
 * @version 13 Feb 2022
 * */

package br.pucminas.algoritmosestruturadedadosii.labs.listai;

import java.util.Locale;
import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		double[] velocidade = new double [5];
		byte quantidadeMultas = 0;
		
		System.out.println("RADAR CRISTIANO MACHADO");
		
		
		for (int i = 0; i < 5; i++) {
			System.out.printf("Digite a velocidade do %dº carro: ", (i+1));
			velocidade[i] = scan.nextDouble();
			
			if (velocidade[i] > 60.0) {
				quantidadeMultas++;
			}
		}
		
		double valorTotalMultas = 150.0 * quantidadeMultas;
		
		
		System.out.printf("Quantidade de veículos acima de 60km/h: %d\n", quantidadeMultas);
		System.out.printf("Valor total das multas: R$%.2f\n", valorTotalMultas);
		scan.close();
				
	}

}
