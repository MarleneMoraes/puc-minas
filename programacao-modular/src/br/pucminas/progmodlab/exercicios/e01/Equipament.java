package br.pucminas.progmodlab.exercicios.e01;

public class Equipament {
	private String name;
	private String maintenanceDate;
	private String departament;
	private String status;
	
	public Equipament(String name, String maintenanceDate, String departament, String status) {
		super();
		this.name = name;
		this.maintenanceDate = maintenanceDate;
		this.departament = departament;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaintenanceDate() {
		return maintenanceDate;
	}

	public void setMaintenanceDate(String maintenanceDate) {
		this.maintenanceDate = maintenanceDate;
	}

	public String getDepartament() {
		return departament;
	}

	public void setDepartament(String departament) {
		this.departament = departament;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
