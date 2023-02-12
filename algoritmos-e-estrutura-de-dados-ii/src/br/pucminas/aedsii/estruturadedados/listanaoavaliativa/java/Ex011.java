/*	
  	Enunciado:
 	Faça  um  programa,  em  Java,  que  preencha  uma  matriz  de  ordem  3  x  3  com  números 
	inteiros  e  positivos;  e  mostre  a  média  dos  elementos  de  sua  diagonal  principal.  Dica:  os 
	elementos da diagonal principal de uma matriz são aqueles que apresentam os índices linha 
	e coluna iguais. 
	 
 */

/**
 * Java's List
 * 
 * @author MarleneMoraes
 * @date 20 set 2022
 * */

package br.pucminas.aedsii.estruturadedados.listanaoavaliativa.java;

import java.util.Random;

public class Ex011 {
	public static void main(String[] args) {
		int[][] matriz = fillMatrix();
		
		double avg = calculateAvg(matriz);
		
		System.out.printf("A média dos elementos da diagonal principal da matriz informada é: %.0f", avg);
	}

	public static int[][] fillMatrix() {
		Random random = new Random();

		int[][] matrix = new int[3][3];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = random.nextInt(100) - 1;				
			}
		}
		
		return matrix;
	}
	
	public static double calculateAvg(int[][] matrix) {
		double avg = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (i == j)
					avg += matrix[i][j];		
			}
		}
		
		return avg /= 3;
		
	}

}