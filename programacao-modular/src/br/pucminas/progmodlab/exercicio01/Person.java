package br.pucminas.progmodlab.exercicio01;

import java.util.ArrayList;

public class Person {
	protected String name;
	protected String birthDate;
	protected String bloodType;
	protected ArrayList<String> alergies;

	public Person() { }

	public Person(String name, String birthDate, String bloodType, ArrayList<String> alergies) {
		this.name = name;
		this.birthDate = birthDate;
		this.bloodType = bloodType;
		this.alergies = alergies;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getTipoSang() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public ArrayList<String> getBloodType() {
		return alergies;
	}

	public void setAlergies(ArrayList<String> alergies) {
		this.alergies = alergies;
	}
}
