/*
    Faça um programa que receba o custo de um espetáculo teatral e o preço do convite desse espetáculo. 
    Esse programa deverá calcular e mostrar a quantidade de convites que devem ser vendidos para que pelo menos o custo do espetáculo seja alcançado. 
 */
package lista01_Sequenciais;

import java.util.Scanner;

public class ex016 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Custo do espetáculo: ");
        float custo = sc.nextFloat();

        System.out.print("Preço do convite: ");
        float precoConvite = sc.nextFloat();

        sc.close();

        int quantidadeConvite = (int) (custo / precoConvite);

        System.out.printf("Para atingir seu objetivo, deverá vender %d convites", quantidadeConvite);
    }
}
