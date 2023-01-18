/*	
 	Enunciado:
 	Fa�a um programa, em Java, que receba como entrada tr�s notas de um aluno (digite
	valores entre 0 e 10), calcule e mostre a m�dia aritm�tica e a mensagem constante na
	tabela a seguir:

		M�dia Aritm�tica 			Mensagem
		de 0,0 a abaixo de 4,0 		Reprovado
		de 4,0 a abaixo de 6,0 		Exame Especial
		de 6,0 a 10,0 				Aprovado
 */

/**
 * Java's Exercices from college 
 * 
 * @author MarleneMoraes
 * created on 13 Feb 2022
 * */

package br.pucminas.aedsii20221.estruturadedados.naoavaliativos.listajava;

import java.util.Locale;
import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		double[] notas = new double [3];
		double mediaAritmetica = 0;
		
		System.out.println("BOLETIM ESCOLAR");
		
		for (int i = 0; i < 3; i++) {
			System.out.printf("Digite a %dª nota: ", (i+1));
			notas[i] = scan.nextDouble();
			mediaAritmetica += notas[i];
		}
		
		mediaAritmetica /= 3;
		
		if (mediaAritmetica > 0  && mediaAritmetica < 4.0) {
			System.out.println("REPROVADO");
		} else if (mediaAritmetica >= 4.0  && mediaAritmetica < 6.0) {
			System.out.println("EXAME ESPECIAL");
		} else if (mediaAritmetica >= 6.0  && mediaAritmetica <= 10.0) {
			System.out.println("APROVADO");
		} else {
			System.out.println("Media invalida");
		}
				
		scan.close();

	}

}
