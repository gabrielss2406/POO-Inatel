import java.util.Random;
import java.util.Scanner;

// Cap 2 - Exercicio CanYouGuessTheNumber
public class MainClass {
    public static void main(String[] args) {
        int numRandom;
        int numTentado;
        int contador=0;
        Random randomGenerator = new Random();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Tente acertar os numero entre 1 e 10:");

        numRandom = randomGenerator.nextInt(10)+1;
        do {
            numTentado = leitor.nextInt();
            contador++;
        } while(numRandom != numTentado);

        System.out.println("PARABENS!!!\nVoce acertou o numero na "+contador+" tentativa.");
    }
}
