public class BH extends Unidade{
    @Override
    public void mostraPizzas() {
        System.out.println("UNIDADE DE BH");
        super.mostraPizzas();
        System.out.println();
    }

    // CONSTRUTOR
    public BH(String endereco, String nomeResponsavel) {
        super(endereco, nomeResponsavel);
        pizzas[0] = new Pepperoni(15);
        pizzas[1] = new Supreme(25);
    }
}
