public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("Preto", "Volks", "Gol", 120.6, 52.5, 120, "Motorizado");
        Carro c2 = new Carro("Azul", "Fiat", "Carro", 160, 78.1, 220, "Muito motorizado");

        c1.ligar();
        c1.acelerar();
        c1.mostraInfo();
        System.out.println();
        c2.ligar();
        c2.acelerar();
        c2.mostraInfo();
    }
}
