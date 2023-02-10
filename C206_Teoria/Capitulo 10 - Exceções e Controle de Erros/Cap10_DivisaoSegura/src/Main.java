import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int n1;
        int n2;
        float resultado;
        JDialog.getWindows();
        try {
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Número 1:"));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Número 2:"));
            resultado = n1/n2;
            JOptionPane.showMessageDialog(null, "Resultado "+n1+" / "+n2+" = "+resultado);
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "<html><body text='red'><b>NÃO ENTRA COM COISA ERRADA POR FAVOR!<br>"+e, "ERRO", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null, "<html><body text='red'><b>DIVISÃO POR ZERO<br>"+e, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
}
