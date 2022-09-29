public class Aeroporto  implements Contavel, Comparable<Aeroporto>{
	private String codigo;
	private String nome;
	private Geo loc;
	private static int totalAeroportos=0;
	
	public Aeroporto(String codigo, String nome, Geo loc) {
		totalAeroportos++;
		this.codigo = codigo;
		this.nome = nome;
		this.loc = loc;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Geo getLocal() {
		return loc;
	}

	public int getTotalObj()
	{
		return totalAeroportos;
	}

	public int compareTo(Aeroporto x)
	{
		return nome.compareTo(x.nome);
	}
}
