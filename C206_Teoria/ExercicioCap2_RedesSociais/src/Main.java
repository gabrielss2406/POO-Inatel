public class Main {
    public static void main(String[] args) {
        // User 1
        RedeSocial[] r1 = new RedeSocial[2];
        r1[0] = new Facebook("senha123", 145);
        r1[1] = new Twitter("senha123321", 222);
        Usuario u1 = new Usuario("__gabriel.siqueira__", "gabrielss2406@gmail.com", r1);

        System.out.println("Usuario: "+u1.getNome());
        System.out.println("Email: "+u1.getEmail());

        // Funções rede social 1
        u1.getRedeSocials()[0].postarFoto();
        u1.getRedeSocials()[0].postarComentario();
        ((Facebook)u1.getRedeSocials()[0]).fazStreaming();
        // Funções rede social 2
        u1.getRedeSocials()[1].postarVideo();
        ((Twitter)u1.getRedeSocials()[1]).compartilhar();
        u1.getRedeSocials()[1].curtirPublicacao();
    }
}
