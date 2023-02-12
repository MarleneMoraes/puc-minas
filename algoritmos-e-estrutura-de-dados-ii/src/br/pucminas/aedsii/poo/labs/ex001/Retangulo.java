package br.pucminas.aedsii.poo.labs.ex001;

public class Retangulo {
	private double base;
	private double altura;

	public Retangulo() {
		this.base = 0;
		this.altura = 0;
	}

	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getArea() {
		double area = this.getBase() + this.getAltura();
		return area;
	}

	public double getPerimetro() {
		double perimetro = 2 * (this.getBase()) + 2 * (this.getAltura());
		return perimetro;
	}

	public String imprimir() {
		if (getBase() != 0 && getAltura() != 0) {
			return "Retângulo \nBase: " + getBase() + "\nAltura: " + getAltura() 
			+ "\nÁrea: " + getArea() + "\nPerímetro: " + getPerimetro();			
		} else {
			return "Não foram instancidos os valores.";
		}
	}

}
