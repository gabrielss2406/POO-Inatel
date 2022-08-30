public class Conta {
    // ATRIBUTOS
    private static int qtdClientes=0;
    private double saldo;
    public Cliente cliente;

    // METODOS
    public void deposita(double valor){
        this.saldo+=valor;
        System.out.println("Depositou R$"+valor+", a conta agora tem R$"+this.saldo);
    }
    public void saca(double valor){
        this.saldo-=valor;
        System.out.println("Sacou R$"+valor+", a conta agora tem R$"+this.saldo);
    }
    public void extrato(){
        System.out.println("Titular da conta: "+cliente.getNome());
        System.out.println("CPF do titular: "+cliente.getCpf());
        System.out.println("Saldo atual: "+this.saldo);
    }

    // CONSTRUTOR
    public Conta(double saldo, Cliente cliente) {
        qtdClientes++;
        this.saldo = saldo;
        this.cliente = cliente;
    }
}
