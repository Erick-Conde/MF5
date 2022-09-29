public class Rota  implements Contavel, Comparable<Rota>{
	private CiaAerea cia;
	private Aeroporto origem;
	private Aeroporto destino;
	private Aeronave aeronave;
	private int totalRotas=0;
	
	public Rota(CiaAerea cia, Aeroporto origem, Aeroporto destino, Aeronave aeronave) {
		totalRotas++;
		this.cia = cia;
		this.origem = origem;
		this.destino = destino;
		this.aeronave = aeronave;		
	}	
	


	public CiaAerea getCia() {
		return cia;
	}
	
	public Aeroporto getDestino() {
		return destino; 
	}
	
	public Aeroporto getOrigem() {
		return origem;
	}
	
	public Aeronave getAeronave() {
		return aeronave;
	}

	public int getTotalObj()
	{
		return totalRotas;
	}

	public int compareTo(Rota x)
	{
		return cia.compareTo(x.getCia());
	}
}
