package br.pucminas.algoritmosestruturadedadosii.labs.tratamentoexcecao;

public class TratamentoExcecao05 {
	public static void metodo(int i) throws Exception {
		if (i % 2 == 1) {
			throw new Exception("Valor ímpar");
			// MyIO.println("Valor ímpar");
		}
	}
}
