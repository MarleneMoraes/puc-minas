package br.pucminas.algoritmosestruturadedadosii.labs.tratamentoexcecao;

public class TratamentoExcecao02 {

	public static void main(String[] args) {
		try {
			Integer i = new Integer(args[0]);
			MyIO.println("A variável i vale " + i);
		} catch (ArrayIndexOutOfBoundsException e) {
			MyIO.println("Erro na passagem de parâmetros!!!");
		} finally {
			MyIO.println("FIM DE PROGRAMA!!!");
		}
	}

}
