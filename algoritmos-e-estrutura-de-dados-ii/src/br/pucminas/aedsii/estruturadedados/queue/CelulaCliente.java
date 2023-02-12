package br.pucminas.aedsii.estruturadedados.queue;

public class CelulaCliente {

	protected Cliente item;
	protected CelulaCliente proximo;

	public CelulaCliente(Cliente cli) {

		this.item = cli;
		this.proximo = null;
	}
}