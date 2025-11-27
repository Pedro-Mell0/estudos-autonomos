// 13 - Faça algoritmo que leia o nome e a idade de uma pessoa e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.

import javax.swing.*;

public class Test13 {
    public static void main (String []args) {


        String nome;
        int idade;

        nome = JOptionPane.showInputDialog("Qual o seu nome? ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem? "));

        if (idade >= 18 ) {
            JOptionPane.showMessageDialog(null, "Olá, " + nome + " você tem " + idade + " anos e é maior de idade.");
        } else {
            JOptionPane.showMessageDialog(null, "Olá, " + nome + " você tem " + idade + " anos e é menor de idade.");
        }
    }
}
