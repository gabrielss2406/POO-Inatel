public abstract class Personagem implements Movel{
    // ATRIBUTOS
    protected String cor;
    protected int posicaoX;
    protected int posicaoY;

    // METODOS
    public void movePraCima(){
        if(posicaoY < 10)
            posicaoY+=1;
    }
    public void movePraBaixo(){
        if(posicaoY > 0)
            posicaoY-=1;
    }
    public void movePraDireita(){
        if(posicaoX < 10)
            posicaoY+=1;
        //else
        //    System.out.println("Encostou na parte da direita!");
    }
    public void movePraEsquerda(){
        if(posicaoX > 0)
            posicaoY-=1;
    }

    // CONSTRUTOR
    public Personagem(String cor, int posicaoX, int posicaoY) {
        this.cor = cor;
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
    }

    // GETTER
    public int getPosicaoX() {
        return posicaoX;
    }
    public int getPosicaoY() {
        return posicaoY;
    }
}
