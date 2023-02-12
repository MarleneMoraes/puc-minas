/*
 	Enunciado:
 	Faca  um  programa,  em  Java,  que  leia  um  numero  N,  que  
 	deve  indicar  quantos  valores inteiros  e  positivos  devem  
 	ser  lidos  a  seguir.  Em  seguida,  para  cada  numero  informado, 
 	indique o fatorial desse numero. 
 */

/**
 * Java's List
 * 
 * @author MarleneMoraes
 * @date 20 set 2022
 * */

package br.pucminas.aedsii.estruturadedados.listanaoavaliativa.java;

import java.util.Scanner;

public class Ex006 {

	public static void main(String[] args) {
		System.out.println("FATORIAL");
		int[] numbers = defineVector();

		for (int number : numbers) {
			int factorial = factorial(number);
			System.out.printf("Fatorial de %d: %d\n", number, factorial);
		}
	}

	public static int[] defineVector() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite a quantidade de numeros: ");
		int n = scan.nextInt();
		int[] numbers = new int[n];

		System.out.print("Digite os valores");
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = scan.nextInt();

		scan.close();
		return numbers;
	}

	public static int factorial(int n) {
		if (n == 0 || n == 1)
			return 1;

		return n * factorial(n - 1);
	}

}