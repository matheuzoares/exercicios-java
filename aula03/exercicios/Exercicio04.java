package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int soma = 0, cont = 1;
        int num = 1;

        while (num != 0) {
            System.out.println("Digite o " + cont + "º número:");
            num = entrada.nextInt();

            soma += num;
            cont++;
        }

        System.out.println("A soma dos valores é: " + soma);

        entrada.close();
    }
}