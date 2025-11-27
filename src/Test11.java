// 11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.

import javax.swing.*;

// 4 notas / Media / Nome / Aprovado ou Reprovado
public class Test11 {
    public static void main (String []args) {


        String Nome;
        int NotaUm, NotaDois, NotaTres, NotaQuatro;
        double Media;



        Nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");

        NotaUm = Integer.parseInt(JOptionPane.showInputDialog("Nota um: "));
        NotaDois = Integer.parseInt(JOptionPane.showInputDialog("Nota dois: "));
        NotaTres = Integer.parseInt(JOptionPane.showInputDialog("Nota três: "));
        NotaQuatro = Integer.parseInt(JOptionPane.showInputDialog("Nota quatro: "));

        Media = ( NotaUm + NotaDois + NotaTres + NotaQuatro ) / 4;

        if (Media >= 7 ) {
             JOptionPane.showMessageDialog(null, Nome + " foi aprovado com média " + Media);
        } else {
            JOptionPane.showMessageDialog(null, Nome + " foi reprovado com média " + Media);
        }

    }
}
