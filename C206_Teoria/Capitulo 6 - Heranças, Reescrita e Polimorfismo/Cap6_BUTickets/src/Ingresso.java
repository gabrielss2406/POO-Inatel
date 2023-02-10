import java.util.Date;

public class Ingresso {
    // ATRIBUTOS
    private static long numberGenerator = 0;
    private long numero;
    protected float valorIngresso;
    protected static float taxaCartao = 5;
    protected Date dataHoraCompras;

    // METODOS
    public float calculaTotalIngresso(){
        return (valorIngresso+taxaCartao);
    }
    public void mostraInfo(){
        System.out.println("Numero: "+numero);
        System.out.println("Valor do ingresso: R$"+calculaTotalIngresso());
        System.out.println("Taxa do cartao: R$"+taxaCartao);
        System.out.println("Data e hora de compra: "+dataHoraCompras);
    }

    // CONSTRUTOR
    public Ingresso(float valorIngresso) {
        this.valorIngresso = valorIngresso;
        numberGenerator++;
        numero = numberGenerator;
        this.dataHoraCompras = new Date();
    }
}
