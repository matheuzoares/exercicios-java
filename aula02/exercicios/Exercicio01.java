package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero, metade;

        System.out.println("Digite um número.");
        numero = entrada.nextInt();

        metade = numero/2;

        if (numero > 20) {
            System.out.printf("A metade do número é %d", metade);
        } else {
            System.out.printf("O número é %d", numero);
        }

        entrada.close();
    }
}