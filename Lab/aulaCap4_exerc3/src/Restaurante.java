public class Restaurante {
    // ATRIBUTOS
    String cnpj;
    String endereco;
    String nome;
    Fornecedor[] fornecedors;

    // METODOS
    void exibirInfos(){
        System.out.println("CNPJ: "+cnpj+"\nEndereco: "+endereco+"\nNome: "+nome);
        for(int i=0; i<fornecedors.length; i++){
            System.out.println(fornecedors[i].quantidade+" -> "+fornecedors[i].tipo);
        }
    }
    void constructFornecedors(String[] tipos, int[] quantidades){
        fornecedors = new Fornecedor[2];
        fornecedors[0] = new Fornecedor(tipos[0], quantidades[0]);
        fornecedors[1] = new Fornecedor(tipos[1], quantidades[1]);
    }

    // CONSTRUTOR
    Restaurante(String cnpj, String endereco, String nome, String[] tipos, int[] quantidades){
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.nome = nome;
        constructFornecedors(tipos,quantidades);
    }
}
