public class Main {
    public static void main(String[] args) {
        ThreadTempo tTempo = new ThreadTempo(5);
        ThreadFatorial tFatorial = new ThreadFatorial(4);
        ThreadHexagono tHexagono = new ThreadHexagono(2);

        tTempo.start();
        tFatorial.start();
        tHexagono.start();
    }
}
