// 5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).

import java.text.DecimalFormat;
import javax.swing.*;

public class Test5 {
    public static void main (String []args) {


        Double Salario;
        Double SalarioM = 1293.20;

        Salario = Double.valueOf(JOptionPane.showInputDialog("Digite o valor do salário atual: "));

        double MediaSM = Salario/SalarioM;

        // arredondar para  casas decimais
        DecimalFormat df = new DecimalFormat("#.00");
        String mediaFormatada = df.format(MediaSM);

        JOptionPane.showMessageDialog(null, "O usuário ganha em média " + mediaFormatada + "x salários mínimos.");

    }
}
