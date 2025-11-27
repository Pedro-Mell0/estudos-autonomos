// 15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em
//consideração o ano com 365 dias e o mês com 30 dias.
//(Ex: 5 anos, 2 meses e 15 dias de vida)


import javax.swing.*;

public class Test15 {
    public static void main ( String []args) {

        String nome;
        int idade;
        int anoNascimento;
        int mesNascimento;
        int diaNascimento;
        int data = 739478;

        anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento: "));
        mesNascimento = Integer.parseInt(JOptionPane.showInputDialog("Mês de nascimento: "));
        diaNascimento = Integer.parseInt(JOptionPane.showInputDialog("Dia de nascimento: "));

        int ano = anoNascimento * 365 + (mesNascimento * 30) + diaNascimento;
        int diferenca = data - ano;

        int anos = diferenca / 365;
        int mes = (diferenca % 365) / 30;
        int dia = (diferenca % 365) % 30;

        nome = JOptionPane.showInputDialog("Qual o seu nome?");
        JOptionPane.showMessageDialog(null, nome + " Já viveu " + anos + " anos " + mes + " meses " + " e " + dia + " dias ");




    }
}
