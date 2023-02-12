/*	
  	Enunciado:
 	Escreva um programa, em Java, que preencha um vetor A com quinze caracteres digitados 
	pelo usuário. Em seguida, gere um segundo vetor B, considerando as entradas do vetor A, 
	da seguinte forma: o 1o elemento de A será o 15o elemento de B; o 2o elemento de A será o 
	14o de B; e assim por diante, até preencher o 1o de B com o 15o elemento de A. Mostre os 
	vetores A e B. Lembre-se que o 1o elemento é aquele que se encontra na posição zero do 
	vetor, e assim por diante. 
	 
 */

/**
 * Java's List
 * 
 * @author MarleneMoraes
 * @date 20 set 2022
 * */

package br.pucminas.aedsii.estruturadedados.listanaoavaliativa.java;

import java.util.Random;

public class Ex009 {
	public static void main(String[] args) {
		char[] vectorA = fillVectorA();
		char[] vectorB = fillVectorB(vectorA);
		
		System.out.println("Vetor A: ");
		printVector(vectorA);
		
		System.out.println("\nVetor B: ");
		printVector(vectorB);
	}

	public static char[] fillVectorA() {
		Random random = new Random();

		char[] character = new char[15];

		for (int i = 0; i < character.length; i++)
			character[i] = (char)(random.nextInt(26) + 'a');

		return character;
	}

	public static char[] fillVectorB(char[] vector) {
		char[] character = new char[15];
		int n = 0;

		for (int i = character.length - 1; i >= 0; i--) {
			character[n] = vector[i];
			n++;
		}

		return character;
	}

	public static void printVector(char[] vector) {
		for (int i = 0; i < vector.length; i++)
			System.out.print(vector[i] + " ");
		
	}

}