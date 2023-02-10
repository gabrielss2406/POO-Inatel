public class Peixe extends Animal{
    // ATRIBUTOS
    private int nBarbatanas;

    // METODOS
    @Override
    public void fazBarulho(){
        System.out.println("Blub");
    }

    // CONSTRUTOR
    public Peixe(String nome, int nPatas, String cor, int nBarbatanas) {
        super(nome, nPatas, cor);
        this.nBarbatanas = nBarbatanas;
    }

    // GETTERS E SETTERS
    public int getnBarbatanas() {
        return nBarbatanas;
    }
}
