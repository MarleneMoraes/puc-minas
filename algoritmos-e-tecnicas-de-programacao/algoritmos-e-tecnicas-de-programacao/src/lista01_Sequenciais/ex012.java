/*
    Um trabalhador recebeu seu salário e o depositou em sua conta bancária. Esse trabalhador emitiu dois cheques e agora deseja saber seu saldo atual. 
    Sabe-se que cada operação bancária de retirada paga CPMF de 0,38% e o saldo inicial da conta está zerado.
 */
package lista01_Sequenciais;

import java.util.Scanner;

public class ex012 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o seu salário: ");
        float salario = sc.nextFloat();

        System.out.print("Valor do primeiro cheque: ");
        float cheque1 = sc.nextFloat();

        System.out.print("Valor do segundo cheque: ");
        float cheque2 = sc.nextFloat();
        sc.close();

        double CPMF = 0.0038;
        double saldoAtual = salario - ((cheque1 + (CPMF * cheque1)) + (cheque2 + (CPMF * cheque2)));

        System.out.printf("Saldo atual: R$%.2f", saldoAtual);
    }
}
