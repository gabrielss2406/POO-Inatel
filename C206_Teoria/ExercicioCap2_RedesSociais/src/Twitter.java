public class Twitter extends RedeSocial implements Compartilhamento{

    // METODOS
    @Override
    public void compartilhar() {
        System.out.println("Compartilhou uma publicacao no Twitter");
    }
    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
        System.out.println("Twitter");
    }
    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Twitter");
    }
    @Override
    public void postarVideo() {
        System.out.println("Postou um video no Twitter");
    }
    @Override
    public void postarComentario() {
        System.out.println("Postou um comentario no Twitter");
    }

    // CONSTRUTOR
    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }
}
