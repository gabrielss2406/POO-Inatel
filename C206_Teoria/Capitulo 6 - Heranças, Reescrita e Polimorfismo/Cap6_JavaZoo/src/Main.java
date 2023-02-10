public class Main {
    public static void main(String[] args) {
        Animal[] animais = new Animal[10];

        Animal coruja = new Coruja("George", 2, "Branca", 15);
        Animal peixe = new Peixe("Alfredo", 2, "Azul", 12);
        Animal leao = new Leao("Juvanir", 2, "Amarelo", 20);
        Animal pato = new Pato("Cleyson", 2, "Cinza", 26);

        animais[0] = coruja;
        animais[1] = peixe;
        animais[2] = leao;
        animais[3] = pato;

        coruja.fazBarulho();
        peixe.fazBarulho();
        leao.fazBarulho();
        pato.fazBarulho();

        Zoologico z = new Zoologico("Zoo", "Rua Bairro", animais);

        z.mostraInfo();
    }
}
