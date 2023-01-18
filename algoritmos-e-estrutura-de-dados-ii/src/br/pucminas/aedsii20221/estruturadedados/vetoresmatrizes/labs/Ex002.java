/* Enunciado:
	Faça  um  programa,  em  Java,  que  preencha  uma  matriz  de  
	ordem  3  x  4  (3  linhas  e  4 colunas) com numeros inteiros 
	e positivos; calcule e mostre: 
 
	a) o maior elemento da matriz e sua posicao (linha e coluna); 
	b) o menor elemento da matriz e sua posicao (linha e coluna).
*/

/**
* Java's Exercices from college 
* 
* @author MarleneMoraes
* @date 25 Feb 2022
* */
package br.pucminas.aedsii20221.estruturadedados.vetoresmatrizes.labs;

import java.util.Random;

public class Ex002 {
	public static void main(String[] args) {
		Random random = new Random();
		int[][] var = new int[3][4];
		int maior, menor, linhaMaior, colunaMaior, linhaMenor, colunaMenor;

		maior = 0;
		menor = 0;
		linhaMaior = 0;
		colunaMaior = 0;
		linhaMenor = 0;
		colunaMenor = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				var[i][j] = random.nextInt(100);
				System.out.printf("%d ", var[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == 0 && j == 0) {
					maior = var[i][j];
					menor = var[i][j];
				}

				if (var[i][j] > maior) {
					maior = var[i][j];
					linhaMaior = i;
					colunaMaior = j;
				}

				if (var[i][j] < menor) {
					menor = var[i][j];
					linhaMenor = i;
					colunaMenor = j;
				}
			}
		}
		
		System.out.printf("Maior elemento: %d [%d, %d]\n", maior, linhaMaior, colunaMaior);
		System.out.printf("Menor elemento: %d [%d, %d]", menor, linhaMenor, colunaMenor);
	}
}
