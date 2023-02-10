public class Animal {
    // ATRIBUTOS
    protected String nome;
    protected int nPatas;
    protected String cor;

    // METODOS
    public void fazBarulho(){
        System.out.println("Silencio.");
    }

    // CONSTRUTOR
    public Animal(String nome, int nPatas, String cor) {
        this.nome = nome;
        this.nPatas = nPatas;
        this.cor = cor;
    }
}
