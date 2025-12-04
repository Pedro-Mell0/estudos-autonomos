// 22 - Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela o quociente e o resto da divisão inteira entre eles.

import javax.swing.*;

public class Test22 {
    public static void main (String [] args) {

        int A;
        int B;

        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));

        int Q = A%B;
        int R = A/B;


        JOptionPane.showMessageDialog(null, "O quociente da divisão entre A e B é: " + R + "\n E o resto da divisão inteira é: " + Q);
    }
}
