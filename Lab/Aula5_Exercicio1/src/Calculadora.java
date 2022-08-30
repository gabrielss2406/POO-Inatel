public class Calculadora {
    // Atributos
    public static double PI=3.14;

    // Metodos
    public static double circuferencia(double raio){
        double circ = 2.0*PI*raio;
        return circ;
    }
    public static double volume(double raio){
        double volum = 4.0/3*PI*(raio*raio*raio);
        return volum;
    }
}
