import java.util.Scanner;

public class AnimalPet {
    // Atributos
    String nome;
    String especie;
    String som;
    String comida;
    int idade;

    // Metodos
    void comer(){
        System.out.println("O(A) "+nome+" esta comendo "+comida+".");
    }
    void dormir(int horas){
        System.out.println("O(A) "+nome+" esta dormindo por "+horas+" horas.");
    }
    void movimentar(int metros){
        System.out.println("O(A) "+nome+" esta movimentando por "+metros+" metros.");
    }
    void fazerBarulho(){
        System.out.println("O(A) "+nome+" esta gritando: "+som+" .");
    }
}
