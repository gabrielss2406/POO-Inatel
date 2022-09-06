public class Camiseta extends Produto{
    // ATRIBUTOS
    private String cor;
    private String tamanho;

    // METODOS
    @Override
    public String etiquetaPreco(){
        String etiqueta = super.etiquetaPreco()+"\nCor: "+cor+"\nTamanho: "+tamanho;
        return etiqueta;
    }

    // CONSTRUTOR
    public Camiseta(String nome, double preco, String cor, String tamanho) {
        super(nome, preco);
        this.cor = cor;
        this.tamanho = tamanho;
    }
}
