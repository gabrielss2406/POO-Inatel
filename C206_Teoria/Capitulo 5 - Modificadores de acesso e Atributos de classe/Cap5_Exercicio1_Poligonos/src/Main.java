import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nLados, cLados;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Numero de lados: ");
        nLados = entrada.nextInt();
        System.out.print("Comprimento dos lados: ");
        cLados = entrada.nextInt();

        PoligonoRegular pr = new PoligonoRegular();

        pr.calculaArea(nLados,cLados);
        System.out.println("Area: "+pr.getAreaPoligono());
    }
}
