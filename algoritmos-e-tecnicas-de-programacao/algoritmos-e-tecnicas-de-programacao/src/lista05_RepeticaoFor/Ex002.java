/*
    Faça um programa que leia um número N que vai indicar a quantidade de valores inteiros e positivos que devem ser lidos em sequência.
    Depois, para cada valor lido, mostre o número e o seu fatorial.
 */
package lista05_RepeticaoFor;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long n = 0;
        int numero = 0;
        int fatorial = 1;

        System.out.print("Digite a quantidade de números inteiros: ");
        n = sc.nextLong();


        for (int i = 0; i < n; i++){
            System.out.print("Digite o valor: ");
            numero = sc.nextInt();
            int j = numero;

            for (fatorial = 1; j > 1; j--) {
                fatorial *= j;
            }

            System.out.printf("Valor: %d \nFatorial: %d \n", numero, fatorial);
        }

    }
}
