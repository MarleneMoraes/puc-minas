package br.pucminas.aedsii.estruturadedados.listai;

import java.util.Locale;
import java.util.Scanner;

/**
 * Java's Exercices from college 
 * 
 * @author MarleneMoraes
 * @date 08-25-2022
 * */

/*	
 	Enunciado:
 	Questão 03
		Com base nas questões 1 e 2, calcule o lucro obtido por um investimento, após o pagamento de juros. O
		programa deverá receber as mesmas entradas do Exercício 02. Crie uma função que retorne o valor do
		lucro obtido, após pagamento de impostos.
		Fórmula de cálculo:
		
		lucro = ((investimento x (1+juros)^dias - investimento) x (1-aliquota))
 */

public class Ex003 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double investimento = scan.nextDouble();
		double juros = scan.nextDouble();
		int dias = scan.nextInt();
		double aliquota = valorAliquota(dias);

		System.out.printf("%.2f",lucro(investimento, juros, dias, aliquota));
		scan.close();
	}
	
	
	public static double valorAliquota(int dias) {
		if(dias >= 0 && dias <= 180)
			return (22.5 / 100);
		else if(dias > 180 && dias <= 360)
			return (20 / 100);
		else if(dias > 360 && dias <= 720)
			return (17.5 / 100);
		else 
			return (15 / 100);
	}
	
	public static double lucro(double i, double j, int d, double a) {
		return ((i * (Math.pow((1 + j / 100), d)) - i)) * (1 - a);
	}
}