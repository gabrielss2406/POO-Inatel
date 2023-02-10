public class Processador {
    // ATRIBUTOS
    private String marca;
    private float frequenciaProcessamento;

    // CONSTRUTOR
    public Processador(String marca, float frequenciaProcessamento) {
        this.marca = marca;
        this.frequenciaProcessamento = frequenciaProcessamento;
    }

    // GETTERS / SETTERS
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public float getFrequenciaProcessamento() {
        return frequenciaProcessamento;
    }
    public void setFrequenciaProcessamento(float frequenciaProcessamento) {
        this.frequenciaProcessamento = frequenciaProcessamento;
    }
}
