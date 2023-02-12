/*	
  	Enunciado:
 	Faça  um  programa,  em  Java,  que  criptografe  uma  frase  dada  pelo  usuário  invertendo  a 
	frase informada.  
 */

/**
 * Java's List
 * 
 * @author MarleneMoraes
 * @date 20 set 2022
 * */

package br.pucminas.aedsii.estruturadedados.listanaoavaliativa.java;

import java.util.Scanner;

public class Ex015 {
	public static void main(String[] args) {
		System.out.println(reverse());

	}

	public static String reverse() {
		Scanner scan = new Scanner(System.in);
		String string = scan.nextLine();

		String reverso = new StringBuffer(string).reverse().toString();

		scan.close();
		return reverso;
	}
}