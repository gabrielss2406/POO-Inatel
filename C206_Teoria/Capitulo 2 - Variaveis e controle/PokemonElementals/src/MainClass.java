import java.util.Scanner;

/* Cap2 - Exercicio PokemonElementals */
public class MainClass {
    public static void main(String[] args) {
        String tipo="";

        Scanner leitor = new Scanner(System.in);
        tipo = leitor.nextLine();

        switch (tipo){
            case "fogo":
                System.out.println(tipo+" tem fraqueza a agua.");
                break;
            case "agua":
                System.out.println(tipo+" tem fraqueza a eletricidade.");
                break;
            case "eletricidade":
                System.out.println(tipo+" tem fraqueza a pedra.");
                break;
            case "pedra":
                System.out.println(tipo+" tem fraqueza a gelo.");
                break;
            case "gelo":
                System.out.println(tipo+" tem fraqueza a fogo.");
                break;
            case "planta":
                System.out.println(tipo+" tem fraqueza a fogo.");
                break;
            default:
                System.out.println(tipo+" nao representa um tipo conhecido.");
        }
    }
}
