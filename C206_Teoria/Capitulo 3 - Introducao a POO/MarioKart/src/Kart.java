public class Kart {
    // Construtor
    Kart(String nome, String cilindradas, float velocidadeMaxima, Piloto piloto) {
        this.nome = nome;
        motor = new Motor(cilindradas, velocidadeMaxima);
        this.piloto = piloto;
    }

    // Atribuitos
    String nome;
    Motor motor;
    Piloto piloto;

    // Metodos
    void pular(){
        System.out.println(piloto.nome+" acabou de pular, o motor de "+motor.cilindradas+" do "+nome+" explodiu!");
    }
    void soltarTurbo(){
        System.out.println(piloto.nome+" saltou o turbo do "+nome+", rumo a "+motor.velocidadeMaxima);
    }
    void fazerDrift(){
        System.out.println(piloto.nome+" fazendo o drift!");
    }
}
