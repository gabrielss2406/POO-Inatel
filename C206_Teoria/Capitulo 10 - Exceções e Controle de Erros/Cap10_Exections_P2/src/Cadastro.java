import java.util.ArrayList;

public class Cadastro {
    // ATRIBUTOS
    public ArrayList<String> codigosValidos = new ArrayList<>();
    public ArrayList<String> codigosInvalidos = new ArrayList<>();

    // METODOS
    public void addCodigo(String codigo){
        if(codigo.length() == 7 &&
                codigo.startsWith("np-") ||
                codigo.startsWith("dp-") ||
                codigo.startsWith("bp-")){
            codigosValidos.add(codigo);
        } else {
            try {
                throw new CodigoInvalidoException();
            } catch (CodigoInvalidoException e) {
                codigosInvalidos.add(codigo);
            }
        }
    }
    public void mostraCodigos(){
        System.out.println("Códigos válidos: ");
        for (String codigosValido : codigosValidos) {
            System.out.println(codigosValido);
        }
        System.out.println("Códigos inválidos: ");
        for (String codigosInvalido : codigosInvalidos) {
            System.out.println(codigosInvalido);
        }
    }
}
