package br.pucminas.aedsii20221.estruturadedados.combinador;

import java.util.Scanner;

public class Combinador {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String a, b;
		
		while(true) {
			a = scan.next();
			
			if (a.equals("FIM"))
				break;
			
			b = scan.next();
			System.out.println(combinador(a, b));
		}		
		
		scan.close();
	}
	
	public static String combinador(String a, String b) {
		StringBuilder s = new StringBuilder();
		
		for (int i = 0; i < Math.max(a.length(), b.length()); i++) {
			if (i < a.length()) 
				s.append(a.charAt(i));
			
			if (i < b.length()) 
				s.append(b.charAt(i));
		}
		
		return s.toString();
	}
}