package br.pucminas.algoritmosestruturadedadosii.labs.listaiii;

import java.util.Scanner;

/*	
	Enunciado:
	Crie  um  método  iterativo  em  Java  que  receba  como  parâmetro  uma  string  e 
	retorne  o  número  de  caracteres  maiúsculos  presentes  nessa  string.  A  entrada 
	padrão  é  composta  por  várias  linhas  sendo  que  a  última  apresenta  apenas  a 
	palavra  FIM.  A  saída  padrão  contém  um  número  inteiro  para  cada  linha  de 
	entrada. 
*/

/**
 * Java's Exercices from college
 * 
 * @author MarleneMoraes
 * @date 25 Feb 2022
 */

public class ContarCaracteresIterativo {

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
