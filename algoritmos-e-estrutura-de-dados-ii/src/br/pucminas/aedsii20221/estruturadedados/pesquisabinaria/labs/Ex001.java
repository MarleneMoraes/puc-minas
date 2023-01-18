package br.pucminas.aedsii20221.estruturadedados.pesquisabinaria.labs;

import java.util.Scanner;

public class Ex001 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String string = scan.nextLine();
		int maiusculas = 0;

		while (!string.equals("FIM")) {
			for (int i = 0; i < string.length(); i++) {
				char character = string.charAt(i);
				if (Character.isUpperCase(character)) {
					maiusculas++;
				}
			}

			System.out.println(maiusculas);
			string = scan.nextLine();
			maiusculas = 0;
		}

		scan.close();
	}
}
