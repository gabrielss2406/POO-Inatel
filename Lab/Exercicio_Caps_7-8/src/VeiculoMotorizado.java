public abstract class VeiculoMotorizado {
    // ATRIBUTOS
    private int potencia;
    private String cor;
    private int velocidadeAtual;

    // METODOS
    public void acelerar(){
        velocidadeAtual += (potencia/10);
        System.out.println("Acelerou "+(potencia/10)+" km/h. Agora está com "+velocidadeAtual+" km/h.");
    }

    // CONSTRUTOR
    public VeiculoMotorizado(int potencia, String cor, int velocidadeAtual) {
        this.potencia = potencia;
        this.cor = cor;
        this.velocidadeAtual = velocidadeAtual;
    }
}
