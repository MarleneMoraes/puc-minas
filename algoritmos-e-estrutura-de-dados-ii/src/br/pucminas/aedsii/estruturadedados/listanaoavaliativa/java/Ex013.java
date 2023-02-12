/*	
  	Enunciado:
 	Faça  um  programa,  em  Java,  que  preencha  dois  vetores,  de  dez  posições  cada  um,  com 
	números  inteiros.  O  preenchimento  desses  dois  vetores  deve  ser  realizado  por  meio  da 
	chamada  de  um  método.  Em  seguida,  faça  um  método  que  receba  como  parâmetro  esses 
	dois  vetores,  realize  a  multiplicação  de  seus  elementos  de  mesmo  índice,  e  retorne  o 
	resultado  em  um  terceiro  vetor.  Por  fim,  faça  um  método  que  receba  esse  terceiro  vetor 
	como parâmetro e exiba seus elementos na tela.  
	 
 */

/**
 * Java's List
 * 
 * @author MarleneMoraes
 * @date 20 set 2022
 * */

package br.pucminas.aedsii.estruturadedados.listanaoavaliativa.java;

import java.util.Random;

public class Ex013 {
	public static void main(String[] args) {
		printVectorC();
	}

	public static int[] fillVector() {
		Random random = new Random();

		int[] vector = new int[10];

		for (int i = 0; i < vector.length; i++) {
			vector[i] = random.nextInt(10) + 1;
		}

		return vector;
	}

	public static int[] createVectorC() {
		int[] vectorA = fillVector();
		int[] vectorB = fillVector();
		int[] vectorC = new int[10];

		for (int i = 0; i < vectorC.length; i++)
			vectorC[i] = vectorA[i] * vectorB[i];

		return vectorC;
	}

	public static void printVectorC() {
		int[] vectorC = createVectorC();

		for (int i : vectorC)
			System.out.print(i + " ");
	}

}