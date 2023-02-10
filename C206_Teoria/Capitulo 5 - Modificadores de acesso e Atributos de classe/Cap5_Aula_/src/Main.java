public class Main {
    public static void main(String[] args) {
        Conta c = new Conta(324,1104.1f,"Gabriel");
        System.out.println("Saldo inicial: R$"+c.getSaldo());
        c.saca(500f);
    }
}