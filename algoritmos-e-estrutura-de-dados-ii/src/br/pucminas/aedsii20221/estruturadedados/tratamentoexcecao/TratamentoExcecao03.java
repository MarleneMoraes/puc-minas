package br.pucminas.aedsii20221.estruturadedados.tratamentoexcecao;

import br.pucminas.aedsii20221.estruturadedados.MyIO;

/**
 * Tratamento de excecao
 * 
 * @author Max do Val Machado
 * @version 2 01/2015
 */

public class TratamentoExcecao03 {
	public static void main(String[] args) {
		try {
			int i = Integer.parseInt(args[0]);
			MyIO.println("A variavel i vale " + i);
		} catch (NumberFormatException e) {
			MyIO.println("Erro no parâmetro informado. "
					+ "Deve ser informado um número inteiro.");
		} catch (ArrayIndexOutOfBoundsException e) {
			MyIO.println(
					"Erro na passagem de parâmetros! Deve ser informado "
					+ "um número inteiro como argumento do programa.");
			MyIO.println(e.toString());

		} catch (Exception e) {
			MyIO.println("Erro na execução do programa! " + e.toString());
		}

		finally {
			MyIO.println("FIM DE PROGRAMA!!!");
		}
	}
}
