public class PacMan extends Personagem{
    // ATRIBUTOS
    private int pontuacao=0;
    private int vidas;

    // METODOS
    @Override
    public void movePraCima() {
        super.movePraCima();
        ganhaPonto();
    }
    @Override
    public void movePraBaixo() {
        super.movePraBaixo();
        ganhaPonto();
    }
    @Override
    public void movePraDireita() {
        super.movePraDireita();
        ganhaPonto();
    }
    @Override
    public void movePraEsquerda() {
        super.movePraEsquerda();
        ganhaPonto();
    }
    public void perdeVida(){
        vidas -= 1;
        if(vidas == 0)
            System.out.println("VOCE PERDEU!");
    }
    public void ganhaPonto(){
        pontuacao += 1;
    }

    // CONSTRUTOR
    public PacMan(String cor, int posicaoX, int posicaoY, int vidas) {
        super(cor, posicaoX, posicaoY);
        this.vidas = vidas;
    }

    // GETTER
    public int getVidas() {
        return vidas;
    }
}
