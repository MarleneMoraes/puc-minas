/* 
    Faça um programa que receba o código correspondente ao cargo de um funcionário e seu salário atual e mostre o cargo, o valor do aumento e seu novo salário. 
    Os cargos estão listados na tabela abaixo.
  
        Código         Cargo            Percentual
        1           Escriturário            50%
        2           Secretário              35%	
        3           Caixa                   20%
        4           Gerente                 10%
        5           Diretor             Não tem aumento
*/

package lista03_CondicionaisSwitchCase;


import java.util.Scanner;

public class ex001 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o código do cargo: ");
        int codigo = sc.nextInt();


        System.out.print("Insira o salário atual: ");
        float salarioAtual = sc.nextFloat();
        
        double novoSalario = 0;

        switch (codigo) {
            case 1:
                    novoSalario = (salarioAtual * 1.5);
                    System.out.println("Cargo 1: Escriturário\nAumento: 50%"); 
                    break;
            case 2:
                    novoSalario = (salarioAtual * 1.35);
                    System.out.println("Cargo 2: Secretário\nAumento: 35%"); 
                    break;
            case 3:
                    novoSalario = (salarioAtual * 1.2);
                    System.out.println("Cargo 3: Caixa\nAumento: 20%"); 
                    break;
            case 4:
                    novoSalario = (salarioAtual * 1.1);
                    System.out.println("Cargo 4: Gerente\nAumento: 10%"); 
                    break;
            case 5:
                    novoSalario = (salarioAtual * 0);
                    System.out.println("Cargo 5: Diretor\nAumento: inexistente"); 
                    break;
            default:
                    System.out.print("Valor inválido. Tente novamente."); 
                    break;
        }

        sc.close ();

        if (codigo == 1 || codigo == 2 || codigo == 3 || codigo == 4 || codigo == 5 ) {
            System.out.printf("Novo salário: R$%.2f", novoSalario);
        }

    }

}
