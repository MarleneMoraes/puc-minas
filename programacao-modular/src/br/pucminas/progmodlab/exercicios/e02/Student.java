package br.pucminas.progmodlab.exercicios.e02;

import java.util.List;

public class Student {
	private String name;
    private String birthDate;
    private String enrollment;
	
    public Student() { }

	public Student(String name, String birthDate, String enrollment) {
		this.name = name;
		this.birthDate = birthDate;
		this.enrollment = enrollment;
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

	public String getEnrollment() {
		return enrollment;
	}

	public void setEnrollment(String enrollment) {
		this.enrollment = enrollment;
	}
    
	public String insert(String enrollment, List<Student> students) {
        for (Student student : students) {
            if (!(student.getEnrollment().equals(enrollment))) {
                students.add(student);
                System.out.print(student.getName());
               return "Estudante inserido com sucesso.";
            }
        }

        return "Estudante já existente.";
    }

    public String update(String enrollment, List<Student> students, String item) {
        for (Student student : students) {
            if (student.getEnrollment().equals(enrollment)) {

                if(item.equals(name)) {
                    student.setName(name);
                    return "Informação alterada com sucesso.";
                } else if (item.equals(birthDate)) {
                    student.setBirthDate(item);
                    return "Informação alterada com sucesso.";
                } else {
                    System.out.println("código inválido");
                }
            }
        }

        return "Estudante não encontrado.";
    }

    public void seeList(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void remove(String enrollment, List<Student> students) {
        for (Student student : students) {
            if (student.getEnrollment().equals(enrollment)) {
                students.remove(student);
                System.out.println("Estudante removido com sucesso.");
                break;
            }
        }
    }
    
}
