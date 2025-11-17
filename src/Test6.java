// 6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5% a mais.


import javax.swing.*;

public class Test6 {
    public static void main (String []args){

        double N, NewN;

        N = Double.valueOf(JOptionPane.showInputDialog("Digite o valor de para reajuste"));

        NewN =  N * 1.05;

        JOptionPane.showMessageDialog(null, "O valor reajustado é de: " + NewN);



    }
}
