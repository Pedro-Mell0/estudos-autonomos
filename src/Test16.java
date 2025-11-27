// 16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são válidos, determine se o triângulo é
//equilátero, isósceles ou escaleno.

import javax.swing.*;
public class Test16 {
    public static void main(String[] args) {

        int a, b, c;

        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado A: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado B: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado C: "));


        if (a == b && b == c) {
            JOptionPane.showMessageDialog(null, "O triângulo é Equilátero.");
        } else if (a != b && b != c) {
            JOptionPane.showMessageDialog(null, "O triângulo é Escaleno");
        } else
            JOptionPane.showMessageDialog(null, "O triângulo é Isóceles.");

    }
}



