public class Main {
    //----------------------------------------------ARRAY--------------------------------------------------------
    public static void main(String[] args) {
        //Caracteristicas IMPORTANTES de um array
        //1- Tamanho pré-definido
        //2- Guarda elementos homogeneos (Tipo pré-definido)
        //3- É declarado como um objeto - "new"

        //DECLARACÃO de Array (ponteiro + criando o objeto)
        int[] numeros = new int[10];
        int n = 10;
        int[] numeros1 = new int[n];

        numeros[0] = 8;
        for (int i = 0; i < numeros.length; i++) {
            //System.out.println(numeros[i]);
        }

        for(int numero : numeros){
            //System.out.println(numero);
        }

        //"Array de objetos" (Guardam referencias)- Array de referencias
        Conta[] contas = new Conta[10];

        Conta c1 = new Conta();
        c1.numero = 77;
        Conta c2 = new Conta();
        c2.numero = 88;

        contas[1] = c1;
        contas[8] = c2;
        contas[2] = new Conta();

        contas[2].numero = 99;

        for (Conta aux: contas) {
            if(aux != null) {
                System.out.println(aux.numero);
            }
        }
    }
}
