public class ThreadFatorial extends Thread{

    private int numberFat;
    private int result;

    @Override
    public void run() {
        result = 1;
        for (int i = numberFat; i > 1; i++) {
            result *= numberFat;
        }
        System.out.println("Fatorial: "+result);
    }

    public ThreadFatorial(int numberFat) {
        this.numberFat = numberFat;
    }
}
