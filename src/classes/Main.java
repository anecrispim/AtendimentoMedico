package classes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataMedico = LocalDate.parse("01/11/1999", formatter);
		
		Medico medico = new Medico(dataMedico, "Jussara Florisbela");
		Especialidade especialidade = new Especialidade("Clínico General");
		medico.setEspecialidade(especialidade);
		
		LocalDate dataPaciente = LocalDate.parse("14/02/2000", formatter);
		
		Paciente paciente = new Paciente(dataPaciente, "Jerundio");
		
		boolean[] respostas = new boolean[5];
		String[] perguntas = {
				"Está sentindo dor?"
				, "Está com febre?"
				, "É gestante, idoso ou recém nascido?"
				, "Foi mordido por algum animal pessonhento?"
				, "Está inconsciente?"
		};
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
		
		DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime inicio = LocalDateTime.parse("20/08/2022 11:30", formatterTime);
		
		Atendimento atendimento = new Atendimento(inicio, 1, paciente, respostas);
		
		ListaAtendimento listaA = new ListaAtendimento();
		listaA.addLista(atendimento);
		
		LocalDate dataPaciente2 = LocalDate.parse("14/02/2001", formatter);
		
		Paciente paciente2 = new Paciente(dataPaciente2, "Clotilde");
		
		boolean[] respostas2 = new boolean[5];
		
		String resposta2;
		System.out.println("Responda as seguintes perguntas com sim ou não?");
		for (int i = 0; i < perguntas.length; i++) {
			System.out.println(perguntas[i]);
			resposta2 = entrada.nextLine();
			if (resposta2.equals("sim")) {
				respostas2[i] = true;
			} else {
				respostas2[i] = false;
			}
		}
		
		LocalDateTime inicio2 = LocalDateTime.parse("22/08/2022 11:30", formatterTime);
		
		Atendimento atendimento2 = new Atendimento(inicio2, 1, paciente2, respostas2);
		listaA.addLista(atendimento2);
		
		
		List<Atendimento> lista = listaA.mostraLista();
		
		System.out.println("Lista de Atendimentos");
		System.out.println(lista.toString());
		
		//setando um atendimento já executado pelo medico e emitindo atestado
		LocalDateTime fim = LocalDateTime.parse("22/08/2022 12:30", formatterTime);
		atendimento2.setFim(fim);
		atendimento2.setMedico(medico);
		atendimento2.setEstado(2);
		
		Atestado atestado = new Atestado(inicio2, fim, 1);
		
		System.out.println("Emissão do atestado: ");
		System.out.println(atestado.emitirAtestado(atendimento2));
		
		entrada.close();
	}

}
