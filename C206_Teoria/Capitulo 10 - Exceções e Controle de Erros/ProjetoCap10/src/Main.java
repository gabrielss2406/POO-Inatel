import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inicio do método Main...");
        metodo1();
        System.out.println("..Fim do método Main");
    }

    public static void metodo1(){
        System.out.println("Inicio do método 1..");
        metodo2();
        System.out.println("..Fim do método 1..");
    }

    public static void metodo2(){
        System.out.println("Inicio do método 2..");
        int[] array = new int[10];
        try{
            for (int i = 0; i < 15; i++) {
                array[i] = i;
                System.out.println(i);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "<html><body text='red'><b>Deu cagada!<br>"+e, "ERRO", JOptionPane.ERROR_MESSAGE);
        }

        System.out.println("..Fim do método 2");
    }
}
