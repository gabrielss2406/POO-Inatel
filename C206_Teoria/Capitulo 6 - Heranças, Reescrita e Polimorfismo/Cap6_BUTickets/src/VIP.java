public class VIP extends Ingresso{
    // ATRIBUTOS
    protected String tamanhoAbada;

    // METODOS
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Tamanho do abada: "+tamanhoAbada);
    }

    // CONSTRUTOR
    public VIP(float valorIngresso, String tamanhoAbada) {
        super(valorIngresso);
        this.tamanhoAbada = tamanhoAbada;
    }
}
