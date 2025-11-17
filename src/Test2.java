// Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.


import javax.swing.*;

public class Test2 {
    public static void main (String []args){

        int N;

        N = Integer.parseInt(JOptionPane.showInputDialog("Digite o número desejado"));

        if (N > 0 && N % 2 == 0 ) {
            JOptionPane.showMessageDialog(null,N + " É Positivo e Par");
        }else if (N > 0 && N % 2 != 0) {
            JOptionPane.showMessageDialog(null, N + " É Positivo e Ímpar");
        }else if (N < 0 && N % 2 != 0)
            JOptionPane.showMessageDialog(null, N + " É Negativo e Ímpar");
        else {
            JOptionPane.showMessageDialog(null,N + " É  Negativo e Par");
        }



    }
}
