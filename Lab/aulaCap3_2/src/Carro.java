public class Carro {

    // CONSTRUTOR
    Carro(String cor, String marca, String modelo, double velocidadeMaxima, double velocidadeAtual, int potencia, String tipo){
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = velocidadeAtual;
        this.motor.potencia = potencia;
        this.motor.tipo = tipo;
    }

    // ATRIBUTOS
    String cor;
    String marca;
    String modelo;
    double velocidadeMaxima;
    double velocidadeAtual;
    Motor motor = new Motor();

    // METODOS
    void ligar(){
        System.out.println("Ligou! O motor do "+modelo+" esta a todo vapor.");
    }
    void acelerar(){
        System.out.println("Acelerou! Velocidade Atual: "+velocidadeAtual);
    }
    void mostraInfo(){
        System.out.println("Cor: "+cor);
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Velocidade maxima: "+velocidadeMaxima);
        System.out.println("Velocidade atual: "+velocidadeAtual);
        System.out.println("Potencia do motor: "+motor.potencia);
        System.out.println("Tipo do motor: "+motor.tipo);
    }
}
