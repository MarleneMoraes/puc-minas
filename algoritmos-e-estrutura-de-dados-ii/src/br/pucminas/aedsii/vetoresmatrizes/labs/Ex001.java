/*	
	Enunciado:
	Faça um programa, em Java, para corrigir provas de múltipla escolha. 
	Cada prova tem oito questões e cada quest�o vale um ponto. O primeiro 
	conjunto de dados a ser lido é o gabarito da prova. Os outros dados 
	são os números dos alunos e suas respectivas respostas às questões da 
	prova. Existem dez alunos matriculados. Calcule e mostre:
		a) o número e a nota de cada aluno;
		b) a porcentagem de aprovação, sabendo-se que a nota mínima necessária 
		para aprovação é cinco.
*/

/**
* Java's Exercices from college 
* 
* @author MarleneMoraes
* @date 25 Feb 2022
* */
package br.pucminas.aedsii.vetoresmatrizes.labs;

import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] gabarito = new int[8];
		int[] nota = new int[10];
		int[][] alunos = new int[10][9];
		int aprovado = 0;
		double percentualAprovacao = 0;

		System.out.print("Insira o gabarito: ");

		for (int i = 0; i < gabarito.length; i++) {
			gabarito[i] = scan.nextInt();
		}

		System.out.print("Insira o número do aluno e, em seguida suas questões: ");

		for (int i = 0; i < 10; i++) {
			// primeira posição número do aluno, as demais, as questões do aluno
			for (int j = 0; j < 9; j++) {
				alunos[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 1; j < 9; j++) {
				if (alunos[i][j] == gabarito[j - 1]) {
					nota[i]++;
				}
			}

			if (nota[i] >= 5) {
				aprovado++;
			}

			System.out.printf("Aluno num %d tem nota %d\n", alunos[i][0], nota[i]);
		}

		percentualAprovacao = (aprovado * 10);

		System.out.printf("Percentual de aprovação é de %.1f%%", percentualAprovacao);

		scan.close();
	}

}
