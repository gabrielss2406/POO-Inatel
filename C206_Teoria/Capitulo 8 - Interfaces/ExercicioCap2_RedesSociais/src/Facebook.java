public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento{

    // METODOS
    @Override
    public void compartilhar() {
        System.out.print("Compartilhou uma publicacao no Facebook");
    }
    @Override
    public void fazStreaming() {
        System.out.print("Realizou uma vídeo conferência no Facebook");
    }
    @Override
    public void postarFoto() {
        System.out.print("Postou uma foto no Facebook");
    }
    @Override
    public void postarVideo() {
        System.out.print("Postou um video no Facebook");
    }
    @Override
    public void postarComentario() {
        System.out.print("Postou um comentario no Facebook");
    }

    // CONSTRUTOR
    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }
}
