package classes;

import java.time.LocalDate;

public class Paciente extends Pessoa {

	public Paciente(LocalDate dataNascimento,String nome) {
		super(dataNascimento, nome);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Paciente [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
