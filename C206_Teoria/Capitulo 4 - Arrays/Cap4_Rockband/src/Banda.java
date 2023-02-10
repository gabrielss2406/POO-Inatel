public class Banda {
    // ATRIBUTOS
    public String nome;
    public String genero;
    public Musico[] musicos;
    public Musica[] musicas;
    public Empresario empresario;

    // METODOS
    void mostraInfosBanda(){
        System.out.println("Nome da banda: "+nome+", uma banda de "+genero);
        System.out.println("Os integrantes são: ");
        for (Musico musico : musicos)
            System.out.println(musico.nome+" que tem como função "+musico.funcao);
        System.out.println("\nSeus sucessos são: ");
        for (Musica musica : musicas)
            System.out.println(musica.nome+" que tem "+musica.tempo+" minutos");
        if(empresario != null)
            System.out.println("O empresário é o(a) "+empresario.nome+" -> CNPJ: "+empresario.cnpj);
    }
    void constructMusicas(String[] nome, int[] tempo){
        int tamanho= nome.length;
        if(nome.length!=tempo.length){
            if(nome.length>tempo.length)
                tamanho = tempo.length;
        }

        musicas = new Musica[tamanho];
        for (int i=0; i< tamanho; i++)
            musicas[i] = new Musica(nome[i],tempo[i]);
    }

    // CONSTRUTOR
    Banda(String nome, String genero, Musico[] musicos, String[] nomeMusicas, int[] tempoMusicas, Empresario empresario){
        this.nome = nome;
        this.genero = genero;
        this.musicos = musicos;
        constructMusicas(nomeMusicas, tempoMusicas);
        this.empresario = empresario;
    }
    Banda(String nome, String genero, Musico[] musicos, String[] nomeMusicas, int[] tempoMusicas){
        this.nome = nome;
        this.genero = genero;
        this.musicos = musicos;
        constructMusicas(nomeMusicas, tempoMusicas);
    }
}
