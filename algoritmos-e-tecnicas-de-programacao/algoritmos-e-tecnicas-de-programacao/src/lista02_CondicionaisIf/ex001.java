/*
    Suponha que você está desenvolvendo um software para controle de estoque que precisa informar como está a quantidade de pacotes de uma ração A:
        a. se suficiente, para quantidades superiores a 100;
        b. em alerta, para quantidades entre 100 e 50;
        c. e abaixo do ideal, para quantidades menores do que 50.
    Faça um programa que imprima o status do estoque como base na entrada da quantidade atual.
 */
package lista02_CondicionaisIf;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de pacotes de ração A:");

        int racao = sc.nextInt();
        sc.close();

        if (racao > 100) {
            System.out.print("Suficiente");
        } else if (racao <= 100 && racao >= 50) {
            System.out.print("Em alerta");
        } else {
            System.out.print("Abaixo do ideal");
        }
    }
}
