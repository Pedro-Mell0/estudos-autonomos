// 20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.

import javax.swing.*;

public class Test20 {
    public static void main (String []args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para receber sua tabuada"));
    String tabuada = "Tabuada do " + n + ":\n";;
        for (int i = 0; i <= 10; i++) {
           tabuada += n + " * " + i + " = " + (n * i) + "\n";
        }

        JOptionPane.showMessageDialog(null, tabuada);
        

    }
}
