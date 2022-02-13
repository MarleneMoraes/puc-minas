/*
  Faça um programa que receba o salário de um funcionário, calcule e mostre o novo salário, sabendo-se que este sofreu um aumento de 25%.
 */
package lista01_Sequenciais;

import java.util.Scanner;

public class ex002 {
            
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Parabéns! Você recebeu um aumento!");
        System.out.println("Pode-se conferir o novo salário aqui.");
        System.out.println("Digite o seu salário atual: ");

        float salario = sc.nextFloat();
        sc.close();

        double aumento = salario + salario * 0.25;

        System.out.printf("O seu novo salário é %.2f ", aumento);
    }
}
