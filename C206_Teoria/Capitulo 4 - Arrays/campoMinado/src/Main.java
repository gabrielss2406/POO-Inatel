import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dimensao = 3;
        int x;
        int y;
        int i=0; //contador
        int linha, coluna; //linha e coluna da bomba
        boolean[][] matriz = new boolean[dimensao][dimensao];

        Random randomGenerator = new Random();

        linha = randomGenerator.nextInt(dimensao);
        coluna = randomGenerator.nextInt(dimensao);

        matriz[linha][coluna] = true;

        Scanner entrada = new Scanner(System.in);

        System.out.println("xxxx CAMPO MINADO ("+dimensao+"x"+dimensao+") xxxx");
        do{
            System.out.println("Matriz para chutar:");
            x = entrada.nextInt();
            y = entrada.nextInt();

            if (matriz[x-1][y-1]) {
                System.out.println("BOOOOM! GAME OVER! :(");
                break;
            }else {
                System.out.println("Muito bom!");
                matriz[x-1][y-1] = true;
                i++;
            }
        } while(i<(dimensao*dimensao)-1);

        if(i == (dimensao*dimensao)-1)
            System.out.println("Parabéns você ZEROU o jogo!");

        System.out.println("Total de pontos: "+i);
    }
}
