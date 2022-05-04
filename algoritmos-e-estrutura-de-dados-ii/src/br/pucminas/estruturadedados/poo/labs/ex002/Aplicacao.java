/*
 * Crie uma classe CartaoValeTransporte com os atributos privados: n�mero (int),  
 * saldo (double) e bloqueado (boolean). Sua classe tamb�m ter�, pelo menos, dois 
 * construtores, e os m�todos gets, sets, clone e imprimir. O m�todo imprimir exibe 
 * o valor de todos os atributos do objeto.
 * Implemente tamb�m os m�todos da classe CartaoValeTransporte descritos abaixo, 
 * obedecendo �s seguintes descri��es:
 * 	- carregar(double credito): Se o cart�o vale-transporte estiver desbloqueado e o valor 
 * a ser creditado, passado como par�metro para esse m�todo, for positivo: incrementa o 
 * saldo do cart�o vale-transporte com o valor de cr�dito informado;
 * 	- pagar(double tarifa): Se o cart�o vale-transporte estiver desbloqueado, o valor da 
 * tarifa, passado como par�metro para esse m�todo, for positivo, e houver saldo suficiente:   
 * decrementa, do saldo atual do cart�o vale-transporte, o valor da tarifa informada;
 * 	- bloquear(CartaoValeTransporte destino): bloqueia o cart�o vale-transporte, transfere   
 * seu saldo restante para o outro cart�o vale-transporte que foi informado como par�metro 
 * desse m�todo, e zera seu saldo.
 */

package br.pucminas.estruturadedados.poo.labs.ex002;

import br.pucminas.estruturadedados.MyIO;

public class Aplicacao {

	public static void main(String[] args) {
		CartaoValeTransporte cartao1, cartao2;

		cartao1 = new CartaoValeTransporte(21074, 50.00);
		MyIO.printf("Saldo atual do cart�o vale-transporte 1: R$ %.2f\n", cartao1.getSaldo());
		cartao1.pagar(2.80); // R$ 50,00

		MyIO.printf("Saldo atual do cart�o vale-transporte 1: R$ %.2f\n", cartao1.getSaldo()); // R$ 47,20
		cartao1.pagar(1.40);

		MyIO.printf("Saldo atual do cart�o vale-transporte 1: R$ %.2f\n", cartao1.getSaldo()); // R$ 45,80
		cartao1.carregar(5.00);
		
		MyIO.printf("Saldo atual do cart�o vale-transporte 1: R$ %.2f\n", cartao1.getSaldo()); // R$ 50,80
		
		cartao2 = new CartaoValeTransporte(390176, 25.00);
		MyIO.printf("Saldo atual do cart�o vale-transporte 2: R$ %.2f\n", cartao2.getSaldo()); // R$ 25,00
		cartao1.bloquear(cartao2);
		
		MyIO.printf("Saldo atual do cart�o vale-transporte 1: R$ %.2f\n", cartao1.getSaldo()); // R$ 0,00
		MyIO.printf("Saldo atual do cart�o vale-transporte 2: R$ %.2f\n",cartao2.getSaldo()); // R$ 75,80

	}

}
