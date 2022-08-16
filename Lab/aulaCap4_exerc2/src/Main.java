public class Main {
    public static void main(String[] args) {
        Contato c1 = new Contato("Aurio", "aurio@gmail.com", "(32)99999-9999", "12/02/1973");
        Contato c2 = new Contato("Gabriel", "gabriel@gmail.com", "(32)91234-4321", "24/06/2003");

        Contato[] contatos = new Contato[2];
        contatos[0]=c1;
        contatos[1]=c2;

        Empresa empresa = new Empresa("18864-89", "Rua Rua Bairro Cidade", contatos);
        empresa.exibirInfos();
    }
}
