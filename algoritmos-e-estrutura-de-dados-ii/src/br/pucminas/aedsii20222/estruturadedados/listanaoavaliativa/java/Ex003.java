/*	
 	Enunciado:
 	Faca um programa, em Java, que receba como entrada tres notas de um aluno (digite
	valores entre 0 e 10), calcule e mostre a media aritmetica e a mensagem constante na
	tabela a seguir:
		Media Aritmetica 				Mensagem
		de 0,0 a abaixo de 4,0 			Reprovado
		de 4,0 a abaixo de 6,0 			Exame Especial
		de 6,0 a 10,0 					Aprovado
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

public class Ex003 {

	public static void main(String[] args) {
		results();
	}	

	public static double average(){
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		double[] notas = new double [3];
		double mediaAritmetica = 0;
		
		System.out.println("BOLETIM ESCOLAR");
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a %dª nota: ", (i+1));
			notas[i] = scan.nextDouble();
			mediaAritmetica += notas[i];
		}

		scan.close();

		return mediaAritmetica /= 3;
	}

	public static String results(){
		double a = average();

		if (a > 0  && a < 4.0) 
			return "REPROVADO";
		else if (a >= 4.0  && a < 6.0) 
			return "EXAME ESPECIAL";
		else if (a >= 6.0  && a <= 10.0) 
			return "APROVADO";
	
		return "Media invalida";
	}

}