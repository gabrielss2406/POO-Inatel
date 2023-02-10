public class Main {
    public static void main(String[] args) {
        Musico m1 = new Musico("Aurio Augusto", "Vocalista");
        Musico m2 = new Musico("Harley Teixeira", "Guitarrista");
        Musico m3 = new Musico("Eduardoles", "Baterista");
        Musico m4 = new Musico("Filipinho", "Triangulo");
        Musico[] musicos = new Musico[4];
        musicos[0] = m1;
        musicos[1] = m2;
        musicos[2] = m3;
        musicos[3] = m4;

        //Empresario e = new Empresario(574854477, "Maria Augusta");

        String[] nomeMusicas = {"Machismo é o programa", "Aurio Otavio, o heroi","jdbhs"};
        int[] tempo = {3,10};

        Banda b = new Banda("Aurio e amigos", "Babymetal", musicos, nomeMusicas, tempo);
        b.mostraInfosBanda();
    }
}
