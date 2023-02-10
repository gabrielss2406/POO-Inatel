public class Main {
    public static void main(String[] args) {
        // Criando Piloto
        Piloto p1 = new Piloto("Que Mario", true);
        // Criando Kart
        Kart k1 = new Kart("Egg1", "150cc", 150, p1);

        // Testando metodos
        k1.pular();
        p1.soltaSuperPoder();
        k1.soltarTurbo();
        k1.fazerDrift();
    }
}
