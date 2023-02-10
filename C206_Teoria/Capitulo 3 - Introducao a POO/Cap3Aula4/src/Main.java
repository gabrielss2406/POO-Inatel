public class Main {
    public static void main(String[] args) {
        Trabalhador trab1 = new Trabalhador();
        Trabalhador trab2 = new Trabalhador();

        trab1.nome = "Teemo";
        trab1.profissao = "TopLaner";
        trab1.salario = 128987;
        trab1.rg = "MG-313.223.789";
        trab1.dataNascimento = "21/08/2021";

        trab2.nome = "Udyr";
        trab2.profissao = "MidLaner";
        trab2.salario = 8976;
        trab2.rg = "MG-313.223.789";
        trab2.dataNascimento = "12/02/2018";

        trab1.mostraInfosFuncionario();
        trab1.recebeAumento(898);

        System.out.println("========================================");

        // REFERENCIA DO TRAB1 RECEBE A DO TRAB2
        trab2 = trab1;

        trab2.recebeAumento(-260);
        trab2.mostraInfosFuncionario();
    }
}
