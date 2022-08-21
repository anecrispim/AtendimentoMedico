package classes;

import java.time.LocalDateTime;

public class Atestado extends Operacao {
	private int cid;
	
	public Atestado(LocalDateTime inicio, LocalDateTime fim, int cid) {
		super(inicio);
		super.setFim(fim);
		setCid(cid);
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public String emitirAtestado(Atendimento atendimento) {
		return atendimento.toString().concat(toString());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atestado [cid=");
		builder.append(cid);
		builder.append(", tempoTotal()=");
		builder.append(tempoTotal());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
