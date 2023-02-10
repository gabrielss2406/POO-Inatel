public class Piloto {
    // Construtor
    Piloto(String nome, boolean vilao){
        this.nome = nome;
        this.vilao = vilao;
    }

    // Atributos
    String nome;
    boolean vilao;

    // Metodos
    void soltaSuperPoder(){
        System.out.print(nome+" soltou um superpoder do ");
        if(vilao)
            System.out.println("mal.");
        else
            System.out.println("bem.");
    }
}
