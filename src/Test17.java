// 17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas. Fórmula: C = (5 * ( F-32) / 9)


import javax.swing.*;
import java.text.DecimalFormat;

public class Test17 {
    public static void main (String []args ) {

        double Celsius;
        double F;

       F = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em graus Fahreinheit"));

       Celsius = (5 * ( F-32) / 9);

        DecimalFormat df = new DecimalFormat("#.00");
        String CelsiusD = df.format(Celsius);

       JOptionPane.showMessageDialog(null, F + " graus Fahreinheit equivalem a " + CelsiusD + " graus Celsius");



    }
}
