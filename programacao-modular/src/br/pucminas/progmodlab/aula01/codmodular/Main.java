package br.pucminas.progmodlab.aula01.codmodular;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois números para somar:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

		int resultadoSoma = Calculadora.somar(num1, num2);
        System.out.println("A soma é: " + resultadoSoma);

        System.out.println("Digite a quantidade de números para calcular a média:");
        int quantidadeNumeros = scanner.nextInt();

        int[] numeros = new int[quantidadeNumeros];
        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            numeros[i] = scanner.nextInt();
        }

        double resultadoMedia = Calculadora.calcularMedia(numeros);
        System.out.println("A média é: " + resultadoMedia);

        scanner.close();
    }
}