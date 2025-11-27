// 12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
// pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
// Tabela de Código de Condições de Pagamento
// 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
// 2 - À Vista no cartão de crédito, recebe 10% de desconto
// 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
// 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%


import javax.swing.*;

public class Test12 {
    public static void main (String []args) {


        double Valor = Double.parseDouble(JOptionPane.showInputDialog("Digte o valor do produto: "));

        double Pix = Valor - (Valor * 0.15);
        double Vista = Valor - (Valor * 0.10);
        double Parcela = Valor + (Valor * 0.10);

            String[] opcoes = {"Pix", "À Vista", "Parcelado 2x", "Parcelado + 2x"};

        int pagamento = JOptionPane.showOptionDialog(null, "Selecione o método de pagamento ", "Pagamento",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        switch (pagamento) {

            case 0: JOptionPane.showMessageDialog(null, "O pagamento será via Pix, conferindo 15% de desconto, totalizando o valor da compra em: " + Pix);
            break;

            case 1: JOptionPane.showMessageDialog(null, "O pagamento será à vista, conferindo 10% de desconto, totalizando o valor da compra em: " + Vista);
            break;

            case 2: JOptionPane.showMessageDialog(null, "O pagamento será parcelado em duas vezes, totalizando o valor da compra em: " + Valor);
            break;

            case 3: JOptionPane.showMessageDialog(null, "O pagamento será via parcelado em mais de duas vezes, conferindo 10% de juros, totalizando o valor da compra em: " + Parcela);
            break;


        }
    }
}
