/*	
  	Enunciado:
 	Faça  um  programa,  em  Java,  que  leia  uma  matriz  quadrada  de  ordem  5x5  de  elementos 
	reais; calcule e imprima a soma dos elementos situados abaixo da diagonal principal dessa 
	matriz. 
 */

/**
 * Java's List
 * 
 * @author MarleneMoraes
 * @date 20 set 2022
 * */

package br.pucminas.aedsii.estruturadedados.listanaoavaliativa.java;

import java.util.Scanner;

public class Ex018 {
	public static void main(String[] args) {
		print();
	}

	public static double[][] preencherMatriz() {
		Scanner scan = new Scanner(System.in);

		double[][] matrix = new double[3][3];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = scan.nextDouble();
			}
		}

		scan.close();
		return matrix;
	}

	public static double sum() {
		double[][] matrix = preencherMatriz();
		double sum = 0.0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if(i <= j) continue;
				sum += matrix[i][j];
			}
		}

		return sum;
	}
	
	public static void print() {
		double sum = sum();
		
		System.out.printf("Soma abaixo da diagonal principal: %.2f", sum);
	}
}