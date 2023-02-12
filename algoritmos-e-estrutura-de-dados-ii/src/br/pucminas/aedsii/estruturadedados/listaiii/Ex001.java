package br.pucminas.aedsii.estruturadedados.listaiii;

import java.util.Scanner;

/**
 * @author Marlene
 * @date 09-08-2022
 * Exercicios de pratica de introducao ao verde
 */

/*
 * 1 - Contar Caracteres Mai�sculos Iterativo 
 * Crie  um  m�todo  iterativo  em  Java  que  receba  como  par�metro  uma  string  e 
 * retorne  o  n�mero  de  caracteres  mai�sculos  presentes  nessa  string.  A  entrada 
 * padr�o  �  composta  por  v�rias  linhas  sendo  que  a  �ltima  apresenta  apenas  a 
 * palavra  FIM.  A  sa�da  padr�o  cont�m  um  n�mero  inteiro  para  cada  linha  de 
 * entrada.
 */

public class Ex001 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String string = scan.nextLine();
		
		while (!string.equals("FIM")) {
			System.out.println(upperCount(string));
			
			string = scan.nextLine();
		}
		scan.close();
	}
	
	
	public static int upperCount(String s) {
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
				count++;
		}
		return count;
	}
}
