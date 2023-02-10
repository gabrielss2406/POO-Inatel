public class Main {
    public static void main(String[] args) {
        // User 1
        RedeSocial[] r1 = new RedeSocial[2];
        r1[0] = new Facebook("senha123", 145);
        r1[1] = new Twitter("senha123321", 222);
        Usuario u1 = new Usuario("__gabriel.siqueira__", "gabrielzs2406@gmail.com", r1);


    }
}
