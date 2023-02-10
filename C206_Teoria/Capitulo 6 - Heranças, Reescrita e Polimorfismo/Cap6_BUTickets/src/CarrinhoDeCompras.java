public class CarrinhoDeCompras {
    // ATRIBUTOS
    private String loginCliente;
    private Ingresso[] ingressos = new Ingresso[50];

    // METODOS
    public void addIngresso(Ingresso ing){
        for (int i=0; i< ingressos.length; i++){
            if(ingressos[i] == null){
                ingressos[i] = ing;
                break;
            }
        }
    }
    public void mostraDetalhesCompras(){
        double precoTotal=0;
        System.out.println("Carrinho do cliente: "+loginCliente+"\n");
        for (int i = 0; i < ingressos.length; i++) {
            if(ingressos[i] == null)
                break;
            ingressos[i].mostraInfo();

            System.out.print("Ingresso: ");
            if(ingressos[i] instanceof Kids)
                System.out.println("Kids\n");
            else if(ingressos[i] instanceof Camarote)
                System.out.println("Camarote\n");
            else if(ingressos[i] instanceof VIP)
                System.out.println("VIP\n");

            precoTotal += ingressos[i].calculaTotalIngresso();
        }
        System.out.println("Preco total: R$"+precoTotal);
    }

    // CONSTRUTOR
    public CarrinhoDeCompras(String loginCliente, Ingresso ingresso) {
        this.loginCliente = loginCliente;
        addIngresso(ingresso);
    }
}
