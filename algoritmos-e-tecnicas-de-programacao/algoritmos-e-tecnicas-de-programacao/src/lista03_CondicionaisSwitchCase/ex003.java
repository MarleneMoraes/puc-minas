/*
    Faça um programa que receba:
        a. O código do estado de origem da carga de um caminhão, supondo que a digitação do código do estado seja sempre válida, ou seja, um número inteiro entre 1 e 5.
        b. O peso da carga do caminhão em toneladas.
	c. O código da carga, supondo que a digitação do código seja sempre válida, ou seja, um número inteiro entre 10 e 40.

        Tabelas:
        Código do estado		Imposto
            1                             35%
            2                             25%
            3                             15%
            4                              5%
            5				 ISENTO

        Código da carga 		Preço por grama
            10 a 20                         100
            21 a 30                         250
            31 a 40                         340

    Calcule e mostre:
        - O peso da carga do caminhão convertido em quilos;
        - O preço da carga do caminhão;
        - O valor do imposto, sabendo-se que o imposto é cobrado sobre o preço da carga do caminhão e depende do estado de origem;
        - O valor total transportado pelo caminhão, preço da carga mais imposto. 
*/

package lista03_CondicionaisSwitchCase;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        double carga = 0,imposto = 0;
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Código do estado de origem: ");
        int codigoEstado = sc.nextInt();
        
        System.out.print("Peso da carga do caminhão (em toneladas): ");
        float peso = sc.nextFloat();
        
        System.out.print("Código da carga:");
        int codigoCarga = sc.nextInt();
        
        if (codigoCarga >= 10 && codigoCarga <= 40){
           double pesoQuilos = (peso*1000);
           
           if (codigoCarga >= 10 && codigoCarga <= 20) {
                carga = (pesoQuilos * 1000 * 100);
                
                carga = sc.nextFloat();
            } else if (codigoCarga >= 21 && codigoCarga <= 30) {
                carga = (pesoQuilos * 1000 * 250);
                carga = sc.nextFloat();
            } else if (codigoCarga >= 31 && codigoCarga <= 40) {
                carga = (pesoQuilos * 1000 * 340);
                carga = sc.nextFloat();
            }
           
            switch (codigoEstado){
                case 1:
                    imposto = (carga * 0.35);
                    break;
                case 2:
                    imposto = (carga * 0.25);
                    break;
                case 3:
                    imposto = (carga * 0.15);
                    break;
                case 4:
                    imposto = (carga * 0.05);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Código inválido. Tente novamente.");
            } 
            
            double valorTotal = (carga + imposto);
            System.out.printf("Peso da carga do caminhão convertido em quilos: %.2f", pesoQuilos);
            System.out.printf("Preço da carga do caminhão: R$%.2f", carga);
            System.out.printf("Valor do imposto: R$%.2f", imposto);
            System.out.printf("Valor total: R$%.2f", valorTotal);
            
        } else{
            System.out.println("ERRO. Tente novamente.");
        }      
    }
}
