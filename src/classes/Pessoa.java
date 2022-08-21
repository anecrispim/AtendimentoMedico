package classes;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
	private LocalDate dataNascimento;
	private String nome;
	
	public Pessoa (LocalDate dataNascimento,String nome){
		setDataNascimento(dataNascimento);
		setNome(nome);
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int calcularIdade() {
		final LocalDate dataAtual = LocalDate.now();
		final Period periodo = Period.between(this.dataNascimento, dataAtual);
		return periodo.getYears();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [dataNascimento=");
		builder.append(dataNascimento);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", idade()=");
		builder.append(calcularIdade());
		builder.append("]");
		return builder.toString();
	}
}
