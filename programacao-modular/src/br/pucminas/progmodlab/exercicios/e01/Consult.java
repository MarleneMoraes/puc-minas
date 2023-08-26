package br.pucminas.progmodlab.exercicios.e01;

public class Consult {
	private String date;
	private String hour;
	private Doctor doctor;
	private Patient patient;

	public Consult(String date, String hour, Doctor doctor, Patient patient) {
		this.date = date;
		this.hour = hour;
		this.doctor = doctor;
		this.patient = patient;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Consult scheduleConsult(String date, String hour, Doctor doctor, Patient patient) {
		Consult newConsult = new Consult(date, hour, doctor, patient);
		doctor.medicalConsultationCalendar.add(newConsult);
		return newConsult;
	}

	public Consult rescheduleConsult(Consult atualConsult, String newHour, String newDate) {
		atualConsult.date = newDate;
		atualConsult.hour = newHour;
		return atualConsult;
	}

	public Consult cancelConsult(Doctor doctor, Consult consult) {

		doctor.medicalConsultationCalendar.remove(consult);
		return consult;
	}

}
