package br.pucminas.algoritmostecnicasprogramacao.listametodos;

import java.util.Scanner;

public class Ex001 {
	static Scanner sc = new Scanner(System.in);

	static void converterSegundos(int s) {
		// 1 hora = 60*60 minutos
		int horas = s / 3600;
		s -= (horas * 3600);

		// 1 minuto = 60 segundos
		int minutos = s / 60;
		s -= (minutos * 60);

		System.out.printf("%d:%d:%d", horas, minutos, s);
	}

	public static void main(String[] args) {

		System.out.println("CONVERSOR DE TEMPO");
		System.out.print("Digite o tempo em segundos: ");
		int segundos = sc.nextInt();

		converterSegundos(segundos);

	}
}
