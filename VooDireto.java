import java.time.*;

public class VooDireto extends Voo{
    public enum Status { CONFIRMADO, ATRASADO, CANCELADO };
	private int totalVoos = 0;
	private Rota rota;
	private Status status;
	
	public VooDireto(LocalDateTime dh, Rota rota){
		super(dh);
        totalVoos++;
		this.rota = rota;
		this.status = Status.CONFIRMADO;
	}

	public Rota getRota() {
		return rota;
	}
	
	
	public static double distanciaP(Geo geo1, Geo geo2) {
        double lat1 = Math.toRadians(geo1.getLatitude());
        double lat2 = Math.toRadians(geo2.getLatitude());
        double lon1 = Math.toRadians(geo1.getLongitude());
        double lon2 = Math.toRadians(geo2.getLongitude());
        
        double diflat = (lat1-lat2)/2;
        double diflon = (lon1-lon2)/2;
        
        double d = Math.pow(Math.sin(diflat),2)+
                   Math.pow(Math.sin(diflon),2)*
                   Math.cos(lat1) * Math.cos(lat2);
        
        d = 2 * 6371 * Math.asin(Math.sqrt(d));
                
        return d;   
    }
	public Duration getDuracao() {
        double distancia = distanciaP((rota.getOrigem()).getLocal(),(rota.getDestino()).getLocal());
        double duracaoH = (distancia/805) + 0.5;
        double duracaoM = duracaoH/60;

		return  Duration.ofMinutes((long)duracaoM);
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status novo) {
		this.status = novo;
	}

	public int getTotalObj()
	{
		return totalVoos;
	}
}