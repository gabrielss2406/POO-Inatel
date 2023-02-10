public class Leao extends Animal{
    // ATRIBUTOS
    private float tamanhoJuba;

    // METODOS
    @Override
    public void fazBarulho(){
        System.out.println("Uaauaaa");
    }
    // CONSTRUTOR
    public Leao(String nome, int nPatas, String cor, float tamanhoJuba) {
        super(nome, nPatas, cor);
        this.tamanhoJuba = tamanhoJuba;
    }

    // GETTERS E SETTERS
    public float getTamanhoJuba() {
        return tamanhoJuba;
    }
}
