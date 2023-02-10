public class Carro extends VeiculoMotorizado{
    // ATRIBUTOS
    private int numeroDePortas;

    // CONSTRUTOR
    public Carro(int potencia, String cor, int velocidadeAtual, int numeroDePortas) {
        super(potencia, cor, velocidadeAtual);
        this.numeroDePortas = numeroDePortas;
    }
}
