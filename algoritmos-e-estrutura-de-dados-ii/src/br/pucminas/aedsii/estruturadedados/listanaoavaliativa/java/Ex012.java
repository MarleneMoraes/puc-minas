/*	
  	Enunciado:
 	Faça  um  programa,  em  Java,  que  preencha  uma  matriz  de  ordem  3  x  4  (3  linhas  e  4 
	colunas) com números inteiros e positivos; calcule e mostre: 
	 
	c) o maior elemento da matriz e sua posição (linha e coluna); 
	d) o menor elemento da matriz e sua posição (linha e coluna). 
	 
 */

/**
 * Java's List
 * 
 * @author MarleneMoraes
 * @date 20 set 2022
 * */

package br.pucminas.aedsii.estruturadedados.listanaoavaliativa.java;

import java.util.Random;

public class Ex012 {
	public static void main(String[] args) {
		int[][] matrix = fillMatrix();

		findBigger(matrix);
		findSmaller(matrix);
	}

	public static int[][] fillMatrix() {
		Random random = new Random();

		int[][] matriz = new int[3][4];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				matriz[i][j] = random.nextInt(100) - 1;
			}
		}

		return matriz;
	}

	public static void findSmaller(int[][] matriz) {
		int smaller = 0;
		int index = 0;
		int jdex = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				if (smaller > matriz[i][j]) {
					smaller = matriz[i][j];
					index = i;
					jdex = j;
				}
				
			}
		}

		System.out.printf("O menor elemento da matriz informada é %d\n", smaller); 
		System.out.printf("Sua posição é: [%d, %d]\n", index, jdex);
	}

	public static void findBigger(int[][] matrix) {
		int bigger = 0;
		int index = 0;
		int jdex = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				if (bigger < matrix[i][j]) {
					bigger = matrix[i][j];
					index = i;
					jdex = j;
				}
			}
		}

		System.out.printf("O maior elemento da matriz informada é %d\n", bigger); 
		System.out.printf("Sua posição é: [%d, %d]\n", index, jdex);
	}

}