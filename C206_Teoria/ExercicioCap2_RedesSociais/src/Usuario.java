public class Usuario {
    // ATRIBUTOS
    private String nome;
    private String email;
    private RedeSocial[] redeSocials = new RedeSocial[4];

    // CONSTRUTOR
    public Usuario(String nome, String email, RedeSocial[] redeSocials) {
        this.nome = nome;
        this.email = email;
        this.redeSocials = redeSocials;
    }

    // GET/SET
    public RedeSocial[] getRedeSocials() {
        return redeSocials;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
}
