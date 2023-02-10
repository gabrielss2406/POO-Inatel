public class Main {
    public static void main(String[] args) {
        Ingresso i1 = new Camarote(134f, "G");
        Ingresso i2 = new VIP(98f, "M");
        Ingresso i3 = new Kids(100f, "PP", "123345");

        CarrinhoDeCompras c = new CarrinhoDeCompras("Gabriel Siqueira", i1);
        c.addIngresso(i2);
        c.addIngresso(i3);

        c.mostraDetalhesCompras();
    }
}
