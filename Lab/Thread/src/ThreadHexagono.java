import com.sun.webkit.ThemeClient;

import static java.lang.Math.sqrt;

public class ThreadHexagono extends Thread {

    private int s;
    private double result;

    @Override
    public void run() {
        result = ((3*sqrt(3)*s*s)/2);

        System.out.println("Area hexagono: "+result);
    }

    public ThreadHexagono(int s) {
        this.s = s;
    }
}
