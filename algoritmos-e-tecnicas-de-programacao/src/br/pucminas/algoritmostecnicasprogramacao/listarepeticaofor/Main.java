package br.pucminas.algoritmostecnicasprogramacao.listarepeticaofor;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ex;

		System.out.println("LISTA V - EXERC�CIOS REPETI��O FOR");

		do {
			System.out.print("Digite o n�mero do exerc�cio (1-6) ou 0 para sair: ");
			ex = sc.nextInt();

			switch (ex) {
			case 0:
				break;
			case 1:
				Exercises.ex001();
				break;
			case 2:
				Exercises.ex002();
				break;
			case 3:
				Exercises.ex003();
				break;
			case 4:
				Exercises.ex004();
				break;
			case 5:
				Exercises.ex005();
				break;
			case 6:
				Exercises.ex006();
				break;
			}
		} while (ex != 0);
		
		sc.close();
	}

}