public class Produto {

    // CONSTRUTOR
    Produto(int codigoSerie, String codigoProduto, String nome, String categoria, int quantidade){
        this.codigoSerie = codigoSerie;
        this.codigoProduto = codigoProduto;
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
    }

    // ATRIBUTOS
    int codigoSerie;
    String codigoProduto;
    String nome;
    String categoria;
    int quantidade;

    // METODOS
    void mostraInfo(){
        System.out.println("Codigo de serie: "+codigoSerie);
        System.out.println("Codigo do produto: "+codigoProduto);
        System.out.println("Nome: "+nome);
        System.out.println("Categoria: "+categoria);
        System.out.println("Quantidade: "+quantidade);
    }
}
