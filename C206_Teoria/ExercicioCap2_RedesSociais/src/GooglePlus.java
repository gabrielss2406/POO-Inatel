public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento{

    // METODOS
    @Override
    public void compartilhar() {
        System.out.println("Compartilhou uma publicacao no Google Plus");
    }
    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
        System.out.println("Google Plus");
    }
    @Override
    public void fazStreaming() {
        System.out.println("Realizou uma video conferencia no Google Plus");
    }
    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Google Plus");
    }
    @Override
    public void postarVideo() {
        System.out.println("Postou um video no Google Plus");
    }
    @Override
    public void postarComentario() {
        System.out.println("Postou um comentario no Google Plus");
    }

    // CONSTRUTOR
    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }
}
