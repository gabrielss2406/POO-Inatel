public class Instagram extends RedeSocial{

    // METODOS
    @Override
    public void postarFoto() {
        System.out.print("Postou uma foto no Instagram");
    }
    @Override
    public void postarVideo() {
        System.out.print("Postou um video no Instagram");
    }
    @Override
    public void postarComentario() {
        System.out.print("Postou um comentario no Instagram");
    }

    // CONSTRUTOR
    public Instagram(String senha, int numAmigos) {
        super(senha, numAmigos);
    }
}
