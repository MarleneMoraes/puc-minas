package br.pucminas.aedsii.poo.labs.ex002;

public class CartaoValeTransporte {
	private int numero;
	private double saldo;
	private boolean bloqueado;

	public CartaoValeTransporte() {
		numero = 0;
		saldo = 0;
		bloqueado = false;
	}

	public CartaoValeTransporte(int numero, double saldo, boolean bloqueado) {
		this.numero = numero;
		this.saldo = saldo;
		this.bloqueado = bloqueado;
	}

	public CartaoValeTransporte(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getBloqueado() {
		return bloqueado;
	}

	public void setBloqueado(boolean bloqueado) {
		this.bloqueado = bloqueado;
	}

	public void carregar(double saldo) {
		if (!getBloqueado() && saldo > 0) {
			setSaldo(saldo + getSaldo());
		}
	}

	public void pagar(double valor) {
		setSaldo(getSaldo() - valor);
	}

	public void bloquear(CartaoValeTransporte pass) {
		pass.setSaldo(this.getSaldo() + pass.getSaldo());
		this.setSaldo(0);
		this.setBloqueado(true);
	}
}
