public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto(2,"FR#25","Destino Entrelaçado", "Genshin", 10);
        Produto p2 = new Produto(43,"OI#43","Riot Points", "League of Legends", 1390);

        p1.mostraInfo();
        System.out.println();
        p2.mostraInfo();
    }
}
