package br.pucminas.algoritmostecnicasprogramacao.listasequenciais;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ex;

		System.out.println("LISTA I - EXERCÍCIOS SEQUENCIAIS");

		do {
			System.out.print("Digite o número do exercício (1-20) ou 0 para sair: ");
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
			case 7:
				Exercises.ex007();
				break;
			case 8:
				Exercises.ex008();
				break;
			case 9:
				Exercises.ex009();
				break;
			case 10:
				Exercises.ex010();
				break;
			case 11:
				Exercises.ex011();
				break;
			case 12:
				Exercises.ex012();
				break;
			case 13:
				Exercises.ex013();
				break;
			case 14:
				Exercises.ex014();
				break;
			case 15:
				Exercises.ex015();
				break;
			case 16:
				Exercises.ex016();
				break;
			case 17:
				Exercises.ex017();
				break;
			case 18:
				Exercises.ex018();
				break;
			case 19:
				Exercises.ex019();
				break;
			case 20:
				Exercises.ex020();
				break;
			}
		} while (ex != 0);
		
		sc.close();
	}

}
