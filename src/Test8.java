// 8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.


import javax.swing.*;

public class Test8 {
    public static void main (String []args) {

        int A, B, C;
        int maior, meio, menor;

        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A"));
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B"));
        C = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C"));

        if (A > B && A > C) {
            maior = A;
            if (B > C) {
                meio = B;
                menor = C;
            }else {
                meio = C;
                menor = B;
            }

        }else if ( B > A && B > C) {
            maior = B;
            if (A > C) {
                meio = A;
                menor = C;
            } else {
                meio = C;
                menor = A;
            }
        } else {
            maior = C;
            if (A > B) {
                meio = A;
                menor = B;
            } else {
                meio = B;
                menor = A;
            }
        }

        JOptionPane.showMessageDialog(null, "Os valores de A, B e C em ordem decrescente é: " + maior + " " + meio + " " + menor);


    }
}
