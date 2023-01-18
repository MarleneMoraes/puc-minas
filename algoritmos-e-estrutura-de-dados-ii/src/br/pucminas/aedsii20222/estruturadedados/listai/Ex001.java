package br.pucminas.aedsii20222.estruturadedados.listai;

import java.util.Scanner;

/**
* Introduction to Java: Decision and Repetition Commands
* 
* @author MarleneMoraes
* @date 08-25-2022
* */

/*	
	Enunciado:
	Questão 01
		Faça um programa em Java que receba como entrada o período de tempo, em dias, de um investido
		financeiro sujeito a tributação. O programa deverá informar a alíquota de imposto de renda a ser paga,
		com base na seguinte tabela:
		
		Tempo					Aliquota
		de 0 a 180 dias			22,5%
		de 181 a 360 dias		20%
		de 361 a 720 dias		17,5%
		mais de 720 dias		15%
 */

public class Ex001 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int tempo = scan.nextInt();
		
		valorAliquota(tempo);
		
		scan.close();
	}
	
	public static String valorAliquota(int dias) {

		if(dias >= 0 && dias <= 180)
			return "22,5%";
		else if(dias > 180 && dias <= 360)
			return "20%";
		else if(dias > 360 && dias <= 720)
			return "17,5%";
		else 
			return "15%";
	}
}
