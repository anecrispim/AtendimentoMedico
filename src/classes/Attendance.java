package classes;

import java.time.LocalDateTime;

public class Attendance extends Atendimento {
	public Attendance(LocalDateTime inicio, int estado, Paciente paciente, boolean[] respostas) {
		super(inicio, estado, paciente, respostas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Attendance [priority=");
		builder.append(super.getPrioridade());
		builder.append(", state=");
		builder.append(super.getEstado());
		builder.append(", doctor=");
		builder.append(super.getMedico());
		builder.append(", patient=");
		builder.append(super.getPaciente());
		builder.append(", toString()=");
		builder.append(super.superToString());
		builder.append("]");
		return builder.toString();
	}
}
