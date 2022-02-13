/*
  Faça um programa que receba o salário de um funcionário e o percentual de aumento, calcule e mostre o valor do aumento e o novo salário.
 */
package lista01_Sequenciais;

import java.util.Scanner;

public class ex003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Parabéns! Você recebeu um aumento!");
        System.out.println("Pode-se conferir o novo salário aqui.");
        System.out.print("Digite o seu salário atual: ");

        float salario = sc.nextFloat();

        System.out.print("Digite o percentual de aumento: ");
        float percentual = sc.nextFloat();
        sc.close();

        percentual /= 100;

        float aumento = salario + salario * percentual;

        System.out.printf("O seu novo salário é %.2f ", aumento);
    }

}
