/*	
  	Enunciado:
 	Faça  um  programa,  em  Java,  que  preencha  uma  matriz  de  ordem  4  x  5  com  números 
	inteiros e positivos. O preenchimento dessa matriz deve ser realizado por meio da chamada 
	de  um  método.  Em  seguida,  faça  um  método  que  receba  essa  matriz  como  parâmetro  e 
	preencha  um  vetor  de  quatro  posições,  sendo  que  cada  posição  desse  vetor  deve  conter  a 
	soma  dos  elementos  de  cada  linha  da  matriz.  Por  fim,  faça  um  método  que  exiba  os 
	elementos  desse  vetor  maiores  do  que  dez.  Mostre  também  a  posição  que  o  elemento 
	ocupa  no  vetor.  Se  não  existir  nenhum  elemento  no  vetor  maior  do  que  dez,  deve  ser 
	exibida uma mensagem.  
	 
 */

/**
 * Java's List
 * 
 * @author MarleneMoraes
 * @date 20 set 2022
 * */

package br.pucminas.aedsii.estruturadedados.listanaoavaliativa.java;

import java.util.Random;

public class Ex014 {
	public static void main(String[] args) {
		printValues();

	}

	public static int[][] fillMatrix() {
		Random random = new Random();

		int[][] matrix = new int[4][5];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				matrix[i][j] = random.nextInt(10) - 1;
			}
		}

		return matrix;
	}

	public static int[] sum(int[][] matrix) {
		int[] vector = new int[4];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				vector[i] += matrix[i][j];
			}
		}

		return vector;
	}
	
	public static void printValues() {
		int[][] matriz = fillMatrix();
		int[] sum = sum(matriz);
		int[] biggerThanTen = new int[4];
		int index = 0;
		
		for (int i = 0; i < sum.length; i++) {
			if(sum[i] > 10) {
				biggerThanTen[index] = sum[i];
				System.out.println(sum[i] + " [" + i + "] ");
				index++;
			}
		}
		
		if(biggerThanTen[0] == 0) {
			System.out.println("Não há valores maiores que 10");
		}
	}

}