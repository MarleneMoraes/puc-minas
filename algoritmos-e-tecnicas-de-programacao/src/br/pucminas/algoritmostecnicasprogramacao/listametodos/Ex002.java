package br.pucminas.algoritmostecnicasprogramacao.listametodos;

import java.util.Scanner;

public class Ex002 {
	/*
	 * Elabore um programa contendo um método que receba as três notas de um aluno
	 * como parâmetros e uma letra. 
	 * Se a letra for “A”, o método deverá calcular a média aritmética das notas do aluno; 
	 * se for “P”, deverá calcular a média ponderada, com pesos 5, 3 e 2. 
	 * A média calculada deverá ser devolvida ao programa principal para, então, ser mostrada.
	 */
	static Scanner sc = new Scanner(System.in);

	static void mediaDeNotas(double n1, double n2, double n3, char l) {
		double media;

		if (l == 'A' || l == 'a') {
			media = (n1 + n2 + n3) / 3;
			System.out.printf("A média aritmética é %.2f", media);
		} else if (l == 'P' || l == 'p') {
			media = ((n1 * 5) + (n2 * 3) + (n3 * 2)) / 10;
			System.out.printf("A média ponderada é %.2f", media);
		} else {
			System.out.println("Valor inválido");
		}

	}

	public static void main(String[] args) {
		System.out.println("MÉDIA DE NOTAS");

		System.out.print("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();

		System.out.print("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();

		System.out.print("Digite a terceira nota: ");
		double nota3 = sc.nextDouble();

		System.out.print("Digite o tipo de média que deseja calcular (A - Aritmética/P - Ponderada): ");
		char tipoMedia = sc.next().charAt(0);

		mediaDeNotas(nota1, nota2, nota3, tipoMedia);
	}
}
