public class Cliente {
    // ATRIBUTOS
    private String nome;
    private long cpf;

    // CONSTRUTOR
    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // GETTERS / SETTERS
    public String getNome() {
        return nome;
    }
    public long getCpf() {
        return cpf;
    }
}
