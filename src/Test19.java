// Faça um algoritmo que imprima na tela a tabuada de 1 até 10.


import javax.swing.*;

public class Test19 {
    public static void main(String[] args) {

        for (int n = 1; n <= 10; n++) {
            String tabuada = "Tabuada do " + n + ":\n";

            for (int i = 0; i <= 10; i++) {
                tabuada += n + " * " + i + " = " + (n * i) + "\n";
            }

            JOptionPane.showMessageDialog(null, tabuada);
        }
    }
}