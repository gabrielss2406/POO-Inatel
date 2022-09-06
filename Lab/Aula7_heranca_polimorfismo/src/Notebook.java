public class Notebook extends Produto{
    // ATRIBUTOS
    private double armazenamento;
    private String gpu;
    private String processador;

    // METODOS
    @Override
    public String etiquetaPreco(){
        String etiqueta = super.etiquetaPreco()+"\nArmazenamento: "+armazenamento+"\nGPU: "+gpu+"\nProcessador: "+processador;
        return etiqueta;
    }

    // CONSTRUTOR
    public Notebook(String nome, double preco, double armazenamento, String gpu, String processador) {
        super(nome, preco);
        this.armazenamento = armazenamento;
        this.gpu = gpu;
        this.processador = processador;
    }
}
