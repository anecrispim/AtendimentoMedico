package classes;

import java.time.LocalDateTime;
import java.time.Duration;

public class Operacao {
	private LocalDateTime inicio;
	private LocalDateTime fim;
	
	public Operacao(LocalDateTime inicio) {
		setInicio(inicio);
	}

	public LocalDateTime getInicio() {
		return inicio;
	}
	public void setInicio(LocalDateTime inicio) {
		this.inicio = inicio;
	}
	public LocalDateTime getFim() {
		return fim;
	}
	public void setFim(LocalDateTime fim) {
		this.fim = fim;
	}
	
	public long tempoTotal() {
		long diferencaHora = Duration.between(this.inicio, this.fim).toHours();
		return diferencaHora;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Operacao [inicio=");
		builder.append(inicio);
		builder.append(", fim=");
		builder.append(fim);
		builder.append("]");
		return builder.toString();
	}
}
