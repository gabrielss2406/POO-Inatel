public class RJ extends Unidade{
    @Override
    public void mostraPizzas() {
        System.out.println("UNIDADE DO RJ\n=================================");
        super.mostraPizzas();
        System.out.println();
    }
    // CONSTRUTOR
    public RJ(String endereco, String nomeResponsavel) {
        super(endereco, nomeResponsavel);
        pizzas[0] = new Pepperoni(15);
        pizzas[1] = new Brasileira(20);
    }
}
