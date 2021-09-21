package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero, sequencia = 2;

        System.out.println("Digite um número:");
        numero = entrada.nextInt();

        System.out.print(1);

        while (sequencia <= numero) {
            System.out.print(", " + sequencia);
            sequencia *= 2;
        }

        entrada.close();
    }
}
