public class Instagram extends RedeSocial{

    // METODOS
    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Instagram");
    }
    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
        System.out.println("Instagram");
    }
    @Override
    public void postarVideo() {
        System.out.println("Postou um video no Instagram");
    }
    @Override
    public void postarComentario() {
        System.out.println("Postou um comentario no Instagram");
    }

    // CONSTRUTOR
    public Instagram(String senha, int numAmigos) {
        super(senha, numAmigos);
    }
}
