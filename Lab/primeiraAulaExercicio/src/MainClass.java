import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        int idade,cpf,titulo; // Variaveis idade, cpf, e titulo de eleitor (1-tem, 0-nao tem)
        String nome;

        Scanner leitor = new Scanner(System.in);
        System.out.print("Nome:");
        nome = leitor.nextLine();
        System.out.print("Idade:");
        idade = leitor.nextInt();
        System.out.print("Cpf:");
        cpf = leitor.nextInt();
        System.out.print("Tem titulo (0-nao, 1-sim):");
        titulo = leitor.nextInt();

        System.out.print(nome);
        if (titulo==1 && cpf!=0 && idade>=16)
            System.out.println(" pode votar.");
    }
}
