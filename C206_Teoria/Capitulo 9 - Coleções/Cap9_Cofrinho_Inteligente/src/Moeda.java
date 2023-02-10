public class Moeda implements Comparable<Moeda> {
    // Atributos
    private float valor;

    // Metodos
    @Override
    public int compareTo(Moeda o) {
        if(valor < o.valor)
            return -1;
        else if(valor > o.valor)
            return 1;
        else
            return 0;
    }

    // Construtor
    public Moeda(float v) {
        this.valor = v;
    }

    public float getValor() {
        return valor;
    }
}
