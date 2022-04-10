/*
 * Crie uma classe Retangulo com os atributos privados: base (double) e altura
 * (double). Sua classe também terá, pelo menos, dois construtores, e os métodos  
 * gets, sets, clone e imprimir. O método imprimir exibe o valor de todos os atributos 
 * do objeto.
 * Implemente também o método double getArea( ), que retorna o valor da área do retângulo;   
 * e o método double getPerimetro( ), que retorna o valor do perímetro do retângulo.
 * Desenvolva   também   uma   classe  Aplicacao  contendo   um   método  main  para
 * testar os métodos da classe Retangulo.
 */

package br.pucminas.algoritmosestruturadedadosii.labs.poo.ex001;

import java.util.Locale;

public class Aplicacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Retangulo retangulo = new Retangulo(3.0, 8.5);
		retangulo.getPerimetro();
		retangulo.getArea();
		
		System.out.println(retangulo.imprimir());
		
		Retangulo retangulo2 = new Retangulo();
		
		System.out.println(retangulo2.imprimir());
	}

}
