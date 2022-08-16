public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("RP","Riot Points","Riot",22.90);
        Produto p2 = new Produto("Poeira Estelar","Barganhas da Paimon","Genshin",160);

        Produto[] produtos = new Produto[2];
        produtos[0] = p1;
        produtos[1] = p2;

        Carrinho carrinho = new Carrinho(produtos);
        carrinho.exibirInfos();
    }
}
