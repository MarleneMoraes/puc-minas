/*
    Faça um programa para calcular a área de um triângulo, que não permita a entrada de dados inválidos, ou seja, medidas menores ou iguais a 0.
*/

package lista04b_RepeticaoDoWhile;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float base, altura;
       
        do {
            System.out.println("Vamos descobrir a área de um triângulo!");
            System.out.print("Digite o valor da base: ");

            base = sc.nextFloat();

            System.out.print("Digite o valor da altura: ");
            altura = sc.nextFloat();
            sc.close();

            double areaTriangulo = (base * altura) / 2;

            System.out.printf("A área do triângulo é de %.2f\n", areaTriangulo);
        } while (base <= 0 || altura <= 0);
    }
}
