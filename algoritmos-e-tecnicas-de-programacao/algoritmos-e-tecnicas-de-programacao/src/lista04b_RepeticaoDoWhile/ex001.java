/*
    Faça um programa que receba um número inteiro maior que 1, verifique se o número fornecido é primo ou não e mostre uma mensagem de número primo ou de número não primo.
    Um número é primo quando é divisível apenas por 1 e por ele mesmo.
 */
package lista04b_RepeticaoDoWhile;

import java.util.Scanner;

public class ex001 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número: ");
        int numero = sc.nextInt();
        sc.close();

        int divisor = 0;
        int count = 1;

        do {
            if (numero % count == 0) {
                divisor++;
                count++;
            }
        } while (count <= numero);

        if (divisor > 2) {
            System.out.printf("%d não é um número primo", numero);
        } else {
            System.out.printf("%d é um número primo", numero);
        }
    }
}
