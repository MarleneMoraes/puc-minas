/*	
  	Enunciado:
 	Faça  um  programa,  em  Java,  que  leia  uma  matriz  quadrada  de  ordem  4x4  de  elementos 
	inteiros;  divida  cada  elemento  de  uma  linha  dessa  matriz  pelo  elemento  da  diagonal 
	principal desta linha; e imprima a matriz resultante.  
 */

/**
 * Java's List
 * 
 * @author MarleneMoraes
 * @date 20 set 2022
 * */

package br.pucminas.aedsii.estruturadedados.listanaoavaliativa.java;

import java.util.Scanner;

public class Ex016 {
	public static void main(String[] args) {
		print();
	}

	public static int[][] fillMatrix() {
		Scanner scan = new Scanner(System.in);

		int[][] matrix = new int[4][4];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}

		scan.close();
		return matrix;
	}

	public static int[][] division() {
		int[][] matrix = fillMatrix();
		int[][] division = new int[4][4];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				division[i][j] = (matrix[i][j]/matrix[i][i]); 
			}
		}

		return division;
	}
	
	public static void print() {
		int[][] matrix = division();
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " "); 
			}
			System.out.println();
		}
	}

}