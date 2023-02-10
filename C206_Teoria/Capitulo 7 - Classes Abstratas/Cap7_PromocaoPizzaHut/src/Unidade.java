public abstract class Unidade {
    // ATRIBUTOS
    protected String endereco;
    protected String nomeResponsavel;
    protected Pizza[] pizzas = new Pizza[3];

    // METODOS
    public void mostraPizzas() {
        System.out.println("Endereco: "+endereco);
        System.out.println("Responsavel: "+nomeResponsavel);
        System.out.println("=== PIZZAS ===");
        for (Pizza pizza : pizzas) {
            if (pizza == null)
                break;
            else {
                if(pizza instanceof Brasileira)
                    System.out.println("=> Pizza Brasileira");
                else if(pizza instanceof Supreme)
                    System.out.println("=> Pizza Supreme");
                else if(pizza instanceof Pepperoni)
                    System.out.println("=> Pizza Pepperoni");
                pizza.mostraIngredientes();
                pizza.mostraBrinde();
            }
            System.out.println("Preco: R$"+pizza.preco);
        }
    }

    // CONSTRUTOR
    public Unidade(String endereco, String nomeResponsavel) {
        this.endereco = endereco;
        this.nomeResponsavel = nomeResponsavel;
    }
}
