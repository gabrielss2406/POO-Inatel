public class Kids extends VIP{
    // ATRIBUTOS
    private String docResponsavel;

    // METODOS
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Documento do responsavel: "+docResponsavel);
    }
    @Override
    public float calculaTotalIngresso(){
        return ((valorIngresso/2)+taxaCartao);
    }

    // CONSTRUTOR
    public Kids(float valorIngresso, String tamanhoAbada, String docResponsavel) {
        super(valorIngresso, tamanhoAbada);
        this.docResponsavel = docResponsavel;
    }

}
