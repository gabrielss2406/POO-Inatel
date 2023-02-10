public class Camarote extends Ingresso{
    // ATRIBUTOS
    private String tamanhoCamiseta;

    // METODOS
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Tamanho Camiseta: "+tamanhoCamiseta);
    }

    // CONSTRUTOR
    public Camarote(float valorIngresso, String tamanhoCamiseta) {
        super(valorIngresso);
        this.tamanhoCamiseta = tamanhoCamiseta;
    }
}
