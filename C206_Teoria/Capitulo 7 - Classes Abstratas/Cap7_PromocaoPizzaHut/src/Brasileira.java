public class Brasileira extends Pizza{
    // METODOS
    @Override
    public void mostraIngredientes() {
        System.out.println("Ingredientes: Mussarela, Requeijao, Presunto e Azeitona.");
    }
    @Override
    public void mostraBrinde() {
        System.out.println("Brinde: Chaveiro.");
    }

    // CONSTRUTOR
    public Brasileira(float preco) {
        super(preco);
    }
}
