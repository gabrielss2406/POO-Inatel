public class Main {
    public static void main(String[] args) {
        Moeda m1 = new Moeda(13.5f);
        Moeda m2 = new Moeda(15);
        Moeda m3 = new Moeda(10.8f);
        Moeda m4 = new Moeda(13);
        Moeda m5 = new Moeda(11.2f);

        Cofrinho cofre = new Cofrinho();
        cofre.addMoeda(m1);
        cofre.addMoeda(m2);
        cofre.addMoeda(m3);
        cofre.addMoeda(m4);
        cofre.addMoeda(m5);

        System.out.println(cofre.getValorTotal());
        System.out.println(cofre.getQuantMoedas());
        System.out.println(cofre.getMoedaMaiorValor());
        cofre.ordenaMoedas();
    }
}
