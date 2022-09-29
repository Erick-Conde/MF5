import java.time.Duration;
import java.time.LocalDateTime;

public abstract class Voo  implements Contavel{
	
	public enum Status { CONFIRMADO, ATRASADO, CANCELADO };

	private LocalDateTime datahora;

	public Voo(LocalDateTime dh) {
		this.datahora = dh;
	}

	public LocalDateTime getDataHora() {
		return datahora;
	}
	
	public abstract Duration getDuracao();
	
	public abstract Rota getRota();
}