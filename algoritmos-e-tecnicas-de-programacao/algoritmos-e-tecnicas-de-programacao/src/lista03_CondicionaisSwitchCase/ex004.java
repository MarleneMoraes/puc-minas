/*
    Faça um programa que apresente o menu a seguir, permita ao usuário escolher a opção desejada, receba os dados necessários 
    para executar a operação e mostre o resultado. Verifique a possibilidade de opção inválida e não se preocupe com restrições, 
    como salário negativo.

        Menu de opções:
        1. Imposto
        2. Novo Salário
        3. Classificação

    Digite a opção desejada.

    Na opção 1: receber o salário de um funcionário, calcular e mostrar o valor do imposto usando as regras a seguir:
        Salário                                       Imposto
        Menor que R$500,00                              5%
        De R$500,00 a R$850,00				10%
        Acima de R$850					15%

    Na opção 2: receber o salário de um funcionário, calcular e mostrar o valor do novo salário, usando as regras a seguir:
        Salário                             Aumento
        > R$1500,00                         R$25,00
        >= R$750,00 e <= R$1500,00          R$50,00
        >= R$450,00 e < R$750               R$75,00
        < R$450,00                          R$100,00

    Na opção 3: receber o salário de um funcionário e mostrar sua classificação usando a tabela a seguir:
        Salário 				Classificação
        Até R$700,00 (inclusive)		Mal remunerado
        Maiores que R$700,00			Bem remunerado
*/

package lista03_CondicionaisSwitchCase;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("MENU DE OPÇÕES");
        System.out.println("-----------------");
        System.out.println("1. Imposto");
        System.out.println("2. Novo Salário");
        System.out.println("3. Classificação");
        System.out.print("\nDigite a opção desejada: ");
        int opcao=sc.nextInt();

        switch (opcao) {
            case 1: 
                System.out.println("IMPOSTO");
                System.out.print("Informe o salário: ");
                float salario = sc.nextFloat();
                
                double imposto;
                
                if (salario < 500) {
                    imposto = (salario * 0.05);
                } else if (salario >= 500 && salario <= 850) {
                    imposto = (salario * 0.1);
                } else {
                    imposto = (salario * 0.15);
                }
                
                System.out.printf("Valor do imposto: R$%.2f", imposto);
                break;
            case 2:
                System.out.println("NOVO SALÁRIO");
                System.out.print("Informe o salário atual: ");
                float salarioAtual = sc.nextFloat();
                
                double novoSalario;
                
                if (salarioAtual < 1500) {
                    novoSalario = (salarioAtual + 25);
                } else if (salarioAtual >= 750 && salarioAtual <= 1500) {
                    novoSalario = (salarioAtual + 50);
                } else if (salarioAtual >= 450 && salarioAtual < 750) {
                    novoSalario = (salarioAtual + 75);
                } else {
                    novoSalario = (salarioAtual + 100);
                }
                
                System.out.printf("Valor do novo salário: R$%.2f", novoSalario);
                break;
            case 3: 
                System.out.println("CLASSIFICAÇÃO");
                System.out.print("Informe o salário: ");
                salario = sc.nextFloat();

                if (salario <= 700) {
                    System.out.println("Mal remunerado");
                } else {
                    System.out.println("Bem remunerado");
                }
                break;
            default:
               System.out.println("Opção inválida. Tente novamente.");  
        }
    }
}
