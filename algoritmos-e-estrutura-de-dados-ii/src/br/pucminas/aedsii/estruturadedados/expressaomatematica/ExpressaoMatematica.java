package br.pucminas.aedsii.estruturadedados.expressaomatematica;

import java.util.Scanner;

public class ExpressaoMatematica {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String notacao = "";

		String string = entrada.nextLine();
		Pilha pilha = new Pilha();

		while (!string.equals("FIM")) {
			notacao = notacaoPolonesa(string, pilha);
			
			System.out.println(notacao);
			
			string = entrada.nextLine();
			pilha = new Pilha();

		}

		entrada.close();
	}

	public static String notacaoPolonesa(String string, Pilha pilha) {
		Character caractere;
		String notacao = "";

		for (int i = 0; i < string.length(); i++) {
			caractere = string.charAt(i);
			switch (caractere) {
			case '*':
			case '/':
			case '(':
				pilha.empilhar(caractere);
				break;
			case '+':
			case '-':
				if (pilha.consultarTopo() != '(')
					notacao = desempilhaSequencia(notacao,pilha);
				else
					pilha.empilhar(caractere);
				break;
			case ')':
				notacao = desempilhaSequencia(notacao,pilha);
				break;
			default:
				notacao += caractere;
			}

		}

		return notacao;
	}

	public static String desempilhaSequencia(String string, Pilha pilha) {
		if (pilha.pilhaVazia() == false) {
			while (pilha.consultarTopo() != '(') {
				string += (" " + pilha.desempilhar());
			}
		}
		
		return string;
	}
}