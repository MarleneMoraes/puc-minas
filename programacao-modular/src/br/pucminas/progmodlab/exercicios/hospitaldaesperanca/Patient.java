package br.pucminas.progmodlab.exercicios.hospitaldaesperanca;

import java.util.ArrayList;

public class Patient extends Person {
	private Consult previousConsultation;
	private ArrayList<String> surgeries;
	private ArrayList<Medicine> medicines;
	
	public Patient() {	}
	
	public Patient(String name, String birthDate, String bloodType, ArrayList<String> alergies) {
		super(name, birthDate, bloodType, alergies);
	}

	public Patient(Consult previousConsultation, ArrayList<String> surgeries, ArrayList<Medicine> medicines) {
		super();
		this.previousConsultation = previousConsultation;
		this.surgeries = surgeries;
		this.medicines = medicines;
	}

	public Consult getPreviousConsultation() {
		return previousConsultation;
	}

	public void setPreviousConsultation(Consult previousConsultation) {
		this.previousConsultation = previousConsultation;
	}

	public ArrayList<String> getSurgeries() {
		return surgeries;
	}

	public void setSurgeries(ArrayList<String> surgeries) {
		this.surgeries = surgeries;
	}

	public ArrayList<Medicine> getMedicines() {
		return medicines;
	}

	public void setMedicines(ArrayList<Medicine> medicines) {
		this.medicines = medicines;
	}
}
