/*	
 	Enunciado:
 	Faça um programa, em Java, que receba como entrada dois números inteiros, verifique e
 	exiba se a soma desses números é par ou ímpar.
 */

/**
 * Java's List
 * 
 * @author MarleneMoraes
 * @date 20 set 2022
 * */


package br.pucminas.aedsii20222.estruturadedados.listanaoavaliativa.java;

import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int[] valores = new int[2];


		for(int i = 0; i < valores.length; i++){
			System.out.print("Digite um numero inteiro: ");
			valores[i] = scan.nextInt();
		}
		
		results(valores[0], valores[1]);
		
		scan.close();
	}

	public static String results(int v1, int v2){
		int s = v1 + v2;
		
		if (s % 2 == 0) 
			return "A soma desses numeros e par.";
		
		return "A soma desses numeros e impar.";
		
	}

}