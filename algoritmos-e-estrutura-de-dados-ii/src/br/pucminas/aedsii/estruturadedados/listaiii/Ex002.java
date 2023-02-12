package br.pucminas.aedsii.estruturadedados.listaiii;

import java.util.Scanner;


/**
 * @author Marlene
 * @date 09-08-2022
 * Exercicios de pratica de introducao ao verde
 */

/*
 * 2 - Contar Caracteres Maiusculos Recursivo 
 * Refaca a questao anterior de forma recursiva. 
 */

public class Ex002 {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String string= scan.nextLine();
		
		
		while (!string.equals("FIM")) {
			System.out.println(upperCount(string));
			
			string = scan.nextLine();
		}

		scan.close();
	}
	

	public static int upperCount(String str){
		return upperCount(str,0,0);
	}

	public static int upperCount(String s,int i,int c){
		if(i <= s.length()-1){
			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
				c++;
				c = upperCount(s,(i+1),c);
			}
			else
				c = upperCount(s, (i+1), c);
			
		}
		return c;
	}
}
