/*
   Faça um programa que receba três números e mostre-os em ordem crescente. Suponha que o usuário digite três números diferentes.
 */
package lista02_CondicionaisIf;

import java.util.Scanner;

public class ex004 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o primeiro valor:");
        int num1 = sc.nextInt();

        System.out.print("Insira o segundo valor:");
        int num2 = sc.nextInt();

        System.out.print("Insira o terceiro valor:");
        int num3 = sc.nextInt();
        sc.close();

        if (num1 < num2 && num2 < num3) {
            System.out.printf("A ordem dos valores são: %d, %d, %d", num1, num2, num3);
        } else if (num1 > num2 && num2 > num3) {
            System.out.printf("A ordem dos valores são:  %d, %d, %d", num3, num2, num1);
        }
    }
}
