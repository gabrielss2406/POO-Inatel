public class Main {
    public static void main(String[] args) {
        Produto n = new Notebook("Acer",1400,128, "Intel HD Graphics", "I3 10º");
        Produto c = new Camiseta("Camiseta", 1800, "Branco", "GG");

        System.out.println(n.etiquetaPreco());
        System.out.println("\n"+c.etiquetaPreco());
    }
}