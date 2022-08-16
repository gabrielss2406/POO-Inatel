public class Main {
    public static void main(String[] args) {
        String[] tipos = {"Material", "Mao de obra"};
        int[] quantidades = {87,2};

        Restaurante restaurante = new Restaurante("978979-90", "rua rua bairro rua", "Bar do Dimas",tipos,quantidades);
        restaurante.exibirInfos();
    }
}
