/*
    Faça um programa que receba o valor do salário mínimo, o número de horas trabalhadas, o número de dependentes do funcionário e a quantidade de horas extras trabalhadas. 
    Calcule e mostre o salário a receber do funcionário de acordo com as regras a seguir:
        - O valor da hora trabalhada é igual a 1/5 do salário mínimo;
        - O salário do mês é igual ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada;
        - Para cada dependente, acrescentar R$ 32,00;
        - Para cada hora extra trabalhada, calcular o valor da hora trabalhada acrescida de 50%;
        - O salário bruto é igual ao salário do mês mais o valor dos dependentes mais o valor das horas extras; 
        - Calcular o valor do imposto de renda de acordo com a tabela a seguir: 
        
        IRRF          Salário bruto
        Isento     Inferior a R$200,00
        10%        De R$200,00 até R$500,00
        20%         Superior a R$500,00
    
        O salário líquido é igual ao salário bruto menos o IRRF;
        A gratificação será de acordo com a tabela a seguir:
        
        Salário líquido		Gratificação
        Até R$350,00		 R$100,00
        Superior a R$350,00  	 R$50,00

        O salário a receber do funcionário é igual ao salário líquido mais a gratificação
 */

package lista02_CondicionaisIf;

import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Salário mínimo: ");
        float salarioMinimo = sc.nextFloat();

        System.out.print("Horas trabalhadas: ");
        int horas = sc.nextInt();

        System.out.print("Número de dependentes: ");
        int dependente = sc.nextInt();

        System.out.print("Horas extras trabalhadas: ");
        int horasExtras = sc.nextInt();
        sc.close();

        float valorHora = (salarioMinimo / 5);
        float salario = (horas * valorHora);

        double valorHoraExtra = (1.5 * valorHora);

        double salarioBruto = (salario + (dependente * 32) + valorHoraExtra);
        
        double irrf;
        
        if (salarioBruto < 200) {
            irrf = 0;
        } else if (salarioBruto >= 200 && salarioBruto <= 500) {
            irrf = 0.1;

        } else {
            irrf = 0.2;
        }
        
        float salarioLiquido = (float) (salarioBruto - irrf);

        if (salarioLiquido <= 350) {
            salario = salarioLiquido + 100;
        } else {
            salario = salarioLiquido + 50;
        }

        System.out.printf("Salário a receber: %.2f", salario);
    }
}
