import java.util.Scanner;

/*Cap2 - Variáveis Primitivas e Controle de Fluxo
  Data: 28/07/2022 */
public class ClassePrincipal {
    public static void main(String[] args) {
        // COMENTARIOS (// /* /**), /** -> javaDoc
        // Variáveis, primitivas(int,float,char), classe(string)

        int idade_=19;
        byte idade=0;
        String nome="Gabriel";
        System.out.println(nome);
        System.out.println(nome.toUpperCase());
        System.out.println(nome.length());
        System.out.println(nome.replace("abrie","a"));
        idade = (byte) idade_;
        System.out.println(idade);

        Scanner leitor = new Scanner(System.in);
        idade_ = leitor.nextInt();
        leitor.nextLine();
        nome = leitor.nextLine();
        System.out.println(idade_+" anos de "+nome);
        System.out.println("=======Exercicio GoRangers=======");

        // Exercicio GoRangers
        int primeiroAno,segundoAno,terceiroAno; // variaveis qnt de inimigos derrotados
        int somaAnos; // Soma total qnt inimigos

        Scanner teclado = new Scanner(System.in);

        primeiroAno = teclado.nextInt();
        segundoAno = teclado.nextInt();
        terceiroAno = teclado.nextInt();
        somaAnos = primeiroAno+segundoAno+terceiroAno;

        System.out.printf("Inimigos derrotados:\nAno 1: %d.\nAno2: %d.\nAno3: %d.\n",primeiroAno,segundoAno,terceiroAno);
        System.out.printf("Nos últimos 3 anos, %d inimigos foram derrotados.",somaAnos);

        if (primeiroAno>10)
            System.out.println("Muitas apreensões no primeiro ano");
        else
            System.out.println("Poucas apreensões no primeiro ano");

    }
}