// Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

import java.util.Scanner;


public class Test1 {

    public static void main (String []args) {

        int  A, B, C, Soma;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, digite o valor de A:");

        A = Integer.parseInt(scanner.nextLine());

        System.out.println("O valor de B:");
        B = Integer.parseInt(scanner.nextLine());


        System.out.println("O valor de C");
        C = Integer.parseInt(scanner.nextLine());

        Soma = A + B;

        System.out.println(" A soma de A + B = " + Soma);

        if (Soma < C ){
            System.out.println(Soma + " é menor que " + C);
        } else System.out.println(Soma + " é maior que " + C);

    }
}


