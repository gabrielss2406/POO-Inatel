import java.util.List;

public class Cliente {
    // ATRIBUTOS
    public String nome;
    public long cpf;
    public Computador[] computadores;

    // METODOS
    float calculaTotalCompra(){
        float soma = 0;
        for (Computador computador : computadores)
            soma += computador.preco;

        return soma;
    }
    void emitirNota(){
        System.out.println("\n====================================");
        System.out.println("          Nota das Compras          ");
        System.out.println("====================================");
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);

        System.out.println("------------------------------------\nCOMPRAS: ");

        for (int i=0; i<computadores.length; i++){
            System.out.println("\nComputador "+(i+1));
            computadores[i].mostraPCConfigs();
        }
        System.out.println("\n------------------------------------\nTotal Compras: R$"+calculaTotalCompra());
    }

    // CONSTRUTOR
    Cliente(String nome, long cpf, List<Computador> compras){
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = new Computador[compras.size()];

        for(int i = 0; i < compras.size(); i++)
            this.computadores[i] = compras.get(i);
    }
}
