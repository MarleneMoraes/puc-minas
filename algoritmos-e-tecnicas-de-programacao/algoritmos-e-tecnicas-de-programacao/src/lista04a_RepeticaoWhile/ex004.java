/*
    Faça um programa que receba o valor de uma dívida e mostre uma tabela com os seguintes dados: 
    valor da dívida, valor dos juros, quantidade de parcelas e valor da parcela. 
 
    Quantidade de parcelas			% de juros sobre o valor inicial da dívida
	1								0
        3								10
        6								15
        9								20
        12								25

    Exemplo de sa�da do programa
    Valor da Dívida		Valor dos juros		Quant. de parcelas          Valor da parcela
        R$1000,00                   0                       1                           R$1000,00
        R$1100,00                   100                     3                           R$366,67
        R$1150,00                   150                     6                           R$191,67
 */
package lista04a_RepeticaoWhile;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int parcelas = 1;
        float valorJuros = 0, valorParcela = 0;
        
        System.out.print("Digite o valor da dívida: ");
        float divida = sc.nextFloat();
        
        System.out.println("Valor da Dívida			Valor dos juros			Quantidade de parcelas			Valor da parcela");
        
        while (parcelas <= 12){
            valorJuros = (divida - 1000); 
            valorParcela = (divida/parcelas);
           
            if (parcelas == 1){
                System.out.printf("%.2f				%.2f					%d					%.2f%n", divida, valorJuros, parcelas, valorParcela);
                
                divida += 100;
                parcelas += 2;
            } else {
                System.out.printf("%.2f				%.2f					%d					%.2f%n", divida, valorJuros, parcelas, valorParcela);
                divida += 50;
                parcelas += 3;
            }

       }
        
    }
}
