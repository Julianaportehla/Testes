import javax.swing.JOptionPane;
 
public class Raio {
 
    public static void main(String[] args) {
        final Double pi = 3.14;
 
        System.out.println("Informe o raio da circunferencia");
        Double raio = Double.parseDouble(JOptionPane.showInputDialog("Informe o raio"));
 
        Double area = pi * (raio*raio);
 
        System.out.println("o raio da circunferencia é: " + area);
    }
 
}