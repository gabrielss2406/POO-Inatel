public class Main {
    public static void main(String[] args) {
        VeiculoMotorizado carro = new Carro(120, "Roxo fosco", 20, 4);
        VeiculoMotorizado moto = new Moto(80, "Ciano", 26, 80);
        Bicicleta bicicleta = new Bicicleta(6);

        carro.acelerar();
        moto.acelerar();
        ((Moto) moto).empinar();
        bicicleta.empinar();
    }
}