public abstract class RedeSocial {
    // ATRIBUTOS
    protected String senha;
    protected int numAmigos;

    // METODOS
    public abstract void postarFoto();
    public abstract void postarVideo();
    public abstract void postarComentario();
    public void curtirPublicacao(){
        System.out.print("Curtiu uma publicacao no ");
    }

    // CONSTRUTOR
    public RedeSocial(String senha, int numAmigos) {
        this.senha = senha;
        this.numAmigos = numAmigos;
    }
}
