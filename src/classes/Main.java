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
		
		Perguntas pergunta = new Perguntas();
		
		pergunta.RespondePerguntas(entrada);
		
		DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime inicio = LocalDateTime.parse("20/08/2022 11:30", formatterTime);
		
		Atendimento atendimento = new Atendimento(inicio, 1, paciente, pergunta.getRespostas());
		
		ListaAtendimento listaA = new ListaAtendimento();
		listaA.addLista(atendimento);
		
		LocalDate dataPaciente2 = LocalDate.parse("14/02/2001", formatter);
		
		Paciente paciente2 = new Paciente(dataPaciente2, "Clotilde");
		
		pergunta.RespondePerguntas(entrada);
		
		LocalDateTime inicio2 = LocalDateTime.parse("22/08/2022 11:30", formatterTime);
		
		Atendimento atendimento2 = new Atendimento(inicio2, 1, paciente2, pergunta.getRespostas());
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
