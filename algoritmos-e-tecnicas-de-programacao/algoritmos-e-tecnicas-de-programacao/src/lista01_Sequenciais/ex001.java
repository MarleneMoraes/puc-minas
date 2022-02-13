/*
    Faça um programa que receba três notas e seus respectivos pesos, calcule e mostre a média ponderada dessas notas.
 */
package lista01_Sequenciais;

import java.util.Scanner;

public class ex001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Olá! Descubra a média da sua nota aqui.");
        System.out.print("Digite a sua primeira nota: ");
        float nota1 = sc.nextFloat();

        System.out.print("Digite o peso da primeira nota: ");
        int peso1 = sc.nextInt();

        System.out.print("Digite a sua segunda nota: ");
        float nota2 = sc.nextFloat();

        System.out.print("Digite o peso da segunda nota: ");
        int peso2 = sc.nextInt();

        System.out.print("Digite a sua terceira nota: ");
        float nota3 = sc.nextFloat();

        System.out.print("Digite o peso da terceira nota: ");
        int peso3 = sc.nextInt();

        sc.close();

        float media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / 3;

        System.out.printf("A sua média é %.2f ", media);
    }
}


