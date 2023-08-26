package br.pucminas.progmodlab.revisao01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Habilidade {
	private String nome;
	private int nivel;
	
	public Habilidade(String nome) {
		this.nome = nome;
	}
	
	public Habilidade(String nome, int nivel) {
		this.nome = nome;
		this.nivel = nivel;
	}

	public String getNome() {
		return nome;
	}
	
	public List<Habilidade> lerHabilidadesCandidato() {
		List<Habilidade> tecnologias = lerTecnologias("arquivo1.txt");
		List<Habilidade> habilidades = new ArrayList<>();
		
		/*for(Habilidade tecnologia : tecnologias) {
			habilidades.add(tecnologia, n)
		}*/

		return habilidades;
	}
	
	private List<Habilidade> lerTecnologias(String fileName) {
		List<Habilidade> tecnologias = new ArrayList<>();

		File file = new File(fileName);
		
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String string = scanner.nextLine();
				
				tecnologias.add(new Habilidade(string));
			}

			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return tecnologias;
	}

}
