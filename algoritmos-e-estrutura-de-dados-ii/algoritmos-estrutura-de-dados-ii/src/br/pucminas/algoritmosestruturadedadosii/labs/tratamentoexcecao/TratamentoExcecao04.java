package br.pucminas.algoritmosestruturadedadosii.labs.tratamentoexcecao;

public class TratamentoExcecao04 {
	public static void m1(String s) throws NumberFormatException, ArrayIndexOutOfBoundsException {
		Integer i = new Integer(s);
		MyIO.println("A variável i vale " + i);
	}

	public static void m2(String s) throws NumberFormatException {
		Integer i = new Integer(s);
		// Integer i = 0; 
		//Integer i = new Integer("0,32");
		MyIO.println("A variável i vale " + i);
	}

	public static void main(String[] args) {
		try {
			m1(args[0]);
		} 
		catch (NumberFormatException e) {
			MyIO.println("Erro1: " + e.getMessage());
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			MyIO.println("Erro2:" + e.getMessage());
		}
		
		MyIO.println("--- >>>>>    <<<<< -----");

		/*
		 * try { 
		 * 	m2(args[0]); 
		 * }
		*/
		try {
			m2("null");
		} // teste com essa parte do código
		catch (NumberFormatException e) {
			MyIO.println("Erro3:" + e.getMessage());
		}
		MyIO.println("--- >>>>>    <<<<< -----");
	}

}
