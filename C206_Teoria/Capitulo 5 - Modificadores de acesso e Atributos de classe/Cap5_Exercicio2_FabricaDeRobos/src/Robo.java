import java.util.Date;

public class Robo {
    // ATRIBUTOS
    private static long serialNumberGenerator = 0;
    private long serialNumber;
    private Date dataCriacao;
    private Processador processador;
    private Corpo corpo;

    // CONSTRUTOR
    public Robo(boolean temProcessador) {
        serialNumberGenerator++;
        serialNumber = serialNumberGenerator;
        dataCriacao = new Date();

        if(temProcessador){
            processador = new Processador("Marca", 144);
        }

        corpo = new Corpo("Humanoide", "Rosa");
    }

    // METODOS
    public void mostraConfigRobo(){
        System.out.println("Serial: "+serialNumber);
        System.out.println("Data de criacao: "+dataCriacao);
        System.out.println("Corpo: "+corpo.getTipo()+" na cor "+corpo.getCor());
        if(processador!=null)
            System.out.println("Processador: "+processador.getMarca()+" com frequencia "+processador.getFrequenciaProcessamento());
    }
}
