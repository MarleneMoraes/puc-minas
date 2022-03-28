package br.pucminas.algoritmosestruturadedadosii.labs.listaiii;

import java.util.Scanner;

/**
 * Java's Exercices from college
 * 
 * @author MarleneMoraes
 * @date 24 mar 2022
 */

public class ContarCaracteresRecursivo {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String string = scan.nextLine();
		while (!string.equals("FIM")) {
			System.out.println(contadorLetrasMaiusculas(string));
			scan.nextLine();
		}
		scan.close();
	}

	public static int contadorLetrasMaiusculas(String string) {
		if (string.isEmpty()) {
			return 0;
		}

		return (Character.isUpperCase(string.charAt(0)) ? 1 : 0) + contadorLetrasMaiusculas(string.substring(1));
	}
}
