/*
    Faça um programa que leia um número não determinado de pares de valores m e n,
    inteiros e positivos, um par de cada vez, e que calcule e mostre a soma de todos
    os números inteiros entre m e n (inclusive). A digitação de pares terminará
    quando m for maior ou igual a n.
 */
package lista05_RepeticaoFor;

import java.util.Scanner;

public class Ex006 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 0;
        int n = 0;
        int soma = 0;

        for (int i = m; i >= n; i++){
            System.out.println("Digite o valor de m: ");
            m = sc.nextInt();

            System.out.println("Digite o valor de n: ");
            n = sc.nextInt();

            soma += (m+n);
        }

        System.out.printf("Soma de todos os números: %d", soma);
    }
}

