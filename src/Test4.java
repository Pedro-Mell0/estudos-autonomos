// Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.


import javax.swing.*;

public class Test4 {
    public static void main (String []args) {

        int N;

        N = Integer.parseInt(JOptionPane.showInputDialog("Digite o número desejado: "));

        int Num = N - 1;
        int Ndois = N + 1;

        JOptionPane.showMessageDialog(null, "O antecessor de " + N + " é " + Num + ", e seu sucessor é " + Ndois + ".");
    }
}
