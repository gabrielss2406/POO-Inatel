import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Cofrinho {
    // Atributos
    ArrayList<Moeda> moedas = new ArrayList();

    // Metodos
    public void addMoeda(Moeda m){
        moedas.add(m);
    }
    public double getValorTotal(){
        double soma = 0;
        for (Moeda moeda : moedas) soma += moeda.getValor();
        return soma;
    }
    public int getQuantMoedas(){
        return moedas.size();
    }
    public Moeda getMoedaMaiorValor(){
        return Collections.max(moedas);
    }
    public void ordenaMoedas(){
        Collections.sort(moedas);
    }
}
