package br.pucminas.algoritmosestruturadedadosii.labs.tratamentoexcecao;

public class TratamentoExcecao {

	public static void main(String[] args) {
		Integer i = new Integer(args[0]);
		MyIO.println("A variável i vale " + i);
		MyIO.println("FIM DE PROGRAMA!!!");

		String str = null;
		// str = frase.toUpperCase(); //comente essa linha para fazer o tratamento da excessao
		MyIO.println("String original: " + str);

		try {
			str = str.toUpperCase();
		} catch (NullPointerException e) { // captura da POSSÍVEL exceção.
			// Tratamento da exceção
			MyIO.println(
					"A variavel str estava nula, para solucionar " + "o problema, foi lhe atribuito um novo valor.");
			str = "String com valor valido";
		} // retire os comentarios das linhas e teste
		finally {
			str = str.toUpperCase();
		}

		MyIO.println("Frase antiga: " + str);
	}

}
