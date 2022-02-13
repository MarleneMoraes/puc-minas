/*
    O custo ao consumidor de um carro novo é a soma do preço de fábrica com o percentual de lucro do distribuidor e dos impostos aplicados ao preço de fábrica. 
    Faça um programa que receba o preço de fábrica de um veículo, o percentual de lucro do distribuidor e o percentual de impostos, calcule e mostre:
	a. O valor correspondente ao lucro do distribuidor;
	b. O valor correspondente aos impostos;
	c. O preço final do veículo.
 */
package lista01_Sequenciais;

import java.util.Scanner;

public class ex010 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Preço de fábrica do veículo: ");
        float precoFabrica = sc.nextFloat();

        System.out.print("Insira o percentual de lucro do distribuidor: ");
        float percentualLucro = sc.nextFloat();

        System.out.print("Insira o percentual de impostos: ");
        float percentualImpostos = sc.nextFloat();
        

        float lucro = precoFabrica * (percentualLucro / 100);
        System.out.printf("Lucro do distribuidor: R$%.2f%n", lucro);

        float impostos = precoFabrica * (percentualImpostos / 100);
        System.out.printf("Impostos: R$%.2f\n", impostos);

        float valorFinal = (precoFabrica + lucro + impostos);
        System.out.printf("Preço final do veículo: R$%.2f\n", valorFinal);
        sc.close();
    }
}
