/*
        Faça um programa que receba o número de horas trabalhadas e o valor do salário mínimo, calcule e mostre o salário a receber seguindo as regras:
            a. A hora trabalhada vale a metade do salário mínimo;
            b. O salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada;
            c. O imposto equivale a 3% do salário bruto;
            d. O salário a receber equivale ao salário bruto menos o imposto.
 */
package lista01_Sequenciais;

import java.util.Scanner;

public class ex011 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Salário mínimo: ");
        float salarioMinimo = sc.nextFloat();

        System.out.print("Insira o número de horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();

        float valorHora = (salarioMinimo / 2);

        float salarioBruto = (horasTrabalhadas * valorHora);

        double imposto = (salarioBruto * 0.03);

        double salarioFinal = (salarioBruto - imposto);
        
        System.out.printf("Salário a receber: R$%.2f", salarioFinal);

        sc.close();
    }
}
