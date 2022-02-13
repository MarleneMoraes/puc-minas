/*
    Faça um programa que receba:
	a. O código de um produto comprado, supondo que a digitação do código do produto seja sempre válida, ou seja, um número inteiro entre 1 e 10.
	b. O peso do produto em quilos.
	c. O código do país de origem, supondo que a digitação do código seja sempre válida, ou seja, um número inteiro entre 1 e 3.
    
    Tabelas:

        Código do país de origem        Imposto
            1                              0%
            2                              15%
            3                              25%

        Código do produto 		Preço por grama
            1 a 4                           10
            5 a 7                           25
            8 a 10                          35

    Calcule e mostre:
        a) O peso do produto convertido em gramas;
        b) O preço total do produto comprado;
        c) O valor do imposto, sabendo-se que ele é cobrado sobre o pre�o total do produto comprado e depende do país de origem;
        d) O valor total (preço total do produto mais imposto).
 */
package lista03_CondicionaisSwitchCase;
import java.util.Scanner;

public class ex002 {

    public static void main(String[] args) {
        int codigopais;
        double preco = 0, imposto = 0;

        Scanner sc = new Scanner (System.in);

        System.out.print("Peso do produto (em kg): ");
        float peso = sc.nextFloat();

        double pesoGramas = (peso / 1000);

        System.out.print("Código do produto: ");
        int codigo = sc.nextInt();

        switch(codigo){
            case 1:
            case 2:
            case 3:
            case 4: 
                preco = (pesoGramas * 10);
                break;
            case 5:
            case 6:
            case 7: 
                preco = (pesoGramas * 25);
                break;
            case 8:
            case 9:
            case 10: 
                preco = (pesoGramas * 10);
                break;
            default: 
                System.out.print("Código inválido. Tente novamente.");
        }

        if (codigo > 0 && codigo <=10) {
            
            System.out.print("Código do país: ");
            int codigoPais = sc.nextInt();
    
            switch (codigoPais) {
                case 1: 
                    imposto = preco;
                    
                    break;
                case 2: 
                    imposto = (preco*1.15); 
                    break;
                case 3: 
                    imposto = (preco*1.25); 
                    break;
            }

            double valorTotal = (preco + imposto);
        
            System.out.printf("Peso em gramas: %.2f %n", pesoGramas);
            System.out.printf("Preço do produto: R$%.2f", preco);
            System.out.printf("Valor do imposto: R$%.2f %n", imposto);
            System.out.printf("Valor total: R$%.2f", valorTotal);
        }    
        
    }

}
