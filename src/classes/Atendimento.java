package classes;

import java.time.LocalDateTime;

public class Atendimento extends Operacao implements Comparable<Atendimento>{
	private int prioridade;
	private int estado;
	private Medico medico;
	private Paciente paciente;
	
	public Atendimento(LocalDateTime inicio, int estado,Paciente paciente, boolean[] respostas) {
		super(inicio);
		setEstado(estado);
		setPaciente(paciente);
		calculaPrioridade(respostas);
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public void calculaPrioridade(boolean[] respostas) {
		int prioridade = respostas.length;
		for (int i = 0; i < respostas.length; i++) {
			if (respostas[i]) {
				prioridade = prioridade - 1;
			}
		}
		setPrioridade(prioridade);
	}
	
	@Override 
	public int compareTo(Atendimento outroAtendimento) {
		if (this.prioridade < outroAtendimento.getPrioridade()) { 
			return -1; 
		} else if (this.prioridade > outroAtendimento.getPrioridade()) { 
			return 1; 
		}
		return 0; 
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atendimento [prioridade=");
		builder.append(prioridade);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", medico=");
		builder.append(medico);
		builder.append(", paciente=");
		builder.append(paciente);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
