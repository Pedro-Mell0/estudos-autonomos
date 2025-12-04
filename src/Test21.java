// 21 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100.

import javax.swing.*;

public class Test21 {
    public static void main (String [] args) {



        int n = (int) (Math.random() * (100 - 0)) + 0;

        JOptionPane.showMessageDialog(null, "Número aleatório de 0 até 100 : \n" + n);


    }
}
