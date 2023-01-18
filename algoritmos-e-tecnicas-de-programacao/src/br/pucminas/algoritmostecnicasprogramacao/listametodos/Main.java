package br.pucminas.algoritmostecnicasprogramacao.listametodos;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ex;

		System.out.println("LISTA VI - EXERCÍCIOS MÉTODOS");

		do {
			System.out.print("Digite o número do exercício (1-5) ou 0 para sair: ");
			ex = sc.nextInt();

			switch (ex) {
			case 0:
				break;
			case 1:
				Ex001.main(args);
				break;
			case 2:
				Ex002.main(args);
				break;
			case 3:
				Ex003.main(args);
				break;
			case 4:
				//Ex004.main(args);
				break;
			case 5:
				Ex005.main(args);
				break;
			}
		} while (ex != 0);
		
		sc.close();
	}

}
