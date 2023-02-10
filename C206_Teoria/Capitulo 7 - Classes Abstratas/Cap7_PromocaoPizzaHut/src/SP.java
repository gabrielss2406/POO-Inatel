public class SP extends Unidade{
    @Override
    public void mostraPizzas() {
        System.out.println("UNIDADE DE SP");
        super.mostraPizzas();
        System.out.println();
    }
    // CONSTRUTOR
    public SP(String endereco, String nomeResponsavel) {
        super(endereco, nomeResponsavel);
        pizzas[0] = new Pepperoni(15);
        pizzas[1] = new Supreme(25);
        pizzas[2] = new Brasileira(20);
    }
}
