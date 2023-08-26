package br.pucminas.progmodlab.exercicio01;

import java.util.ArrayList;

public class Doctor extends Person {

	private String specialties;
	private int yearXp;
	public ArrayList<Consult> medicalConsultationCalendar = new ArrayList<>();

	public Doctor() { }

	public Doctor(String name, String birthDate, String bloodType, ArrayList<String> alergies) {
		super(name, birthDate, bloodType, alergies);
	}

	public String getSpecialties() {
		return specialties;
	}

	public void setSpecialties(String specialties) {
		this.specialties = specialties;
	}

	public int getYearXp() {
		return yearXp;
	}
}
