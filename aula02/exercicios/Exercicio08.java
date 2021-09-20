package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a, b, c;

        System.out.println("Digite o lado A:");
        a = entrada.nextInt();
        
        System.out.println("Digite o lado B:");
        b = entrada.nextInt();
        
        System.out.println("Digite o lado C:");
        c = entrada.nextInt();

        if (a > b + c) {
            System.out.println("Não formam triângulo algum");
        } else if (a == b && b == c && a == c) {
            System.out.println("Formam um triângulo equilátero");
        } else if (a == b || b == c || a == c) {
            System.out.println("Formam um triângulo isósceles");
        } else {
            System.out.println("Formam um triângulo escaleno");
        }

        entrada.close();
    }
}
