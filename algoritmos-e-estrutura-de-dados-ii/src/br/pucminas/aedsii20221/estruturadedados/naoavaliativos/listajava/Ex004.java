/*	
 	Enunciado:
 	Faça um programa, em Java, que receba como entrada dois números inteiros, verifique e
 	exiba se a soma desses números é par ou ímpar.
 */

/**
 * Java's Exercices from college 
 * 
 * @author MarleneMoraes
 * created on 13 Feb 2022
 * */

package br.pucminas.aedsii20221.estruturadedados.naoavaliativos.listajava;

import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Digite um numero inteiro: ");
		int valor1 = scan.nextInt();
		
		System.out.print("Digite outro numero inteiro: ");
		int valor2 = scan.nextInt();
		
		int soma = valor1 + valor2;
		
		if (soma%2 == 0) {
			System.out.println("A soma desses numeros e par.");
		} else {
			System.out.println("A soma desses numeros e impar.");
		}
			
		
		scan.close();
	}

}
