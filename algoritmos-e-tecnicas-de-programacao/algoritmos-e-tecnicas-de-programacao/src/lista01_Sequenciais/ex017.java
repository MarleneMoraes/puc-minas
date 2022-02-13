/*
    Faça um programa para ler o número de um funcionário, a quantidade de horas trabalhadas e o valor que recebe por hora. 
    O programa deve calcular e mostrar o salário deste funcionário.
 */

package lista01_Sequenciais;

import java.util.Scanner;

public class ex017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá! Descubra o valor do seu salário.");
        System.out.print("Digite o seu número de funcionário: ");
        int id = sc.nextInt();

        System.out.print("Quantas horas trabalhadas realizou? ");
        int horas = sc.nextInt();

        System.out.print("Valor por hora: ");
        float valor = sc.nextInt();

        sc.close();

        float salario = (valor * horas);

        System.out.printf("O salário do funcionário %d é R$%.2f", id, salario);
    }
}
