/*
    Faça um programa que calcule e mostre a área de um trapézio.
 */
package lista01_Sequenciais;

import java.util.Scanner;

public class ex018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Olá! Descubra o valor da área de um trapézio.");
        System.out.print("Digite o valor da base maior: ");
        float baseMaior = sc.nextFloat();

        System.out.print("Digite o valor da base menor: ");
        float baseMenor = sc.nextFloat();

        System.out.print("Digite o valor da altura: ");
        float altura = sc.nextFloat();

        sc.close();

        double area = (((baseMaior + baseMenor) * altura) / 2);

        System.out.printf("Área do trapézio: %.2f ", area);
    }
}
