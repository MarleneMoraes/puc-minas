/*	
 	Enunciado:
 	Uma empresa pretende ajustar os sal�rios de seus funcion�rios conforme a tabela a seguir:
	
		Sal�rio 				Percentual de Aumento
		at� R$ 1200,00 					10%
		acima de R$ 1200,00 			5%
	
	Fa�a um programa, em Java, que receba o sal�rio atual do funcion�rio; 
	calcule e mostre o aumento que esse funcion�rio receber� e seu novo sal�rio.
 */

/**
 * Java's Exercices from college 
 * 
 * @author MarleneMoraes
 * created on 13 Feb 2022
 * */


package br.pucminas.estruturadedados.naoavaliativos.listajava;

import java.util.Locale;
import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		double aumento, novoSalario;
		
		System.out.println("NOVO SALARIO");
		System.out.println("Digite o seu salario atual: ");
		double salarioAtual = scan.nextDouble();
		
		if (salarioAtual <= 1200.0) {
			aumento = salarioAtual * 0.1;
		} else {
			aumento = salarioAtual * 0.05;
		}
		
		novoSalario = salarioAtual + aumento;
		
		System.out.printf("Aumento: R$%.2f\n", aumento);
		System.out.printf("Novo salario: R$%.2f\n", novoSalario);
		
		scan.close();
	}

}
