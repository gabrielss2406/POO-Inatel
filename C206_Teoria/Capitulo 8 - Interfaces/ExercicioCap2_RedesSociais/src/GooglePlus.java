public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento{

    // METODOS
    @Override
    public void compartilhar() {
        System.out.print("Compartilhou uma publicacao no Google Plus");
    }
    @Override
    public void fazStreaming() {
        System.out.print("Realizou uma vídeo conferência no Google Plus");
    }
    @Override
    public void postarFoto() {
        System.out.print("Postou uma foto no Google Plus");
    }
    @Override
    public void postarVideo() {
        System.out.print("Postou um video no Google Plus");
    }
    @Override
    public void postarComentario() {
        System.out.print("Postou um comentario no Google Plus");
    }

    // CONSTRUTOR
    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }
}
