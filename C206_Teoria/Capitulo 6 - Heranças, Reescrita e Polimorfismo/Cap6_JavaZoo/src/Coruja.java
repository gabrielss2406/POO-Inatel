public class Coruja extends Animal{
    // ATRIBUTOS
    private int alturaVoo;

    // METODOS
    @Override
    public void fazBarulho(){
        System.out.println("Pruuu");
    }

    // CONSTRUTOR
    public Coruja(String nome, int nPatas, String cor, int alturaVoo) {
        super(nome, nPatas, cor);
        this.alturaVoo = alturaVoo;
    }

    // GETTERS E SETTERS
    public int getAlturaVoo() {
        return alturaVoo;
    }
}
