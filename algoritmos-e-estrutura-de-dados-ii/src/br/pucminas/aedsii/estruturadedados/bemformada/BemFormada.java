package br.pucminas.aedsii.estruturadedados.bemformada;

import java.util.Scanner;

public class BemFormada {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Pilha pilha = new Pilha();

		String string = entrada.nextLine();

		while (!string.equals("FIM")) {
			pilha = verificaFormacao(string, pilha);

			if (pilha.pilhaVazia() == true)
				System.out.println("correto");
			else
				System.out.println("incorreto");

			string = entrada.nextLine();
		}

		entrada.close();
	}

	public static Pilha verificaFormacao(String string, Pilha pilha) {
		Character caractere;
		Character topo = pilha.consultarTopo();

		for (int i = 0; i < string.length(); i++) {
			caractere = string.charAt(i);
			topo = pilha.consultarTopo();

			if (caractere == '(' || caractere == '[')
				pilha.empilhar(caractere);

			if (caractere == ')' && topo == '(' || caractere == ']' && topo == '[')
				pilha.desempilhar();

		}

		return pilha;
	}
}