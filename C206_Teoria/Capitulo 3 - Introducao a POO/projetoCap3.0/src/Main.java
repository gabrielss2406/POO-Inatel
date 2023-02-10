// Cap 3 - Introdução à orientação a objetos
public class Main {
    public static void main(String[] args) {
        // Para se cria um objeto dentro da memoria usa new
        // Para acessar cria um ponteiro

        /*People p1 = new People();
        p1.nome = "Gabriel";
        p1.idade = 19;
        p1.cpf = "020.265.324-97";

        People p2 = new People();
        p2.nome = "Rose";
        p2.idade = 50;
        p2.cpf = "123.456.789-10";

        p1.come();
        p2.tomaAgua();
        p1.tomaAgua();
        p2.dorme();*/

        AnimalPet animal1 = new AnimalPet();
        AnimalPet animal2 = new AnimalPet();

        animal1.nome = "Teemo";
        animal1.especie = "Yordle";
        animal1.som = "Rebolando";
        animal1.comida = "Toplaner Meele";
        animal1.idade = 19;

        animal2.nome = "Garen";
        animal2.especie = "Humano";
        animal2.som = "Por demacia";
        animal2.comida = "Zero Mecanica";
        animal2.idade = 37;

        animal1.dormir(13);
        animal2.movimentar(89);
        animal2.fazerBarulho();
        animal1.comer();

    }
}
