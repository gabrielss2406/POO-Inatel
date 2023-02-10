public class Zoologico{
    // ATRIBUTOS
    private String nome;
    private String endereco;
    private Animal[] animais = new Animal[10];

    // METODOS
    public void mostraInfo(){
        System.out.println("Zoológico "+nome+"\nLocalizacao: "+endereco);
        System.out.println("\nANIMAIS:");
        for (int i=0; i< animais.length; i++){
            if(animais[i]!=null){
                System.out.print((i+1)+". "+animais[i].nome+" com "+animais[i].nPatas+" patas e cor "+animais[i].cor+" ");
                if(animais[i] instanceof Pato)
                    System.out.println("com tamanho do bico de "+((Pato) animais[i]).getTamanhoBico());
                else if(animais[i] instanceof Leao)
                    System.out.println("com tamanho da juba de "+((Leao) animais[i]).getTamanhoJuba());
                else if(animais[i] instanceof Coruja)
                    System.out.println("com altura do voo de "+((Coruja) animais[i]).getAlturaVoo());
                else if(animais[i] instanceof Peixe)
                    System.out.println("com numero de barbatanas de "+((Peixe) animais[i]).getnBarbatanas());
            }
            else
                break;
        }
    }

    // CONSTRUTOR
    public Zoologico(String nome, String endereco, Animal[] animais) {
        this.nome = nome;
        this.endereco = endereco;
        this.animais = animais;
    }
}
