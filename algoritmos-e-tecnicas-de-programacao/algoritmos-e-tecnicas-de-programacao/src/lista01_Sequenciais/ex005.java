/*
  Faça um programa que calcule e mostre a área de um triângulo.
 */
package lista01_Sequenciais;

import java.util.Scanner;

public class ex005 {
    
    static double AreaTriangulo(float b, float h){
        return ((b * h) / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Vamos descobrir a área de um triângulo!");
        System.out.print("Digite o valor da base: ");

        float base = sc.nextFloat();

        System.out.print("Digite o valor da altura: ");
        float altura = sc.nextFloat();
        sc.close();

        double areaTriangulo = (base * altura) / 2;

        System.out.printf("A área do triângulo é de %.2f ", areaTriangulo);
    }
}
