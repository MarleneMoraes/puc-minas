/* 
    Em uma fábrica trabalham 15 pessoas entre homens e mulheres divididos em três classes:
 
    Peças por mês                                               Classe
        Trabalhadores que fazem até 30 peças por mês		  1
        Trabalhadores que fazem de 30 a 35 peças por mês	  2	
        Trabalhadores que fazem mais de 35 peças por mês	  3		
  
    A classe 1 recebe salário mínimo(R$1000,00).
    A classe 2 recebe salário mínimo mais 3% deste salário por peça, acima das 30 peças iniciais. 
    A classe 3 recebe salário mínimo mais 5% deste salário por peça, acima das 30 peças iniciais.
 
    Faça um programa que receba o número do operário, o número de peças fabricadas por ele no mês, o sexo do operário, e que também calcule e mostre:
    a) O número do operário e seu salário;
    b) O total da folha de pagamento da fábrica;
    c) O número total de peças fabricadas no mês;
    d) A média de peças fabricadas pelos homens;
    e) A média de peças fabricadas pelas mulheres;
    f) O número do operário ou operária de maior salário.
*/
package lista04a_RepeticaoWhile;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int trabalhadores = 0, operarioMaiorSalario = 0, totalPecas = 0;
        float mediaPecasMasculino = 0, mediaPecasFeminino = 0, totalFolha = 0;
        double maiorSalario = 0;
        
        while (trabalhadores < 15){
            System.out.print("\nNúmero do operário: ");
            int numeroOperario = sc.nextInt();

            System.out.print("Número de peças:");
            int pecas = sc.nextInt();
            
            System.out.print("Gênero do operário: ");
            char genero = sc.next().charAt(0);

            int classe;
            double salario;
            
            
            if (pecas <= 30){
                classe = 1;
                salario = 1000;
            } else if (pecas > 30 || pecas < 35){
                classe = 2;
                salario = (1000 + ((1000*0.03)* (pecas-30)));
            } else{ 
                classe = 3;
                salario = (1000 + ((1000*0.05)* (pecas-35)));
            }
            
            if (maiorSalario < salario){
                maiorSalario = salario;
                operarioMaiorSalario = numeroOperario;
            }
            
            if (genero == 'M' || genero == 'm'){
                mediaPecasMasculino++;
            } else if (genero == 'F' || genero == 'f'){
                mediaPecasFeminino++;
            } else {
                System.out.println("ERRO. Tente Novamente.");
            }
            
            System.out.printf("Operário nº %d       Salário R$%.2f", numeroOperario, salario);
            
            totalFolha += salario;
            totalPecas += pecas;
            trabalhadores++;
        }
        
        System.out.printf("Total da folha de pagamento da fábrica: %.2f\n", totalFolha);
        System.out.printf("Número total de peças fabricadas no mês: %d\n", totalPecas);
        System.out.printf("Média de peças fabricadas pelos homens: %d\n", mediaPecasMasculino);
        System.out.printf("Média de peças fabricadas pelas mulheres: %d\n", mediaPecasFeminino);
        System.out.printf("Número do operário ou operária de maior salário: %d\n", operarioMaiorSalario);
    
    }
}
