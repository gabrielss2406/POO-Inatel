public class Trabalhador {
    // Atributos
    String nome,
            profissao,
            rg,
            dataNascimento;
    float salario;

    // Metodos
    void recebeAumento(float valor){
        salario+=valor;
        System.out.println("O novo salario de "+nome+" é de "+salario);
    }
    float calculaGanhoAnual(){
        return salario*13;
    }
    void mostraInfosFuncionario(){
        System.out.println("Nome: "+nome);
        System.out.println("Profissao: "+profissao);
        System.out.println("Salario(mes): "+salario);
        System.out.println("Salario(ano): "+calculaGanhoAnual());
        System.out.println("RG: "+rg);
        System.out.println("Data de Nascimento: "+dataNascimento);
    }
}
