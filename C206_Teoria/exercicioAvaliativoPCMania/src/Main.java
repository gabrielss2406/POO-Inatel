import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variaveis --------------------------------------------
        String nome; // Nome do cliente (Entrada)
        long cpf; // Cpf do cliente (Entrada)
        int promocao; // Promocao escolhida para vizualizar
        int exit=0; // Finalizar compra (0-continua, 1-finaliza)
        int comprar; // Indica se compra ou não o produto
        List<Computador> compras = new ArrayList(); // Lista de compras do cliente

        // Informações estáticas ---------------------------------
        // Memorias USB
        MemoriaUSB m1 = new MemoriaUSB("Pen-drive", 16);
        MemoriaUSB m2 = new MemoriaUSB("Pen-drive", 32);
        MemoriaUSB m3 = new MemoriaUSB("HD Externo", 1000); //1Tb

        // Hardwares Basicos
            // Kit1
                String[] nomesHB1 = {"Pentium Core i3","Memoria RAM","HD"};
                int[] tiposHB1 = {1200,4,500};
            // Kit2
                String[] nomesHB2 = {"Pentium Core i5","Memoria RAM","HD"};
                int[] tiposHB2 = {2260,8,1000};
            // Kit3a
                String[] nomesHB3 = {"Pentium Core i7","Memoria RAM","HD"};
                int[] tiposHB3 = {3500,16,2000};

        // Promocoes
            // Promocao 1
            Computador c1 = new Computador("Positivo", 1300, "Linux Ubuntu", 32, nomesHB1, tiposHB1);
            c1.addMemoriaUSB(m1);
            // Promocao 2
            Computador c2 = new Computador("Acer", 1800, "Windows 8", 64, nomesHB2, tiposHB2);
            c2.addMemoriaUSB(m2);
            // Promocao 3
            Computador c3 = new Computador("Vaio", 2800, "Windows 10", 64, nomesHB3, tiposHB3);
            c3.addMemoriaUSB(m3);

        // Interacao com user ---------------------------------------
        Scanner entrada = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("        Bem-vindo a PC Mania        ");
        System.out.println("====================================");
        System.out.println("-> Login <-");
        System.out.print("Nome: ");
        nome = entrada.nextLine();
        System.out.print("CPF: ");
        cpf = entrada.nextLong();

        System.out.println("\nBem-vindo "+nome);

        // Compras
        while(exit==0){
            System.out.println("\n------------------------------------\nPara sair, digite 0. Para ver o carrinho, digite 4.\nPara vizualizar as promocoes, digite o numero correspondente (1 a 3).");
            promocao = entrada.nextInt();

            switch (promocao) { // Consultas
                case 0: // Sai do programa
                    exit=1;
                    break;
                case 1: // Mostra pc1
                    c1.mostraPCConfigs();
                    break;
                case 2: // Mostra pc2
                    c2.mostraPCConfigs();
                    break;
                case 3: // Mostra pc3
                    c3.mostraPCConfigs();
                    break;
                case 4: // Carrinho
                    System.out.println("CARRINHO:");
                    for (Computador compra : compras) System.out.println("Computador da marca: "+compra.marca);
                    break;
                default: // Caso de erro
                    System.out.println("ERRO!!!! Promocao "+promocao + " nao e uma promocao cadastrada.");
            }
            if(exit==1) break; // Quebra o while, parando a compra

            if(promocao==1 || promocao==2 || promocao==3) { // Tratamento do caso de erro do switch (default)
                System.out.print("\nDeseja comprar? (1-sim, 0-nao):");
                comprar = entrada.nextInt();
            } else comprar = 0;

            if(comprar==1){ // Computando compra
                System.out.println("Promocao "+promocao+" adicionada ao carrinho.");
                switch (promocao) {
                    case 1 -> compras.add(c1);
                    case 2 -> compras.add(c2);
                    case 3 -> compras.add(c3);
                }
            }

            System.out.print("Se deseja continuar comprando digite 0, caso queira parar digite 1:");
            exit = entrada.nextInt();
        }

        // Registro e final ------------------------------------------
        Cliente cliente = new Cliente(nome,cpf,compras); // Registrando todas as compras e o cliente
        cliente.emitirNota(); // Emitindo nota final
    }
}
