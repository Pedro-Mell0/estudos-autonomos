//10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

import javax.swing.*;

public class Test10 {
    public static void main (String []args){


        double notaUm, notaDois, notaTres;
        double media;

        notaUm = Double.valueOf(JOptionPane.showInputDialog("Digite a primeira nota: "));
        notaDois = Double.valueOf(JOptionPane.showInputDialog("Digite a segunda nota: "));
        notaTres = Double.valueOf(JOptionPane.showInputDialog("Digite a terceira nota: "));

        media = (notaUm + notaDois + notaTres) / 3;

        JOptionPane.showMessageDialog(null, "A média do aluno é de: " + media);


    }
}
