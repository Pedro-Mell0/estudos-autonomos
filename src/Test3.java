// 3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores, caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela.

import javax.swing.*;



public class Test3 {
    public static void main (String []args) {

        int A, B, C;

        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A"));
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B"));

        if ( A == B ) {
            C = A + B;


        } else {
            C = A * B;
        }

        JOptionPane.showMessageDialog(null,"O Valor de C é: " + C);





    }
}
