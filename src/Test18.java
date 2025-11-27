// Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano. Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Sara seja maior que Francisco.

import javax.swing.*;

public class Test18 {
    public static void main (String []args) {


            double F = 1.50;
            double S = 1.10;
            int ano = 0;

            for (ano = 0; S < F; ano++ ) {
                F = F + 0.02;
                S = S + 0.03;

            }
        JOptionPane.showMessageDialog(null,  "Serão necessários " + ano + " anos para Sara ser maior que Francisco.");
    }
}


