/*
    Faça um programa que receba um número inteiro e verifique se é par ou ímpar.
 */
package lista02_CondicionaisIf;

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um valor:");
        int numero = sc.nextInt();
        sc.close();

        if (numero % 2 == 0) {
            System.out.println("Este valor é par.");
        } else {
            System.out.println("Este valor é impar.");
        }
    }
}
