/*
 Sabe-se que :
	1 pé = 12 polegadas
	1 jarda = 3 pés
	1 milha = 1.760 jardas

    Faça um programa que receba uma medida em pés, faça as conversões a seguir e mostre os resultados: 
    a) em polegadas; b) em jardas; c) em milhas.
 */
package lista01_Sequenciais;

import java.util.Scanner;

public class ex008 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma medida em pés: ");
        float medida = sc.nextFloat();

        float polegadas = (medida * 12);
        float jardas = (medida * 3);
        float milhas = (1760 * jardas);

        System.out.printf("A medida %.2f em pés, em polegadas é %.2f, em jardas é %.2f e em milhas é %.2f", medida, polegadas, jardas, milhas);
        sc.close();

    }
}
