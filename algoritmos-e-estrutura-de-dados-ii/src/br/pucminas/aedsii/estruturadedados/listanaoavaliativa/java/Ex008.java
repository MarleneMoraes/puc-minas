/*	
  	Enunciado:
 	Faça  um  programa,  em  Java,  que  preencha  um  vetor  com  seis  elementos  numericos 
	inteiros e mostre: 
	 
	a) todos os numeros pares digitados; 
	b) a soma dos numeros pares digitados; 
	c) todos os numeros impares digitados; 
	d) a quantidade de numeros impares digitados. 
	 
 */

/**
 * Java's List
 * 
 * @author MarleneMoraes
 * @date 20 set 2022
 * */

package br.pucminas.aedsii.estruturadedados.listanaoavaliativa.java;

import java.util.Random;

public class Ex008 {
	public static void main(String[] args) {
		int[] numbers = fillVector();
		int sumOdd = 0;
		int qtdEven = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.printf("Número par digitado na posição %d do vetor: %d.\n", i, numbers[i]);
				sumOdd += numbers[i];
			} else {
				System.out.printf("Número ímpar digitado na posição %d do vetor: %d.\n", i, numbers[i]);
				qtdEven++;
			}
		}

		System.out.printf("A soma dos números pares digitados é: %d\n", sumOdd);
		System.out.printf("A quantidade de números ímpares digitados é: %d\n", qtdEven);

	}

	public static int[] fillVector() {
		Random random = new Random();
		int[] numbers = new int[6];

		for (int i = 0; i < numbers.length; i++)
			numbers[i] = random.nextInt(10) - 1;

		return numbers;
	}
}