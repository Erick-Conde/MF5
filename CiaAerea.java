public class CiaAerea  implements Contavel, Comparable<CiaAerea>{
	private String codigo;
	private String nome;
	private static int totalCias=0;
	
	public CiaAerea(String codigo, String nome) {
		totalCias++;
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}

	public int getTotalObj()	{
		return totalCias;
	}

	public int compareTo(CiaAerea x)
	{
		return 0;
	}
}
