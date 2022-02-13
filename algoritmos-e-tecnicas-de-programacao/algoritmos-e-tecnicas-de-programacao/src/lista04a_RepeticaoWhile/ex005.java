/*
    Faça um programa que receba o salário de um funcionário chamado Carlos. 
    Sabe-se que outro funcionário, João, tem salário equivalente a um terço do salário de Carlos. 
    Carlos aplicará seu salário integralmente na caderneta de poupança, que está rendendo 2% ao mês, 
    e João aplicará seu salário integralmente no fundo de renda fixa, que está rendendo 5% ao mês. 
    O programa deverá calcular e mostrar a quantidade de meses necessários para que o valor pertencente 
    a João igual e/ou ultrapasse o valor pertencente a Carlos. 
*/

package lista04a_RepeticaoWhile;

import java.util.Scanner;

public class ex005 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Redimento de contas");
        System.out.print("Salário de Carlos: ");
        float salarioCarlos = sc.nextFloat();
        
        float salarioJoao = (salarioCarlos/3);
        
        float rendimentoCarlos = 0, rendimentoJoao = 0;
        int meses = 0;
        
        while (salarioJoao <= salarioCarlos) {

            rendimentoCarlos = ((salarioCarlos * 2) / 100);
            rendimentoJoao = ((salarioJoao * 5) / 100);

            salarioCarlos += rendimentoCarlos;
            salarioJoao += rendimentoJoao;

            meses++;
        }
        
        System.out.printf("O rendimento de João iguala ou ultrapassa o rendimento de Carlos em %d meses", meses);

        sc.close();
    }
   
}