public class Main {
    public static void main(String[] args) {
        Unidade u1 = new BH("Rua da pqp", "Gabriel");
        Unidade u2 = new RJ("Rua da vsf", "Gabriel dnv");
        Unidade u3 = new SP("Rua da fds", "Gabriel dnv dnv");

        u1.mostraPizzas();
        u2.mostraPizzas();
        u3.mostraPizzas();
    }
}