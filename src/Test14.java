//14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.


import javax.swing.*;

public class Test14 {
    public static void main (String []args) {

        int A, B;

        A = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de A: "));
        B = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de B: "));

        JOptionPane.showMessageDialog(null, " O valor de A é: " + B + "." + " \n O valor de B é: " + A + ".");
    }
}
