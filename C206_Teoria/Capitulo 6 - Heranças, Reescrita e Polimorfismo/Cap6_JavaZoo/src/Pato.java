public class Pato extends Animal{
    // ATRIBUTOS
    private float tamanhoBico;

    // METODOS
    @Override
    public void fazBarulho(){
        System.out.println("QuackQuack");
    }

    // CONSTRUTOR
    public Pato(String nome, int nPatas, String cor, float tamanhoBico) {
        super(nome, nPatas, cor);
        this.tamanhoBico = tamanhoBico;
    }

    // GETTERS E SETTERS
    public float getTamanhoBico() {
        return tamanhoBico;
    }
}
