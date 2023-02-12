/*	
  	Enunciado:
 	Faça  um  programa,  em  Java,  que  receba  como  entrada  um  número  real  informado  pelo 
	usuário e retorne o piso e o teto desse valor. O piso e o teto devem ser calculados através 
	de dois métodos. Dessa forma, você deve implementar um método que retorne, a partir de 
	um  determinado  valor  passado  como  parâmetro  para  esse  método,  o  valor  arredondado 
	para cima, ou seja, o teto do valor passado como parâmetro; e outro método que retorne, a 
	partir de um determinado valor passado como parâmetro, o valor arredondado para baixo, 
	ou seja, o piso desse valor. 
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

public class Ex017 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Digite um valor: ");
		double number = scan.nextDouble();
		
		System.out.printf("Piso: %.2f\n", piso(number));
		System.out.printf("Teto: %.2f\n", teto(number));
		
		scan.close();
	}

	public static double piso(double numero) {
		return Math.floor(numero);
	}

	public static double teto(double numero) {
		return Math.ceil(numero);
	}
}