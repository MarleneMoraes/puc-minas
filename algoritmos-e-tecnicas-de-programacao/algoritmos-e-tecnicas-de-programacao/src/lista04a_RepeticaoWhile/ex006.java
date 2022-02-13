/*
    Faça um programa para ler o código, o sexo (M-masculino, F-feminino) e o número de horas/aula dadas mensalmente pelos professores de uma universidade, 
    sabendo-se que cada hora/aula vale R$ 30,00. Emita uma listagem contendo o código, o salário bruto e o salário líquido (levando em consideração os 
    descontos explicados a seguir) de todos os professores. Mostre também a média dos salários líquidos dos professores do sexo masculino e a média dos 
    salários líquidos dos professores do sexo feminino. Considere: 
        a) desconto para homens, 10% e, para mulheres, 5%; 
        b) as informações terminarão quando for lido o código = 99999 
 */
package lista04a_RepeticaoWhile;

import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        double salario_liquido, medsalario_liquido_M, medsalario_liquido_F;
        int codigo = 0;

        Scanner sc = new Scanner(System.in);

        while (codigo != 99999) {
            System.out.print("Código: ");
            codigo = sc.nextInt();

            System.out.print("Sexo: ");
            char genero = sc.next().charAt(0);

            System.out.print("Número de horas/aula trabalhadas: ");
            int horaAula = sc.nextInt();

            double salarioBruto = horaAula * 30;
            
            double salarioLiquido;

            if (genero == 'M' || genero == 'm') {
                salarioLiquido = salarioBruto - (salarioBruto * 0.1);
                System.out.printf("Salário bruto: %.2f\nSalário líquido: %.2f\n", salarioBruto, salarioLiquido);
            } else if (genero == 'F' || genero == 'f') {
                salarioLiquido = salarioBruto - (salarioBruto * 0.05);
                System.out.printf("Salário bruto: %.2f\nSalário líquido: %.2\n", salarioBruto, salarioLiquido);
            } else {
                System.out.print("Valor inválido");
            }
        }

        sc.close();
    }
}
