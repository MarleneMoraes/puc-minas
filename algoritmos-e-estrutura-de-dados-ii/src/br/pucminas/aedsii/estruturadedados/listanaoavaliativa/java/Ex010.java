/*	
  	Faça um programa, em Java, para corrigir provas de múltipla escolha. Cada prova tem oito 
	questões  e  cada  questão  vale  um  ponto.  O  primeiro  conjunto  de  dados  a  ser  lido  é  o 
	gabarito da prova. Os outros dados são os números dos alunos e suas respectivas respostas 
	às questões da prova. Existem dez alunos matriculados. Calcule e mostre: 
	 
	a) o número e a nota de cada aluno; 
	b) a  porcentagem  de  aprovação,  sabendo-se  que  a  nota  mínima  necessária  para 
	aprovação é cinco. 
	 
 */

/**
 * Java's List
 * 
 * @author MarleneMoraes
 * @date 20 set 2022
 * */

package br.pucminas.aedsii.estruturadedados.listanaoavaliativa.java;

import java.util.Random;

public class Ex010 {
	public static void main(String[] args) {
		Exam answerExam = new Exam();
		Student[] students = new Student[10];

	}
}

class Student {
	private int id;
	private Exam exam;
	private double grade;

	public Student() {
		Random random = new Random();
		this.id = random.nextInt(100) - 1;
		grade = 0.0;
	}

	public int getId() {
		return id;
	}

	public Exam getExam() {
		return exam;
	}

	public double getGrade() {
		return grade;
	}

	/*public void setGrade(double grade) {
		for(int i = 0; i < answerExam.getAnswer().length; i++) {
			if(answerExam == student.getExam()) {
				student.g
			}			
		}
	}*/

	public boolean isApproval(double grade) {
		return grade >= 5.0;
	}

}

class Exam {
	private char[] answer;

	public Exam() {
		this.answer = setAnswer();
	}

	public char[] getAnswer() {
		return answer;
	}

	public char[] setAnswer() {
		Random random = new Random();

		char[] answer = new char[8];

		for (int i = 0; i < answer.length; i++)
			answer[i] = (char) (random.nextInt(26) + 'a');

		return answer;
	}

}
