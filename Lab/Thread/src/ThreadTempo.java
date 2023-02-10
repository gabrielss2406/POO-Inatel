import java.util.concurrent.TimeUnit;

public class ThreadTempo extends Thread{

    private int tempoTotal;

    @Override
    public void run() {
        for (int i = 0; i < tempoTotal; i++) {
            System.out.println("Segundos: "+i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public ThreadTempo(int tempoTotal) {
        this.tempoTotal = tempoTotal;
    }
}
