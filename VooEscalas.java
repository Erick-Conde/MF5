import java.time.*;
import java.util.ArrayList;

public class VooEscalas extends Voo
{
    private ArrayList<Rota> listaR = new ArrayList<Rota>();
    private Rota rota;
    private int totalVoos = 0;

    public VooEscalas(LocalDateTime dh) {
       super(dh);
       totalVoos++;
    }

    public void adicionaRota(Rota rota)
    {
        listaR.add(rota);
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
        
        double duracaoH = 0;

        for(Rota r : listaR)
        {
            double distancia = distanciaP((r.getOrigem()).getLocal(),(r.getDestino()).getLocal());
            duracaoH += (distancia/805) + 0.5;
        }
        double duracaoM = duracaoH/60;;


		return Duration.ofMinutes((long)duracaoM);
	}

    public Rota getRota()
    {
        return rota;
    }

    public ArrayList<Rota> getRotas()
    {
        return listaR;
    }

    @Override
    public int getTotalObj() {
        return totalVoos;
    }
}