public class Pepperoni extends Pizza{
    // METODOS
    @Override
    public void mostraIngredientes() {
        System.out.println("Ingredientes: Pepperoni e Mussarela.");
    }
    @Override
    public void mostraBrinde() {
        System.out.println("Brinde: Caneta.");
    }

    // CONSTRUTOR
    public Pepperoni(float preco) {
        super(preco);
    }
}
