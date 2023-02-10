public class Moto extends VeiculoMotorizado implements Manobras{
    // ATRIBUTOS
    private int cilindradas;

    // METODOS
    @Override
    public void empinar() {
        System.out.println("Empinou a moto.");
    }

    // CONSTRUTOR
    public Moto(int potencia, String cor, int velocidadeAtual, int cilindradas) {
        super(potencia, cor, velocidadeAtual);
        this.cilindradas = cilindradas;
    }
}
