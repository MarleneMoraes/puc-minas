package br.pucminas.algoritmostecnicasprogramacao.listametodos;

import java.util.Scanner;

public class Ex002 {
	/*
	 * Elabore um programa contendo um m�todo que receba as tr�s notas de um aluno
	 * como par�metros e uma letra. 
	 * Se a letra for �A�, o m�todo dever� calcular a m�dia aritm�tica das notas do aluno; 
	 * se for �P�, dever� calcular a m�dia ponderada, com pesos 5, 3 e 2. 
	 * A m�dia calculada dever� ser devolvida ao programa principal para, ent�o, ser mostrada.
	 */
	static Scanner sc = new Scanner(System.in);

	static void mediaDeNotas(double n1, double n2, double n3, char l) {
		double media;

		if (l == 'A' || l == 'a') {
			media = (n1 + n2 + n3) / 3;
			System.out.printf("A m�dia aritm�tica � %.2f", media);
		} else if (l == 'P' || l == 'p') {
			media = ((n1 * 5) + (n2 * 3) + (n3 * 2)) / 10;
			System.out.printf("A m�dia ponderada � %.2f", media);
		} else {
			System.out.println("Valor inv�lido");
		}

	}

	public static void main(String[] args) {
		System.out.println("M�DIA DE NOTAS");

		System.out.print("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();

		System.out.print("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();

		System.out.print("Digite a terceira nota: ");
		double nota3 = sc.nextDouble();

		System.out.print("Digite o tipo de m�dia que deseja calcular (A - Aritm�tica/P - Ponderada): ");
		char tipoMedia = sc.next().charAt(0);

		mediaDeNotas(nota1, nota2, nota3, tipoMedia);
	}
}
