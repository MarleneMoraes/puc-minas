/*	
 	Enunciado:
 	Uma empresa pretende ajustar os salarios de seus funcionarios conforme a tabela a seguir:
	
		Salario 				        Percentual de Aumento
		ate R$ 1200,00 				        	10%
		acima de R$ 1200,00 		        	5%
	
	Faca um programa, em Java, que receba o salario atual do funcionario; 
	calcule e mostre o aumento que esse funcionario recebera e seu novo salario.
 */

/**
 * Java's List
 * 
 * @author MarleneMoraes
 * @date 20 set 2022
 * */

package br.pucminas.aedsii.estruturadedados.listanaoavaliativa.java;

import java.util.Locale;
import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("AUMENTO DO SALARIO");
		System.out.println("Salario atual: ");
		double actualSalary = scan.nextDouble();

		double increase = increase(actualSalary);

		double newSalary = actualSalary + increase;

		printResults(increase, newSalary);

		scan.close();
	}

	public static double increase(double s) {
		return (s <= 1200.0) ? (s * 0.1) : (s * 0.05);
	}

	public static void printResults(double i, double n) {
		System.out.printf("Aumento: R$%.2f\n", i);
		System.out.printf("Novo salario: R$%.2f\n", n);
	}

}