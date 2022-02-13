/*
    Faça um programa que receba o valor de um depósito e o valor da taxa de juros, calcule e mostre o valor do rendimento e o valor total depois do rendimento.
 */
package lista01_Sequenciais;

import java.util.Scanner;

public class ex004 {
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos conferir o seu rendimento");
        System.out.print("Digite o valor de seu depósito: ");

        float deposito = sc.nextFloat();

        System.out.print("Digite o valor da taxa de juros (em porcentagem): ");
        float juros = sc.nextFloat();

        System.out.print("Digite o tempo em que o depósito foi feito (em meses): ");
        int tempo = sc.nextInt();

        juros /= 100;

        double total = deposito * (1 + juros) * tempo;

        double rendimento = total - deposito;

        System.out.printf("O seu rendimento é de %.2f e seu total é de %.2f ", rendimento, total);
        sc.close();
    }
}
