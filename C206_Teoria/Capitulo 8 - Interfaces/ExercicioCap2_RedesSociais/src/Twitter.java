public class Twitter extends RedeSocial implements Compartilhamento{

    // METODOS
    @Override
    public void compartilhar() {
        System.out.print("Compartilhou uma publicacao no Twitter");
    }
    @Override
    public void postarFoto() {
        System.out.print("Postou uma foto no Twitter");
    }
    @Override
    public void postarVideo() {
        System.out.print("Postou um video no Twitter");
    }
    @Override
    public void postarComentario() {
        System.out.print("Postou um comentario no Twitter");
    }

    // CONSTRUTOR
    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }
}
