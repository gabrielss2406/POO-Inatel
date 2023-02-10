public class Conta {
    // ATRIBUTOS
    private int numero;
    private float saldo;
    private String proprietario;

    // METODOS
    public void saca(float quantia){
        if(quantia<=saldo)
            saldo -= quantia;
        else
            System.out.println("Saldo insuficiente!!!");

        System.out.println("Saldo atual: R$"+saldo);
    }

    // CONSTRUTOR
    public Conta(int numero, float saldo, String proprietario) {
        this.numero = numero;
        this.saldo = saldo;
        this.proprietario = proprietario;
    }

    // GETTERS / SETTERS
    public float getSaldo() {
        return saldo;
    }
}
