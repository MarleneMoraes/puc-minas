package br.pucminas.progmodlab.revisao01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Candidato {
	private String nome;
	private List<Habilidade> habilidades;

	public Candidato() {
	}

	public Candidato(String nome, List<Habilidade> habilidades) {
		this.nome = nome;
		this.habilidades = habilidades;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Habilidade> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<Habilidade> habilidades) {
		this.habilidades = habilidades;
	}

	public static List<Candidato> lerCandidatos(String fileName) {
		List<Candidato> candidatos = new ArrayList<>();

		File file = new File(fileName);

		Scanner scanner;
		try {
			scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String string = scanner.nextLine();
				String[] data = string.split(";");
				
				String nome = data[0];
				
				List<Habilidade> habilidades = new ArrayList<>();
				
				for(int i = 1; i < data.length; i++)
					habilidades.add(Integer.parseInt(data[i]), null);
				
				candidatos.add(new Candidato(nome, habilidades));
				
			}

			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return candidatos;
	}

}
