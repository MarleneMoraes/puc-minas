package br.pucminas.aedsii20222.estruturadedados.listai;

import java.util.Locale;
import java.util.Scanner;

/**
 * Introduction to Java: Decision and Repetition Commands
 * 
 * @author MarleneMoraes
 * @date 08-25-2022
 * */

/*	
Enunciado:
	Questão 02
	Faça um programa em Java que receba as seguintes entradas:
		1. Valor investido em uma aplicação financeira (R$);
		2. Taxa de juros (diária, percentual);
		3. Tempo de investimento (em dias);
	Calcule o montante resultante do investimento, após o período de tempo.
	Fórmula de cálculo:
	
	montante = investimento x (1 + juros)^dias 
*/

public class Ex002 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double investimento = scan.nextDouble();
		double juros = scan.nextDouble();
		int dias = scan.nextInt();
		
		
		System.out.printf("%.2f", amount(investimento, juros, dias));
		scan.close();
	}
	
	public static double amount(double i, double j, int d) {
		
		double montante = i * (Math.pow((1 + j / 100), d));
		
		return montante;
		
	}
}