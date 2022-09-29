import java.util.*;

public class Aeronave implements Contavel, Comparable<Aeronave>{
	private String codigo;
	private String descricao;
	private int capacidade;
	public int totalAeronaves=0;
	
	public Aeronave(String codigo, String descricao, int capacidade) {
		totalAeronaves++;
		this.codigo = codigo;
		this.descricao = descricao;
		this.capacidade= capacidade;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public int getCapacidade() {
		return capacidade;
	}

	public int getTotalObj()
	{
		return totalAeronaves;
	}
	
	public int compareTo(Aeronave x)
	{
		return descricao.compareTo(x.descricao);
	}
}