/*
    Um funcionário de uma empresa recebe aumento salarial anualmente. Sabe-se que:
        a. Esse funcionário foi contratado em 2015, com salário inicial de R$ 1000,00.
        b. Em 2016, ele recebeu aumento de 1,5% sobre seu salário inicial.
        c. A partir de 2017 (inclusive), os aumentos salariais sempre corresponderam ao dobro do percentual do ano anterior.
        Faça um programa que determine o salário atual desse funcionário.
 */
package lista05_RepeticaoFor;

public class Ex001 {
    public static void main(String[] args) {

        //salario inicial
        double salario = 1000;
        double percentual = 0.015;
        double novoSalario = salario + (salario*percentual);

        for (int i = 2017; i <= 2020; i++){
            novoSalario += (novoSalario*(2*percentual));
        }

        System.out.printf("O seu novo salário é de R$%.2f ", novoSalario);
    }
}
