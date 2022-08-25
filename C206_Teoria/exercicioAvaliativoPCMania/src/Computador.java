import java.lang.ref.Cleaner;

public class Computador {
    // ATRIBUTOS
    String marca;
    float preco;
    MemoriaUSB memoriaUSB;
    SistemaOperacional sistemaOperacional;
    HardwareBasico[] hardwareBasicos = new HardwareBasico[3];

    // METODOS
    void mostraPCConfigs(){
        System.out.println("Marca -> "+marca);
        System.out.print("Preco -> "+preco);
        for (HardwareBasico hardwareBasicos : hardwareBasicos)
            System.out.print("\nHardware -> " + hardwareBasicos.nome+" "+hardwareBasicos.capacidade + " (Mhz/Gb)");
        System.out.println("\nSistema Operacional -> "+sistemaOperacional.nome+" ("+sistemaOperacional.tipo+" bits)");
        if (memoriaUSB!=null)
            System.out.println("Acompanha -> "+memoriaUSB.nome+" de "+memoriaUSB.capacidade+" Gb");
    }
    void addMemoriaUSB(MemoriaUSB musb){
        this.memoriaUSB = musb;
    }

    // CONSTRUTOR
    Computador(String marca, float preco, String nomeSO, int tipoSO, String[] nomesHardware, int[] tiposHardware){ // Caso não tenha MemoriaUSB
        this.marca = marca;
        this.preco = preco;
        sistemaOperacional = new SistemaOperacional(nomeSO, tipoSO);

        for(int i=0; i< nomesHardware.length; i++){
            hardwareBasicos[i] = new HardwareBasico(nomesHardware[i], tiposHardware[i]);
        }
    }
}
