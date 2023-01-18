package br.pucminas.aedsii20221.estruturadedados.tratamentoexcecao;

import br.pucminas.aedsii20221.estruturadedados.MyIO;

/**
 * Tratamento de excecao
 * 
 * @author Max do Val Machado
 * @version 2 01/2015
 */

public class TratamentoExcecao04 {
	public static void metodo1(String s) throws 
		NumberFormatException, ArrayIndexOutOfBoundsException {
		int i = Integer.parseInt(s);
		MyIO.println("A variavel i vale " + i);
	}

	public static void metodo2(String s) throws NumberFormatException {
		Integer i = Integer.parseInt(s);
		MyIO.println("A variavel i vale " + i);
	}

	public static void main(String[] args) {
		try {
			metodo1(args[0]);
		} catch (NumberFormatException e) {
			MyIO.println("Erro!!!");
		} catch (ArrayIndexOutOfBoundsException e) {
			MyIO.println("Erro!!! " + e.toString());
		}
		
		MyIO.println("-------------->>>>>>>>    <<<<<<<<--------------");
		
		try {
			metodo2(args[0]);
		} catch (NumberFormatException e) {
			MyIO.println("Erro!!!");
		}

		MyIO.println("-------------->>>>>>>>    <<<<<<<<--------------");

	}
}
