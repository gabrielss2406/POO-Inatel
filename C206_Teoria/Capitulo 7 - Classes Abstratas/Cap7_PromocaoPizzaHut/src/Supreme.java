public class Supreme extends Pizza{
    // METODOS
    @Override
    public void mostraIngredientes() {
        System.out.println("Ingredientes: Mussarela, Cebola, Pimentao e Azeitona.");
    }
    @Override
    public void mostraBrinde() {
        System.out.println("Brinde: Caneca.");
    }

    // CONSTRUTOR
    public Supreme(float preco) {
        super(preco);
    }
}
