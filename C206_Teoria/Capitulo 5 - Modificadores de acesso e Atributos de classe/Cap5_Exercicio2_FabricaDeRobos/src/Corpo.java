public class Corpo {
    // ATRIBUTOS
    private String tipo;
    private String cor;

    // CONSTRUTOR
    public Corpo(String tipo, String cor) {
        this.tipo = tipo;
        this.cor = cor;
    }

    // GETTERS / SETTERS
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
