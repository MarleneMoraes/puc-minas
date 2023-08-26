package br.pucminas.progmodlab.aula01.codmodular;

public class Calculadora {
	public static int somar(int a, int b) {
		return a + b;
	}
	
	public static double calcularMedia(int[] numeros) {
		int soma = 0;
		for (int num : numeros) {
			soma += num;
		}
		return (double) soma / numeros.length;
	}
}
