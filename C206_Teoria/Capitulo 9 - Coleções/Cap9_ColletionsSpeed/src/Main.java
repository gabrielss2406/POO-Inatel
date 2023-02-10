import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        long tempoInicio;
        long tempoFinal;
        long[] resultado = new long[3];

        // Lista
        ArrayList<Integer> lista = new ArrayList<>();
        HashSet<Integer> conjunto = new HashSet<>();
        HashMap<Integer,Integer> mapa = new HashMap<>();

        tempoInicio = System.currentTimeMillis();
        for(int i=0; i<200000; i++)
            lista.add(i);
        for(int i=0; i<200000; i++)
            lista.get(i);
        tempoFinal = System.currentTimeMillis();
        resultado[0] = tempoFinal - tempoInicio;

        tempoInicio = System.currentTimeMillis();
        for(int i=0; i<200000; i++)
            conjunto.add(i);
        for(int i=0; i<200000; i++){}
        tempoFinal = System.currentTimeMillis();
        resultado[1] = tempoFinal - tempoInicio;

        tempoInicio = System.currentTimeMillis();
        for(int i=0; i<200000; i++)
            mapa.put(i,i);
        for(int i=0; i<200000; i++)
            mapa.get(i);
        tempoFinal = System.currentTimeMillis();
        resultado[2] = tempoFinal - tempoInicio;

        System.out.println("Lista: "+resultado[0]);
        System.out.println("Conjunto: "+resultado[1]);
        System.out.println("Mapa: "+resultado[2]);
    }
}
