/*
    Faça um programa que calcule e mostre a área de um círculo.
 */
package lista01_Sequenciais;

import java.util.Scanner;

public class ex006 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Vamos descobrir a área de um círculo!");
        System.out.print("Digite o valor do raio: ");

        float raio = sc.nextFloat();
        sc.close();

        double areaCirculo = Math.PI * Math.pow(raio, 2);

        System.out.printf("A área do círculo é de %.2f ", areaCirculo);
    }
}
