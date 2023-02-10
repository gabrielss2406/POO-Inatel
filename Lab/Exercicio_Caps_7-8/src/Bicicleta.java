public class Bicicleta implements Manobras{
    // ATRIBUTOS
    private int numeroDeMarchas;

    // METODOS
    @Override
    public void empinar() {
        System.out.println("Empinou a bicicleta.");
    }

    // CONSTRUTOR
    public Bicicleta(int numeroDeMarchas) {
        this.numeroDeMarchas = numeroDeMarchas;
    }
}
