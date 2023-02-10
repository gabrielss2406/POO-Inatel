import java.util.Random;

public class Main {

    public static void main(String[] args) {

        PacMan pac = new PacMan("Amarelo",5,5, 1);
        Inimigo i1 = new Inimigo("Azul",0,0);
        Inimigo i2 = new Inimigo("Vermelho",10,0);
        Inimigo i3 = new Inimigo("Rosa",0,10);
        Inimigo i4 = new Inimigo("Roxo",10,10);

        Inimigo[] inimigos = {i1,i2,i3,i4};

        int randomNumber1, randomNumber2;
        Random generator = new Random();

        while (pac.getVidas() > 0){
            randomNumber1 = generator.nextInt(5);
            randomNumber2 = generator.nextInt(4);
            switch (randomNumber1){
                case 0:
                    switch (randomNumber2){
                        case 0:
                            pac.movePraCima();
                            break;
                        case 1:
                            pac.movePraBaixo();
                            break;
                        case 2:
                            pac.movePraDireita();
                            break;
                        case 3:
                            pac.movePraEsquerda();
                            break;
                    }
                    break;
                case 1:
                    switch (randomNumber2){
                        case 0:
                            i1.movePraCima();
                            break;
                        case 1:
                            i1.movePraBaixo();
                            break;
                        case 2:
                            i1.movePraDireita();
                            break;
                        case 3:
                            i1.movePraEsquerda();
                            break;
                    }
                    break;
                case 2:
                    switch (randomNumber2){
                        case 0:
                            i2.movePraCima();
                            break;
                        case 1:
                            i2.movePraBaixo();
                            break;
                        case 2:
                            i2.movePraDireita();
                            break;
                        case 3:
                            i2.movePraEsquerda();
                            break;
                    }
                    break;
                case 3:
                    switch (randomNumber2){
                        case 0:
                            i3.movePraCima();
                            break;
                        case 1:
                            i3.movePraBaixo();
                            break;
                        case 2:
                            i3.movePraDireita();
                            break;
                        case 3:
                            i3.movePraEsquerda();
                            break;
                    }
                    break;
                case 4:
                    switch (randomNumber2){
                        case 0:
                            i4.movePraCima();
                            break;
                        case 1:
                            i4.movePraBaixo();
                            break;
                        case 2:
                            i4.movePraDireita();
                            break;
                        case 3:
                            i4.movePraEsquerda();
                            break;
                    }
                    break;
            }
            for(int i=0; i<4; i++){
                if((pac.getPosicaoX() == inimigos[i].getPosicaoX()) && (pac.getPosicaoY() == inimigos[i].getPosicaoY())){
                    System.out.println("aaaaa");
                    pac.perdeVida();
                    System.out.println("O PacMan tomou dano para o inimigo "+i);
                }
            }
        }
        System.out.println("Game over, x pontos");
    }
}
