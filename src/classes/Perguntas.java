package classes;

import java.util.Scanner;

public class Perguntas {
	private String[] perguntas;
	private boolean[] respostas;
	
	public Perguntas() {
		String[] perguntas = {
			"Está sentindo dor?"
			, "Está com febre?"
			, "É gestante, idoso ou recém nascido?"
			, "Foi mordido por algum animal pessonhento?"
			, "Está inconsciente?"
		};
		setPerguntas(perguntas);
	}

	public String[] getPerguntas() {
		return perguntas;
	}
	public void setPerguntas(String[] perguntas) {
		this.perguntas = perguntas;
	}
	public boolean[] getRespostas() {
		return respostas;
	}
	public void setRespostas(boolean[] respostas) {
		this.respostas = respostas;
	}
	
	public void RespondePerguntas(Scanner entrada) {
		boolean[] respostas = new boolean[perguntas.length];
		
		String resposta;
		System.out.println("Responda as seguintes perguntas com sim ou não?");
		for (int i = 0; i < perguntas.length; i++) {
			System.out.println(perguntas[i]);
			resposta = entrada.nextLine();
			if (resposta.equals("sim")) {
				respostas[i] = true;
			} else {
				respostas[i] = false;
			}
		}
		this.setRespostas(respostas);
	}
}
