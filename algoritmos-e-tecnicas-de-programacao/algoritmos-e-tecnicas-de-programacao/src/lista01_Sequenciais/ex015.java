/*
    Sabe-se que o quilowatt de energia custa um quinto do salário mínimo. 
    Faça um programa que receba o valor do salário mínimo e a quantidade de quilowatts consumida por uma residência, calcule e mostre:
        a. O valor de cada quilowatt;
	b. O valor a ser pago por essa residência;
	c. O valor a ser pago com desconto de 15%.
 */
package lista01_Sequenciais;

import java.util.Scanner;

public class ex015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor do sal�rio m�nimo: ");
        float salarioMinimo = sc.nextFloat();
        double quilowatt = (salarioMinimo * 0.2);

        System.out.printf("Valor de cada quilowatt: R$%.2f%n", quilowatt);

        System.out.print("Insira a quantidade de quilowatts consumida na resid�ncia: ");
        float quantidadeQuilowatt = sc.nextFloat();
        sc.close();

        double valorTotal = (quantidadeQuilowatt * quilowatt);

        System.out.printf("Valor a ser pago: R$%.2f%n", valorTotal);

        double valorDesconto = (valorTotal - (valorTotal * 0.15));

        System.out.printf("Valor com desconto: R$%.2f", valorDesconto);
    }
}
