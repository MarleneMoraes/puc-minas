/*
    Faça  um  programa  que  receba  o  valor  do  salário  mínimo,  uma  lista  contendo  a  quantidade  de quilowatts  gasta  por  consumidor  
    e  o  tipo  de  consumidor  (1-residencial,  2-comercial  ou  3-industrial).  Termine  a  entrada  de  dados  com  quantidade  de  quilowhats  
    igual  a  zero.  Calcule  e mostre:
        a)O valor de cada quilowatt, sabendo que o quilowatt custa um oitavo do salário mínimo;
        b)O valor a ser pago por cada consumidor (conta final mais acréscimo). O acréscimoencontra-se na tabela a seguir:
  
        Tipo		%   de   acréscimo   sobre   o   valor gasto
         1                    5
         2                    10	
         3                    15
 
        c)O faturamento geral da empresa;
        d)A quantidade de consumidores que pagam entre R$ 500,00 e R$ 1000,00.
 */
package lista04b_RepeticaoDoWhile;

import java.util.Scanner;

public class ex005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Consumo de Energia");
        System.out.print("Salário mínimo: ");
        float salario = sc.nextFloat();
        float valorQuilowatts = (salario / 8);
        float quantidadeConsumida;
        float geral = 0;
        double acrescimo = 0,  consumidores = 0;

        do {
            System.out.print("Quantidade de KW consumida: ");
            quantidadeConsumida = sc.nextFloat();

            if (quantidadeConsumida != 0) {
                float gasto = (valorQuilowatts * quantidadeConsumida);
                System.out.print("Tipo do consumidor \n1-Residencial\n 2-Comercial\n 3-Industrial");
                int tipo = sc.nextInt();

                switch (tipo) {
                    case 1:
                        acrescimo = (gasto * 0.05);
                        break;
                    case 2:
                        acrescimo = (gasto * 0.1);
                        break;
                    case 3:
                        acrescimo = (gasto * 0.15);
                        break;
                }

                double total = (gasto + acrescimo);
                geral += total;

                if (total >= 500 && total <= 1000) {
                    consumidores += 1;
                }
                System.out.printf("Valor gasto: %.2f%n", gasto);
                System.out.printf("Valor acréscimo: %.2f%n", acrescimo);
                System.out.printf("Valor final: %.2f%n", total);
            }
        } while (quantidadeConsumida != 0);

        System.out.printf("Total geral consumido: %.2f\n", geral);
        System.out.printf("Total de consumidores que pagam entre 500 e 1000 reais: %.2f\n ", consumidores);

        sc.close();
    }

}
