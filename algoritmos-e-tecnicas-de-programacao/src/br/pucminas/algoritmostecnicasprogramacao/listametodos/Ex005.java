package br.pucminas.algoritmostecnicasprogramacao.listametodos;

import java.util.Scanner;

public class Ex005 {
	/*
	 * Implemente os seguintes m�todos: 
	 * - O m�todo Celsius retorna o equivalente em Celsius de uma temperatura 
	 * em Fahrenheit com o c�lculo: C = 5/9 * (F - 32) 
	 * - O m�todo fahrenheit retorna o equivalente em Fahrenheit de uma 
	 * temperatura em Celsius com o c�lculo: F = 9/5 * C + 32 
	 * Implemente um m�todo principal que permita que o usu�rio digite uma 
	 * temperatura em Fahrenheit e exiba o equivalente em Celsius e vice-versa.
	 */

	static Scanner sc = new Scanner(System.in);

	static float Celsius(float t) {
		float c = 5 / 9 * t - 32;

		return c;
	}

	static float Fahrenheit(float t) {
		float f = 9 / 5 * t + 32;

		return f;
	}

	public static void main(String[] args) {
		System.out.println("CONVERSOR DE TEMPERATURA");

		System.out.print("Digite uma temperatura em Fahrenheit: ");
		float temperatura = sc.nextFloat();

		System.out.println(Celsius(temperatura) + "�C");

		System.out.print("Digite uma temperatura em Celsius: ");
		temperatura = sc.nextFloat();

		System.out.println(Fahrenheit(temperatura) + "�F");
	}
}
