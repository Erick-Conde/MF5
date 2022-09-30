import java.util.*;

public class GerenciadorRotas{

    private ArrayList<Rota> rotas;

    public void ordenaDescricao()
    {
        Collections.sort(rotas);
    }

    public ArrayList <Rota> listarTodas() {return rotas;}

    public ArrayList <Rota> buscarPorOrigem (Aeroporto orig) 
    {
        ArrayList <Rota> aux = new ArrayList<>();
        for (Rota r: rotas) 
        {
            if (r.getOrigem().equals(orig)) 
            {
                aux.add(r);
            }
        }
        return aux;
    }
}