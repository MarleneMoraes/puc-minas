/*
    Faça um programa que leia o número total de prestações de um consórcio, o total de prestações pagas e o valor atual da prestação. 
    O código deve calcular e apresentar o saldo devedor atual.
 */
package lista01_Sequenciais;

import java.util.Scanner;

public class ex019 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá! Descubra o seu saldo devedor.");
        System.out.print("Digite o número total de prestações: ");
        int prestacaoTotal = sc.nextInt();

        System.out.print("Digite o número de prestações pagas: ");
        int prestacaoAtual = sc.nextInt();
        
        System.out.print("Digite o valor atual da prestação: ");
        float valorAtual = sc.nextFloat();
        sc.close();
        
        float valorTotal = (valorAtual*prestacaoTotal);
        
        double saldoDevedor = valorTotal - (valorAtual * (prestacaoTotal-prestacaoAtual));
        
        System.out.printf("Saldo devedor atual é de %.2f", saldoDevedor);
        
    }  
}
