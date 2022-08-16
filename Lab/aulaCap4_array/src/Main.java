public class Main {
    public static void main(String[] args) {
        int[] inteiros = {1,2,3,4,5,6,7};
        for (int inteiro : inteiros) {
            System.out.println(inteiro);
        }

        System.out.println("----------------------------------------");

        Conta[] contas = new Conta[5]; //array de 4 instancias tipo conta

        contas[0] = new Conta("Joaquim", 1982);
        contas[1] = new Conta("Aurio", 9999999);
        contas[2] = new Conta("Harley", 3540.9);

        for (int i=0; i< contas.length; i++) {
            if(contas[i]!=null){
                System.out.println(contas[i]+" -> "+contas[i].titular+" tem: "+contas[i].saldo+" reais.");
            }
        }

        System.out.println("----------------------------------------");
    }
}
