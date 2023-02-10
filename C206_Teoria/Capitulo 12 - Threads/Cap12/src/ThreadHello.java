import java.util.concurrent.TimeUnit;

public class ThreadHello extends Thread{
    String palavra;

    @Override
    public void run() {
        while(true){
            System.out.println(palavra);
            try {
                TimeUnit.SECONDS.sleep(7);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public ThreadHello(String palavra) {
        this.palavra = palavra;
    }
}
