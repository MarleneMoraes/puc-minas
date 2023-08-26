package br.pucminas.progmodlab.exercicio01;

public class Medicine {
	private String name;
	private String dosage;
	private String expiration;
	private int quantity;

	public Medicine(String name, String dosage, String expiration, int quantity) {
		this.name = name;
		this.dosage = dosage;
		this.expiration = expiration;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public String getExpiration() {
		return expiration;
	}

	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
