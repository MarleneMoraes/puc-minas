package br.pucminas.aedsii.estruturadedados.pesquisabinaria.labs;

import java.util.Scanner;

public class Ex002 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
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
