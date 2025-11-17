//7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.


import javax.swing.*;

public class Test7 {
    public static void main (String []args) {

        boolean One, Two;

        One = Boolean.valueOf(JOptionPane.showInputDialog("Digite o primeiro valor como TRUE ou FALSE"));
        Two = Boolean.valueOf( JOptionPane.showInputDialog("Digite o segundo valor como TRUE ou FALSE "));

        if (One == Two) {
            JOptionPane.showMessageDialog(null, "Ambos são " + One);
        } else JOptionPane.showMessageDialog(null, "Os valores são diferentes");

    }
}
