public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Jair", 2412541);

        Conta co1 = new Conta(20, c1);

        co1.deposita(100);
        co1.saca(10);
        co1.extrato();
    }
}