import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet();
        conjunto.add("a");
        conjunto.add("a");
        conjunto.add("b");
        conjunto.add("c");
        conjunto.add("d");
        System.out.println(conjunto);

        HashMap<Integer,String> mapa = new HashMap();
        mapa.put(154, "Gabriel Siqueira");
        mapa.put(199, "Xico, o Calvo");
        System.out.println(mapa);
    }
}
