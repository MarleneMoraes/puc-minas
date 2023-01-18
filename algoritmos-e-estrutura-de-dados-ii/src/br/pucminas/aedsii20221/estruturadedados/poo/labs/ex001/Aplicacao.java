/*
 * Crie uma classe Retangulo com os atributos privados: base (double) e altura
 * (double). Sua classe tamb�m ter�, pelo menos, dois construtores, e os m�todos  
 * gets, sets, clone e imprimir. O m�todo imprimir exibe o valor de todos os atributos 
 * do objeto.
 * Implemente tamb�m o m�todo double getArea( ), que retorna o valor da �rea do ret�ngulo;   
 * e o m�todo double getPerimetro( ), que retorna o valor do per�metro do ret�ngulo.
 * Desenvolva   tamb�m   uma   classe  Aplicacao  contendo   um   m�todo  main  para
 * testar os m�todos da classe Retangulo.
 */

package br.pucminas.aedsii20221.estruturadedados.poo.labs.ex001;

import java.util.Locale;

import br.pucminas.aedsii20221.estruturadedados.MyIO;

public class Aplicacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Retangulo retangulo = new Retangulo(3.0, 8.5);
		retangulo.getPerimetro();
		retangulo.getArea();
		
		MyIO.println(retangulo.imprimir());
		
		Retangulo retangulo2 = new Retangulo();
		
		MyIO.println(retangulo2.imprimir());
	}

}
