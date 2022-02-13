/*
  Faça um programa que receba o código correspondente ao cargo de um funcionário e seu salário atual e mostre o cargo, o valor do aumento e seu novo salário. 
  Os cargos estão na tabela abaixo:
  
       Cód      Cargo 		  Percentual
        1	Escriturário        50%
        2	Secretário          35%	
        3	Caixa               20%
        4	Gerente             10%
        5	Diretor             Não tem aumento
 */
package lista02_CondicionaisIf;

import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double novoSalario = 0;

        System.out.print("Insere código do cargo: ");
        int codigo = sc.nextInt();

        System.out.print("Insira o salário atual: ");
        float salario = sc.nextFloat();

        if (codigo == 1){
                novoSalario = (salario * 1.5);
                System.out.println("Cargo 1: Escriturário\nAumento: 50% ");
                System.out.printf("Novo salário: R$%.2f", novoSalario);
        } else if (codigo == 2){
                novoSalario = (salario * 1.35);
                System.out.println("Cargo 2: Secretário\nAumento: 35%");
                System.out.printf("Novo salário: R$%.2f", novoSalario);
        } else if (codigo == 3){
                novoSalario = (salario * 1.2);
                System.out.println("Cargo 3: Caixa\nAumento: 20%");
                System.out.printf("Novo salário: R$%.2f", novoSalario);
        } else if (codigo == 4){
                novoSalario = (salario * 1.1);
                System.out.println("Cargo 4: Gerente\nAumento: 10%");
                System.out.printf("Novo salário: R$%.2f", novoSalario);
        } else if (codigo == 5){
                novoSalario = salario + (salario * 0);
                System.out.println("Cargo 5: Diretor\nAumento: inexistente");
                System.out.printf("Novo salário: R$%.2f", novoSalario);
        } else{
             System.out.println("Código inválido. Tente novamente.");
        }

        sc.close();
    }
}
