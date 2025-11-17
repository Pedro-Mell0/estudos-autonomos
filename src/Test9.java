//9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição
//de acordo com a tabela abaixo:
//
//Fórmula do IMC = peso / (altura) ²
//Tabela Condições IMC
//
// Abaixo de 18,5   | Abaixo do peso
// Entre 18,6 e 24,9 | Peso ideal (parabéns)
// Entre 25,0 e 29,9 | Levemente acima do peso
// Entre 30,0 e 34,9 | Obesidade grau I
// Entre 35,0 e 39,9 | Obesidade grau II (severa)
// Maior ou igual a 40 | Obesidade grau III (mórbida)


import javax.swing.*;

public class Test9 {
    public static void main (String []args) {

        double peso, altura, IMC;


        peso = Double.valueOf(JOptionPane.showInputDialog("Digite seu peso: "));
        altura = Double.valueOf(JOptionPane.showInputDialog("Digite sua altura no formato x.xx: " ));

        IMC = peso / (altura * altura);

        if (IMC < 18.5) {
            JOptionPane.showMessageDialog(null, "Abaixo do peso");
        }else if ( IMC >= 18.6 && IMC <= 24.9) {
            JOptionPane.showMessageDialog(null, "Parabéns, você está no peso ideal");
        }else if (IMC >= 25.0 && IMC <= 29.9) {
            JOptionPane.showMessageDialog(null, "Você está levemente acima do peso");
        }else if ( IMC >= 30.0 && IMC <= 34.9) {
            JOptionPane.showMessageDialog(null, "Obesidade grau I");
        }else if ( IMC >= 35.0 && IMC <= 39.9) {
            JOptionPane.showMessageDialog(null, "Obesidade grau II (severa)");
        }else if ( IMC >= 40.0) {
            JOptionPane.showMessageDialog(null, "Obesidade grau III (mórbida)");
        }

    }
}
