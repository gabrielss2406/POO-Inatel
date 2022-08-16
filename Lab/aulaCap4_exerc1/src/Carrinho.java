public class Carrinho {
    // ATRIBUTOS
    double total;
    Produto[] produtos;

    // METODOS
    void exibirInfos(){
        System.out.println("Valor total: "+this.total);
        for (int i=0; i<produtos.length; i++)
            System.out.println(i+" -> "+produtos[i].nome+": "+produtos[i].preco+"\n"+produtos[i].descricao+" -> "+produtos[i].fabricante);
    }
    double calculaTotal(Produto[] produtos){
        double soma = 0;
        for (Produto produto : produtos)
            soma += produto.preco;
        return soma;
    }

    // CONSTRUTOR
    Carrinho(Produto[] produtos){
        this.total = calculaTotal(produtos);
        this.produtos = produtos;
    }
}
