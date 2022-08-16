public class Empresa {
    // ATRIBUTOS
    String cnpj;
    String endereco;
    Contato[] contatos;

    // METODOS
    void exibirInfos(){
        System.out.println("CNPJ: " + cnpj + " - Endereco: " + endereco);
        for(int i=0; i<contatos.length; i++) {
            System.out.println("\nContato "+i+":\nNome: "+contatos[i].nome+"\nEmail: "+contatos[i].email
                +"\nTelefone: "+contatos[i].telefone+"\nData de nascimento: "+contatos[i].dataNascimento);
        }
    }

    // CONSTRUTOR
    Empresa(String cnpj, String endereco, Contato[] contatos){
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.contatos = contatos;
    }
}
