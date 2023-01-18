package br.pucminas.aedsii20221.estruturadedados.tratamentoexcecao;

import br.pucminas.aedsii20221.estruturadedados.MyIO;

/**
 * Tratamento de excecao
 * 
 * @author Max do Val Machado
 * @version 2 01/2015
 */

public class TratamentoExcecao05 {
	public static void metodo(int i) throws Exception {
		if (i % 2 == 1) {
			throw new Exception("Valor impar");
		}
	}

	public static void main(String[] args) {
		int i = 2;

		MyIO.println("-------------->>>>>>>>    <<<<<<<<--------------");

		try {
			metodo(i);
		} catch (Exception e) {
			MyIO.println(e.getMessage());
		}

		MyIO.println("-------------->>>>>>>>    <<<<<<<<--------------");

		try {
			metodo(i + 2);
		} catch (Exception e) {
			MyIO.println(e.getMessage());
		}

		MyIO.println("-------------->>>>>>>>    <<<<<<<<--------------");
	}
}
