public abstract class Pizza {
    // ATRIBUTOS
    protected float preco;

    // METODOS
    public abstract void mostraIngredientes();
    public abstract void mostraBrinde();

    // CONSTRUTOR
    public Pizza(float preco) {
        this.preco = preco;
    }
}
