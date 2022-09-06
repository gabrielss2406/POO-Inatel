public class Produto {
    // ATRIBUTOS
    private String nome;
    private double preco;

    // METODOS
    public String etiquetaPreco(){
        String etiqueta = "Nome: "+nome+"\nPreco: "+preco;
        return etiqueta;
    }

    // CONSTRUTOR
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}
