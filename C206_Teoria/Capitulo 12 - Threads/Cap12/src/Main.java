public class Main {
    public static void main(String[] args) {
        ThreadHello tHello1 = new ThreadHello("Olá");
        ThreadHello tHello2 = new ThreadHello("Hello");
        ThreadHello tHello3 = new ThreadHello("Hallo");
        ThreadHello tHello4 = new ThreadHello("Ciao");

        tHello1.start();
        tHello2.start();
        tHello3.start();
        tHello4.start();
    }
}
