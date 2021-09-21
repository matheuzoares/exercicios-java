package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cont = 1, num, par = 0, impar = 0;

        while (cont <= 10) {
            System.out.println("Digite o " + cont + " º número:");
            num = entrada.nextInt();

            if (num % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }

        System.out.println("O total de pares é: " + par);
        System.out.println("O total de ímpares é: " + impar);

        entrada.close();
    }
}
